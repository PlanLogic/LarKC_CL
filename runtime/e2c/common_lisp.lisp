(DEFINE COERCE (VALUE RESULT-TYPE)
  (CLET ((LEN VALUE)
         (VTYPE (TYPE-OF VALUE))
         (CLTYPE RESULT-TYPE))
        (PWHEN (EQUAL RESULT-TYPE VTYPE)
               (RET VALUE))
        (FUNLESS (CAND (CONSP CLTYPE)
                      (CSETQ LEN (SECOND CLTYPE))
                      (CSETQ CLTYPE (CAR CLTYPE)))
          (FIF
           (CONSP VALUE)
           (CSETQ LEN (LENGTH VALUE))))
        (PCASE CLTYPE ('T (RET VALUE))
               ('SEQUENCE
                (FIF
                 (SEQUENCEP VALUE)
                 (RET (COPY-SEQ VALUE))
                 (CSETQ VALUE (WRITE-TO-STRING VALUE)))
                (CSETQ CLTYPE (MAKE-VECTOR LEN))
                (CDO ((IDX 0 (+ 1 IDX)))
                     ((= IDX LEN)
                      (RET CLTYPE ))
                     (SET-AREF CLTYPE IDX (ELT VALUE IDX))))
               ('CHARACTER
                (PCOND
                 ((CHARACTERP VALUE)
                  (RET VALUE))
                 ((NUMBERP VALUE)
                  (RET (CODE-CHAR VALUE)))
                 ((STRINGP VALUE)
                  (RET (CHAR VALUE 0)))
                 (T (RET (CHAR (COERCE VALUE 'STRING ) 0)))))
               ('NUMBER
                (PCOND
                 ((NUMBERP VALUE)
                  (RET VALUE))
                 ((CHARACTERP VALUE)
                  (RET (CHAR-CODE VALUE)))
                 ((STRINGP VALUE)
                  (RET (STRING-TO-NUMBER VALUE)))
                 (T (RET (STRING-TO-NUMBER (WRITE-TO-STRING VALUE))))))
               ('INTEGER (RET (ROUND (COERCE VALUE 'NUMBER))))
               ('FIXNUM (RET (ROUND (COERCE VALUE 'NUMBER))))
               ('FLOAT (RET (FLOAT (COERCE VALUE 'NUMBER))))
               ('REAL (RET (FLOAT (COERCE VALUE 'NUMBER))))
               ('FLONUM (RET (FLOAT (COERCE VALUE 'NUMBER))))
               ('STRING
                (PCOND
                 ((STRINGP VALUE)
                  (RET VALUE))
                 ((CHARACTERP VALUE)
                  (RET (MAKE-STRING 1 VALUE)))
                 ((SEQUENCEP VALUE)
                  (CSETQ CLTYPE (MAKE-STRING LEN))
                  (CDO ((IDX 0 (+ 1 IDX)))
                       ((= IDX LEN)
                        (RET CLTYPE ))
                       (SET-AREF CLTYPE IDX (COERCE (ELT VALUE IDX) 'CHARACTER))))
                 (T (RET (WRITE-TO-STRING VALUE)))))
               ('LIST
                (PCOND
                 ((LISTP VALUE)
                  (RET LIST))
                 ((SEQUENCEP VALUE)
                  (CSETQ CLTYPE NIL)
                  (CDO ((IDX LEN (- IDX 1)))
                       ((= IDX 0)
                        (RET CLTYPE ))
                       (CSETQ CLTYPE (CONS (ELT VALUE IDX) CLTYPE))))
                 (T (CSETQ CLTYPE NIL)
                    (CSETQ VALUE (WRITE-TO-STRING VALUE))
                    (CDO ((IDX LEN (- IDX 1)))
                         ((= IDX 0)
                          (RET CLTYPE ))
                         (CSETQ CLTYPE (CONS (ELT VALUE IDX) CLTYPE))))))
               ('CONS
                (PCOND
                 ((LISTP VALUE)
                  (RET LIST))
                 ((SEQUENCEP VALUE)
                  (CSETQ CLTYPE NIL)
                  (CDO ((IDX LEN (- IDX 1)))
                       ((= IDX 0)
                        (RET CLTYPE ))
                       (CSETQ CLTYPE (CONS (ELT VALUE IDX) CLTYPE))))
                 (T (CSETQ CLTYPE NIL)
                    (CSETQ VALUE (WRITE-TO-STRING VALUE))
                    (CDO ((IDX LEN (- IDX 1)))
                         ((= IDX 0)
                          (RET CLTYPE ))
                         (CSETQ CLTYPE (CONS (ELT VALUE IDX) CLTYPE))))))
               ('KEYPAIR
                (PCOND
                 ((ATOM VALUE)
                  (RET LIST VALUE))
                 (T (RET (COERCE VALUE 'CONS)))))
               ('ALIST (CSETQ CLTYPE (CSETQ CLTYPE NIL))
                (FIF
                 (SEQUENCEP VALUE) T (CSETQ VALUE (COERCE VALUE 'SEQUENCE)))
                (CDO ((IDX 0 (+ 1 IDX)))
                     ((= IDX LEN)
                      (RET CLTYPE))
                     (CSETQ RESULT-TYPE (COERCE (ELT VALUE IDX) 'CONS))
                     (CSETQ CLTYPE (ACONS (CAR RESULT-TYPE)
                                          (CDR RESULT-TYPE) CLTYPE)))
                (RET CLTYPE))
               ('HASH-TABLE
                (FIF
                 (HASH-TABLE-P VALUE)
                 (RET VALUE))
                (CSETQ CLTYPE (MAKE-HASH-TABLE LEN))
                (FIF
                 (SEQUENCEP VALUE) T (CSETQ VALUE (COERCE VALUE 'SEQUENCE)))
                (CDO ((IDX 0 (+ 1 IDX)))
                     ((= IDX LEN)
                      (RET CLTYPE))
                     (PRINT (LIST 'COERCE VALUE RESULT-TYPE CLTYPE LEN (ELT VALUE IDX)))
                     (CSETQ RESULT-TYPE (COERCE (ELT VALUE IDX) 'KEYPAIR))
                     (SETHASH (CAR RESULT-TYPE) CLTYPE (CDR RESULT-TYPE))))
               (OTHERWISE (RET VALUE)))
        (THROW :COERCE (LIST VALUE RESULT-TYPE)))
  (RET VALUE))

'(
  
  (DEFCONSTANT *DTP-DELAY* 'DELAY)
  
  (DEFINE DELAY-P (SUBLISP::OBJECT)
    (RET (CAND (SUBLISP::_STRUCTURES-BAG-P SUBLISP::OBJECT)
               (EQ (SUBLISP::_STRUCTURE-SLOT SUBLISP::OBJECT 1) *DTP-DELAY*))))
  
  (DEFINE DELAY-VALUE (SUBLISP::OBJECT)
    (CHECK-TYPE SUBLISP::OBJECT DELAY-P)
    (RET (SUBLISP::_STRUCTURE-SLOT SUBLISP::OBJECT 2)))
  
  (DEFINE DELAY-FUNCTION (SUBLISP::OBJECT)
    (CHECK-TYPE SUBLISP::OBJECT DELAY-P)
    (RET (SUBLISP::_STRUCTURE-SLOT SUBLISP::OBJECT 3)))
  
  (DEFINE _CSETF-DELAY-VALUE (SUBLISP::OBJECT SUBLISP::VALUE)
    (CHECK-TYPE SUBLISP::OBJECT DELAY-P)
    (RET (SUBLISP::_SET-STRUCTURE-SLOT SUBLISP::OBJECT 2 SUBLISP::VALUE)))
  
  (DEFINE _CSETF-DELAY-FUNCTION (SUBLISP::OBJECT SUBLISP::VALUE)
    (CHECK-TYPE SUBLISP::OBJECT DELAY-P)
    (RET (SUBLISP::_SET-STRUCTURE-SLOT SUBLISP::OBJECT 3 SUBLISP::VALUE)))
  (SUBLISP::_DEF-CSETF 'DELAY-VALUE '_CSETF-DELAY-VALUE)
  (SUBLISP::_DEF-CSETF 'DELAY-FUNCTION '_CSETF-DELAY-FUNCTION)
  
  (DEFINE MAKE-DELAY (&OPTIONAL SUBLISP::ARGLIST)
    (CLET ((SUBLISP::NEW (SUBLISP::_NEW-STRUCTURE *DTP-STRUCTURES-BAG* 2)))
          (SUBLISP::_CLEAR-SUB-STRUCTURE SUBLISP::NEW 2 *DTP-DELAY*)
          (CLET ((#:NEXT SUBLISP::ARGLIST))
                (LOOP
                  (FIF
                   #:NEXT
                   
                   (CLET ((#:CURRENT-ARG (CAR #:NEXT))
                          (#:CURRENT-VALUE (CADR #:NEXT)))
                         (PCASE #:CURRENT-ARG
                                (:VALUE (_CSETF-DELAY-VALUE SUBLISP::NEW #:CURRENT-VALUE))
                                (:FUNCTION (_CSETF-DELAY-FUNCTION SUBLISP::NEW #:CURRENT-VALUE))
                                (OTHERWISE (ERROR (FORMAT NIL "INVALID SLOT ~S FOR CONSTRUCTION FUNCTION" #:CURRENT-ARG))))
                         (CSETQ #:NEXT (CDDR #:NEXT)))
                   (RET SUBLISP::NEW))))
          (RET SUBLISP::NEW)))
  (IDENTITY 'DELAY))





(DEFMACRO CATCH (TAG &BODY BODY)
  (RET `(APPLY #'VALUES
               (CLET ((*THROWN* :UNTHROWN)
                      (*RESULT* :UNEVALED))(TERPRI)
                     (CCATCH ,TAG *THROWN* (CSETQ *RESULT* (MULTIPLE-VALUE-LIST (PROGN ,@BODY))))
                     (PCOND
                      ((EQUAL *RESULT* :UNEVALED)
                       (LIST *THROWN*))
                      (T *RESULT*))))))



(DEFMACRO CL-LOOP (&REST EXPS)
  ;;"SUPPORTS BOTH ANSI AND SIMPLE LOOP.  WARNING: NOT EVERY LOOP KEYWORD IS SUPPORTED."
  (FORMAT T "~%~S~%" `(LOOP ,@EXPS))(FORCE-OUTPUT)
  (PUNLESS (MEMBER-IF #'SYMBOLP EXPS) (RET `(LOOP ,@EXPS))) 
  (PCASE (CAR EXPS) 
      ((UNTIL WHILE) (RET EXPS))
      (FOR (BREAK "CL-LOOP"))
      (REPEAT (BREAK "CL-LOOP"))
      (OTHERWISE (RET `(LOOP ,@EXPS)))))

;;(DEFMACRO CL-LOOP (&REST FORMS) (RET `(LOOP ,@FORMS)))

(DEFINE BREAK-STRING-AT (STRING BREAK-CHAR) 
  (FUNLESS (STRING= STRING "") 
    (CLET ((CHARAT (POSITION BREAK-CHAR STRING)))(RET (FIF CHARAT (CONS (SUBSEQ STRING 0 CHARAT) 
      (BREAK-STRING-AT (SUBSEQ STRING (+ 1 CHARAT)) BREAK-CHAR)) (LIST STRING))))))

(DEFINE BINDINGS-FOR (PATTERN)
  (CLET ((COLLECT ()))
   (DOLIST (VAR (VARIABLES-IN PATTERN))
	 (SETQ COLLECT (APPEND COLLECT (LIST (CDR (ASSOC VAR *BINDINGS*))))))
    (RET COLLECT)))

(DEFINE COMPILE-RULES (RULES VAR)
 ;; "A RULES IS OF THE FORM (PAT CODE) WHERE CODE MAY REFERENCE VARS IN PAT."
 (CLET ((COLLECT ()))
  (DOLIST (PATTERN+CONSEQUENT RULES)
    (CSETQ COLLECT (APPEND COLLECT (LIST (COMPILE-RULE (FIRST PATTERN+CONSEQUENT)(SECOND PATTERN+CONSEQUENT) VAR)))))
  (RET (CREDUCE #'MERGE-CODE COLLECT))))

(DEFINE EXPLODE (STRING) 
   (FUNLESS (STRING= STRING "")  
     (CLET ((RESULT ())(LEN (LENGTH STRING)))
      (CDO ((NDX (- LEN 1) (- NDX 1))(RESULT (CONS (CHAR STRING NDX) RESULT)(CONS (CHAR STRING NDX) RESULT))) ((= NDX 0)(RET RESULT))))))

(DEFMACRO CONCATENATE (CLTYPE &BODY ARGS)
  (RET `(COERCE (CCONCATENATE ,@ARGS) ,CLTYPE)))

(DEFINE MAP-SEQUENCES (FUNCTION SEQUENCES)
  (RET (FIF
        (MEMBER () SEQUENCES) ()
        (CONS (APPLY FUNCTION (MAPCAR #'CAR SEQUENCES))
              (MAP-SEQUENCES FUNCTION (MAPCAR #'CDR SEQUENCES))))))

(DEFINE MAP (RESULT-TYPE FUNCTION &BODY SEQUENCES)
  (RET (FIF
        RESULT-TYPE (COERCE (MAP-SEQUENCES FUNCTION SEQUENCES) RESULT-TYPE)
        (PROGN (MAP-SEQUENCES FUNCTION SEQUENCES) NIL))))



(DEFMACRO DESTRUCTURING-BIND (ARGS DATUM &BODY BODY)(RET `(CDESTRUCTURING-BIND ,ARGS ,DATUM ,@BODY)))
(DEFMACRO MULTIPLE-VALUE-BIND (ARGS DATUM &BODY BODY)(RET `(CMULTIPLE-VALUE-BIND ,ARGS ,DATUM ,@BODY)))
;;(DEFMACRO CMULTIPLE-VALUE-LIST (VALUE &REST IGNORE)(RET `(MULTIPLE-VALUE-LIST ,VALUE)))

(DEFINE CONCAT (&REST LIST)
  (RET (APPLY #'CCONCATENATE (CONS "" (MAPCAR #'(LAMBDA (X)(RET (FIF (STRINGP X) X (COERCE X 'STRING) ))) LIST)))))

(DEFMACRO CL-DEFSTRUCT (NAME &REST REST)
  (CLET ((SLOTS (MAPCAR #'(LAMBDA(X)(RET (FIF
                                          (ATOM X) X (CAR X)))) REST)))
        (RET `(DEFSTRUCT (,NAME) ,@SLOTS))))

(DEFINE CL-MAKE-STRING (&REST REST)
  (RET (MAKE-STRING (FIND 'NUMBERP REST #'FUNCALL)
                    (FIND #'CHARACTERP REST 'FUNCALL))))

(DEFINE CL-MAKE-HASH-TABLE (&REST REST)
  (CLET ((SIZE (FIND 'NUMBERP REST #'FUNCALL)))
        (RET (MAKE-HASH-TABLE
              (FIF
               SIZE SIZE 64)
              (FIND #'FUNCTIONP REST 'FUNCALL)))))

(DEFINE MAKE-ARRAY (&REST REST)
  (CLET ((SIZE (FIND 'NUMBERP REST #'FUNCALL)))
        (RET (MAKE-VECTOR
              (FIF
               SIZE SIZE 64)
              (FIND #'FUNCTIONP REST 'FUNCALL)))))

(DEFMACRO CASE (TEST &REST FORMS) (RET `(PCASE ,TEST ,(MAPCAR #'(LAMBDA (X) (RET `(,(CAR X)(TRACE-PROGN ,(CDR X))) )) FORMS))))
(DEFMACRO CASE (TEST &REST FORMS) (RET `(PCASE ,TEST ,@FORMS)))

(DEFMACRO COND (&REST FORMS) (RET (CONS 'PCOND (MAPCAR #'(LAMBDA (X) (RET `(,(CAR X)(TRACE-PROGN ,(CDR X))) )) FORMS) )))
(DEFMACRO COND (&REST FORMS) (RET `(PCOND ,@FORMS)))

(DEFMACRO OR (&rest forms) 
  (ret (fif forms (fif (cdr forms) 
        `(PCOND ((TRACE-LISP ,(car forms))) ((OR ,@(cdr forms))))
        `(TRACE-LISP ,(car forms))))))

(DEFMACRO AND (&rest forms) 
 (ret (fif forms (fif (cdr forms) 
        `(PWHEN (TRACE-LISP ,(car forms)) (AND ,@(cdr forms)))
        `(TRACE-LISP ,(car forms))))))


(DEFMACRO CL-READ (&REST FORMS)             
            (terpri)
            (RET (CONS 'READ FORMS)))


(DEFMACRO COND (&REST FORMS) (RET (CONS 'PCOND FORMS)))
(DEFMACRO CASE (&REST FORMS) (RET (CONS 'PCASE FORMS)))

(DEFVAR PLEVEL ())
(CSETQ PLEVEL ())

(DEFMACRO TRACE-FORMAT (STRING &REST REST) 
   (IF *FIRST-ERROR* 
     (RET `(PROGN 
          (FORMAT T "~%;;~A;; " (reverse PLEVEL))
          (FORMAT T ,STRING ,@REST)
          (FORCE-OUTPUT))
          (RET NIL))))

(DEFMACRO TRACE-DEFUN (NAME ARGS &rest FORMS)  
 (ret
   `(progn 
     (clet ((*FIRST-ERROR* T))
      (TRACE-FORMAT "FUNCALL: ~S" (CONS ,NAME (MAPCAR #'(LAMBDA (X) (RET (list 'QUOTE X))) ',ARGS))))
      (clet ((PLEVEL (cons ,NAME PLEVEL))) (TRACE-PROGN ,@FORMS)))))

(DEFMACRO TRACE-PROGN (&REST FORMS) 
  (RET (CONS 'PROGN (MAPCAR #'(LAMBDA (X) (RET `(TRACE-LISP ,X ))) FORMS) )))

(DEFMACRO ERROR-HANDLER-FOR (CODE)
  (RET `(FUNCTION (LAMBDA () 
                    (WITH-ERROR-HANDLER 
                        #'(LAMBDA () (TRACE-FORMAT "ERROR ~S DURRING HANDLER~%" *ERROR-MESSAGE*))
                      (PROGN 
                          (FUNLESS *FIRST-ERROR* (CSETQ *FIRST-ERROR* (list *ERROR-MESSAGE* ',CODE)))
                          (CSETQ *LAST-ERROR* (list *ERROR-MESSAGE* ',CODE))
                          (CINC *ERROR-NUMBER*)                      
                          (TRACE-FORMAT "ERROR ~S DURRING: ~S ~%" *ERROR-MESSAGE* ',CODE)
                          (PWHEN (> *ERROR-NUMBER* 0) (RET (BREAK "ERROR-HANDLER-FOR")))(RET NIL)))))))

(DEFVAR *ERROR-NUMBER* 0)
(CSETQ *ERROR-NUMBER* 1)

(DEFMACRO TRACE-LISP (CODE)
  (RET 
   `(progn 
      (WITH-ERROR-HANDLER 
        #'(LAMBDA () (TRACE-FORMAT "   ERROR ~S DURRING DEBUG~%" *ERROR-MESSAGE*))
          (TRACE-FORMAT "DEBUGGING: ~S => " ',CODE))
      (WITH-ERROR-HANDLER
        (ERROR-HANDLER-FOR ',CODE)
        (CLET ((RESULT ,CODE)) (TRACE-FORMAT " ~S~%" RESULT) RESULT)))))

(DEFVAR *FIRST-ERROR* NIL)
(DEFVAR *LAST-ERROR* NIL)
(CSETQ *FIRST-ERROR* T)
(CSETQ *LAST-ERROR* T)


(DEFMACRO PROG1 (BODY1 &BODY BODY) (RET `(CLET ((PROG1RES ,BODY1)) ,@BODY PROG1RES)))
(DEFMACRO PROG2 (BODY1 BODY2 &BODY BODY) (RET `(CLET ((PROG1RES ,BODY1)(PROG2RES ,BODY2)) ,@BODY PROG2RES)))
(DEFMACRO PROG3 (BODY1 BODY2 BODY3 &BODY BODY) (RET `(CLET ((PROG1RES ,BODY1)(PROG2RES ,BODY2)(PROG3RES ,BODY3)) ,@BODY PROG3RES)))
(DEFMACRO MEMQ (ITEM MY-LIST) `(MEMBER ,ITEM ,MY-LIST :TEST #'EQ))

(DEFVAR INTERNAL-TIME-UNITS-PER-SECOND *INTERNAL-TIME-UNITS-PER-SECOND*)

(DEFMACRO PUSH (ITEM PLACE) (RET `(PROGN (CPUSH ,ITEM ,PLACE) ,PLACE)))
(DEFMACRO PUSH (ITEM PLACE) (RET (LIST 'CPUSH ITEM PLACE)))
(defmacro POP (place) (ret `(CLET ((f1rst (CAR ,place))) (CPOP ,place) f1rst)))

(DEFMACRO GETLKEY (KEY &OPTIONAL DEFAULT) 
  (RET 
   `(CSETQ ,KEY 
     (PCOND 
        ((CAR (CDR (MEMBER-IF #'(LAMBDA (X)(RET (CAND (SYMBOLP X)(SYMBOLP ,KEY)(EQUAL (SYMBOL-NAME X) (SYMBOL-NAME ,KEY))))) LKEYS))))
        (T ,DEFAULT)))))

(DEFINE CL-MEMBER (ITEM LIST &REST LKEYS)
  (TRACE-DEFUN 'CL-MEMBER (ITEM LIST '&REST LKEYS)())
  (CLET (TEST KEY TEST-NOT)
        (GETLKEY TEST)(GETLKEY KEY)(GETLKEY TEST-NOT)     
        (FUNLESS TEST (CSETQ TEST #'EQL))
        (FUNLESS KEY (CSETQ KEY #'IDENTITY))
        (PWHEN TEST-NOT (CSETQ TEST #'(LAMBDA (X Y)(RET (CNOT (FUNCALL TEST-NOT X Y))))))
        (RET (MEMBER ITEM LIST TEST KEY))))

(DEFINE CL-INTERSECTION (LIST-1 LIST-2 &REST LKEYS)
  (TRACE-DEFUN 'CL-INTERSECTION (LIST-1 LIST-2 '&REST LKEYS)())
  (CLET (TEST KEY TEST-NOT)
        (GETLKEY TEST)(GETLKEY KEY)(GETLKEY TEST-NOT)     
        (FUNLESS KEY (CSETQ KEY #'IDENTITY))
        (FUNLESS TEST (CSETQ TEST #'EQL))
        (PWHEN TEST-NOT (CSETQ TEST #'(LAMBDA (X Y)(RET (CNOT (FUNCALL TEST-NOT X Y))))))
        (RET (INTERSECTION LIST-1 LIST-2 TEST KEY ))))

(DEFINE CL-REMOVE (ITEM LIST &REST LKEYS )
  (TRACE-DEFUN 'CL-REMOVE (ITEM LIST '&REST LKEYS)())
  (CLET (TEST FROM-END TEST-NOT START END COUNT KEY)
        (GETLKEY TEST)(GETLKEY KEY)(GETLKEY TEST-NOT)(GETLKEY FROM-END)(GETLKEY START)(GETLKEY END)(GETLKEY COUNT)
        (FUNLESS KEY (CSETQ KEY #'IDENTITY))
        (FUNLESS TEST (CSETQ TEST #'EQL))
        (PWHEN TEST-NOT (CSETQ TEST #'(LAMBDA (X Y)(RET (CNOT (FUNCALL TEST-NOT X Y))))))
        (FUNLESS START (CSETQ START 0))
        (PWHEN FROM-END (RET (REVERSE (REMOVE ITEM (REVERSE LIST) TEST KEY START END COUNT))))
        (RET (REMOVE ITEM LIST TEST KEY START END COUNT))))

(DEFINE CL-REMOVE-DUPLICATES (LIST &REST LKEYS)
  (TRACE-DEFUN 'CL-REMOVE-DUPLICATES (LIST '&REST LKEYS) ())
  (CLET (TEST FROM-END TEST-NOT START END COUNT KEY)
        (GETLKEY TEST)(GETLKEY KEY)(GETLKEY TEST-NOT)(GETLKEY FROM-END)(GETLKEY START)(GETLKEY END)(GETLKEY COUNT)
        (FUNLESS KEY (CSETQ KEY #'IDENTITY))
        (FUNLESS TEST (CSETQ TEST #'EQL))
        (PWHEN TEST-NOT (CSETQ TEST #'(LAMBDA (X Y)(RET (CNOT (FUNCALL TEST-NOT X Y))))))
        (FUNLESS START (CSETQ START 0))
        (PWHEN FROM-END (RET (REVERSE (REMOVE-DUPLICATES (REVERSE LIST) TEST KEY START END))))
        (RET (REMOVE-DUPLICATES LIST TEST KEY START END))))

(DEFINE CL-DELETE-DUPLICATES (LIST &REST LKEYS)    
  (TRACE-DEFUN 'CL-DELETE-DUPLICATES (LIST '&REST LKEYS)())
  (CLET (TEST FROM-END TEST-NOT START END COUNT KEY)
        (GETLKEY TEST)(GETLKEY KEY)(GETLKEY TEST-NOT)(GETLKEY FROM-END)(GETLKEY START)(GETLKEY END)(GETLKEY COUNT)
        (FUNLESS KEY (CSETQ KEY #'IDENTITY))
        (FUNLESS TEST (CSETQ TEST #'EQL))
        (PWHEN TEST-NOT (CSETQ TEST #'(LAMBDA (X Y)(RET (CNOT (FUNCALL TEST-NOT X Y))))))
        (FUNLESS START (CSETQ START 0))
        (PWHEN FROM-END (RET (REVERSE (DELETE-DUPLICATES (REVERSE LIST) TEST KEY START END))))
        (RET (DELETE-DUPLICATES LIST TEST KEY START END))))

(DEFINE CL-SUBSETP (LIST LIST2 &REST LKEYS)
  (TRACE-DEFUN 'CL-SUBSETP (LIST LIST2 '&REST LKEYS)())
  (CLET (TEST KEY TEST-NOT)
        (GETLKEY TEST)(GETLKEY KEY)(GETLKEY TEST-NOT)     
        (FUNLESS KEY (CSETQ KEY #'IDENTITY))
        (FUNLESS TEST (CSETQ TEST #'EQL))
        (PWHEN TEST-NOT (CSETQ TEST #'(LAMBDA (X Y)(RET (CNOT (FUNCALL TEST-NOT X Y))))))
        (RET (SUBSETP LIST LIST2 TEST KEY))))

(DEFMACRO IF (COND TRUE &OPTIONAL FALSE)
    (RET `(FIF ,COND ,TRUE ,FALSE)))


;;(DEFMACRO HANDLER-CASE (FORM &REST CASES) (PRINT (LIST 'HANDLER-CASE FORM CASES)) (RET `,FORM))
(DEFMACRO HANDLER-CASE (FORM &REST CASES) (RET FORM))
;;(DEFMACRO AND (&REST REST) (RET `(TRACE-LISP ,(CONS 'CAND REST))))
;;(DEFMACRO LET (&REST REST) (RET `(TRACE-LISP ,(CONS 'CLET REST))))
;;(DEFMACRO SETF (&REST REST) (RET `(TRACE-LISP ,(CONS 'CSETF REST))))
;;(DEFMACRO SETQ (&REST REST) (RET `(TRACE-LISP ,(CONS 'CSETQ REST))))
;;(DEFMACRO UNLESS (&REST REST) (RET `(TRACE-LISP ,(CONS 'FUNLESS REST))))
;;(DEFMACRO UNWIND-PROTECT (&REST REST) (RET `(TRACE-LISP ,(CONS 'CUNWIND-PROTECT REST))))

;;(DEFINE CL-GET (SYM PROP);; (PRINT `(GET ,SYM ,PROP ,(GET SYM PROP)))
;;                        (RET `(GET ,SYM ,PROP)))
;;(DEFINE CL-SET (SYM PROP VAL) (PRINT `(SET ,SYM ,PROP ,VAL))(RET `(SET ,SYM ,PROP ,VAL)))
;;(DEFINE CL-GET (SYM PROP) (RET `(GET ,SYM ,PROP )))
;;(DEFINE CL-SET (SYM PROP VAL) (RET `(SET ,SYM ,PROP ,VAL)))


;;(DEFMACRO UNLESS (&REST REST) (RET `(RET (PROGN (PRINT ',FORM) ,FORM))))
;;(DEFMACRO SUBLISP-INITVAR (VAR VALUE) (RET `(FUNLESS ,VAR (CSETQ ,VAR ,VALUE))))
(DEFMACRO SUBLISP-INITVAR (VAR VALUE) (RET `(FUNLESS ,VAR (CSETQ ,VAR ,VALUE))))

(DEFINE CL-STRING-DOWNCASE (STR)
  (RET (PCOND
        ((SYMBOLP STR)
         (STRING-DOWNCASE (SYMBOL-NAME STR)))
        (T (STRING-DOWNCASE STR)))))

#|
(DEFVAR STREAM *STANDARD-INPUT*) 
(DEFVAR EOF-VAL :EOF) 
(DEFVAR REC-P T) 
(DEFVAR EOF-ERR-P NIL) 
(DEFMACRO USER-WARNING (STRING &REST ARGS)
    (RET `(FORMAT T ,STRING ,@ARGS)))
(DEFMACRO USER-ERROR (STRING &REST ARGS)
    (RET `(FORMAT T ,STRING ,@ARGS)))
|#



(DEFINE CL-EQUAL (&REST REST)
  (TRACE-FORMAT "~S~%"  `(EQUAL ,@REST))
  (RET (EQUAL (CAR REST) (CAR (CDR REST)))))

(DEFINE MY-CONCAT (&REST REST) (RET (APPLY #'CONCAT REST)))
(DEFINE CONCAT (&REST REST) (RET (APPLY #'CCONCATENATE (CONS "" (FLATTEN REST)))))


(PRINT "LOADED COMMON-LISP.LISP!")
(define KMP () 
 (CSETF (READTABLE-CASE *READTABLE*) :UPCASE)
  (load "common_lisp.lisp")
  (load "kmp.subl")
  (load "common_lisp.lisp")
 ;;(CSETF (READTABLE-CASE *READTABLE*) :PRESERVE)
  )

#|
 CREATE-INSTANCE 
 ISA 
 ALL-INSTANCES 
 COMMENT 
 LOAD-KB 
 FLATTEN 
 ASSOC-EQUAL 
 ORDERED-SET-DIFFERENCE 
 ORDERED-INTERSECTION 
 QUOTIFY 
 PERMUTE 
 TRIM-WHITESPACE 
 FIRST-CHAR 
 LAST-CHAR 
 ENDS-WITH 
 STARTS-WITH 
 STRING-TO-NUMBER 
|#


