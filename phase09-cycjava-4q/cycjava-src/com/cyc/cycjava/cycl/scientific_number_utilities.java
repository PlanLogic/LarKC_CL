package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class scientific_number_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.scientific_number_utilities";
    public static final String myFingerPrint = "5128e7ce382d389237ac4725a467361ae9b1735bb0a3ebac5483e0cff1da462a";
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 17160L)
    public static SubLSymbol $scientific_number_e$;
    private static final SubLSymbol $sym0$SCIENTIFIC_NUMBER_P;
    private static final SubLSymbol $sym1$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym2$INTEGERP;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$EXTENDED_NUMBER_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 458L)
    public static SubLObject scientific_number_abs(final SubLObject sci_num) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        final SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        return scientific_numbers.new_scientific_number(Numbers.abs(significand), exponent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 732L)
    public static SubLObject scientific_number_negate(final SubLObject sci_num) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        final SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        return scientific_numbers.new_scientific_number(Numbers.multiply((SubLObject)scientific_number_utilities.MINUS_ONE_INTEGER, significand), exponent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 1010L)
    public static SubLObject scientific_number_integer_part(final SubLObject sci_num) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        final SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        final SubLObject sig_length = number_utilities.decimal_integer_length(significand);
        final SubLObject division_exponent = Numbers.subtract(sig_length, exponent, (SubLObject)scientific_number_utilities.ONE_INTEGER);
        if (exponent.numL((SubLObject)scientific_number_utilities.ZERO_INTEGER)) {
            return (SubLObject)scientific_number_utilities.ZERO_INTEGER;
        }
        if (division_exponent.numL((SubLObject)scientific_number_utilities.ZERO_INTEGER)) {
            return Numbers.multiply(significand, Numbers.expt((SubLObject)scientific_number_utilities.TEN_INTEGER, Numbers.minus(division_exponent)));
        }
        return Numbers.integerDivide(significand, Numbers.expt((SubLObject)scientific_number_utilities.TEN_INTEGER, division_exponent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 1539L)
    public static SubLObject scientific_number_significant_digits(final SubLObject sci_num, final SubLObject digits) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        assert scientific_number_utilities.NIL != subl_promotions.positive_integer_p(digits) : digits;
        final SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject significand_length = number_utilities.decimal_integer_length(significand);
        SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        SubLObject new_significand = number_utilities.significant_digits(significand, digits);
        final SubLObject new_significand_length = number_utilities.decimal_integer_length(new_significand);
        final SubLObject division_exponent = Numbers.subtract(new_significand_length, digits);
        if (new_significand_length.numG(significand_length)) {
            exponent = Numbers.add(exponent, Numbers.subtract(new_significand_length, significand_length));
        }
        if (division_exponent.numG((SubLObject)scientific_number_utilities.ZERO_INTEGER)) {
            new_significand = Numbers.integerDivide(new_significand, Numbers.expt((SubLObject)scientific_number_utilities.TEN_INTEGER, division_exponent));
        }
        return scientific_numbers.new_scientific_number(new_significand, exponent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 2399L)
    public static SubLObject scientific_number_eql(final SubLObject sci_num0, final SubLObject sci_num1) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num0) : sci_num0;
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num1) : sci_num1;
        final SubLObject exponent0 = scientific_numbers.scientific_number_exponent(sci_num0);
        final SubLObject exponent2 = scientific_numbers.scientific_number_exponent(sci_num1);
        if (exponent0.numE(exponent2)) {
            final SubLObject significand0 = scientific_numbers.scientific_number_significand(sci_num0);
            final SubLObject significand2 = scientific_numbers.scientific_number_significand(sci_num1);
            return Numbers.numE(significand0, significand2);
        }
        return (SubLObject)scientific_number_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 2873L)
    public static SubLObject scientific_number_comparison_significant_digits(final SubLObject sci_num, final SubLObject ex_num) {
        return Numbers.max((SubLObject)scientific_number_utilities.ONE_INTEGER, (scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(ex_num)) ? Numbers.min(scientific_numbers.scientific_number_significant_digit_count(sci_num), scientific_numbers.scientific_number_significant_digit_count(ex_num)) : (ex_num.isInteger() ? scientific_numbers.scientific_number_significant_digit_count(sci_num) : (ex_num.isNumber() ? Numbers.min(scientific_numbers.scientific_number_significant_digit_count(sci_num), scientific_numbers.scientific_number_significant_digit_count(scientific_numbers.scientific_number_from_subl_real(ex_num, (SubLObject)scientific_number_utilities.UNPROVIDED))) : scientific_numbers.scientific_number_significant_digit_count(sci_num))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 3724L)
    public static SubLObject scientific_numberE(final SubLObject sci_num0, final SubLObject sci_num1, SubLObject digits) {
        if (digits == scientific_number_utilities.UNPROVIDED) {
            digits = (SubLObject)scientific_number_utilities.NIL;
        }
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num0) : sci_num0;
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num1) : sci_num1;
        digits = ((scientific_number_utilities.NIL != digits) ? digits : scientific_number_comparison_significant_digits(sci_num0, sci_num1));
        assert scientific_number_utilities.NIL != subl_promotions.positive_integer_p(digits) : digits;
        final SubLObject new_sci_num0 = number_utilities.significant_digits(sci_num0, digits);
        final SubLObject new_sci_num2 = number_utilities.significant_digits(sci_num1, digits);
        final SubLObject exponent0 = scientific_numbers.scientific_number_exponent(new_sci_num0);
        final SubLObject exponent2 = scientific_numbers.scientific_number_exponent(new_sci_num2);
        if (!exponent0.numE(exponent2)) {
            return (SubLObject)scientific_number_utilities.NIL;
        }
        final SubLObject significand0 = scientific_numbers.scientific_number_significand(new_sci_num0);
        final SubLObject significand2 = scientific_numbers.scientific_number_significand(new_sci_num2);
        if ((scientific_number_utilities.ZERO_INTEGER.numE(significand0) || digits.numGE(number_utilities.decimal_integer_length(significand0))) && (scientific_number_utilities.ZERO_INTEGER.numE(significand2) || digits.numGE(number_utilities.decimal_integer_length(significand2)))) {
            return Numbers.numE(significand0, significand2);
        }
        return (SubLObject)scientific_number_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 4766L)
    public static SubLObject scientific_number_integerE(final SubLObject sci_num, final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        assert scientific_number_utilities.NIL != Types.integerp(v_int) : v_int;
        sig_digits = ((scientific_number_utilities.NIL != sig_digits) ? sig_digits : scientific_number_comparison_significant_digits(sci_num, v_int));
        if (scientific_number_utilities.NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return Numbers.zerop(v_int);
        }
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_numberE(sci_num, new_sci_num, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 5315L)
    public static SubLObject integer_scientific_numberE(final SubLObject v_int, final SubLObject sci_num, SubLObject digits) {
        if (digits == scientific_number_utilities.UNPROVIDED) {
            digits = (SubLObject)scientific_number_utilities.NIL;
        }
        return scientific_number_integerE(sci_num, v_int, digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 5449L)
    public static SubLObject scientific_numberG(final SubLObject sci_num0, final SubLObject sci_num1, SubLObject digits) {
        if (digits == scientific_number_utilities.UNPROVIDED) {
            digits = (SubLObject)scientific_number_utilities.NIL;
        }
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num0) : sci_num0;
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num1) : sci_num1;
        digits = ((scientific_number_utilities.NIL != digits) ? digits : scientific_number_comparison_significant_digits(sci_num0, sci_num1));
        assert scientific_number_utilities.NIL != subl_promotions.positive_integer_p(digits) : digits;
        final SubLObject new_sci_num0 = number_utilities.significant_digits(sci_num0, digits);
        final SubLObject new_sci_num2 = number_utilities.significant_digits(sci_num1, digits);
        final SubLObject significand0 = scientific_numbers.scientific_number_significand(new_sci_num0);
        final SubLObject exponent0 = scientific_numbers.scientific_number_exponent(new_sci_num0);
        final SubLObject significand2 = scientific_numbers.scientific_number_significand(new_sci_num2);
        final SubLObject exponent2 = scientific_numbers.scientific_number_exponent(new_sci_num2);
        if ((!scientific_number_utilities.ZERO_INTEGER.numE(significand0) && !digits.numLE(number_utilities.decimal_integer_length(significand0))) || (!scientific_number_utilities.ZERO_INTEGER.numE(significand2) && !digits.numLE(number_utilities.decimal_integer_length(significand2)))) {
            return (SubLObject)scientific_number_utilities.NIL;
        }
        if (scientific_number_utilities.ZERO_INTEGER.numE(significand0)) {
            return Numbers.minusp(significand2);
        }
        if (scientific_number_utilities.ZERO_INTEGER.numE(significand2)) {
            return Numbers.plusp(significand0);
        }
        if (exponent0.numG(exponent2)) {
            return Numbers.plusp(significand0);
        }
        if (exponent2.numG(exponent0)) {
            return Numbers.minusp(significand2);
        }
        if (exponent0.numE(exponent2)) {
            return Numbers.numG(significand0, significand2);
        }
        return (SubLObject)scientific_number_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 6848L)
    public static SubLObject scientific_number_integerG(final SubLObject sci_num, final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        assert scientific_number_utilities.NIL != Types.integerp(v_int) : v_int;
        sig_digits = ((scientific_number_utilities.NIL != sig_digits) ? sig_digits : scientific_number_comparison_significant_digits(sci_num, v_int));
        if (scientific_number_utilities.NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return subl_promotions.negative_integer_p(v_int);
        }
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_numberG(sci_num, new_sci_num, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 7410L)
    public static SubLObject integer_scientific_numberG(final SubLObject v_int, final SubLObject sci_num, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        assert scientific_number_utilities.NIL != Types.integerp(v_int) : v_int;
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        sig_digits = ((scientific_number_utilities.NIL != sig_digits) ? sig_digits : scientific_number_comparison_significant_digits(sci_num, v_int));
        if (scientific_number_utilities.NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return subl_promotions.positive_integer_p(v_int);
        }
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_numberG(new_sci_num, sci_num, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 7972L)
    public static SubLObject scientific_numberGE(final SubLObject sci_num0, final SubLObject sci_num1, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num0, sci_num1);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(scientific_number_utilities.NIL != scientific_numberE(sci_num0, sci_num1, sig_digits) || scientific_number_utilities.NIL != scientific_numberG(sci_num0, sci_num1, sig_digits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 8256L)
    public static SubLObject scientific_number_integerGE(final SubLObject sci_num, final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(scientific_number_utilities.NIL != scientific_number_integerE(sci_num, v_int, sig_digits) || scientific_number_utilities.NIL != scientific_number_integerG(sci_num, v_int, sig_digits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 8540L)
    public static SubLObject integer_scientific_numberGE(final SubLObject v_int, final SubLObject sci_num, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(scientific_number_utilities.NIL != integer_scientific_numberE(v_int, sci_num, sig_digits) || scientific_number_utilities.NIL != integer_scientific_numberG(v_int, sci_num, sig_digits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 8824L)
    public static SubLObject scientific_numberL(final SubLObject sci_num0, final SubLObject sci_num1, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num0, sci_num1);
        }
        return scientific_numberG(sci_num1, sci_num0, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 9046L)
    public static SubLObject scientific_number_integerL(final SubLObject sci_num, final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return integer_scientific_numberG(v_int, sci_num, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 9265L)
    public static SubLObject integer_scientific_numberL(final SubLObject v_int, final SubLObject sci_num, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return scientific_number_integerG(sci_num, v_int, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 9484L)
    public static SubLObject scientific_numberLE(final SubLObject sci_num0, final SubLObject sci_num1, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num0, sci_num1);
        }
        return scientific_numberGE(sci_num0, sci_num1, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 9707L)
    public static SubLObject scientific_number_integerLE(final SubLObject sci_num, final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return integer_scientific_numberGE(v_int, sci_num, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 9929L)
    public static SubLObject integer_scientific_numberLE(final SubLObject v_int, final SubLObject sci_num, SubLObject sig_digits) {
        if (sig_digits == scientific_number_utilities.UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return scientific_number_integerGE(sci_num, v_int, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 10151L)
    public static SubLObject scientific_number_times(final SubLObject sci_num0, final SubLObject sci_num1) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num0) : sci_num0;
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num1) : sci_num1;
        final SubLObject significand0 = scientific_numbers.scientific_number_significand(sci_num0);
        final SubLObject significand2 = scientific_numbers.scientific_number_significand(sci_num1);
        if (significand0.isZero() || significand2.isZero()) {
            return scientific_numbers.new_scientific_number((SubLObject)scientific_number_utilities.ZERO_INTEGER, (SubLObject)scientific_number_utilities.ZERO_INTEGER);
        }
        final SubLObject exponent0 = scientific_numbers.scientific_number_exponent(sci_num0);
        final SubLObject sig_length0 = number_utilities.decimal_integer_length(significand0);
        final SubLObject exponent2 = scientific_numbers.scientific_number_exponent(sci_num1);
        final SubLObject sig_length2 = number_utilities.decimal_integer_length(significand2);
        final SubLObject new_significand = Numbers.multiply(significand0, significand2);
        final SubLObject new_sig_length = number_utilities.decimal_integer_length(new_significand);
        final SubLObject new_exponent = Numbers.subtract(new_sig_length, new SubLObject[] { Numbers.subtract(sig_length0, exponent0, (SubLObject)scientific_number_utilities.ONE_INTEGER), Numbers.subtract(sig_length2, exponent2, (SubLObject)scientific_number_utilities.ONE_INTEGER), scientific_number_utilities.ONE_INTEGER });
        final SubLObject new_sig_digits = Numbers.min(sig_length0, sig_length2);
        return number_utilities.significant_digits(scientific_numbers.new_scientific_number(new_significand, new_exponent), new_sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 11170L)
    public static SubLObject scientific_number_integer_times(final SubLObject sci_num, final SubLObject v_int) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        assert scientific_number_utilities.NIL != Types.integerp(v_int) : v_int;
        if (scientific_number_utilities.NIL != scientific_numbers.scientific_number_zero_p(sci_num) || v_int.isZero()) {
            return scientific_numbers.new_scientific_number((SubLObject)scientific_number_utilities.ZERO_INTEGER, (SubLObject)scientific_number_utilities.ZERO_INTEGER);
        }
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_number_times(sci_num, new_sci_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 11620L)
    public static SubLObject integer_scientific_number_times(final SubLObject v_int, final SubLObject sci_num) {
        return scientific_number_integer_times(sci_num, v_int);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 11741L)
    public static SubLObject scientific_number_inverse(final SubLObject sci_num) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        if (scientific_number_utilities.NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject real_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
        return scientific_numbers.scientific_number_from_subl_real(Numbers.divide((SubLObject)scientific_number_utilities.ONE_INTEGER, real_num), sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 12155L)
    public static SubLObject scientific_number_quotient(final SubLObject sci_num0, final SubLObject sci_num1) {
        return scientific_number_times(sci_num0, scientific_number_inverse(sci_num1));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 12302L)
    public static SubLObject scientific_number_integer_quotient(final SubLObject sci_num, final SubLObject v_int) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        assert scientific_number_utilities.NIL != Types.integerp(v_int) : v_int;
        if (v_int.isZero()) {
            relation_evaluation.throw_unevaluatable();
        }
        if (scientific_number_utilities.NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return scientific_numbers.new_scientific_number((SubLObject)scientific_number_utilities.ZERO_INTEGER, (SubLObject)scientific_number_utilities.ZERO_INTEGER);
        }
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_number_quotient(sci_num, new_sci_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 12781L)
    public static SubLObject integer_scientific_number_quotient(final SubLObject v_int, final SubLObject sci_num) {
        assert scientific_number_utilities.NIL != Types.integerp(v_int) : v_int;
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        if (scientific_number_utilities.NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (v_int.isZero()) {
            return scientific_numbers.new_scientific_number((SubLObject)scientific_number_utilities.ZERO_INTEGER, (SubLObject)scientific_number_utilities.ZERO_INTEGER);
        }
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_number_quotient(new_sci_num, sci_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 13260L)
    public static SubLObject scientific_number_plus(final SubLObject sci_num0, final SubLObject sci_num1) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num0) : sci_num0;
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num1) : sci_num1;
        if (scientific_number_utilities.NIL != scientific_numbers.scientific_number_zero_p(sci_num0)) {
            return scientific_numbers.copy_scientific_number(sci_num1);
        }
        if (scientific_number_utilities.NIL != scientific_numbers.scientific_number_zero_p(sci_num1)) {
            return scientific_numbers.copy_scientific_number(sci_num0);
        }
        final SubLObject exponent0 = scientific_numbers.scientific_number_exponent(sci_num0);
        final SubLObject exponent2 = scientific_numbers.scientific_number_exponent(sci_num1);
        SubLObject result = (SubLObject)scientific_number_utilities.NIL;
        if (exponent0.numE(exponent2)) {
            result = scientific_number_plus_same_exponent(sci_num0, sci_num1, exponent0);
        }
        else if (exponent0.numG(exponent2)) {
            result = scientific_number_plus_different_exponents(sci_num0, exponent0, sci_num1, exponent2);
        }
        else if (exponent0.numL(exponent2)) {
            result = scientific_number_plus_different_exponents(sci_num1, exponent2, sci_num0, exponent0);
        }
        if (scientific_number_utilities.NIL != scientific_numbers.scientific_number_zero_p(result)) {
            return scientific_numbers.new_scientific_number((SubLObject)scientific_number_utilities.ZERO_INTEGER, (SubLObject)scientific_number_utilities.ZERO_INTEGER);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 14200L)
    public static SubLObject scientific_number_plus_same_exponent(final SubLObject sci_num0, final SubLObject sci_num1, final SubLObject exponent) {
        final SubLObject sig_digits0 = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num0);
        final SubLObject sig_digits2 = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num1);
        final SubLObject sig_digits3 = Numbers.min(sig_digits0, sig_digits2);
        final SubLObject new_sci0 = number_utilities.significant_digits(sci_num0, sig_digits3);
        final SubLObject new_sci2 = number_utilities.significant_digits(sci_num1, sig_digits3);
        final SubLObject significand0 = scientific_numbers.scientific_number_significand(new_sci0);
        final SubLObject significand2 = scientific_numbers.scientific_number_significand(new_sci2);
        final SubLObject sum = Numbers.add(significand0, significand2);
        final SubLObject sum_length = number_utilities.decimal_integer_length(sum);
        final SubLObject difference = Numbers.subtract(sum_length, sig_digits3);
        final SubLObject new_exponent = Numbers.add(exponent, difference);
        return scientific_numbers.new_scientific_number(sum, new_exponent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 14948L)
    public static SubLObject scientific_number_plus_different_exponents(final SubLObject sci_num_large, final SubLObject exponent_large, final SubLObject sci_num_small, final SubLObject exponent_small) {
        final SubLObject exponent_diff = Numbers.subtract(exponent_large, exponent_small);
        final SubLObject significand_large = scientific_numbers.scientific_number_significand(sci_num_large);
        final SubLObject guarded_significand_large = Numbers.multiply((SubLObject)scientific_number_utilities.TEN_INTEGER, significand_large);
        final SubLObject guarded_sci_num_large = scientific_numbers.new_scientific_number(guarded_significand_large, exponent_large);
        final SubLObject sig_digits_large = scientific_numbers.cyc_scientific_number_significant_digit_count(guarded_sci_num_large);
        final SubLObject sig_digits_small = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num_small);
        if (exponent_diff.numGE(sig_digits_large)) {
            return scientific_numbers.copy_scientific_number(sci_num_large);
        }
        final SubLObject sig_digits = Numbers.min(sig_digits_large, Numbers.add(exponent_diff, sig_digits_small));
        final SubLObject new_sci_num_large = number_utilities.significant_digits(guarded_sci_num_large, sig_digits);
        final SubLObject new_sci_num_small = number_utilities.significant_digits(sci_num_small, Numbers.subtract(sig_digits, exponent_diff));
        final SubLObject new_significand_large = scientific_numbers.scientific_number_significand(new_sci_num_large);
        final SubLObject new_significand_small = scientific_numbers.scientific_number_significand(new_sci_num_small);
        final SubLObject sum = Numbers.add(new_significand_large, new_significand_small);
        final SubLObject new_sig_digits = Numbers.min(Numbers.subtract(sig_digits_large, (SubLObject)scientific_number_utilities.ONE_INTEGER), Numbers.add(sig_digits_small, exponent_diff));
        final SubLObject sum_length = number_utilities.decimal_integer_length(sum);
        final SubLObject adjustment_factor = Numbers.subtract(sum_length, sig_digits);
        final SubLObject new_exponent = Numbers.add(exponent_large, adjustment_factor);
        final SubLObject almost_final_sig_digits = Numbers.add(new_sig_digits, adjustment_factor);
        final SubLObject initial_result = almost_final_sig_digits.numG((SubLObject)scientific_number_utilities.ZERO_INTEGER) ? scientific_numbers.new_scientific_number(sum, new_exponent) : scientific_numbers.new_scientific_number(number_utilities.significant_digits(Numbers.integerDivide(sum, (SubLObject)scientific_number_utilities.TEN_INTEGER), (SubLObject)scientific_number_utilities.ONE_INTEGER), Numbers.add(new_exponent, (SubLObject)scientific_number_utilities.ONE_INTEGER));
        final SubLObject final_sig_digits = (SubLObject)(almost_final_sig_digits.numG((SubLObject)scientific_number_utilities.ZERO_INTEGER) ? almost_final_sig_digits : scientific_number_utilities.ONE_INTEGER);
        return number_utilities.significant_digits(initial_result, final_sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 16849L)
    public static SubLObject scientific_number_minus(final SubLObject sci_num0, final SubLObject sci_num1) {
        final SubLObject significand1 = scientific_numbers.scientific_number_significand(sci_num1);
        final SubLObject exponent1 = scientific_numbers.scientific_number_exponent(sci_num1);
        final SubLObject new_sci_num1 = scientific_numbers.new_scientific_number(Numbers.minus(significand1), exponent1);
        return scientific_number_plus(sci_num0, new_sci_num1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 17408L)
    public static SubLObject scientific_number_log(final SubLObject sci_num, SubLObject base) {
        if (base == scientific_number_utilities.UNPROVIDED) {
            base = scientific_number_utilities.$scientific_number_e$.getGlobalValue();
        }
        assert scientific_number_utilities.NIL != extended_numbers.extended_number_p(base) : base;
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        if (base.numE((SubLObject)scientific_number_utilities.TEN_INTEGER)) {
            return scientific_number_log10(sci_num);
        }
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
        final SubLObject new_num = Numbers.log(real_sci_num, base);
        return scientific_numbers.scientific_number_from_subl_real(new_num, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 17928L)
    public static SubLObject scientific_number_log10(final SubLObject sci_num) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        final SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        final SubLObject exponent_length = number_utilities.decimal_integer_length(exponent);
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject new_significand = Numbers.log(Numbers.divide(significand, Numbers.expt((SubLObject)scientific_number_utilities.TEN_INTEGER, Numbers.subtract(sig_digits, (SubLObject)scientific_number_utilities.ONE_INTEGER))), (SubLObject)scientific_number_utilities.TEN_INTEGER);
        final SubLObject new_number = Numbers.add(exponent, new_significand);
        final SubLObject new_sig_digits = Numbers.add(sig_digits, exponent_length);
        return scientific_numbers.scientific_number_from_subl_real(new_number, new_sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 18557L)
    public static SubLObject scientific_number_antilog(final SubLObject sci_num, final SubLObject base) {
        return scientific_number_expt(base, sci_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 18664L)
    public static SubLObject scientific_number_antilog10(final SubLObject sci_num) {
        return scientific_number_expt((SubLObject)scientific_number_utilities.TEN_INTEGER, sci_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 18766L)
    public static SubLObject scientific_number_sqrt(final SubLObject sci_num) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject old_exponent = scientific_numbers.scientific_number_exponent(sci_num);
        final SubLObject new_exponent = Numbers.floor(Numbers.divide(old_exponent, (SubLObject)scientific_number_utilities.TWO_INTEGER), (SubLObject)scientific_number_utilities.UNPROVIDED);
        final SubLObject old_significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject old_significand_float = (SubLObject)(old_significand.isZero() ? scientific_number_utilities.ZERO_INTEGER : Numbers.divide(old_significand, Numbers.expt((SubLObject)scientific_number_utilities.TEN_INTEGER, Numbers.truncate(Numbers.log(Numbers.abs(old_significand), (SubLObject)scientific_number_utilities.TEN_INTEGER), (SubLObject)scientific_number_utilities.UNPROVIDED))));
        final SubLObject new_significand_square = (scientific_number_utilities.NIL != Numbers.oddp(old_exponent)) ? Numbers.multiply((SubLObject)scientific_number_utilities.TEN_INTEGER, old_significand_float) : old_significand_float;
        final SubLObject new_significand_float = (SubLObject)(new_significand_square.isZero() ? scientific_number_utilities.ZERO_INTEGER : number_utilities.significant_digits(Numbers.sqrt(new_significand_square), sig_digits));
        final SubLObject new_significand = reader.read_from_string(Sequences.remove((SubLObject)Characters.CHAR_period, print_high.princ_to_string(new_significand_float), (SubLObject)scientific_number_utilities.UNPROVIDED, (SubLObject)scientific_number_utilities.UNPROVIDED, (SubLObject)scientific_number_utilities.UNPROVIDED, (SubLObject)scientific_number_utilities.UNPROVIDED, (SubLObject)scientific_number_utilities.UNPROVIDED), (SubLObject)scientific_number_utilities.UNPROVIDED, (SubLObject)scientific_number_utilities.UNPROVIDED, (SubLObject)scientific_number_utilities.UNPROVIDED, (SubLObject)scientific_number_utilities.UNPROVIDED, (SubLObject)scientific_number_utilities.UNPROVIDED);
        return scientific_numbers.new_scientific_number(new_significand, new_exponent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 19742L)
    public static SubLObject scientific_number_expt10(final SubLObject sci_num) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        final SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
        final SubLObject new_num = Numbers.expt((SubLObject)scientific_number_utilities.TEN_INTEGER, real_sci_num);
        final SubLObject new_sig_digits = Numbers.max(Numbers.subtract(sig_digits, exponent, (SubLObject)scientific_number_utilities.ONE_INTEGER), (SubLObject)scientific_number_utilities.ONE_INTEGER);
        return scientific_numbers.scientific_number_from_subl_real(new_num, new_sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 20214L)
    public static SubLObject scientific_number_expt(final SubLObject base, final SubLObject sci_num) {
        assert scientific_number_utilities.NIL != extended_numbers.extended_number_p(base) : base;
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        if (base.numE((SubLObject)scientific_number_utilities.TEN_INTEGER)) {
            return scientific_number_expt10(sci_num);
        }
        final SubLObject new_base = (scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(base)) ? scientific_numbers.cyc_scientific_number_to_subl_real(base) : base;
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
        final SubLObject new_num = Numbers.expt(new_base, real_sci_num);
        return scientific_numbers.scientific_number_from_subl_real(new_num, sig_digits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/scientific-number-utilities.lisp", position = 20824L)
    public static SubLObject scientific_number_exp(final SubLObject sci_num) {
        assert scientific_number_utilities.NIL != scientific_numbers.scientific_number_p(sci_num) : sci_num;
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
        final SubLObject new_num = Numbers.exp(real_sci_num);
        return scientific_numbers.scientific_number_from_subl_real(new_num, sig_digits);
    }
    
    public static SubLObject declare_scientific_number_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_abs", "SCIENTIFIC-NUMBER-ABS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_negate", "SCIENTIFIC-NUMBER-NEGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_integer_part", "SCIENTIFIC-NUMBER-INTEGER-PART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_significant_digits", "SCIENTIFIC-NUMBER-SIGNIFICANT-DIGITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_eql", "SCIENTIFIC-NUMBER-EQL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_comparison_significant_digits", "SCIENTIFIC-NUMBER-COMPARISON-SIGNIFICANT-DIGITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_numberE", "SCIENTIFIC-NUMBER=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_integerE", "SCIENTIFIC-NUMBER-INTEGER=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "integer_scientific_numberE", "INTEGER-SCIENTIFIC-NUMBER=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_numberG", "SCIENTIFIC-NUMBER>", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_integerG", "SCIENTIFIC-NUMBER-INTEGER>", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "integer_scientific_numberG", "INTEGER-SCIENTIFIC-NUMBER>", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_numberGE", "SCIENTIFIC-NUMBER>=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_integerGE", "SCIENTIFIC-NUMBER-INTEGER>=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "integer_scientific_numberGE", "INTEGER-SCIENTIFIC-NUMBER>=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_numberL", "SCIENTIFIC-NUMBER<", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_integerL", "SCIENTIFIC-NUMBER-INTEGER<", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "integer_scientific_numberL", "INTEGER-SCIENTIFIC-NUMBER<", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_numberLE", "SCIENTIFIC-NUMBER<=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_integerLE", "SCIENTIFIC-NUMBER-INTEGER<=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "integer_scientific_numberLE", "INTEGER-SCIENTIFIC-NUMBER<=", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_times", "SCIENTIFIC-NUMBER-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_integer_times", "SCIENTIFIC-NUMBER-INTEGER-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "integer_scientific_number_times", "INTEGER-SCIENTIFIC-NUMBER-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_inverse", "SCIENTIFIC-NUMBER-INVERSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_quotient", "SCIENTIFIC-NUMBER-QUOTIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_integer_quotient", "SCIENTIFIC-NUMBER-INTEGER-QUOTIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "integer_scientific_number_quotient", "INTEGER-SCIENTIFIC-NUMBER-QUOTIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_plus", "SCIENTIFIC-NUMBER-PLUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_plus_same_exponent", "SCIENTIFIC-NUMBER-PLUS-SAME-EXPONENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_plus_different_exponents", "SCIENTIFIC-NUMBER-PLUS-DIFFERENT-EXPONENTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_minus", "SCIENTIFIC-NUMBER-MINUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_log", "SCIENTIFIC-NUMBER-LOG", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_log10", "SCIENTIFIC-NUMBER-LOG10", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_antilog", "SCIENTIFIC-NUMBER-ANTILOG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_antilog10", "SCIENTIFIC-NUMBER-ANTILOG10", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_sqrt", "SCIENTIFIC-NUMBER-SQRT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_expt10", "SCIENTIFIC-NUMBER-EXPT10", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_expt", "SCIENTIFIC-NUMBER-EXPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.scientific_number_utilities", "scientific_number_exp", "SCIENTIFIC-NUMBER-EXP", 1, 0, false);
        return (SubLObject)scientific_number_utilities.NIL;
    }
    
    public static SubLObject init_scientific_number_utilities_file() {
        scientific_number_utilities.$scientific_number_e$ = SubLFiles.defconstant("*SCIENTIFIC-NUMBER-E*", (SubLObject)scientific_number_utilities.$list3);
        return (SubLObject)scientific_number_utilities.NIL;
    }
    
    public static SubLObject setup_scientific_number_utilities_file() {
        return (SubLObject)scientific_number_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_scientific_number_utilities_file();
    }
    
    public void initializeVariables() {
        init_scientific_number_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_scientific_number_utilities_file();
    }
    
    static {
        me = (SubLFile)new scientific_number_utilities();
        scientific_number_utilities.$scientific_number_e$ = null;
        $sym0$SCIENTIFIC_NUMBER_P = SubLObjectFactory.makeSymbol("SCIENTIFIC-NUMBER-P");
        $sym1$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym2$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $list3 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScientificNumberFn")), (SubLObject)SubLObjectFactory.makeInteger("2718281828459045"), (SubLObject)scientific_number_utilities.ZERO_INTEGER);
        $sym4$EXTENDED_NUMBER_P = SubLObjectFactory.makeSymbol("EXTENDED-NUMBER-P");
    }
}

/*

	Total time: 186 ms
	
*/