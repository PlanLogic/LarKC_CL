;;; apropos.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id$
;;;
;;; This program is free software; you can redistribute it and/or
;;; modify it under the terms of the GNU General Public License
;;; as published by the Free Software Foundation; either version 2
;;; of the License, or (at your option) any later version.
;;;
;;; This program is distributed in the hope that it will be useful,
;;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;;; GNU General Public License for more details.
;;;
;;; You should have received a copy of the GNU General Public License
;;; along with this program; if not, write to the Free Software
;;; Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
;;;
;;; As a special exception, the copyright holders of this library give you
;;; permission to link this library with independent modules to produce an
;;; executable, regardless of the license terms of these independent
;;; modules, and to copy and distribute the resulting executable under
;;; terms of your choice, provided that you also meet, for each linked
;;; independent module, the terms and conditions of the license of that
;;; module.  An independent module is a module which is not derived from
;;; or based on this library.  If you modify this library, you may extend
;;; this exception to your version of the library, but you are not
;;; obligated to do so.  If you do not wish to do so, delete this
;;; exception statement from your version.

;;; Adapted from SBCL.

(in-package #:system)

(defun apropos-list  (string-designator &optional package-designator &keys (external-only nil external-only-supplied-p))
   (sys::apropos-list-eo string-designator package-designator (and external-only-supplied-p external-only)))
(defun apropos  (string-designator &optional package-designator &keys (external-only nil external-only-supplied-p))
   (sys::apropos-eo string-designator package-designator (and external-only-supplied-p external-only)))


(defun sys::apropos-list-eo (string-designator package-designator
                                                 external-only)
  (if package-designator
      (let ((package (find-package package-designator))
            (string (string string-designator))
            (result nil))
        (dolist (symbol (package-external-symbols package))
          (declare (type symbol symbol))
          (when (search string (symbol-name symbol) :test #'char-equal)
            (push symbol result)))
        (unless external-only
          (dolist (symbol (package-internal-symbols package))
            (declare (type symbol symbol))
            (when (search string (symbol-name symbol) :test #'char-equal)
              (push symbol result))))
        result)
      (mapcan (lambda (package)
                (sys::apropos-list-eo string-designator package external-only))
              (list-all-packages))))


(defun sys::apropos-eo (string-designator package-designator external-only)
  (dolist (symbol (remove-duplicates (sys::apropos-list-eo string-designator
                                                   package-designator
                                                   external-only)))
    (fresh-line)
    (prin1 symbol)
    (when (boundp symbol)
      (write-string " (bound)"))
    (when (fboundp symbol)
      (write-string " (fbound)")))
    (values))