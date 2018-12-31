//
//
package com.cyc.tool.subl.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class UUID implements Serializable, Comparable {
	private static long serialVersionUID = -4856846361193249489L;

	private static volatile SecureRandom numberGenerator;

	static {
		UUID.numberGenerator = null;
	}

	private static String digits(long val, int digits) {
		long hi = 1L << digits * 4;
		return Long.toHexString(hi | val & hi - 1L).substring(1);
	}

	public static UUID fromString(String name) {
		String[] components = name.split("-");
		if (components.length != 5)
			throw new IllegalArgumentException("Invalid UUID string: " + name);
		long mostSigBits = Long.parseLong(components[0], 16);
		mostSigBits <<= 16;
		mostSigBits |= Long.parseLong(components[1], 16);
		mostSigBits <<= 16;
		mostSigBits |= Long.parseLong(components[2], 16);
		long leastSigBits = Long.parseLong(components[3], 16);
		leastSigBits <<= 48;
		leastSigBits |= Long.parseLong(components[4], 16);
		return new UUID(mostSigBits, leastSigBits);
	}

	public static UUID nameUUIDFromBytes(byte[] name) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException nsae) {
			throw new InternalError("MD5 not supported");
		}
		byte[] digest;
		byte[] md5Bytes = digest = md.digest(name);
		int n = 6;
		digest[n] &= 0xF;
		byte[] array = md5Bytes;
		int n2 = 6;
		array[n2] |= 0x30;
		byte[] array2 = md5Bytes;
		int n3 = 8;
		array2[n3] &= 0x3F;
		byte[] array3 = md5Bytes;
		int n4 = 8;
		array3[n4] |= (byte) 128;
		return new UUID(md5Bytes);
	}

	public static UUID randomUUID() {
		SecureRandom ng = UUID.numberGenerator;
		if (ng == null)
			ng = UUID.numberGenerator = new SecureRandom();
		byte[] randomBytes = new byte[16];
		ng.nextBytes(randomBytes);
		byte[] array = randomBytes;
		int n = 6;
		array[n] &= 0xF;
		byte[] array2 = randomBytes;
		int n2 = 6;
		array2[n2] |= 0x40;
		byte[] array3 = randomBytes;
		int n3 = 8;
		array3[n3] &= 0x3F;
		byte[] array4 = randomBytes;
		int n4 = 8;
		array4[n4] |= (byte) 128;
		UUID result = new UUID(randomBytes);
		return new UUID(randomBytes);
	}

	private long mostSigBits;
	private long leastSigBits;
	private transient int version;
	private transient int variant;
	private transient volatile long timestamp;
	private transient int sequence;
	private transient long node;
	private transient int hashCode;

	private UUID(byte[] data) {
		this.version = -1;
		this.variant = -1;
		this.timestamp = -1L;
		this.sequence = -1;
		this.node = -1L;
		this.hashCode = -1;
		long msb = 0L;
		long lsb = 0L;
		assert data.length == 16;
		for (int i = 0; i < 8; ++i)
			msb = msb << 8 | data[i] & 0xFF;
		for (int i = 8; i < 16; ++i)
			lsb = lsb << 8 | data[i] & 0xFF;
		this.mostSigBits = msb;
		this.leastSigBits = lsb;
	}

	public UUID(long mostSigBits, long leastSigBits) {
		this.version = -1;
		this.variant = -1;
		this.timestamp = -1L;
		this.sequence = -1;
		this.node = -1L;
		this.hashCode = -1;
		this.mostSigBits = mostSigBits;
		this.leastSigBits = leastSigBits;
	}

	public int clockSequence() {
		if (this.version() != 1)
			throw new UnsupportedOperationException("Not a time-based UUID");
		if (this.sequence < 0)
			this.sequence = (int) ((this.leastSigBits & 0x3FFF000000000000L) >>> 48);
		return this.sequence;
	}

	public int compareTo(Object obj) {
		if (obj == null || !(obj instanceof UUID))
			throw new RuntimeException("Can't compare UUIDs to non-UUIDs: " + obj);
		UUID val = (UUID) obj;
		return this.mostSigBits < val.mostSigBits ? -1
				: this.mostSigBits > val.mostSigBits ? 1
						: this.leastSigBits < val.leastSigBits ? -1 : this.leastSigBits > val.leastSigBits ? 1 : 0;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof UUID))
			return false;
		if (((UUID) obj).variant() != this.variant())
			return false;
		UUID id = (UUID) obj;
		return this.mostSigBits == id.mostSigBits && this.leastSigBits == id.leastSigBits;
	}

	public long getLeastSignificantBits() {
		return this.leastSigBits;
	}

	public long getMostSignificantBits() {
		return this.mostSigBits;
	}

	public int hashCode() {
		if (this.hashCode == -1)
			this.hashCode = (int) (this.mostSigBits >> 32 ^ this.mostSigBits ^ this.leastSigBits >> 32
					^ this.leastSigBits);
		return this.hashCode;
	}

	public long node() {
		if (this.version() != 1)
			throw new UnsupportedOperationException("Not a time-based UUID");
		if (this.node < 0L)
			this.node = this.leastSigBits & 0xFFFFFFFFFFFFL;
		return this.node;
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		this.version = -1;
		this.variant = -1;
		this.timestamp = -1L;
		this.sequence = -1;
		this.node = -1L;
		this.hashCode = -1;
	}

	public long timestamp() {
		if (this.version() != 1)
			throw new UnsupportedOperationException("Not a time-based UUID");
		long result = this.timestamp;
		if (result < 0L) {
			result = (this.mostSigBits & 0xFFFL) << 48;
			result |= (this.mostSigBits >> 16 & 0xFFFFL) << 32;
			result |= this.mostSigBits >>> 32;
			this.timestamp = result;
		}
		return result;
	}

	public String toString() {
		return UUID.digits(this.mostSigBits >> 32, 8) + "-" + UUID.digits(this.mostSigBits >> 16, 4) + "-"
				+ UUID.digits(this.mostSigBits, 4) + "-" + UUID.digits(this.leastSigBits >> 48, 4) + "-"
				+ UUID.digits(this.leastSigBits, 12);
	}

	public int variant() {
		if (this.variant < 0)
			if (this.leastSigBits >>> 63 == 0L)
				this.variant = 0;
			else if (this.leastSigBits >>> 62 == 2L)
				this.variant = 2;
			else
				this.variant = (int) (this.leastSigBits >>> 61);
		return this.variant;
	}

	public int version() {
		if (this.version < 0)
			this.version = (int) (this.mostSigBits >> 12 & 0xFL);
		return this.version;
	}
}
