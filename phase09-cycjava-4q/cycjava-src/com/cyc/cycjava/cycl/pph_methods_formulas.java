package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_methods_formulas extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_methods_formulas";
    public static final String myFingerPrint = "7282af077def2b1d138af51f7ced36aeae6db7912fefdbd3045928d42049a13d";
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 23225L)
    public static SubLSymbol $pph_allow_subl_listsP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 33059L)
    private static SubLSymbol $pph_connectives$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    private static SubLSymbol $pph_english_month_names$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    private static SubLSymbol $pph_dates$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    private static SubLSymbol $pph_english_date_disambiguation_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 115263L)
    private static SubLSymbol $pph_new_exception_vars$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 128830L)
    private static SubLSymbol $pph_generate_collection_subset_with_rel_clauseP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 142746L)
    private static SubLSymbol $pph_front_prepositionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 148834L)
    private static SubLSymbol $pph_allow_copula_removalP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 169953L)
    private static SubLSymbol $quant_over_arg_tuples_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 180794L)
    private static SubLSymbol $pph_existential_operators$;
    private static final SubLString $str0$_;
    private static final SubLString $str1$and;
    private static final SubLString $str2$or;
    private static final SubLString $str3$_;
    private static final SubLSymbol $sym4$GENERATE_STRING_WITH_COMMA;
    private static final SubLSymbol $kw5$AND;
    private static final SubLSymbol $kw6$UNORDERED;
    private static final SubLSymbol $kw7$FAILURE;
    private static final SubLString $str8$__Trying_default_precision___S___;
    private static final SubLSymbol $sym9$INTEGERP;
    private static final SubLString $str10$__Working_on_dupe_list___S__;
    private static final SubLString $str11$__Trying_to_reparaphrase__S___;
    private static final SubLString $str12$__Trying_targeted_precision__S_fo;
    private static final SubLSymbol $sym13$PPH_PRECISION_P;
    private static final SubLString $str14$__New_paraphrase_with_precision__;
    private static final SubLString $str15$__Trying_full_precision_for__S;
    private static final SubLString $str16$__New_paraphrase_with_full_precis;
    private static final SubLString $str17$__Changing_output_list_for__S_fro;
    private static final SubLSymbol $kw18$NEW;
    private static final SubLSymbol $sym19$EL_FORMULA_P;
    private static final SubLString $str20$__Suspending_bullet_use_for____S_;
    private static final SubLString $str21$__Turning_bullet_use_back_on___;
    private static final SubLString $str22$__Not_using_bullets____PPH_USE_BU;
    private static final SubLString $str23$__Not_using_bullets___list_is_too;
    private static final SubLSymbol $sym24$GREATER_LENGTH_P;
    private static final SubLObject $const25$verbStrings;
    private static final SubLString $str26$__Found_verb__S__Using_bullets_fo;
    private static final SubLString $str27$____S__;
    private static final SubLSymbol $sym28$PPH_PHRASE_OUTPUT_ITEM_STRING;
    private static final SubLString $str29$__Not_using_bullets___Failed_to_f;
    private static final SubLInteger $int30$40;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$PROGN;
    private static final SubLSymbol $sym33$PWHEN;
    private static final SubLSymbol $sym34$CPUSH;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$ALPHA_CHAR_P;
    private static final SubLSymbol $kw39$HTML;
    private static final SubLString $str40$_;
    private static final SubLSymbol $kw41$NONE;
    private static final SubLSymbol $kw42$SPACE;
    private static final SubLSymbol $kw43$PERIOD;
    private static final SubLString $str44$_;
    private static final SubLSymbol $kw45$OR;
    private static final SubLSymbol $kw46$AND_OR;
    private static final SubLString $str47$and_or;
    private static final SubLSymbol $kw48$BUT;
    private static final SubLString $str49$but;
    private static final SubLObject $const50$OrdinalAdjective;
    private static final SubLList $list51;
    private static final SubLString $str52$Can_t_generate_ordinal_form_of__S;
    private static final SubLSymbol $sym53$ORDINAL_FORM;
    private static final SubLSymbol $kw54$TEST;
    private static final SubLSymbol $kw55$OWNER;
    private static final SubLSymbol $kw56$CLASSES;
    private static final SubLList $list57;
    private static final SubLSymbol $kw58$KB;
    private static final SubLSymbol $kw59$FULL;
    private static final SubLSymbol $kw60$WORKING_;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$_WU;
    private static final SubLObject $const63$denotation;
    private static final SubLSymbol $sym64$_SENSE;
    private static final SubLInteger $int65$100;
    private static final SubLString $str66$st;
    private static final SubLString $str67$nd;
    private static final SubLString $str68$rd;
    private static final SubLString $str69$th;
    private static final SubLSymbol $sym70$GENERATE_NTH_EXPR;
    private static final SubLSymbol $kw71$NTH_EXPR;
    private static final SubLSymbol $kw72$BEST;
    private static final SubLObject $const73$nthLargestElement;
    private static final SubLString $str74$largest;
    private static final SubLString $str75$smallest;
    private static final SubLString $str76$all;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLString $str79$has_the;
    private static final SubLString $str80$of;
    private static final SubLSymbol $sym81$GENERATE_ATOMIC_FORMULA;
    private static final SubLSymbol $kw82$CYCL_SENTENCE;
    private static final SubLSymbol $kw83$DECENT;
    private static final SubLSymbol $kw84$NAUT;
    private static final SubLString $str85$GENERATE_ATOMIC_FORMULA_called_on;
    private static final SubLString $str86$__Entering_PPH_POSSIBLY_BINDING_V;
    private static final SubLSymbol $kw87$GENERATE_ATOMIC_FORMULA_WITH_AGR;
    private static final SubLString $str88$__Leaving_PPH_POSSIBLY_BINDING_VA;
    private static final SubLString $str89$______and__pph_var_types__are_now;
    private static final SubLString $str90$__Using_template_assertion___S___;
    private static final SubLSymbol $sym91$GENERATE_ALL_PHRASES_FOR_FORMULA;
    private static final SubLList $list92;
    private static final SubLSymbol $kw93$TEXT;
    private static final SubLSymbol $kw94$ANY;
    private static final SubLSymbol $kw95$REGULARIZE;
    private static final SubLSymbol $kw96$IGNORE;
    private static final SubLString $str97$Can_t_use__S_with__S;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$PPH_PHRASE_GENERATE_STRING_FROM_CYCL;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLString $str102$_;
    private static final SubLSymbol $sym103$EL_LIST_P;
    private static final SubLObject $const104$genFormat;
    private static final SubLObject $const105$genFormat_Precise;
    private static final SubLObject $const106$genFormat_NP;
    private static final SubLObject $const107$genQuestion;
    private static final SubLObject $const108$genFormat_ArgFixed;
    private static final SubLObject $const109$genlPreds;
    private static final SubLSymbol $kw110$BREADTH;
    private static final SubLSymbol $kw111$DEPTH;
    private static final SubLSymbol $kw112$STACK;
    private static final SubLSymbol $kw113$QUEUE;
    private static final SubLObject $const114$True_JustificationTruth;
    private static final SubLSymbol $sym115$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw116$ERROR;
    private static final SubLString $str117$_A_is_not_a__A;
    private static final SubLSymbol $sym118$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw119$CERROR;
    private static final SubLString $str120$continue_anyway;
    private static final SubLSymbol $kw121$WARN;
    private static final SubLString $str122$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str123$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str124$attempting_to_bind_direction_link;
    private static final SubLString $str125$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLString $str126$___S_not_referenced_in__S____Curr;
    private static final SubLSymbol $sym127$PPH_UNREGISTERED_VARIABLE_;
    private static final SubLSymbol $sym128$RELEVANT_PRED_IS_EVERYTHING;
    private static final SubLSymbol $kw129$GAF;
    private static final SubLSymbol $sym130$PPH_FORBIDDEN_LEXICAL_ASSERTION_;
    private static final SubLSymbol $sym131$GENFORMAT_PRECISION_OK_;
    private static final SubLString $str132$__Looking_for_paraphrase_template;
    private static final SubLString $str133$__No__S_assertions_found_for__S_f;
    private static final SubLString $str134$__Couldn_t_find_paraphrase_templa;
    private static final SubLString $str135$__Paraphrasing__S_with_sublist__S;
    private static final SubLSymbol $sym136$NUMBERP;
    private static final SubLSymbol $sym137$STRINGP;
    private static final SubLSymbol $sym138$PPH_CONNECTIVE_P;
    private static final SubLString $str139$__GENERATE_GENFORMAT_ARG_Result__;
    private static final SubLList $list140;
    private static final SubLObject $const141$CycUniversalDate;
    private static final SubLObject $const142$CycUniversalSecond;
    private static final SubLString $str143$__a_;
    private static final SubLString $str144$__Using_preferred_senses__S__;
    private static final SubLList $list145;
    private static final SubLObject $const146$DurationFn;
    private static final SubLString $str147$in;
    private static final SubLString $str148$at;
    private static final SubLString $str149$on;
    private static final SubLSymbol $sym150$PPH_DETERMINER_;
    private static final SubLSymbol $sym151$PPH_CASE_KW_;
    private static final SubLSymbol $sym152$WORD_SENSE_INDICATOR;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$ATOM;
    private static final SubLString $str155$__Couldn_t_paraphrase_args__S_wit;
    private static final SubLSymbol $sym156$PPH_PHRASE_OUTPUT_LIST_P;
    private static final SubLSymbol $sym157$PPH_STRING_P;
    private static final SubLSymbol $sym158$PPH_PHRASE_OUTPUT_LIST_STRING;
    private static final SubLString $str159$__Couldn_t_paraphrase__S___;
    private static final SubLString $str160$__PROCESS_GEN_FORMAT_ARGLIST____W;
    private static final SubLString $str161$Making_copy_of_reused_output_item;
    private static final SubLSymbol $sym162$PPH_PHRASE_OUTPUT_ITEM_COPY;
    private static final SubLString $str163$Generating_with___genFormat_for_m;
    private static final SubLObject $const164$TheInstance;
    private static final SubLObject $const165$SubcollectionOfWithRelationFromFn;
    private static final SubLObject $const166$possessiveRelation;
    private static final SubLSymbol $kw167$NON_PLURAL_GENERIC;
    private static final SubLObject $const168$SomeFn;
    private static final SubLList $list169;
    private static final SubLList $list170;
    private static final SubLObject $const171$ThirdPerson_NLAttr;
    private static final SubLObject $const172$ReflexivePronoun;
    private static final SubLSymbol $sym173$GENERATE_DATE_NAUT;
    private static final SubLSymbol $kw174$DATE_NAUT;
    private static final SubLSymbol $sym175$GENERATE_ENGLISH_YEAR_NAUT;
    private static final SubLSymbol $kw176$YEAR_NAUT;
    private static final SubLSymbol $kw177$YEAR;
    private static final SubLSymbol $sym178$GENERATE_ENGLISH_MONTH_NAUT;
    private static final SubLSymbol $kw179$MONTH_NAUT;
    private static final SubLList $list180;
    private static final SubLList $list181;
    private static final SubLList $list182;
    private static final SubLSymbol $kw183$MONTH;
    private static final SubLSymbol $sym184$GENERATE_ENGLISH_DAY_NAUT;
    private static final SubLSymbol $kw185$DAY_NAUT;
    private static final SubLList $list186;
    private static final SubLList $list187;
    private static final SubLSymbol $kw188$DAY;
    private static final SubLList $list189;
    private static final SubLString $str190$_2__0D;
    private static final SubLObject $const191$CalendarMilliSecond;
    private static final SubLObject $const192$MillisecondsDuration;
    private static final SubLSymbol $kw193$ARG1;
    private static final SubLObject $const194$CalendarSecond;
    private static final SubLString $str195$_3__0D;
    private static final SubLSymbol $kw196$ARG2;
    private static final SubLObject $const197$CalendarMinute;
    private static final SubLString $str198$_;
    private static final SubLSymbol $sym199$_PRECISION;
    private static final SubLObject $const200$and;
    private static final SubLObject $const201$resultIsa;
    private static final SubLList $list202;
    private static final SubLList $list203;
    private static final SubLObject $const204$BaseKB;
    private static final SubLList $list205;
    private static final SubLSymbol $sym206$GENERATE_PHRASE_FROM_TEMPLATE;
    private static final SubLSymbol $sym207$GENERATE_NL_TAGGED_TERM;
    private static final SubLSymbol $kw208$NL_TAGGED_TERM;
    private static final SubLObject $const209$nounStrings;
    private static final SubLSymbol $kw210$PPH_METHOD_FAILURE;
    private static final SubLString $str211$GENERATE_PHRASE_FROM_TEMPLATE_cal;
    private static final SubLSymbol $kw212$UNSPECIFIED;
    private static final SubLString $str213$__GENERATE_PHRASE_FROM_TEMPLATE_t;
    private static final SubLString $str214$__GENERATE_PHRASE_FROM_TEMPLATE__;
    private static final SubLString $str215$Added__D_template_alternatives_to;
    private static final SubLSymbol $kw216$NO_GEN_TEMPLATES;
    private static final SubLSymbol $kw217$CYCL;
    private static final SubLSymbol $kw218$EXISTING_GEN_TEMPLATES_FAILED;
    private static final SubLList $list219;
    private static final SubLList $list220;
    private static final SubLObject $const221$gerund;
    private static final SubLSymbol $sym222$COERCED_GERUND_FROM_PRESENT_PARTICIPLE;
    private static final SubLString $str223$_PPH_error_level_;
    private static final SubLString $str224$__;
    private static final SubLString $str225$Adding_too_many_justifications__O;
    private static final SubLString $str226$__Initial_paraphrase_agr_is__S__;
    private static final SubLString $str227$__Initial_paraphrase_category_is_;
    private static final SubLString $str228$__Initial_paraphrase_case_is__S__;
    private static final SubLSymbol $kw229$DEFAULT;
    private static final SubLObject $const230$genTemplate_QuerySentence;
    private static final SubLString $str231$_S___does_not_appear_to_match_tem;
    private static final SubLString $str232$Couldn_t_generate_a_PPH_phrase_fr;
    private static final SubLList $list233;
    private static final SubLString $str234$Couldn_t_generate_a_question_from;
    private static final SubLString $str235$__DO_GENERATE_PHRASE_FROM_TEMPLAT;
    private static final SubLString $str236$__GENERATE_PHRASE_FROM_TEMPLATE_f;
    private static final SubLString $str237$__Updated_AGR_is__S___;
    private static final SubLSymbol $sym238$GENERATE_SIMPLE_NEGATION;
    private static final SubLSymbol $kw239$NEGATION;
    private static final SubLSymbol $kw240$NO;
    private static final SubLString $str241$Inside_operator_scope__S;
    private static final SubLSymbol $kw242$ARG0;
    private static final SubLString $str243$__Shadowing_discourse_context____;
    private static final SubLString $str244$Leaving_operator_scope__S;
    private static final SubLObject $const245$Some_NLAttr;
    private static final SubLObject $const246$No_NLAttr;
    private static final SubLObject $const247$Any_NLAttr;
    private static final SubLObject $const248$nonPlural_Generic;
    private static final SubLSymbol $sym249$PPH_TRY_TO_EXPRESS_NEGATION;
    private static final SubLString $str250$Converted__S_to__S;
    private static final SubLObject $const251$WordWithSuffixFn;
    private static final SubLObject $const252$Nt_TheSuffix;
    private static final SubLObject $const253$Aux_Negated;
    private static final SubLString $str254$not;
    private static final SubLObject $const255$not;
    private static final SubLSymbol $sym256$GENERATE_FN_TO_ARG_0;
    private static final SubLSymbol $kw257$FN_TO_ARG_0;
    private static final SubLString $str258$the;
    private static final SubLList $list259;
    private static final SubLList $list260;
    private static final SubLObject $const261$importFromAmountDuring;
    private static final SubLString $str262$_a_export_to__a_during__a;
    private static final SubLList $list263;
    private static final SubLSymbol $sym264$FORMAT;
    private static final SubLSymbol $sym265$PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS;
    private static final SubLSymbol $sym266$GENERATE_KAPPA;
    private static final SubLSymbol $kw267$KAPPA_EXPR;
    private static final SubLSymbol $sym268$EL_VAR_;
    private static final SubLString $str269$for;
    private static final SubLSymbol $sym270$GENERATE_EXISTENTIAL;
    private static final SubLSymbol $kw271$EXISTENTIAL;
    private static final SubLList $list272;
    private static final SubLSymbol $kw273$UNIVERSAL;
    private static final SubLString $str274$Failed_to_paraphrase__S_with_type;
    private static final SubLObject $const275$thereExists;
    private static final SubLString $str276$there_is_some;
    private static final SubLString $str277$such_that;
    private static final SubLString $str278$Failed_to_generate_explicit_exist;
    private static final SubLSymbol $sym279$EL_EXISTENTIAL_P;
    private static final SubLSymbol $sym280$EL_UNIVERSAL_P;
    private static final SubLSymbol $sym281$PPH_UNIVERSAL_P;
    private static final SubLSymbol $sym282$PPH_EXISTENTIAL_P;
    private static final SubLList $list283;
    private static final SubLString $str284$Registering__S_as__S___with_map__;
    private static final SubLList $list285;
    private static final SubLSymbol $sym286$CAR;
    private static final SubLSymbol $kw287$SELF;
    private static final SubLString $str288$__Checking_formula_for_relational;
    private static final SubLString $str289$___S_not_suitable_for_relational_;
    private static final SubLString $str290$__Suitable_for_relational_noun_pa;
    private static final SubLSymbol $sym291$RELATIONAL_NOUN_ARGS_FOR_PRED;
    private static final SubLString $str292$__Paraphrasing__S_with_relational;
    private static final SubLString $str293$Bad_arg___S_in__S___;
    private static final SubLString $str294$Don_t_know_how_to_form_a_relation;
    private static final SubLObject $const295$NLSentence;
    private static final SubLList $list296;
    private static final SubLSymbol $sym297$GENERATE_IMPLICATION_SMART;
    private static final SubLSymbol $kw298$IMPLICATION;
    private static final SubLString $str299$__Removed_var_typing_clauses_in__;
    private static final SubLSymbol $kw300$IMPLIES;
    private static final SubLList $list301;
    private static final SubLObject $const302$different;
    private static final SubLString $str303$__Registering__S_and__S_as_differ;
    private static final SubLSymbol $sym304$PPH_REGISTER_DIFFERENT_VARS;
    private static final SubLList $list305;
    private static final SubLSymbol $kw306$ANTECEDENT;
    private static final SubLSymbol $sym307$GENERIC_ARG_P;
    private static final SubLList $list308;
    private static final SubLSymbol $sym309$EL_GENERAL_EXISTENTIAL_P;
    private static final SubLSymbol $sym310$EL_DISJUNCTION_P;
    private static final SubLSymbol $sym311$PPH_EXISTENTIAL_RMP_SENTENCE_;
    private static final SubLList $list312;
    private static final SubLObject $const313$Every_NLAttr;
    private static final SubLSymbol $kw314$USE_CONTEXT;
    private static final SubLSymbol $sym315$PPH_VALID_RELEVANT_VAR_TYPE_;
    private static final SubLString $str316$Bad_FORMULA_argument_to_REGISTER_;
    private static final SubLSymbol $sym317$REMOVE_VAR_TYPING_CLAUSES;
    private static final SubLString $str318$__Found_a_var_typing_clause__with;
    private static final SubLString $str319$___S_does_not_type__S__Keeping_it;
    private static final SubLString $str320$___S_is_only_remaining_var_typing;
    private static final SubLString $str321$___S_is_already_registered_as__S_;
    private static final SubLString $str322$___S_is_already_registered_as__S_;
    private static final SubLSymbol $sym323$POSSIBLY_NEW_EXCEPTIONAL_VAR_P;
    private static final SubLSymbol $sym324$PPH_OPAQUE_PRED_;
    private static final SubLObject $const325$sentenceImplies;
    private static final SubLObject $const326$genlInverse;
    private static final SubLList $list327;
    private static final SubLInteger $int328$98;
    private static final SubLSymbol $sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_;
    private static final SubLObject $const330$Collection;
    private static final SubLSymbol $sym331$SPEC_;
    private static final SubLInteger $int332$200;
    private static final SubLSymbol $kw333$EXCEPTION;
    private static final SubLSymbol $sym334$GENERATE_CF_IMPLICATION;
    private static final SubLSymbol $kw335$CF_IMPLICATION;
    private static final SubLString $str336$if_it_had_a_been_the_case_that__a;
    private static final SubLObject $const337$cfImplies;
    private static final SubLSymbol $sym338$GENERATE_SUBCOLLECTION_WITH_RELATIONAL_NOUN;
    private static final SubLSymbol $kw339$RELATIONAL_NOUN_SUBCOLLECTION_NAUT;
    private static final SubLObject $const340$SubcollectionRelationFunction_Inv;
    private static final SubLString $str341$Generating_relational_noun_phrase;
    private static final SubLObject $const342$SubcollectionRelationFunction_Ins;
    private static final SubLList $list343;
    private static final SubLObject $const344$Of_TheWord;
    private static final SubLList $list345;
    private static final SubLString $str346$Couldn_t_find_an_arg_in_reln_asse;
    private static final SubLObject $const347$SubcollectionRelationFunction_Can;
    private static final SubLSymbol $sym348$GENERATE_THE_COLLECTION_WITH_REL_CLAUSE;
    private static final SubLSymbol $kw349$THE_COLLECTION_OF_NAT;
    private static final SubLList $list350;
    private static final SubLList $list351;
    private static final SubLObject $const352$CollectionSubsetFn;
    private static final SubLObject $const353$TheSetOf;
    private static final SubLSymbol $sym354$GENERATE_SUBCOLLECTION_WITH_REL_CLAUSE;
    private static final SubLSymbol $kw355$SUBCOLLECTION_RELATION_NAUT;
    private static final SubLObject $const356$FormulaArgFn;
    private static final SubLList $list357;
    private static final SubLList $list358;
    private static final SubLSymbol $sym359$PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE;
    private static final SubLObject $const360$SubcollectionRelationFunction_Typ;
    private static final SubLSymbol $kw361$ARG3;
    private static final SubLSymbol $kw362$INDEFINITE;
    private static final SubLInteger $int363$48;
    private static final SubLString $str364$_S_is_neither_an_atom_nor_a_list_;
    private static final SubLObject $const365$SymmetricBinaryPredicate;
    private static final SubLString $str366$PPH_REL_CLAUSE_FOR_COLL_SUBSET_ca;
    private static final SubLObject $const367$Person;
    private static final SubLString $str368$__Trying_to_make_relative_clause_;
    private static final SubLString $str369$whose;
    private static final SubLObject $const370$PossessivePhrase;
    private static final SubLString $str371$whom;
    private static final SubLString $str372$which;
    private static final SubLString $str373$Moving_rel_clause_copula_to_immed;
    private static final SubLString $str374$__Removing_copula_from_template__;
    private static final SubLObject $const375$Have_TheWord;
    private static final SubLString $str376$with;
    private static final SubLString $str377$__Adding_relative_pronoun_to_temp;
    private static final SubLString $str378$that;
    private static final SubLString $str379$__Template_now_has__D_dtrs___;
    private static final SubLString $str380$Can_t_determine_relative_clause_h;
    private static final SubLObject $const381$Noun;
    private static final SubLString $str382$Updating__S_of__S___to__S;
    private static final SubLObject $const383$Be_TheWord;
    private static final SubLString $str384$_a_;
    private static final SubLString $str385$is_;
    private static final SubLObject $const386$Determiner;
    private static final SubLSymbol $kw387$NEVER;
    private static final SubLObject $const388$Adverb;
    private static final SubLObject $const389$Adjective;
    private static final SubLString $str390$_a_that_;
    private static final SubLObject $const391$thirdPersonSg_Present;
    private static final SubLList $list392;
    private static final SubLString $str393$Found_extractible_dtr______S;
    private static final SubLSymbol $sym394$GENERATE_PHRASE_NAUT;
    private static final SubLSymbol $kw395$PHRASE_DENOTING_NAUT;
    private static final SubLString $str396$__In_GENERATE_PHRASE_NAUT___;
    private static final SubLString $str397$__Precision_is__S___;
    private static final SubLSymbol $sym398$GENERATE_SPECIFIED_SCOPE_SENTENCE;
    private static final SubLSymbol $kw399$SPECIFIED_SCOPE_SENTENCE;
    private static final SubLString $str400$__Replacing_rule_macro_formula___;
    private static final SubLString $str401$__GENERATE_SPECIFIED_SCOPE_SENTEN;
    private static final SubLSymbol $sym402$GENERATE_RMP_SENTENCE_VIA_EXPANSION;
    private static final SubLSymbol $kw403$RMP_SENTENCE;
    private static final SubLSymbol $sym404$COMMON_NON_SKOLEM_INDETERMINATE_TERM_DENOTING_FUNCTION_;
    private static final SubLString $str405$Replacing_rule_macro_formula____S;
    private static final SubLObject $const406$expansion;
    private static final SubLString $str407$__Looking_for_a_template_for__S__;
    private static final SubLString $str408$Abandoning_search_because__S_is_u;
    private static final SubLString $str409$__No_template_found_for__S___;
    private static final SubLString $str410$__Search_limit_exceeded___;
    private static final SubLString $str411$__Search_level_is__S_of__S__;
    private static final SubLSymbol $sym412$SCOPALLY_UNAMBIGUOUS_;
    private static final SubLString $str413$___S_is_not_ambiguous_with_respec;
    private static final SubLInteger $int414$212;
    private static final SubLString $str415$__Entering_PPH_SETTING_VAR_TYPES_;
    private static final SubLString $str416$__Paraphrasing_formula__S__;
    private static final SubLSymbol $kw417$GEN_FORMAT;
    private static final SubLString $str418$__Found_assertion__S_for_formula_;
    private static final SubLString $str419$__Leaving_PPH_SETTING_VAR_TYPES_I;
    private static final SubLString $str420$___Output_list___S__;
    private static final SubLString $str421$___Setting__S_to____S;
    private static final SubLString $str422$___Leaving__PPH_VAR_TYPES___S;
    private static final SubLObject $const423$generateArgWithOutsideScope;
    private static final SubLString $str424$relatedArgPositions;
    private static final SubLObject $const425$relatedArgPositions;
    private static final SubLList $list426;
    private static final SubLString $str427$Couldn_t_find___relatedArgPositio;
    private static final SubLString $str428$Wrong_number_of___relatedArgPosit;
    private static final SubLSymbol $kw429$ITSELF;
    private static final SubLList $list430;
    private static final SubLObject $const431$BareForm_NLAttr;
    private static final SubLObject $const432$nonSingular_Generic;
    private static final SubLObject $const433$Thing;
    private static final SubLString $str434$everything;
    private static final SubLSymbol $sym435$AGREEMENT_LOOKUP;
    private static final SubLSymbol $sym436$QUANT_OVER_ARG_TUPLES;
    private static final SubLObject $const437$generateQuantOverArg;
    private static final SubLSymbol $sym438$_QUANT_OVER_ARG_TUPLES_CACHING_STATE_;
    private static final SubLSymbol $sym439$_;
    private static final SubLSymbol $sym440$SECOND;
    private static final SubLSymbol $sym441$REVERSE;
    private static final SubLList $list442;
    private static final SubLString $str443$__Found_a_genTemplate_for__S___;
    private static final SubLString $str444$__Passing_up_genTemplates_for__S_;
    private static final SubLString $str445$__Couldn_t_find_any_generation_te;
    private static final SubLSymbol $sym446$KEYWORDP;
    private static final SubLString $str447$_a;
    private static final SubLString $str448$_a_and;
    private static final SubLSymbol $sym449$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const450$EverythingPSC;
    private static final SubLSymbol $sym451$PPH_ALLOW_VAR_TYPING_;
    private static final SubLSymbol $sym452$PPH_GENL_;
    private static final SubLList $list453;
    private static final SubLSymbol $sym454$GENERATE_UNIVERSAL;
    private static final SubLString $str455$__Changed_phrase_cycl_from__S___t;
    private static final SubLSymbol $sym456$EL_IMPLICATION_P;
    private static final SubLObject $const457$forAll;
    private static final SubLString $str458$for_every;
    private static final SubLString $str459$Failed_to_generate_explicit_unive;
    private static final SubLSymbol $sym460$PPH_EXISTENTIAL_FORMULA_P;
    private static final SubLSymbol $kw461$UNINITIALIZED;
    private static final SubLObject $const462$ExistentialQuantifier;
    private static final SubLObject $const463$unknownSentence;
    private static final SubLList $list464;
    private static final SubLList $list465;
    private static final SubLString $str466$Couldn_t_remove_var_typing_clause;
    private static final SubLSymbol $kw467$CNF;
    private static final SubLSymbol $sym468$GENERATE_UNICODE_NAUT;
    private static final SubLSymbol $kw469$UNICODE_NAUT;
    private static final SubLObject $const470$genls;
    private static final SubLList $list471;
    private static final SubLObject $const472$SubcollectionOfWithRelationToFn;
    private static final SubLSymbol $sym473$GENERATE_SET_NAUT;
    private static final SubLSymbol $kw474$SET_NAUT;
    private static final SubLString $str475$the_set_of;
    private static final SubLObject $const476$singular;
    private static final SubLSymbol $sym477$GENERATE_WITH_HOLDS_OF;
    private static final SubLSymbol $kw478$ATOMIC_SENTENCE;
    private static final SubLSymbol $kw479$FALLBACK;
    private static final SubLObject $const480$CyclishParaphraseMt;
    private static final SubLString $str481$Generating_with_holds_of_for_moth;
    private static final SubLList $list482;
    private static final SubLString $str483$doesn_t_hold;
    private static final SubLString $str484$does_not_hold;
    private static final SubLString $str485$holds;
    private static final SubLSymbol $sym486$DO_GENERATE_WITH_HOLDS_OF;
    private static final SubLObject $const487$TheCoordinationSet;
    private static final SubLSymbol $sym488$GENERATE_CONJUNCTION_HEAD_DRIVEN;
    private static final SubLSymbol $kw489$CONJUNCTION;
    private static final SubLList $list490;
    private static final SubLSymbol $kw491$POS_PRED;
    private static final SubLSymbol $sym492$SUBJ;
    private static final SubLObject $const493$Individual;
    private static final SubLList $list494;
    private static final SubLList $list495;
    private static final SubLSymbol $sym496$GENERATE_POSSIBLY_REDUCED_COORDINATION;
    private static final SubLSymbol $kw497$COORDINATION;
    private static final SubLString $str498$__Created_coordination_template_f;
    private static final SubLObject $const499$TheDisjunctiveCoordinationSet;
    private static final SubLSymbol $sym500$CYCL_ATOMIC_SENTENCE_P;
    private static final SubLSymbol $sym501$GENERATE_EXISTENTIAL_WITH_THECOLLECTIONOF;
    private static final SubLString $str502$such_that__X;
    private static final SubLList $list503;
    private static final SubLObject $const504$isa;
    private static final SubLList $list505;
    private static final SubLString $str506$X;
    private static final SubLObject $const507$TheCollectionOf;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 941L)
    public static SubLObject generate_string_with_comma(final SubLObject obj) {
        return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(pph_main.pph_phrase_generate_string_from_cycl(obj, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)), (SubLObject)pph_methods_formulas.$str0$_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 1109L)
    public static SubLObject generate_conjunctive_sequence(final SubLObject list) {
        return generate_sequence(list, (SubLObject)pph_methods_formulas.$str1$and);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 1304L)
    public static SubLObject generate_disjunctive_sequence(final SubLObject list) {
        return generate_sequence(list, (SubLObject)pph_methods_formulas.$str2$or);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 1399L)
    public static SubLObject generate_sequence(final SubLObject list, SubLObject conj_string) {
        if (conj_string == pph_methods_formulas.UNPROVIDED) {
            conj_string = (SubLObject)pph_methods_formulas.$str1$and;
        }
        if (pph_methods_formulas.NIL == list_utilities.proper_list_p(list)) {
            return print_high.princ_to_string(list);
        }
        final SubLObject head = list.first();
        final SubLObject head_string = pph_main.pph_phrase_generate_string_from_cycl(head, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject pcase_var = Sequences.length(list);
        if (pcase_var.eql((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            return head_string;
        }
        if (pcase_var.eql((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
            return Sequences.cconcatenate(head_string, new SubLObject[] { pph_methods_formulas.$str3$_, conj_string, pph_methods_formulas.$str3$_, pph_main.pph_phrase_generate_string_from_cycl(conses_high.second(list), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) });
        }
        final SubLObject front = conses_high.butlast(list, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject strings = Mapping.mapcar((SubLObject)pph_methods_formulas.$sym4$GENERATE_STRING_WITH_COMMA, front);
        final SubLObject last_string = pph_main.pph_phrase_generate_string_from_cycl(list_utilities.last_one(list), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        return string_utilities.bunge(ConsesLow.append(strings, (SubLObject)ConsesLow.list(conj_string, last_string)), (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 2065L)
    public static SubLObject generate_juncts(final SubLObject args, SubLObject arg_order_sublist, SubLObject opr_key, SubLObject list_type) {
        if (arg_order_sublist == pph_methods_formulas.UNPROVIDED) {
            arg_order_sublist = (SubLObject)pph_methods_formulas.NIL;
        }
        if (opr_key == pph_methods_formulas.UNPROVIDED) {
            opr_key = (SubLObject)pph_methods_formulas.$kw5$AND;
        }
        if (list_type == pph_methods_formulas.UNPROVIDED) {
            list_type = (SubLObject)pph_methods_formulas.$kw6$UNORDERED;
        }
        final SubLObject olist = generate_juncts_output_list(args, arg_order_sublist, opr_key, list_type);
        return (SubLObject)((pph_methods_formulas.NIL != pph_phrase.pph_phrase_output_list_p(olist)) ? pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_methods_formulas.UNPROVIDED) : pph_methods_formulas.$kw7$FAILURE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 2382L)
    public static SubLObject generate_juncts_output_list(final SubLObject args, SubLObject arg_order_sublist, SubLObject opr_key, SubLObject list_type) {
        if (arg_order_sublist == pph_methods_formulas.UNPROVIDED) {
            arg_order_sublist = (SubLObject)pph_methods_formulas.NIL;
        }
        if (opr_key == pph_methods_formulas.UNPROVIDED) {
            opr_key = (SubLObject)pph_methods_formulas.$kw5$AND;
        }
        if (list_type == pph_methods_formulas.UNPROVIDED) {
            list_type = (SubLObject)pph_methods_formulas.$kw6$UNORDERED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_lists = (SubLObject)pph_methods_formulas.NIL;
        SubLObject big_output_list = (SubLObject)pph_methods_formulas.NIL;
        if (args.isCons()) {
            final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)pph_methods_formulas.NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$1 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$2 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$3 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        SubLObject output_lists_$5 = (SubLObject)pph_methods_formulas.NIL;
                                        SubLObject abortP = (SubLObject)pph_methods_formulas.NIL;
                                        final SubLObject _prev_bind_0_$5 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_ambiguous_strings$.bind((pph_methods_formulas.NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread)) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUALP), (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                                            pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$str8$__Trying_default_precision___S___, pph_utilities.pph_current_precision(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                            SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
                                            SubLObject arg = (SubLObject)pph_methods_formulas.NIL;
                                            SubLObject ignoreme = (SubLObject)pph_methods_formulas.NIL;
                                            list_var = args;
                                            arg = list_var.first();
                                            for (ignoreme = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL == abortP && pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), ignoreme = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, ignoreme)) {
                                                final SubLObject olist = generate_genformat_arg(arg, Sequences.remove_if((SubLObject)pph_methods_formulas.$sym9$INTEGERP, arg_order_sublist, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                pph_disambiguation.note_pph_output_list_for_disambiguation(ignoreme, olist);
                                                if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_output_list_p(olist)) {
                                                    output_lists_$5 = (SubLObject)ConsesLow.cons(olist, output_lists_$5);
                                                }
                                                else {
                                                    abortP = (SubLObject)pph_methods_formulas.T;
                                                }
                                            }
                                            if (pph_methods_formulas.NIL != abortP) {
                                                output_lists = (SubLObject)pph_methods_formulas.$kw7$FAILURE;
                                            }
                                            else {
                                                output_lists_$5 = Sequences.nreverse(output_lists_$5);
                                                SubLObject cdolist_list_var;
                                                final SubLObject dupe_index_lists = cdolist_list_var = pph_disambiguation.pph_find_duplicates(output_lists_$5);
                                                SubLObject dupe_index_list = (SubLObject)pph_methods_formulas.NIL;
                                                dupe_index_list = cdolist_list_var.first();
                                                while (pph_methods_formulas.NIL != cdolist_list_var) {
                                                    pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str10$__Working_on_dupe_list___S__, dupe_index_list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                    final SubLObject dupe_objects = pph_disambiguation.pph_dereference_indexes(dupe_index_list, args);
                                                    SubLObject cdolist_list_var_$7 = dupe_index_list;
                                                    SubLObject ignoreme2 = (SubLObject)pph_methods_formulas.NIL;
                                                    ignoreme2 = cdolist_list_var_$7.first();
                                                    while (pph_methods_formulas.NIL != cdolist_list_var_$7) {
                                                        final SubLObject arg2 = ConsesLow.nth(ignoreme2, args);
                                                        pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$str11$__Trying_to_reparaphrase__S___, arg2, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                        final SubLObject new_precision = pph_utilities.pph_precision_for_object(arg2, dupe_objects);
                                                        final SubLObject new_demerit_cutoff = pph_disambiguation.pph_demerit_cutoff_from_olist(ignoreme2, output_lists_$5);
                                                        SubLObject new_output_list = (SubLObject)pph_methods_formulas.NIL;
                                                        if (!new_precision.equal(pph_utilities.pph_current_precision())) {
                                                            pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str12$__Trying_targeted_precision__S_fo, new_precision, arg2, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                            assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p(new_precision) : new_precision;
                                                            final SubLObject _prev_bind_0_$6 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                            try {
                                                                pph_vars.$paraphrase_precision$.bind(new_precision, thread);
                                                                pph_vars.$pph_demerit_cutoff$.bind(new_demerit_cutoff, thread);
                                                                new_output_list = generate_genformat_arg(arg2, Sequences.remove_if((SubLObject)pph_methods_formulas.$sym9$INTEGERP, arg_order_sublist, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                            }
                                                            finally {
                                                                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
                                                                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$6, thread);
                                                            }
                                                            pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str14$__New_paraphrase_with_precision__, new_precision, arg2, new_output_list);
                                                        }
                                                        if (new_precision.isList() && (pph_methods_formulas.NIL == new_output_list || pph_methods_formulas.NIL != pph_disambiguation.pph_output_list_E(new_output_list, ConsesLow.nth(ignoreme2, output_lists_$5)))) {
                                                            pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str15$__Trying_full_precision_for__S, arg2, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                            assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p((SubLObject)pph_methods_formulas.T) : pph_methods_formulas.T;
                                                            final SubLObject _prev_bind_0_$7 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                            final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                                            final SubLObject _prev_bind_3 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                            try {
                                                                pph_vars.$paraphrase_precision$.bind((SubLObject)pph_methods_formulas.T, thread);
                                                                pph_vars.$pph_ambiguous_strings$.bind((pph_methods_formulas.NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread)) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUALP), (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                                                                pph_vars.$pph_demerit_cutoff$.bind(new_demerit_cutoff, thread);
                                                                new_output_list = generate_genformat_arg(arg2, Sequences.remove_if((SubLObject)pph_methods_formulas.$sym9$INTEGERP, arg_order_sublist, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                            }
                                                            finally {
                                                                pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_3, thread);
                                                                pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
                                                                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$7, thread);
                                                            }
                                                            pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str16$__New_paraphrase_with_full_precis, arg2, new_output_list, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                        }
                                                        if (pph_methods_formulas.NIL != pph_disambiguation.pph_new_olist_better_than_oldP(new_output_list, ConsesLow.nth(ignoreme2, output_lists_$5), arg2)) {
                                                            pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$str17$__Changing_output_list_for__S_fro, arg2, ConsesLow.nth(ignoreme2, output_lists_$5), new_output_list);
                                                            ConsesLow.set_nth(ignoreme2, output_lists_$5, new_output_list);
                                                            pph_disambiguation.note_pph_output_list_for_disambiguation(ignoreme2, new_output_list);
                                                        }
                                                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                                        ignoreme2 = cdolist_list_var_$7.first();
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    dupe_index_list = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2 = args;
                                                arg = (SubLObject)pph_methods_formulas.NIL;
                                                arg = cdolist_list_var2.first();
                                                while (pph_methods_formulas.NIL != cdolist_list_var2) {
                                                    pph_drs.pph_possibly_add_reference_marker(arg);
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    arg = cdolist_list_var2.first();
                                                }
                                                output_lists = ConsesLow.append(output_lists, output_lists_$5);
                                            }
                                        }
                                        finally {
                                            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                        }
                                    }
                                }
                                finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$3, thread);
                            }
                            if (new_or_reused == pph_methods_formulas.$kw18$NEW && pph_methods_formulas.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (pph_methods_formulas.NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                }
                finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
            }
            if (!output_lists.isList()) {
                return (SubLObject)pph_methods_formulas.$kw7$FAILURE;
            }
            pph_add_cycl_to_junct_olists(args, output_lists);
            final SubLObject arg_num = Sequences.find_if((SubLObject)pph_methods_formulas.$sym9$INTEGERP, arg_order_sublist, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != arg_num) {
                pph_contextualize_junct_arg_positions(arg_num, output_lists);
            }
            final SubLObject args_ok_for_bulletsP = Sequences.find_if((SubLObject)pph_methods_formulas.$sym19$EL_FORMULA_P, args, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject suspendP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread) && pph_methods_formulas.NIL == args_ok_for_bulletsP);
            final SubLObject _prev_bind_4 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread) && pph_methods_formulas.NIL != args_ok_for_bulletsP), thread);
                if (pph_methods_formulas.NIL != suspendP && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str20$__Suspending_bullet_use_for____S_, args, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                big_output_list = pph_junct_olist_from_olists(output_lists, opr_key, (SubLObject)pph_methods_formulas.NIL, list_type);
                if (pph_methods_formulas.NIL != suspendP && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str21$__Turning_bullet_use_back_on___, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
            }
            finally {
                pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_4, thread);
            }
        }
        return big_output_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 3478L)
    public static SubLObject pph_use_bullets_for_junct_listsP(final SubLObject junct_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject use_bulletsP = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == pph_vars.$pph_use_bulleted_listsP$.getDynamicValue(thread)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str22$__Not_using_bullets____PPH_USE_BU, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        else if (pph_methods_formulas.NIL != pph_junct_lists_too_short_for_bulletsP(junct_lists)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str23$__Not_using_bullets___list_is_too, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        else if (pph_methods_formulas.NIL != list_utilities.lengthL(list_utilities.extremal(junct_lists, (SubLObject)pph_methods_formulas.$sym24$GREATER_LENGTH_P, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str23$__Not_using_bullets___list_is_too, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        else {
            if (pph_methods_formulas.NIL == use_bulletsP) {
                SubLObject csome_list_var = junct_lists;
                SubLObject junct_list = (SubLObject)pph_methods_formulas.NIL;
                junct_list = csome_list_var.first();
                while (pph_methods_formulas.NIL == use_bulletsP && pph_methods_formulas.NIL != csome_list_var) {
                    if (pph_methods_formulas.NIL == use_bulletsP) {
                        SubLObject csome_list_var_$12 = junct_list;
                        SubLObject item = (SubLObject)pph_methods_formulas.NIL;
                        item = csome_list_var_$12.first();
                        while (pph_methods_formulas.NIL == use_bulletsP && pph_methods_formulas.NIL != csome_list_var_$12) {
                            if (pph_methods_formulas.NIL != pph_utilities.pph_genl_pos_predP(pph_data_structures.pph_phrase_output_item_agr_pred(item), pph_methods_formulas.$const25$verbStrings, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str26$__Found_verb__S__Using_bullets_fo, item, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                }
                                SubLObject cdolist_list_var = junct_lists;
                                SubLObject olist = (SubLObject)pph_methods_formulas.NIL;
                                olist = cdolist_list_var.first();
                                while (pph_methods_formulas.NIL != cdolist_list_var) {
                                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str27$____S__, Mapping.mapcar((SubLObject)pph_methods_formulas.$sym28$PPH_PHRASE_OUTPUT_ITEM_STRING, olist), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    olist = cdolist_list_var.first();
                                }
                                use_bulletsP = (SubLObject)pph_methods_formulas.T;
                            }
                            csome_list_var_$12 = csome_list_var_$12.rest();
                            item = csome_list_var_$12.first();
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    junct_list = csome_list_var.first();
                }
            }
            if (pph_methods_formulas.NIL == use_bulletsP && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str29$__Not_using_bullets___Failed_to_f, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        return use_bulletsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 4665L)
    public static SubLObject pph_junct_lists_too_short_for_bulletsP(final SubLObject junct_lists) {
        final SubLObject too_shortP = list_utilities.lengthL(junct_lists, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject long_enoughP = list_utilities.lengthG(junct_lists, (SubLObject)pph_methods_formulas.FOUR_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject string_length = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
        if (pph_methods_formulas.NIL == too_shortP && pph_methods_formulas.NIL == long_enoughP) {
            SubLObject csome_list_var = junct_lists;
            SubLObject junct_list = (SubLObject)pph_methods_formulas.NIL;
            junct_list = csome_list_var.first();
            while (pph_methods_formulas.NIL == long_enoughP && pph_methods_formulas.NIL != csome_list_var) {
                if (pph_methods_formulas.NIL == long_enoughP) {
                    SubLObject csome_list_var_$13 = junct_list;
                    SubLObject item = (SubLObject)pph_methods_formulas.NIL;
                    item = csome_list_var_$13.first();
                    while (pph_methods_formulas.NIL == long_enoughP && pph_methods_formulas.NIL != csome_list_var_$13) {
                        string_length = Numbers.add(string_length, Sequences.length(pph_data_structures.pph_phrase_output_item_string(item)));
                        long_enoughP = Numbers.numG(string_length, (SubLObject)pph_methods_formulas.$int30$40);
                        csome_list_var_$13 = csome_list_var_$13.rest();
                        item = csome_list_var_$13.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                junct_list = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != too_shortP || pph_methods_formulas.NIL == long_enoughP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 5124L)
    public static SubLObject pph_junct_olist_from_olists(final SubLObject junct_lists, final SubLObject opr_key, SubLObject opr_item, SubLObject list_type) {
        if (opr_item == pph_methods_formulas.UNPROVIDED) {
            opr_item = (SubLObject)pph_methods_formulas.NIL;
        }
        if (list_type == pph_methods_formulas.UNPROVIDED) {
            list_type = (SubLObject)pph_methods_formulas.$kw6$UNORDERED;
        }
        final SubLObject arg_count = Sequences.length(junct_lists);
        final SubLObject opr_string = pph_operator_string_from_key(opr_key);
        final SubLObject use_bulletsP = pph_use_bullets_for_junct_listsP(junct_lists);
        if (pph_methods_formulas.NIL == opr_item) {
            opr_item = pph_question.new_pph_phrase_filler_item(opr_string);
        }
        else {
            pph_data_structures.pph_phrase_output_item_set_string(opr_item, opr_string);
        }
        final SubLObject pcase_var = arg_count;
        if (pcase_var.eql((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            return junct_lists.first();
        }
        if (pcase_var.eql((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
            return pph_junct_olist_from_2_olists(junct_lists, opr_item, list_type, use_bulletsP);
        }
        return pph_junct_olist_from_3_or_more_olists(junct_lists, opr_string, opr_item, list_type, use_bulletsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 6115L)
    public static SubLObject add_to_junct_olist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list31);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        SubLObject as_list_itemP = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list31);
        ans = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list31);
        as_list_itemP = current.first();
        current = current.rest();
        if (pph_methods_formulas.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)pph_methods_formulas.$sym32$PROGN, (SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.$sym33$PWHEN, as_list_itemP, (SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.$sym34$CPUSH, (SubLObject)pph_methods_formulas.$list35, ans)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.$sym33$PWHEN, as_list_itemP, (SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.$sym34$CPUSH, (SubLObject)pph_methods_formulas.$list36, ans)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list31);
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 6423L)
    public static SubLObject pph_junct_olist_from_2_olists(final SubLObject junct_lists, final SubLObject opr_item, final SubLObject list_type, final SubLObject use_bulletsP) {
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        SubLObject first_list = (SubLObject)pph_methods_formulas.NIL;
        SubLObject second_list = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(junct_lists, junct_lists, (SubLObject)pph_methods_formulas.$list37);
        first_list = junct_lists.first();
        SubLObject current = junct_lists.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, junct_lists, (SubLObject)pph_methods_formulas.$list37);
        second_list = current.first();
        current = current.rest();
        if (pph_methods_formulas.NIL == current) {
            if (pph_methods_formulas.NIL != use_bulletsP) {
                ans = (SubLObject)ConsesLow.cons(pph_start_list_item_item(), ans);
            }
            SubLObject cdolist_list_var = first_list;
            SubLObject item = (SubLObject)pph_methods_formulas.NIL;
            item = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(item, ans);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            if (pph_methods_formulas.NIL != use_bulletsP) {
                ans = (SubLObject)ConsesLow.cons(pph_end_list_item_item(), ans);
            }
            if (pph_methods_formulas.NIL == use_bulletsP) {
                ans = (SubLObject)ConsesLow.cons(opr_item, ans);
                cdolist_list_var = second_list;
                item = (SubLObject)pph_methods_formulas.NIL;
                item = cdolist_list_var.first();
                while (pph_methods_formulas.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(item, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
            }
            else if (list_type == pph_methods_formulas.$kw6$UNORDERED) {
                ans = (SubLObject)ConsesLow.cons(pph_start_list_item_item(), ans);
                ans = (SubLObject)ConsesLow.cons(opr_item, ans);
                cdolist_list_var = second_list;
                item = (SubLObject)pph_methods_formulas.NIL;
                item = cdolist_list_var.first();
                while (pph_methods_formulas.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(item, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                ans = (SubLObject)ConsesLow.cons(pph_end_list_item_item(), ans);
            }
            else {
                ans = (SubLObject)ConsesLow.cons(pph_comma_item(), ans);
                ans = (SubLObject)ConsesLow.cons(opr_item, ans);
                ans = (SubLObject)ConsesLow.cons(pph_start_list_item_item(), ans);
                cdolist_list_var = second_list;
                item = (SubLObject)pph_methods_formulas.NIL;
                item = cdolist_list_var.first();
                while (pph_methods_formulas.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(item, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                ans = (SubLObject)ConsesLow.cons(pph_end_list_item_item(), ans);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(junct_lists, (SubLObject)pph_methods_formulas.$list37);
        }
        ans = Sequences.nreverse(ans);
        if (pph_methods_formulas.NIL != use_bulletsP) {
            ans = pph_add_bullet_list_tags(ans, list_type);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 7309L)
    public static SubLObject pph_junct_olist_from_3_or_more_olists(final SubLObject junct_lists, final SubLObject opr_string, final SubLObject opr_item, final SubLObject list_type, final SubLObject use_bulletsP) {
        final SubLObject arg_count = Sequences.length(junct_lists);
        final SubLObject use_commaP = (SubLObject)SubLObjectFactory.makeBoolean(opr_string.isString() && pph_methods_formulas.NIL != Sequences.find_if((SubLObject)pph_methods_formulas.$sym38$ALPHA_CHAR_P, opr_string, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
        final SubLObject repeat_opr_item_each_junctP = (SubLObject)pph_methods_formulas.NIL;
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
        SubLObject junct_list = (SubLObject)pph_methods_formulas.NIL;
        SubLObject i = (SubLObject)pph_methods_formulas.NIL;
        list_var = junct_lists;
        junct_list = list_var.first();
        for (i = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), junct_list = list_var.first(), i = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, i)) {
            final SubLObject first_oneP = Numbers.zerop(i);
            final SubLObject last_oneP = Numbers.numE(i, number_utilities.f_1_(arg_count));
            if (pph_methods_formulas.NIL == last_oneP) {
                if (pph_methods_formulas.NIL != use_bulletsP) {
                    ans = (SubLObject)ConsesLow.cons(pph_start_list_item_item(), ans);
                }
                if (pph_methods_formulas.NIL != repeat_opr_item_each_junctP && pph_methods_formulas.NIL == first_oneP) {
                    ans = (SubLObject)ConsesLow.cons(opr_item, ans);
                }
                SubLObject cdolist_list_var = junct_list;
                SubLObject item = (SubLObject)pph_methods_formulas.NIL;
                item = cdolist_list_var.first();
                while (pph_methods_formulas.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(item, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                if (pph_methods_formulas.NIL != use_commaP) {
                    ans = (SubLObject)ConsesLow.cons(pph_comma_item(), ans);
                }
                if (pph_methods_formulas.NIL != use_bulletsP) {
                    ans = (SubLObject)ConsesLow.cons(pph_end_list_item_item(), ans);
                }
            }
            else if (pph_methods_formulas.NIL == use_bulletsP) {
                if (pph_methods_formulas.NIL != opr_string) {
                    ans = (SubLObject)ConsesLow.cons(opr_item, ans);
                }
                SubLObject cdolist_list_var = junct_list;
                SubLObject item = (SubLObject)pph_methods_formulas.NIL;
                item = cdolist_list_var.first();
                while (pph_methods_formulas.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(item, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
            }
            else if (pph_methods_formulas.NIL == opr_string) {
                ans = (SubLObject)ConsesLow.cons(pph_start_list_item_item(), ans);
                SubLObject cdolist_list_var = junct_list;
                SubLObject item = (SubLObject)pph_methods_formulas.NIL;
                item = cdolist_list_var.first();
                while (pph_methods_formulas.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(item, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                ans = (SubLObject)ConsesLow.cons(pph_end_list_item_item(), ans);
            }
            else if (list_type == pph_methods_formulas.$kw6$UNORDERED) {
                ans = (SubLObject)ConsesLow.cons(pph_start_list_item_item(), ans);
                ans = (SubLObject)ConsesLow.cons(opr_item, ans);
                SubLObject cdolist_list_var = junct_list;
                SubLObject item = (SubLObject)pph_methods_formulas.NIL;
                item = cdolist_list_var.first();
                while (pph_methods_formulas.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(item, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                ans = (SubLObject)ConsesLow.cons(pph_end_list_item_item(), ans);
            }
            else {
                ans = (SubLObject)ConsesLow.cons(opr_item, ans);
                ans = (SubLObject)ConsesLow.cons(pph_start_list_item_item(), ans);
                SubLObject cdolist_list_var = junct_list;
                SubLObject item = (SubLObject)pph_methods_formulas.NIL;
                item = cdolist_list_var.first();
                while (pph_methods_formulas.NIL != cdolist_list_var) {
                    ans = (SubLObject)ConsesLow.cons(item, ans);
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                }
                ans = (SubLObject)ConsesLow.cons(pph_end_list_item_item(), ans);
            }
        }
        ans = Sequences.nreverse(ans);
        if (pph_methods_formulas.NIL != use_bulletsP) {
            ans = pph_add_bullet_list_tags(ans, list_type);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 8671L)
    public static SubLObject pph_comma_item() {
        return pph_question.new_pph_phrase_filler_item((SubLObject)pph_methods_formulas.$str0$_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 8753L)
    public static SubLObject pph_add_bullet_list_tags(final SubLObject output_items, SubLObject type) {
        if (type == pph_methods_formulas.UNPROVIDED) {
            type = (SubLObject)pph_methods_formulas.$kw6$UNORDERED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL == conses_high.member(type, html_macros.$html_valid_list_types$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUAL), (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            type = (SubLObject)pph_methods_formulas.$kw6$UNORDERED;
        }
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_methods_formulas.$kw39$HTML) {
            return (SubLObject)ConsesLow.cons(pph_start_list_item(type), ConsesLow.append(output_items, (SubLObject)ConsesLow.list(pph_end_list_item(type))));
        }
        return output_items;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 9127L)
    public static SubLObject pph_start_list_item(SubLObject type) {
        if (type == pph_methods_formulas.UNPROVIDED) {
            type = (SubLObject)pph_methods_formulas.$kw6$UNORDERED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item = pph_question.new_pph_phrase_filler_item(string_utilities.$empty_string$.getGlobalValue());
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_methods_formulas.$kw39$HTML) {
            pph_data_structures.pph_phrase_output_item_set_html_tags(item, pph_start_list_tag(type), (SubLObject)pph_methods_formulas.NIL);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 9417L)
    public static SubLObject pph_end_list_item(SubLObject type) {
        if (type == pph_methods_formulas.UNPROVIDED) {
            type = (SubLObject)pph_methods_formulas.$kw6$UNORDERED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item = pph_question.new_pph_phrase_filler_item(string_utilities.$empty_string$.getGlobalValue());
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_methods_formulas.$kw39$HTML) {
            pph_data_structures.pph_phrase_output_item_set_html_tags(item, (SubLObject)pph_methods_formulas.NIL, pph_end_list_tag(type));
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 9696L)
    public static SubLObject pph_start_list_tag(SubLObject type) {
        if (type == pph_methods_formulas.UNPROVIDED) {
            type = (SubLObject)pph_methods_formulas.$kw6$UNORDERED;
        }
        SubLObject attributes_string = string_utilities.$empty_string$.getGlobalValue();
        SubLObject type_string = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject pcase_var = type;
        if (pcase_var.eql((SubLObject)pph_methods_formulas.$kw6$UNORDERED)) {
            type_string = html_macros.$html_unordered_list_head$.getGlobalValue();
        }
        else {
            type_string = html_macros.$html_ordered_list_head$.getGlobalValue();
            attributes_string = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_macros.$html_list_type$.getGlobalValue()), format_nil.format_nil_s_no_copy(type));
        }
        return Sequences.cconcatenate(type_string, new SubLObject[] { attributes_string, pph_methods_formulas.$str40$_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 9696L)
    public static SubLObject pph_end_list_tag(SubLObject type) {
        if (type == pph_methods_formulas.UNPROVIDED) {
            type = (SubLObject)pph_methods_formulas.$kw6$UNORDERED;
        }
        final SubLObject pcase_var = type;
        if (pcase_var.eql((SubLObject)pph_methods_formulas.$kw6$UNORDERED)) {
            return html_macros.$html_unordered_list_tail$.getGlobalValue();
        }
        return html_macros.$html_ordered_list_tail$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 10318L)
    public static SubLObject pph_start_list_item_item() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item = pph_question.new_pph_phrase_filler_item(string_utilities.$empty_string$.getGlobalValue());
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_methods_formulas.$kw39$HTML) {
            pph_data_structures.pph_phrase_output_item_set_html_tags(item, Sequences.cconcatenate(html_macros.$html_list_item_head$.getGlobalValue(), (SubLObject)pph_methods_formulas.$str40$_), (SubLObject)pph_methods_formulas.NIL);
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 10604L)
    public static SubLObject pph_end_list_item_item() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject item = pph_question.new_pph_phrase_filler_item(string_utilities.$empty_string$.getGlobalValue());
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_methods_formulas.$kw39$HTML) {
            pph_data_structures.pph_phrase_output_item_set_html_tags(item, (SubLObject)pph_methods_formulas.NIL, html_macros.$html_list_item_tail$.getGlobalValue());
        }
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 10859L)
    public static SubLObject pph_operator_string_from_key(final SubLObject opr_key) {
        if (pph_methods_formulas.NIL == pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        if (opr_key.eql((SubLObject)pph_methods_formulas.$kw41$NONE) || opr_key.eql((SubLObject)pph_methods_formulas.$kw42$SPACE)) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        if (opr_key.eql((SubLObject)pph_methods_formulas.$kw43$PERIOD)) {
            return (SubLObject)pph_methods_formulas.$str44$_;
        }
        if (opr_key.eql((SubLObject)pph_methods_formulas.$kw45$OR)) {
            return (SubLObject)pph_methods_formulas.$str2$or;
        }
        if (opr_key.eql((SubLObject)pph_methods_formulas.$kw46$AND_OR)) {
            return (SubLObject)pph_methods_formulas.$str47$and_or;
        }
        if (opr_key.eql((SubLObject)pph_methods_formulas.$kw5$AND)) {
            return (SubLObject)pph_methods_formulas.$str1$and;
        }
        if (opr_key.eql((SubLObject)pph_methods_formulas.$kw48$BUT)) {
            return (SubLObject)pph_methods_formulas.$str49$but;
        }
        return (SubLObject)pph_methods_formulas.$str0$_;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 11179L)
    public static SubLObject pph_contextualize_junct_arg_positions(final SubLObject starting_argnum, final SubLObject junct_lists) {
        SubLObject current_argnum = starting_argnum;
        SubLObject cdolist_list_var = junct_lists;
        SubLObject junct_list = (SubLObject)pph_methods_formulas.NIL;
        junct_list = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            final SubLObject junct_arg_position = (SubLObject)ConsesLow.list(current_argnum);
            SubLObject cdolist_list_var_$14 = junct_list;
            SubLObject output_item = (SubLObject)pph_methods_formulas.NIL;
            output_item = cdolist_list_var_$14.first();
            while (pph_methods_formulas.NIL != cdolist_list_var_$14) {
                pph_utilities.pph_contextualize_output_item_arg_position(junct_arg_position, output_item);
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                output_item = cdolist_list_var_$14.first();
            }
            current_argnum = Numbers.add(current_argnum, (SubLObject)pph_methods_formulas.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            junct_list = cdolist_list_var.first();
        }
        return junct_lists;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 11679L)
    public static SubLObject pph_add_cycl_to_junct_olists(final SubLObject args, final SubLObject junct_lists) {
        SubLObject junct_list = (SubLObject)pph_methods_formulas.NIL;
        SubLObject junct_list_$15 = (SubLObject)pph_methods_formulas.NIL;
        SubLObject this_arg_top_level_cycl = (SubLObject)pph_methods_formulas.NIL;
        SubLObject this_arg_top_level_cycl_$16 = (SubLObject)pph_methods_formulas.NIL;
        junct_list = junct_lists;
        junct_list_$15 = junct_list.first();
        this_arg_top_level_cycl = args;
        this_arg_top_level_cycl_$16 = this_arg_top_level_cycl.first();
        while (pph_methods_formulas.NIL != this_arg_top_level_cycl || pph_methods_formulas.NIL != junct_list) {
            if (pph_methods_formulas.NIL != list_utilities.singletonP(junct_list_$15) && pph_methods_formulas.NIL == el_utilities.el_formula_p(this_arg_top_level_cycl_$16)) {
                final SubLObject output_item = junct_list_$15.first();
                final SubLObject local_arg_position = pph_data_structures.pph_phrase_output_item_arg_position(output_item);
                if (pph_methods_formulas.NIL == local_arg_position) {
                    pph_data_structures.pph_phrase_output_item_set_cycl(output_item, this_arg_top_level_cycl_$16);
                }
            }
            junct_list = junct_list.rest();
            junct_list_$15 = junct_list.first();
            this_arg_top_level_cycl = this_arg_top_level_cycl.rest();
            this_arg_top_level_cycl_$16 = this_arg_top_level_cycl.first();
        }
        return junct_lists;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 12287L)
    public static SubLObject ordinal_form(final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ordinal_word = ordinal_word(num, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject lexified_ordinal = (SubLObject)((pph_methods_formulas.NIL != pph_types.pph_lexical_wordP(ordinal_word)) ? pph_methods_lexicon.pph_first_string_of_wordXspeech_part(ordinal_word, pph_methods_formulas.$const50$OrdinalAdjective, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) : pph_methods_formulas.NIL);
        if (lexified_ordinal.isString()) {
            return lexified_ordinal;
        }
        SubLObject num_string = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)pph_methods_formulas.T, thread);
            try {
                num_string = pph_main.pph_phrase_generate_string_from_cycl(num, (SubLObject)pph_methods_formulas.$list51, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        }
        finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        if (pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return Sequences.cconcatenate(num_string, english_ordinal_suffix(num));
        }
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_methods_formulas.$str52$Can_t_generate_ordinal_form_of__S, num, pph_vars.$pph_language_mt$.getDynamicValue(thread));
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return num_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 13363L)
    public static SubLObject ordinal_word(final SubLObject num, SubLObject mt) {
        if (mt == pph_methods_formulas.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        SubLObject wu = (SubLObject)pph_methods_formulas.NIL;
        if (num.isNumber() && pph_methods_formulas.NIL == wu) {
            SubLObject csome_list_var;
            SubLObject v_bindings;
            for (csome_list_var = pph_utilities.pph_ask_bindings((SubLObject)ConsesLow.list(pph_methods_formulas.$const63$denotation, (SubLObject)pph_methods_formulas.$sym62$_WU, pph_methods_formulas.$const50$OrdinalAdjective, (SubLObject)pph_methods_formulas.$sym64$_SENSE, num), mt, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), v_bindings = (SubLObject)pph_methods_formulas.NIL, v_bindings = csome_list_var.first(); pph_methods_formulas.NIL == wu && pph_methods_formulas.NIL != csome_list_var; wu = bindings.variable_lookup((SubLObject)pph_methods_formulas.$sym62$_WU, v_bindings), csome_list_var = csome_list_var.rest(), v_bindings = csome_list_var.first()) {}
        }
        return wu;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 13730L)
    public static SubLObject english_ordinal_suffix(SubLObject num) {
        if (num.isNumber()) {
            num = Numbers.mod(num, (SubLObject)pph_methods_formulas.$int65$100);
        }
        if (num.equal((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            return (SubLObject)pph_methods_formulas.$str66$st;
        }
        if (num.equal((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
            return (SubLObject)pph_methods_formulas.$str67$nd;
        }
        if (num.equal((SubLObject)pph_methods_formulas.THREE_INTEGER)) {
            return (SubLObject)pph_methods_formulas.$str68$rd;
        }
        if (!num.isNumber() || num.numLE((SubLObject)pph_methods_formulas.TWENTY_INTEGER)) {
            return (SubLObject)pph_methods_formulas.$str69$th;
        }
        if (num.isNumber()) {
            return english_ordinal_suffix(Numbers.mod(num, (SubLObject)pph_methods_formulas.TEN_INTEGER));
        }
        return (SubLObject)pph_methods_formulas.$str69$th;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 14152L)
    public static SubLObject generate_nth_expr(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_operator(v_object);
        final SubLObject arg1_string = pph_main.pph_phrase_generate_string_from_cycl(cycl_utilities.formula_arg1(v_object, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(v_object, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject arg2_string = arg2.eql((SubLObject)pph_methods_formulas.ONE_INTEGER) ? string_utilities.$empty_string$.getGlobalValue() : (arg2.isInteger() ? ordinal_form(arg2) : pph_main.pph_phrase_generate_string_from_cycl(arg2, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
        SubLObject est_string = (SubLObject)(pred.eql(pph_methods_formulas.$const73$nthLargestElement) ? pph_methods_formulas.$str74$largest : pph_methods_formulas.$str75$smallest);
        final SubLObject qualified_est_string = (pph_methods_formulas.NIL != Strings.stringE(arg2_string, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) ? est_string : pph_string.pph_bunge((SubLObject)ConsesLow.list(arg2_string, est_string));
        final SubLObject arg3 = cycl_utilities.formula_arg3(v_object, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject arg3_string = (pph_methods_formulas.NIL != fort_types_interface.collection_in_any_mtP(arg3)) ? pph_string.pph_bunge((SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.$str76$all, pph_main.pph_phrase_generate_string_from_cycl(arg3, (SubLObject)pph_methods_formulas.$list77, (SubLObject)pph_methods_formulas.UNPROVIDED))) : pph_main.pph_phrase_generate_string_from_cycl(arg3, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject arg4_string = pph_main.pph_phrase_generate_string_from_cycl(cycl_utilities.formula_arg4(v_object, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.$list78, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_methods_formulas.$kw39$HTML) {
            est_string = pph_html.string_term_anchor(est_string, pred);
        }
        pph_phrase.pph_phrase_set_string(phrase, pph_string.pph_bunge((SubLObject)ConsesLow.list(arg1_string, (SubLObject)pph_methods_formulas.$str79$has_the, qualified_est_string, arg4_string, (SubLObject)pph_methods_formulas.$str80$of, arg3_string)));
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 15766L)
    public static SubLObject generate_atomic_formula(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && pph_methods_formulas.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            Errors.error((SubLObject)pph_methods_formulas.$str85$GENERATE_ATOMIC_FORMULA_called_on, phrase);
        }
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == el_utilities.formula_with_sequence_termP(formula)) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
            try {
                pph_vars.$pph_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                final SubLObject _prev_bind_0_$18 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                try {
                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                    pph_vars.$pph_noted_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL), (SubLObject)pph_methods_formulas.SIXTEEN_INTEGER), thread);
                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    try {
                        thread.resetMultipleValues();
                        final SubLObject output_list = do_generate_atomic_formula(phrase);
                        final SubLObject assertion_used = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (pph_phrase.pph_phrase_dtr_count(phrase).isPositive()) {
                            pph_phrase.pph_phrase_remove_all_dtrs(phrase);
                        }
                        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_non_empty_output_list_p(output_list)) {
                            pph_phrase.pph_phrase_set_output_list_with_map(phrase, output_list);
                            if (pph_methods_formulas.NIL == pph_data_structures.dont_care_pph_phrase_agr_p(pph_phrase.pph_phrase_agr(phrase))) {
                                pph_phrase.pph_phrase_increment_top_level_demerits(phrase, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$kw87$GENERATE_ATOMIC_FORMULA_WITH_AGR);
                            }
                            pph_phrase.pph_phrase_note_done(phrase);
                            if (pph_methods_formulas.NIL != assertion_used) {
                                pph_phrase.pph_phrase_add_justification(phrase, assertion_used);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            final SubLObject local_vars = conses_high.set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            pph_macros.pph_handle_local_vars(local_vars);
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                }
                finally {
                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$18, thread);
                }
            }
            finally {
                pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 16853L)
    public static SubLObject do_generate_atomic_formula(final SubLObject phrase) {
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject gen_template_as = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == pph_types.pph_formulaP(formula)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLObject reln = function_terms.naut_to_nart(cycl_utilities.formula_operator(formula));
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject nl_preds_for_formula = pph_utilities.pph_default_nl_preds_for_term(formula);
        final SubLObject nl_preds = pph_utilities.pph_filter_preds(nl_preds_for_formula, pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != nl_preds) {
            gen_template_as = get_best_generation_template_as(reln, args);
            if (pph_methods_formulas.NIL != gen_template_as) {
                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str90$__Using_template_assertion___S___, gen_template_as, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                ans = generate_atomic_formula_from_genformat(formula, gen_template_as, nl_preds, (SubLObject)pph_methods_formulas.NIL, pph_utilities.pph_new_identity_map(), phrase);
            }
        }
        return Values.values(ans, (SubLObject)((pph_methods_formulas.$kw7$FAILURE ==  ans) ? pph_methods_formulas.NIL : gen_template_as));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 17750L)
    public static SubLObject generate_all_phrases_for_formula(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL == pph_types.pph_formulaP(formula)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject reln = cycl_utilities.formula_operator(formula);
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind((SubLObject)pph_methods_formulas.$kw93$TEXT, thread);
            final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject gen_template_as_list = get_generation_template_as_list(reln, args, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = pph_macros.$new_pph_phrases$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)pph_methods_formulas.T, thread);
                try {
                    SubLObject cdolist_list_var = gen_template_as_list;
                    SubLObject as = (SubLObject)pph_methods_formulas.NIL;
                    as = cdolist_list_var.first();
                    while (pph_methods_formulas.NIL != cdolist_list_var) {
                        final SubLObject olist = generate_atomic_formula_from_genformat(formula, as, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        if (pph_methods_formulas.NIL != olist) {
                            ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pph_phrase.pph_phrase_output_list_string(olist, (SubLObject)pph_methods_formulas.NIL), as), ans);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        as = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                    }
                }
            }
            finally {
                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$20, thread);
            }
        }
        finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
        return Sequences.reverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 18608L)
    public static SubLObject genformat_assertion_fits_formulaP(final SubLObject gen_template_as, final SubLObject formula, SubLObject nl_preds) {
        if (nl_preds == pph_methods_formulas.UNPROVIDED) {
            nl_preds = (SubLObject)pph_methods_formulas.$kw94$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_methods_formulas.T;
        thread.resetMultipleValues();
        final SubLObject format_string = get_genformat_string_and_list(gen_template_as);
        SubLObject arg_order_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (format_string.isString()) {
            arg_order_list = regularize_genformat_arglist(arg_order_list, el_utilities.formula_arity(formula, (SubLObject)pph_methods_formulas.$kw95$REGULARIZE));
            SubLObject badP = (SubLObject)pph_methods_formulas.NIL;
            SubLObject argnum = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.$kw96$IGNORE);
            SubLObject rest;
            SubLObject arg;
            SubLObject agr_preds;
            SubLObject arg_preds;
            SubLObject unified_agr_preds;
            for (rest = (SubLObject)pph_methods_formulas.NIL, rest = args; pph_methods_formulas.NIL == badP && pph_methods_formulas.NIL != rest; rest = rest.rest()) {
                arg = rest.first();
                argnum = Numbers.add(argnum, (SubLObject)pph_methods_formulas.ONE_INTEGER);
                agr_preds = (SubLObject)pph_methods_formulas.$kw94$ANY;
                arg_preds = pph_agr_preds_for_cycl(arg);
                unified_agr_preds = pph_utilities.pph_filter_preds(agr_preds, arg_preds, (SubLObject)pph_methods_formulas.UNPROVIDED);
                if (pph_methods_formulas.NIL == unified_agr_preds) {
                    badP = (SubLObject)pph_methods_formulas.T;
                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_methods_formulas.$str97$Can_t_use__S_with__S, gen_template_as, formula);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                }
            }
            if (pph_methods_formulas.NIL != badP) {
                ans = (SubLObject)pph_methods_formulas.NIL;
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 19578L)
    public static SubLObject pph_agr_preds_for_cycl(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)pph_methods_formulas.$kw94$ANY;
        if (pph_methods_formulas.NIL != pph_types.pph_phrase_nautP(cycl)) {
            final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)pph_methods_formulas.T, thread);
                try {
                    final SubLObject phrase = pph_phrase.new_pph_phrase_for_cycl(cycl, pph_utilities.pph_new_empty_map(), (SubLObject)pph_methods_formulas.UNPROVIDED);
                    preds = pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                finally {
                    final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            }
            finally {
                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
            }
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 19864L)
    public static SubLObject generate_atomic_formula_from_genformat(final SubLObject formula, final SubLObject gen_template_as, SubLObject nl_preds, SubLObject determiner, SubLObject arg_position_map, SubLObject phrase) {
        if (nl_preds == pph_methods_formulas.UNPROVIDED) {
            nl_preds = (SubLObject)pph_methods_formulas.$kw94$ANY;
        }
        if (determiner == pph_methods_formulas.UNPROVIDED) {
            determiner = (SubLObject)pph_methods_formulas.NIL;
        }
        if (arg_position_map == pph_methods_formulas.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_methods_formulas.NIL;
        }
        if (phrase == pph_methods_formulas.UNPROVIDED) {
            phrase = (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        thread.resetMultipleValues();
        final SubLObject format_string = get_genformat_string_and_list(gen_template_as);
        final SubLObject arg_order_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ans = generate_atomic_formula_from_format_string_and_arg_order_list(formula, format_string, arg_order_list, arg_position_map, phrase);
        return pph_utilities.pph_add_determiner(determiner, ans, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 20728L)
    public static SubLObject generate_atomic_formula_from_format_string_and_arg_order_list(final SubLObject formula, final SubLObject format_string, final SubLObject arg_order_list, final SubLObject arg_position_map, SubLObject phrase) {
        if (phrase == pph_methods_formulas.UNPROVIDED) {
            phrase = (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL == format_string) {
            final SubLObject string = print_high.princ_to_string(el_utilities.map_formula_args((SubLObject)pph_methods_formulas.$sym99$PPH_PHRASE_GENERATE_STRING_FROM_CYCL, formula, (SubLObject)pph_methods_formulas.UNPROVIDED));
            return pph_phrase.new_pph_phrase_output_list(string, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        SubLObject reln = (SubLObject)pph_methods_formulas.NIL;
        SubLObject args = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)pph_methods_formulas.$list98);
        reln = formula.first();
        final SubLObject current = args = formula.rest();
        final SubLObject output_lists = process_genformat_arglist(formula, reln, args, arg_order_list, arg_position_map, phrase);
        if (pph_methods_formulas.NIL != list_utilities.tree_find((SubLObject)pph_methods_formulas.$kw7$FAILURE, output_lists, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return (SubLObject)pph_methods_formulas.$kw7$FAILURE;
        }
        return pph_output_list_from_format_string_and_args(format_string, reln, output_lists, arg_position_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 21452L)
    public static SubLObject pph_output_list_from_format_string_and_args(final SubLObject format_string, final SubLObject reln, SubLObject output_lists, SubLObject arg_position_map) {
        if (arg_position_map == pph_methods_formulas.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_methods_formulas.NIL;
        }
        SubLObject items = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject arg0_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list100, arg_position_map);
        SubLObject arg0_strings = (SubLObject)pph_methods_formulas.NIL;
        SubLObject cdolist_list_var = string_utilities.string_tokenize(format_string, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject string = (SubLObject)pph_methods_formulas.NIL;
        string = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            final SubLObject squiggle_count = Sequences.count((SubLObject)Characters.CHAR_tilde, string, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != subl_promotions.positive_integer_p(squiggle_count)) {
                if (pph_methods_formulas.NIL != arg0_strings) {
                    items = (SubLObject)ConsesLow.cons(pph_phrase_resolution.pph_phrase_arg0_item(reln, arg0_strings, arg0_position), items);
                    arg0_strings = (SubLObject)pph_methods_formulas.NIL;
                }
                SubLObject strings = string_utilities.string_tokenize(string, (SubLObject)pph_methods_formulas.$list101, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                SubLObject pre_squiggle_string = (SubLObject)pph_methods_formulas.NIL;
                SubLObject post_squiggleP = (SubLObject)pph_methods_formulas.NIL;
                SubLObject substring = (SubLObject)pph_methods_formulas.NIL;
                substring = strings.first();
                while (pph_methods_formulas.NIL != strings) {
                    strings = strings.rest();
                    if (pph_methods_formulas.NIL != Strings.stringE(substring, (SubLObject)pph_methods_formulas.$str102$_, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != strings) {
                        SubLObject cdolist_list_var_$23 = output_lists.first();
                        SubLObject output_item = (SubLObject)pph_methods_formulas.NIL;
                        output_item = cdolist_list_var_$23.first();
                        while (pph_methods_formulas.NIL != cdolist_list_var_$23) {
                            if (pph_methods_formulas.NIL != pre_squiggle_string) {
                                pph_data_structures.pph_phrase_output_item_prefix_string(output_item, pre_squiggle_string);
                                pre_squiggle_string = (SubLObject)pph_methods_formulas.NIL;
                            }
                            items = (SubLObject)ConsesLow.cons(output_item, items);
                            cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                            output_item = cdolist_list_var_$23.first();
                        }
                        output_lists = output_lists.rest();
                        post_squiggleP = (SubLObject)pph_methods_formulas.T;
                    }
                    else if (pph_methods_formulas.NIL != post_squiggleP) {
                        if (pph_methods_formulas.NIL != list_utilities.lengthG(substring, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                            final SubLObject decapitated_string = Sequences.subseq(substring, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            final SubLObject top_item = items.first();
                            pph_data_structures.pph_phrase_output_item_suffix_string(top_item, decapitated_string);
                        }
                        post_squiggleP = (SubLObject)pph_methods_formulas.NIL;
                    }
                    else {
                        pre_squiggle_string = substring;
                    }
                    substring = strings.first();
                }
            }
            else {
                arg0_strings = (SubLObject)ConsesLow.cons(string, arg0_strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        if (pph_methods_formulas.NIL != arg0_strings) {
            items = (SubLObject)ConsesLow.cons(pph_phrase_resolution.pph_phrase_arg0_item(reln, arg0_strings, arg0_position), items);
        }
        return Sequences.nreverse(items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 23357L)
    public static SubLObject get_list_from_formula(final SubLObject formula, final SubLObject arg_pos) {
        SubLObject list = cycl_utilities.formula_arg(formula, arg_pos, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == pph_methods_formulas.$pph_allow_subl_listsP$.getGlobalValue() && !pph_methods_formulas.assertionsDisabledInClass && pph_methods_formulas.NIL == el_utilities.el_list_p(list)) {
            throw new AssertionError(list);
        }
        if (pph_methods_formulas.NIL != el_utilities.el_list_p(list)) {
            list = el_utilities.el_list_to_subl_list_recursively(list);
        }
        return list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 23641L)
    public static SubLObject get_genformat_string_and_list(final SubLObject as) {
        if (pph_methods_formulas.NIL == assertions_high.gaf_assertionP(as)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        return get_genformat_string_and_list_from_formula(assertions_high.gaf_formula(as));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 23958L)
    public static SubLObject get_genformat_string_and_list_from_formula(final SubLObject gaf_formula) {
        if (pph_methods_formulas.NIL == el_utilities.el_formula_p(gaf_formula)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLObject pred = cycl_utilities.formula_operator(gaf_formula);
        if (pph_methods_formulas.NIL != conses_high.member(pred, (SubLObject)ConsesLow.list(pph_methods_formulas.$const104$genFormat, pph_methods_formulas.$const105$genFormat_Precise, pph_methods_formulas.$const106$genFormat_NP), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return Values.values(cycl_utilities.formula_arg2(gaf_formula, (SubLObject)pph_methods_formulas.UNPROVIDED), get_list_from_formula(gaf_formula, (SubLObject)pph_methods_formulas.THREE_INTEGER));
        }
        if (pred.eql(pph_methods_formulas.$const107$genQuestion)) {
            return Values.values(cycl_utilities.formula_arg3(gaf_formula, (SubLObject)pph_methods_formulas.UNPROVIDED), get_list_from_formula(gaf_formula, (SubLObject)pph_methods_formulas.FOUR_INTEGER));
        }
        if (pred.eql(pph_methods_formulas.$const108$genFormat_ArgFixed)) {
            return Values.values(cycl_utilities.formula_arg4(gaf_formula, (SubLObject)pph_methods_formulas.UNPROVIDED), get_list_from_formula(gaf_formula, (SubLObject)pph_methods_formulas.FIVE_INTEGER));
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 24745L)
    public static SubLObject get_best_generation_template_as(final SubLObject relation, SubLObject args) {
        if (args == pph_methods_formulas.UNPROVIDED) {
            args = (SubLObject)pph_methods_formulas.NIL;
        }
        return get_generation_template_as_list(relation, args, (SubLObject)pph_methods_formulas.T).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 24971L)
    public static SubLObject get_generation_template_as_list(final SubLObject relation, SubLObject args, SubLObject best_onlyP) {
        if (args == pph_methods_formulas.UNPROVIDED) {
            args = (SubLObject)pph_methods_formulas.NIL;
        }
        if (best_onlyP == pph_methods_formulas.UNPROVIDED) {
            best_onlyP = (SubLObject)pph_methods_formulas.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject search_limit = pph_utilities.pph_search_limit();
        SubLObject ans = get_generation_template_as_list_for_relation_only(relation, args, best_onlyP);
        SubLObject doneP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != best_onlyP && pph_methods_formulas.NIL != ans);
        final SubLObject tgps = (SubLObject)((pph_methods_formulas.NIL != doneP) ? pph_methods_formulas.NIL : pph_utilities.pph_typed_genl_preds(relation, (SubLObject)pph_methods_formulas.UNPROVIDED));
        if (pph_methods_formulas.NIL == doneP) {
            SubLObject csome_list_var = tgps;
            SubLObject tgp = (SubLObject)pph_methods_formulas.NIL;
            tgp = csome_list_var.first();
            while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var) {
                final SubLObject new_assertions = get_generation_template_as_list_for_relation_only(tgp, args, best_onlyP);
                if (pph_methods_formulas.NIL == doneP) {
                    SubLObject csome_list_var_$24 = new_assertions;
                    SubLObject as = (SubLObject)pph_methods_formulas.NIL;
                    as = csome_list_var_$24.first();
                    while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var_$24) {
                        ans = (SubLObject)ConsesLow.cons(as, ans);
                        doneP = best_onlyP;
                        csome_list_var_$24 = csome_list_var_$24.rest();
                        as = csome_list_var_$24.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                tgp = csome_list_var.first();
            }
        }
        if (pph_methods_formulas.NIL == doneP && search_limit.isPositive() && pph_methods_formulas.NIL != fort_types_interface.predicate_in_any_mtP(relation)) {
            SubLObject search_level = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            if (pph_methods_formulas.NIL == doneP) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module(pph_methods_formulas.$const109$genlPreds);
                final SubLObject deck_type = (SubLObject)((pph_methods_formulas.$kw110$BREADTH == pph_methods_formulas.$kw111$DEPTH) ? pph_methods_formulas.$kw112$STACK : pph_methods_formulas.$kw113$QUEUE);
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)pph_methods_formulas.NIL;
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject mt_var = pph_vars.$pph_language_mt$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$25 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            final SubLObject tv_var = pph_methods_formulas.$const114$True_JustificationTruth;
                            final SubLObject _prev_bind_0_$26 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$27 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((pph_methods_formulas.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_methods_formulas.NIL != tv_var) ? pph_methods_formulas.$sym115$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (pph_methods_formulas.NIL != tv_var && pph_methods_formulas.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_methods_formulas.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)pph_methods_formulas.$kw116$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$str117$_A_is_not_a__A, tv_var, (SubLObject)pph_methods_formulas.$sym118$SBHL_TRUE_TV_P, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_methods_formulas.$kw119$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$str120$continue_anyway, (SubLObject)pph_methods_formulas.$str117$_A_is_not_a__A, tv_var, (SubLObject)pph_methods_formulas.$sym118$SBHL_TRUE_TV_P, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)pph_methods_formulas.$kw121$WARN)) {
                                        Errors.warn((SubLObject)pph_methods_formulas.$str117$_A_is_not_a__A, tv_var, (SubLObject)pph_methods_formulas.$sym118$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)pph_methods_formulas.$str122$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)pph_methods_formulas.$str120$continue_anyway, (SubLObject)pph_methods_formulas.$str117$_A_is_not_a__A, tv_var, (SubLObject)pph_methods_formulas.$sym118$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$27 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$28 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$30 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_methods_formulas.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                    if (pph_methods_formulas.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_methods_formulas.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(relation, sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$28 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$29 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_methods_formulas.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(relation, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                            for (node_and_predicate_mode = (SubLObject)ConsesLow.list(relation, sbhl_search_vars.genl_inverse_mode_p()); pph_methods_formulas.NIL != node_and_predicate_mode && pph_methods_formulas.NIL == doneP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                final SubLObject node_var_$34 = node_and_predicate_mode.first();
                                                final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                                final SubLObject genl_pred = node_var_$34;
                                                final SubLObject _prev_bind_0_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    final SubLObject inverseP = predicate_mode;
                                                    if (pph_methods_formulas.NIL == inverseP && !genl_pred.eql(relation) && pph_methods_formulas.NIL == conses_high.member(genl_pred, tgps, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                        final SubLObject new_assertions2 = get_generation_template_as_list_for_relation_only(genl_pred, args, best_onlyP);
                                                        if (pph_methods_formulas.NIL == doneP) {
                                                            SubLObject csome_list_var2 = new_assertions2;
                                                            SubLObject as2 = (SubLObject)pph_methods_formulas.NIL;
                                                            as2 = csome_list_var2.first();
                                                            while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var2) {
                                                                ans = (SubLObject)ConsesLow.cons(as2, ans);
                                                                search_level = Numbers.add(search_level, (SubLObject)pph_methods_formulas.ONE_INTEGER);
                                                                doneP = best_onlyP;
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                as2 = csome_list_var2.first();
                                                            }
                                                        }
                                                    }
                                                    doneP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != doneP || pph_methods_formulas.NIL != ans || search_level.numGE(search_limit));
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$30;
                                                    SubLObject _prev_bind_1_$30;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$31;
                                                    SubLObject iteration_state_$39;
                                                    SubLObject tv;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$32;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var3;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list;
                                                    SubLObject rest_$41;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$33;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes2;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var4;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest = (SubLObject)pph_methods_formulas.NIL, rest = accessible_modules; pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != rest; rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$30 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_methods_formulas.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                            node = function_terms.naut_to_nart(node_var_$34);
                                                            if (pph_methods_formulas.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED));
                                                                if (pph_methods_formulas.NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED));
                                                                    if (pph_methods_formulas.NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (pph_methods_formulas.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$39 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$39); iteration_state_$39 = dictionary_contents.do_dictionary_contents_next(iteration_state_$39)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$39);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (pph_methods_formulas.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (pph_methods_formulas.NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_methods_formulas.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if (pph_methods_formulas.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && pph_methods_formulas.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else if (sol.isList()) {
                                                                                                    if (pph_methods_formulas.NIL == doneP) {
                                                                                                        csome_list_var3 = sol;
                                                                                                        node_vars_link_node2 = (SubLObject)pph_methods_formulas.NIL;
                                                                                                        node_vars_link_node2 = csome_list_var3.first();
                                                                                                        while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var3) {
                                                                                                            if (pph_methods_formulas.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                                            node_vars_link_node2 = csome_list_var3.first();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                else {
                                                                                                    Errors.error((SubLObject)pph_methods_formulas.$str123$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$32, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$39);
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$31, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                }
                                                                else {
                                                                    sbhl_paranoia.sbhl_error((SubLObject)pph_methods_formulas.FIVE_INTEGER, (SubLObject)pph_methods_formulas.$str124$attempting_to_bind_direction_link, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                }
                                                            }
                                                            else if (pph_methods_formulas.NIL != obsolete.cnat_p(node, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                new_list = ((pph_methods_formulas.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED)));
                                                                for (rest_$41 = (SubLObject)pph_methods_formulas.NIL, rest_$41 = new_list; pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != rest_$41; rest_$41 = rest_$41.rest()) {
                                                                    generating_fn = rest_$41.first();
                                                                    _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                        if (pph_methods_formulas.NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_methods_formulas.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if (pph_methods_formulas.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && pph_methods_formulas.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        }
                                                                        else if (sol2.isList()) {
                                                                            if (pph_methods_formulas.NIL == doneP) {
                                                                                csome_list_var4 = sol2;
                                                                                node_vars_link_node4 = (SubLObject)pph_methods_formulas.NIL;
                                                                                node_vars_link_node4 = csome_list_var4.first();
                                                                                while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var4) {
                                                                                    if (pph_methods_formulas.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                    node_vars_link_node4 = csome_list_var4.first();
                                                                                }
                                                                            }
                                                                        }
                                                                        else {
                                                                            Errors.error((SubLObject)pph_methods_formulas.$str123$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$33, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$30, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$30, thread);
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$29, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$31, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$29, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$28, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str125$Node__a_does_not_pass_sbhl_type_t, relation, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$30, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$28, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$27, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$27, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$26, thread);
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_$25, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
            ans = Sequences.nreverse(ans);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 26383L)
    public static SubLObject genformat_args_okP(final SubLObject as, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = (SubLObject)pph_methods_formulas.NIL;
        thread.resetMultipleValues();
        final SubLObject string = get_genformat_string_and_list(as);
        final SubLObject list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_methods_formulas.NIL == badP) {
            SubLObject csome_list_var = list;
            SubLObject item = (SubLObject)pph_methods_formulas.NIL;
            item = csome_list_var.first();
            while (pph_methods_formulas.NIL == badP && pph_methods_formulas.NIL != csome_list_var) {
                final SubLObject arg_num = (SubLObject)(item.isInteger() ? item : (item.isList() ? item.first() : pph_methods_formulas.NIL));
                badP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != subl_promotions.positive_integer_p(arg_num) && pph_methods_formulas.NIL == ConsesLow.nth(number_utilities.f_1_(arg_num), args));
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 26840L)
    public static SubLObject genformat_precision_okP(final SubLObject as, SubLObject other_as) {
        if (other_as == pph_methods_formulas.UNPROVIDED) {
            other_as = (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = (SubLObject)pph_methods_formulas.NIL;
        SubLObject string_arg_count = (SubLObject)pph_methods_formulas.NIL;
        thread.resetMultipleValues();
        final SubLObject string = get_genformat_string_and_list(as);
        final SubLObject list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_methods_formulas.NIL == list) {
            string_arg_count = Sequences.count((SubLObject)Characters.CHAR_tilde, string, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        if (pph_utilities.pph_current_precision().isList() && pph_methods_formulas.NIL == badP) {
            SubLObject csome_list_var = pph_utilities.pph_current_precision();
            SubLObject item = (SubLObject)pph_methods_formulas.NIL;
            item = csome_list_var.first();
            while (pph_methods_formulas.NIL == badP && pph_methods_formulas.NIL != csome_list_var) {
                final SubLObject arg_num = (SubLObject)(item.isInteger() ? item : (item.isList() ? item.first() : pph_methods_formulas.NIL));
                SubLObject foundP = (SubLObject)pph_methods_formulas.NIL;
                if (pph_methods_formulas.NIL != list) {
                    if (pph_methods_formulas.NIL == foundP) {
                        SubLObject csome_list_var_$44;
                        SubLObject as_item;
                        for (csome_list_var_$44 = list, as_item = (SubLObject)pph_methods_formulas.NIL, as_item = csome_list_var_$44.first(); pph_methods_formulas.NIL == foundP && pph_methods_formulas.NIL != csome_list_var_$44; foundP = (SubLObject)SubLObjectFactory.makeBoolean(arg_num.eql(as_item) || (as_item.isList() && arg_num.eql(as_item.first()))), csome_list_var_$44 = csome_list_var_$44.rest(), as_item = csome_list_var_$44.first()) {}
                    }
                }
                else {
                    foundP = Numbers.numLE(arg_num, string_arg_count);
                }
                badP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == foundP);
                if (pph_methods_formulas.NIL != badP && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_methods_formulas.$str126$___S_not_referenced_in__S____Curr, arg_num, as, pph_utilities.pph_current_precision());
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 27815L)
    public static SubLObject pph_reln_has_precise_templateP(final SubLObject reln) {
        return list_utilities.sublisp_boolean(get_genformat_as_list(reln, (SubLObject)pph_methods_formulas.T, pph_methods_formulas.$const105$genFormat_Precise));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 27992L)
    public static SubLObject get_generation_template_as_list_for_relation_only(final SubLObject relation, final SubLObject args, final SubLObject best_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = (SubLObject)pph_methods_formulas.NIL;
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject precise = get_genformat_as_list(relation, (SubLObject)pph_methods_formulas.NIL, pph_methods_formulas.$const105$genFormat_Precise);
        if ((pph_methods_formulas.NIL != pph_utilities.pph_precise_in_argP((SubLObject)pph_methods_formulas.ZERO_INTEGER) || pph_methods_formulas.NIL != Sequences.find_if((SubLObject)pph_methods_formulas.$sym127$PPH_UNREGISTERED_VARIABLE_, args, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) && pph_methods_formulas.NIL == doneP) {
            SubLObject csome_list_var = precise;
            SubLObject as = (SubLObject)pph_methods_formulas.NIL;
            as = csome_list_var.first();
            while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var) {
                if (pph_methods_formulas.NIL != genformat_args_okP(as, args)) {
                    ans = (SubLObject)ConsesLow.cons(as, ans);
                    doneP = best_onlyP;
                }
                csome_list_var = csome_list_var.rest();
                as = csome_list_var.first();
            }
        }
        if (pph_methods_formulas.NIL == doneP) {
            if (pph_methods_formulas.NIL != args && pph_methods_formulas.NIL != kb_indexing_datastructures.indexed_term_p(relation) && pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != kb_mapping_utilities.some_pred_value_in_any_mt(relation, pph_methods_formulas.$const108$genFormat_ArgFixed, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                final SubLObject _prev_bind_4 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)pph_methods_formulas.$sym128$RELEVANT_PRED_IS_EVERYTHING, thread);
                    final SubLObject pred_var = pph_methods_formulas.$const108$genFormat_ArgFixed;
                    if (pph_methods_formulas.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)pph_methods_formulas.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)pph_methods_formulas.NIL, pred_var);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = (SubLObject)pph_methods_formulas.NIL;
                        while (pph_methods_formulas.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (pph_methods_formulas.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)pph_methods_formulas.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_methods_formulas.$kw129$GAF, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL);
                                    SubLObject done_var_$45 = doneP;
                                    final SubLObject token_var_$46 = (SubLObject)pph_methods_formulas.NIL;
                                    while (pph_methods_formulas.NIL == done_var_$45) {
                                        final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                        final SubLObject valid_$47 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$46.eql(as2));
                                        if (pph_methods_formulas.NIL != valid_$47 && pph_methods_formulas.NIL != genformat_args_okP(as2, args) && pph_methods_formulas.NIL != pph_utilities.genformat_arg_fixed_matches_argsP(as2, args)) {
                                            ans = (SubLObject)ConsesLow.cons(as2, ans);
                                            doneP = best_onlyP;
                                        }
                                        done_var_$45 = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == valid_$47 || pph_methods_formulas.NIL != doneP);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (pph_methods_formulas.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == valid || pph_methods_formulas.NIL != doneP);
                        }
                    }
                }
                finally {
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            if (pph_methods_formulas.NIL == doneP) {
                final SubLObject gf_as = get_genformat_as_list(relation, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.UNPROVIDED);
                if (pph_methods_formulas.NIL == doneP) {
                    SubLObject csome_list_var2 = gf_as;
                    SubLObject as3 = (SubLObject)pph_methods_formulas.NIL;
                    as3 = csome_list_var2.first();
                    while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var2) {
                        if (pph_methods_formulas.NIL != genformat_args_okP(as3, args)) {
                            ans = (SubLObject)ConsesLow.cons(as3, ans);
                            doneP = best_onlyP;
                        }
                        csome_list_var2 = csome_list_var2.rest();
                        as3 = csome_list_var2.first();
                    }
                }
            }
            if (pph_methods_formulas.NIL == ans && pph_methods_formulas.NIL == doneP) {
                SubLObject csome_list_var = precise;
                SubLObject as = (SubLObject)pph_methods_formulas.NIL;
                as = csome_list_var.first();
                while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var) {
                    if (pph_methods_formulas.NIL != genformat_args_okP(as, args)) {
                        ans = (SubLObject)ConsesLow.cons(as, ans);
                        doneP = best_onlyP;
                    }
                    csome_list_var = csome_list_var.rest();
                    as = csome_list_var.first();
                }
            }
        }
        ans = Sequences.remove_if((SubLObject)pph_methods_formulas.$sym130$PPH_FORBIDDEN_LEXICAL_ASSERTION_, ans, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != pph_utilities.pph_current_precision()) {
            ans = Sort.sort(ans, (SubLObject)pph_methods_formulas.$sym131$GENFORMAT_PRECISION_OK_, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 29656L)
    public static SubLObject get_genformat_as_list(final SubLObject relation, SubLObject best_onlyP, SubLObject template_pred) {
        if (best_onlyP == pph_methods_formulas.UNPROVIDED) {
            best_onlyP = (SubLObject)pph_methods_formulas.NIL;
        }
        if (template_pred == pph_methods_formulas.UNPROVIDED) {
            template_pred = pph_methods_formulas.$const104$genFormat;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        SubLObject doneP = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.THREE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str132$__Looking_for_paraphrase_template, relation, pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject assertions = kb_mapping.gather_gaf_arg_index_with_predicate(relation, (SubLObject)pph_methods_formulas.ONE_INTEGER, template_pred, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL == assertions) {
                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str133$__No__S_assertions_found_for__S_f, template_pred, relation, pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
            }
            else if (pph_methods_formulas.NIL == doneP) {
                SubLObject csome_list_var = assertions;
                SubLObject as = (SubLObject)pph_methods_formulas.NIL;
                as = csome_list_var.first();
                while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var) {
                    ans = (SubLObject)ConsesLow.cons(as, ans);
                    doneP = best_onlyP;
                    csome_list_var = csome_list_var.rest();
                    as = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Values.values(ans, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 30294L)
    public static SubLObject get_genformat_formula(final SubLObject input_formula) {
        final SubLObject relation = function_terms.naut_to_nart(cycl_utilities.formula_operator(input_formula));
        final SubLObject args = cycl_utilities.formula_args(input_formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject as_list = get_generation_template_as_list(relation, args, (SubLObject)pph_methods_formulas.T);
        final SubLObject formula = (SubLObject)((pph_methods_formulas.NIL != as_list.first()) ? fi.assertion_fi_formula(as_list.first(), (SubLObject)pph_methods_formulas.UNPROVIDED) : pph_methods_formulas.NIL);
        if (pph_methods_formulas.NIL != formula && !cycl_utilities.formula_arg1(formula, (SubLObject)pph_methods_formulas.UNPROVIDED).eql(relation) && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str134$__Couldn_t_find_paraphrase_templa, relation, cycl_utilities.formula_arg1(formula, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 31086L)
    public static SubLObject generate_genformat_arg(final SubLObject arg, SubLObject arg_order_sublist, SubLObject formula, SubLObject arg_position_map, SubLObject mother) {
        if (arg_order_sublist == pph_methods_formulas.UNPROVIDED) {
            arg_order_sublist = (SubLObject)pph_methods_formulas.NIL;
        }
        if (formula == pph_methods_formulas.UNPROVIDED) {
            formula = (SubLObject)pph_methods_formulas.NIL;
        }
        if (arg_position_map == pph_methods_formulas.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_methods_formulas.NIL;
        }
        if (mother == pph_methods_formulas.UNPROVIDED) {
            mother = (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str135$__Paraphrasing__S_with_sublist__S, arg, arg_order_sublist, pph_utilities.pph_current_precision(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        if (!arg_order_sublist.isList()) {
            arg_order_sublist = (SubLObject)ConsesLow.list(arg_order_sublist);
        }
        final SubLObject number = (SubLObject)((pph_methods_formulas.NIL != formula) ? cycl_utilities.formula_find_if(Symbols.symbol_function((SubLObject)pph_methods_formulas.$sym136$NUMBERP), formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) : pph_methods_formulas.NIL);
        final SubLObject argnum = Sequences.find_if((SubLObject)pph_methods_formulas.$sym9$INTEGERP, arg_order_sublist, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject plural_strings = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)pph_methods_formulas.$sym137$STRINGP), arg_order_sublist, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject connective = pph_get_connective(arg_order_sublist);
        final SubLObject arg_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(function_terms.naut_to_nart(arg), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(mother, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            pph_phrase.pph_phrase_set_mother(arg_phrase, mother);
            pph_phrase.pph_phrase_append(arg_phrase, mother);
        }
        pph_utilities.pph_phrase_rephrase_cycl(arg_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != connective) {
            final SubLObject args = (SubLObject)((pph_methods_formulas.NIL != argnum) ? conses_high.nthcdr(argnum, cycl_utilities.formula_terms(formula, (SubLObject)pph_methods_formulas.UNPROVIDED)) : ConsesLow.list(arg));
            final SubLObject new_arg_order_sublist = Sequences.remove_if((SubLObject)pph_methods_formulas.$sym138$PPH_CONNECTIVE_P, arg_order_sublist, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            ans = generate_juncts_output_list(args, new_arg_order_sublist, connective, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        else if (pph_methods_formulas.NIL != plural_strings) {
            final SubLObject ans_string = number.eql((SubLObject)pph_methods_formulas.ONE_INTEGER) ? plural_strings.first() : conses_high.second(plural_strings);
            ans = (SubLObject)ConsesLow.list(pph_data_structures.new_pph_phrase_output_item(ans_string, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
        }
        else {
            ans = generate_genformat_arg_int(arg_phrase, arg, formula, number, arg_order_sublist, pph_vars.$paraphrase_mode$.getDynamicValue(thread), pph_utilities.pph_current_precision());
            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_output_list_p(ans)) {
                ans = generate_genformat_arg_finish(ans, arg_order_sublist, arg, arg_position_map);
            }
        }
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_output_list_p(ans)) {
            pph_phrase.pph_phrase_set_output_list(arg_phrase, ans, (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase.pph_phrase_note_done(arg_phrase);
            pph_drs.pph_possibly_update_np_index(arg_phrase);
        }
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str139$__GENERATE_GENFORMAT_ARG_Result__, ans, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 33178L)
    public static SubLObject pph_connective_p(final SubLObject v_object) {
        return fort_types_interface.logical_connective_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 33260L)
    public static SubLObject pph_get_connective(final SubLObject arg_order_sublist) {
        return Sequences.find_if((SubLObject)pph_methods_formulas.$sym138$PPH_CONNECTIVE_P, arg_order_sublist, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 33467L)
    public static SubLObject generate_genformat_arg_int(final SubLObject arg_phrase, final SubLObject arg, final SubLObject formula, final SubLObject number, final SubLObject x, final SubLObject mode, final SubLObject precision) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_phrase_copy = pph_phrase.pph_phrase_copy(arg_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject use_term_as_isP = pph_utilities.always_use_nameP(arg);
        assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p(precision) : precision;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(precision, thread);
            if (arg.isInteger() && pph_methods_formulas.NIL != formula && x.first().isInteger() && pph_methods_formulas.NIL != pph_utilities.pph_arg_isaP(cycl_utilities.formula_operator(formula), x.first(), pph_methods_formulas.$const141$CycUniversalDate)) {
                pph_methods.generate_universal_date(arg_phrase_copy);
            }
            else if (arg.isInteger() && pph_methods_formulas.NIL != formula && x.first().isInteger() && pph_methods_formulas.NIL != pph_utilities.pph_arg_isaP(cycl_utilities.formula_operator(formula), x.first(), pph_methods_formulas.$const142$CycUniversalSecond)) {
                pph_methods.generate_universal_second(arg_phrase_copy, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            else if (pph_methods_formulas.NIL != use_term_as_isP && pph_methods_formulas.NIL == pph_types.pph_db_fieldP(arg)) {
                if (pph_methods_formulas.NIL != pph_types.pph_phrase_nautP(arg)) {
                    final SubLObject generation_result = generate_genformat_arg_int(arg_phrase, arg, formula, number, x, mode, precision);
                    if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_non_empty_output_list_p(generation_result)) {
                        pph_phrase.pph_phrase_set_output_list(arg_phrase_copy, generation_result, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        pph_phrase.pph_phrase_note_done(arg_phrase_copy);
                    }
                }
                else {
                    final SubLObject fs_1 = (SubLObject)pph_methods_formulas.$str143$__a_;
                    final SubLObject arg_string = PrintLow.format((SubLObject)pph_methods_formulas.NIL, fs_1, cycl_utilities.hl_to_el(arg));
                    pph_phrase.pph_phrase_set_string(arg_phrase_copy, arg_string);
                }
                pph_phrase.pph_phrase_maybe_add_anchor_tags(arg_phrase_copy);
            }
            else {
                final SubLObject preferred_senses = (SubLObject)pph_methods_formulas.NIL;
                final SubLObject _prev_bind_0_$49 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                try {
                    pph_vars.$paraphrase_mode$.bind(mode, thread);
                    if (pph_methods_formulas.NIL != cycl_grammar.el_variable_p(arg) && pph_methods_formulas.NIL != el_utilities.el_formula_p(formula)) {
                        maybe_register_var_by_arg_constraints(arg, formula);
                    }
                    if (pph_methods_formulas.NIL != preferred_senses) {
                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str144$__Using_preferred_senses__S__, preferred_senses, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        pph_phrase.pph_phrase_set_agr_preds(arg_phrase_copy, preferred_senses, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    pph_main.pph_phrase_generate(arg_phrase_copy, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                finally {
                    pph_vars.$paraphrase_mode$.rebind(_prev_bind_0_$49, thread);
                }
            }
        }
        finally {
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(arg_phrase_copy)) ? pph_phrase.pph_phrase_output_list(arg_phrase_copy) : pph_methods_formulas.$kw7$FAILURE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 35733L)
    public static SubLObject pph_phrase_maybe_add_determiner(final SubLObject phrase, final SubLObject keys) {
        final SubLObject phrase_pred = pph_phrase.pph_phrase_agr_pred(phrase);
        final SubLObject determiner = get_determiner(keys, phrase_pred, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject string = pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_methods_formulas.NIL);
        final SubLObject det_string = pph_utilities.select_determiner_string(determiner, string, phrase_pred);
        if (pph_methods_formulas.NIL != string_utilities.non_empty_stringP(det_string)) {
            final SubLObject det_item = pph_question.new_pph_phrase_filler_item(det_string);
            final SubLObject old_output_list = pph_phrase.pph_phrase_output_list(phrase);
            pph_phrase.pph_phrase_set_output_list(phrase, (SubLObject)ConsesLow.cons(det_item, old_output_list), (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 36315L)
    public static SubLObject generate_genformat_arg_finish(final SubLObject output_list, final SubLObject arg_order_sublist, final SubLObject arg, final SubLObject arg_position_map) {
        final SubLObject argnum = Sequences.find_if((SubLObject)pph_methods_formulas.$sym9$INTEGERP, arg_order_sublist, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject arg_position_context = (SubLObject)((pph_methods_formulas.NIL != argnum) ? ConsesLow.list(argnum) : pph_methods_formulas.NIL);
        SubLObject new_items = (SubLObject)pph_methods_formulas.NIL;
        SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
        SubLObject output_item = (SubLObject)pph_methods_formulas.NIL;
        SubLObject i = (SubLObject)pph_methods_formulas.NIL;
        list_var = output_list;
        output_item = list_var.first();
        for (i = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), output_item = list_var.first(), i = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, i)) {
            final SubLObject local_arg_position = pph_data_structures.pph_phrase_output_item_arg_position(output_item);
            if (pph_methods_formulas.NIL == pph_utilities.pph_unknown_arg_position_p(local_arg_position) && pph_methods_formulas.NIL == arg_finish_leave_arg_position_aloneP(output_item, arg)) {
                final SubLObject contextualized_local_arg_position = pph_utilities.pph_contextualize_arg_position(arg_position_context, local_arg_position);
                final SubLObject global_arg_position = pph_utilities.pph_arg_position_lookup(contextualized_local_arg_position, arg_position_map);
                pph_data_structures.pph_phrase_output_item_set_arg_position(output_item, global_arg_position);
            }
            if (pph_methods_formulas.NIL != list_utilities.singletonP(output_list) && pph_methods_formulas.NIL != arg_position_context && pph_methods_formulas.NIL != pph_utilities.pph_unknown_arg_position_p(local_arg_position)) {
                pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(output_item, arg);
            }
            new_items = (SubLObject)ConsesLow.cons(output_item, new_items);
        }
        return Sequences.nreverse(new_items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 37495L)
    public static SubLObject pph_possessivize_output_item(final SubLObject output_item) {
        final SubLObject item_string = pph_data_structures.pph_phrase_output_item_string(output_item);
        final SubLObject proper_output_itemP = pph_data_structures.pph_phrase_output_item_p(output_item);
        final SubLObject lexical_possessive = (SubLObject)((pph_methods_formulas.NIL != proper_output_itemP) ? morphology.english_lexical_possessive_version_of_string(item_string) : pph_methods_formulas.NIL);
        if (lexical_possessive.isString()) {
            final SubLObject new_item = pph_data_structures.pph_phrase_output_item_copy(output_item);
            pph_data_structures.pph_phrase_output_item_set_string(new_item, lexical_possessive);
            return new_item;
        }
        final SubLObject agr_pred = pph_data_structures.pph_phrase_output_item_agr_pred(output_item);
        final SubLObject suffix = morphology.english_possessive_suffix_for_string(item_string, agr_pred);
        return pph_data_structures.pph_phrase_output_item_suffix_string(output_item, suffix);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 38256L)
    public static SubLObject pph_locativize_output_item(final SubLObject output_item, final SubLObject denot) {
        final SubLObject preposition = morphology.english_locative_preposition_for_denot(denot);
        return pph_data_structures.pph_phrase_output_item_prefix_string(output_item, Sequences.cconcatenate(preposition, (SubLObject)pph_methods_formulas.$str3$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 38491L)
    public static SubLObject pph_locativize_temporal_output_item(final SubLObject output_item, final SubLObject denot) {
        final SubLObject preposition = pph_english_locative_preposition_for_temporal_denot(denot);
        return pph_data_structures.pph_phrase_output_item_prefix_string(output_item, Sequences.cconcatenate(preposition, (SubLObject)pph_methods_formulas.$str3$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 38748L)
    public static SubLObject pph_english_locative_preposition_for_temporal_denot(final SubLObject date) {
        if (pph_methods_formulas.NIL == cycl_grammar.el_variable_p(date)) {
            final SubLObject less_than_one_dayP = pph_utilities.pph_longer_durationP((SubLObject)pph_methods_formulas.$list145, (SubLObject)ConsesLow.list(pph_methods_formulas.$const146$DurationFn, date));
            final SubLObject more_than_one_dayP = (SubLObject)((pph_methods_formulas.NIL != less_than_one_dayP) ? pph_methods_formulas.NIL : pph_utilities.pph_longer_durationP((SubLObject)ConsesLow.list(pph_methods_formulas.$const146$DurationFn, date), (SubLObject)pph_methods_formulas.$list145));
            if (pph_methods_formulas.NIL != more_than_one_dayP) {
                return (SubLObject)pph_methods_formulas.$str147$in;
            }
            if (pph_methods_formulas.NIL != less_than_one_dayP) {
                return (SubLObject)pph_methods_formulas.$str148$at;
            }
        }
        return (SubLObject)pph_methods_formulas.$str149$on;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 39202L)
    public static SubLObject arg_finish_leave_arg_position_aloneP(final SubLObject output_item, final SubLObject arg) {
        final SubLObject item_cycl = pph_data_structures.pph_phrase_output_item_cycl(output_item);
        final SubLObject item_arg_position = pph_data_structures.pph_phrase_output_item_arg_position(output_item);
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        if (item_arg_position.equal(pph_phrase.pph_current_arg0_position()) && (pph_methods_formulas.NIL == el_utilities.el_formula_p(arg) || !item_cycl.equal(cycl_utilities.formula_arg_position(arg, item_arg_position, (SubLObject)pph_methods_formulas.UNPROVIDED)))) {
            ans = (SubLObject)pph_methods_formulas.T;
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 39749L)
    public static SubLObject get_determiner(final SubLObject list, SubLObject pred, SubLObject use_defaultP) {
        if (pred == pph_methods_formulas.UNPROVIDED) {
            pred = (SubLObject)pph_methods_formulas.NIL;
        }
        if (use_defaultP == pph_methods_formulas.UNPROVIDED) {
            use_defaultP = (SubLObject)pph_methods_formulas.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject det = (SubLObject)pph_methods_formulas.NIL;
        SubLObject v_case = (SubLObject)pph_methods_formulas.NIL;
        SubLObject doneP = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (pph_methods_formulas.NIL == doneP) {
                SubLObject csome_list_var = list;
                SubLObject item = (SubLObject)pph_methods_formulas.NIL;
                item = csome_list_var.first();
                while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var) {
                    if (pph_methods_formulas.NIL == pred || (pph_methods_formulas.NIL != forts.fort_p(item) && pph_methods_formulas.NIL != pph_utilities.pph_genl_predicateP(pred, item, (SubLObject)pph_methods_formulas.UNPROVIDED))) {
                        doneP = (SubLObject)pph_methods_formulas.T;
                        det = Sequences.find_if((SubLObject)pph_methods_formulas.$sym150$PPH_DETERMINER_, list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        v_case = Sequences.find_if((SubLObject)pph_methods_formulas.$sym151$PPH_CASE_KW_, list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    else if (item.isList()) {
                        thread.resetMultipleValues();
                        final SubLObject det_pair = get_determiner(item, pred, (SubLObject)pph_methods_formulas.NIL);
                        final SubLObject successP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (pph_methods_formulas.NIL != successP) {
                            final SubLObject datum_evaluated_var = det_pair;
                            det = datum_evaluated_var.first();
                            v_case = conses_high.cadr(datum_evaluated_var);
                            doneP = (SubLObject)pph_methods_formulas.T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    item = csome_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != use_defaultP) {
            det = Sequences.find_if((SubLObject)pph_methods_formulas.$sym150$PPH_DETERMINER_, list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            v_case = Sequences.find_if((SubLObject)pph_methods_formulas.$sym151$PPH_CASE_KW_, list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return Values.values((SubLObject)((pph_methods_formulas.NIL != det) ? ConsesLow.list(det, v_case) : pph_methods_formulas.NIL), doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 40589L)
    public static SubLObject word_sense_indicator(final SubLObject obj) {
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == pph_utilities.pph_determinerP(obj)) {
            if (obj.isKeyword() || (obj.isCons() && obj.first().isKeyword())) {
                ans = obj;
            }
            else if (pph_methods_formulas.NIL != constant_handles.valid_constantP(obj, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                ans = obj;
            }
            else if (obj.isCons() && pph_methods_formulas.NIL != constant_handles.valid_constantP(obj.first(), (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                ans = obj;
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 40948L)
    public static SubLObject word_sense_indicators(final SubLObject list) {
        return Sequences.remove((SubLObject)pph_methods_formulas.NIL, list_utilities.flatten(Mapping.mapcar((SubLObject)pph_methods_formulas.$sym152$WORD_SENSE_INDICATOR, list)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 41062L)
    public static SubLObject get_preferred_senses(final SubLObject list, SubLObject pluralizeP) {
        if (pluralizeP == pph_methods_formulas.UNPROVIDED) {
            pluralizeP = (SubLObject)pph_methods_formulas.NIL;
        }
        SubLObject ans = word_sense_indicators(list);
        if (pph_methods_formulas.NIL != pluralizeP) {
            ans = ConsesLow.append((SubLObject)pph_methods_formulas.$list153, ans);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 41280L)
    public static SubLObject regularize_genformat_arglist(SubLObject arg_order_list, final SubLObject v_arity) {
        if (pph_methods_formulas.NIL == arg_order_list) {
            arg_order_list = list_utilities.num_list(v_arity, (SubLObject)pph_methods_formulas.ONE_INTEGER);
        }
        if (pph_methods_formulas.NIL != Sequences.find_if((SubLObject)pph_methods_formulas.$sym154$ATOM, arg_order_list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject new_list = conses_high.copy_list(arg_order_list);
            SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
            SubLObject x = (SubLObject)pph_methods_formulas.NIL;
            SubLObject i = (SubLObject)pph_methods_formulas.NIL;
            list_var = arg_order_list;
            x = list_var.first();
            for (i = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), x = list_var.first(), i = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, i)) {
                if (x.isAtom()) {
                    ConsesLow.set_nth(i, new_list, (SubLObject)ConsesLow.list(x));
                }
            }
            arg_order_list = new_list;
        }
        return arg_order_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 41673L)
    public static SubLObject process_genformat_arglist(final SubLObject formula, final SubLObject pred, final SubLObject args, SubLObject arg_order_list, SubLObject arg_position_map, SubLObject phrase) {
        if (arg_position_map == pph_methods_formulas.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_methods_formulas.NIL;
        }
        if (phrase == pph_methods_formulas.UNPROVIDED) {
            phrase = (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terms_done = (SubLObject)pph_methods_formulas.NIL;
        SubLObject indexes_done = (SubLObject)pph_methods_formulas.NIL;
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        arg_order_list = regularize_genformat_arglist(arg_order_list, el_utilities.formula_arity(formula, (SubLObject)pph_methods_formulas.$kw95$REGULARIZE));
        SubLObject output_lists = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)pph_methods_formulas.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$50 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$51 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$52 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$53 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    SubLObject output_lists_$54 = (SubLObject)pph_methods_formulas.NIL;
                                    SubLObject abortP = (SubLObject)pph_methods_formulas.NIL;
                                    final SubLObject _prev_bind_0_$54 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_ambiguous_strings$.bind((pph_methods_formulas.NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread)) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUALP), (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                                        pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$str8$__Trying_default_precision___S___, pph_utilities.pph_current_precision(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                        SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
                                        SubLObject arg = (SubLObject)pph_methods_formulas.NIL;
                                        SubLObject i = (SubLObject)pph_methods_formulas.NIL;
                                        list_var = args;
                                        arg = list_var.first();
                                        for (i = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL == abortP && pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), i = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, i)) {
                                            final SubLObject olist = generate_genformat_arg_with_arg_order_list(arg, number_utilities.f_1X(i), arg_order_list, formula, arg_position_map, phrase);
                                            pph_disambiguation.note_pph_output_list_for_disambiguation(i, olist);
                                            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_output_list_p(olist)) {
                                                output_lists_$54 = (SubLObject)ConsesLow.cons(olist, output_lists_$54);
                                            }
                                            else {
                                                abortP = (SubLObject)pph_methods_formulas.T;
                                            }
                                        }
                                        if (pph_methods_formulas.NIL != abortP) {
                                            output_lists = (SubLObject)pph_methods_formulas.$kw7$FAILURE;
                                        }
                                        else {
                                            output_lists_$54 = Sequences.nreverse(output_lists_$54);
                                            SubLObject cdolist_list_var;
                                            final SubLObject dupe_index_lists = cdolist_list_var = pph_disambiguation.pph_find_duplicates(output_lists_$54);
                                            SubLObject dupe_index_list = (SubLObject)pph_methods_formulas.NIL;
                                            dupe_index_list = cdolist_list_var.first();
                                            while (pph_methods_formulas.NIL != cdolist_list_var) {
                                                pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str10$__Working_on_dupe_list___S__, dupe_index_list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                final SubLObject dupe_objects = pph_disambiguation.pph_dereference_indexes(dupe_index_list, args);
                                                SubLObject cdolist_list_var_$56 = dupe_index_list;
                                                SubLObject j = (SubLObject)pph_methods_formulas.NIL;
                                                j = cdolist_list_var_$56.first();
                                                while (pph_methods_formulas.NIL != cdolist_list_var_$56) {
                                                    final SubLObject arg2 = ConsesLow.nth(j, args);
                                                    pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$str11$__Trying_to_reparaphrase__S___, arg2, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                    final SubLObject new_precision = pph_utilities.pph_precision_for_object(arg2, dupe_objects);
                                                    final SubLObject new_demerit_cutoff = pph_disambiguation.pph_demerit_cutoff_from_olist(j, output_lists_$54);
                                                    SubLObject new_output_list = (SubLObject)pph_methods_formulas.NIL;
                                                    if (!new_precision.equal(pph_utilities.pph_current_precision())) {
                                                        pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str12$__Trying_targeted_precision__S_fo, new_precision, arg2, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                        assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p(new_precision) : new_precision;
                                                        final SubLObject _prev_bind_0_$55 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$paraphrase_precision$.bind(new_precision, thread);
                                                            pph_vars.$pph_demerit_cutoff$.bind(new_demerit_cutoff, thread);
                                                            new_output_list = generate_genformat_arg_with_arg_order_list(arg2, number_utilities.f_1X(j), arg_order_list, formula, arg_position_map, phrase);
                                                        }
                                                        finally {
                                                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
                                                            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$55, thread);
                                                        }
                                                        pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str14$__New_paraphrase_with_precision__, new_precision, arg2, new_output_list);
                                                    }
                                                    if (new_precision.isList() && (pph_methods_formulas.NIL == new_output_list || pph_methods_formulas.NIL != pph_disambiguation.pph_output_list_E(new_output_list, ConsesLow.nth(j, output_lists_$54)))) {
                                                        pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str15$__Trying_full_precision_for__S, arg2, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                        assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p((SubLObject)pph_methods_formulas.T) : pph_methods_formulas.T;
                                                        final SubLObject _prev_bind_0_$56 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                                        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
                                                        final SubLObject _prev_bind_3 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$paraphrase_precision$.bind((SubLObject)pph_methods_formulas.T, thread);
                                                            pph_vars.$pph_ambiguous_strings$.bind((pph_methods_formulas.NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread)) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUALP), (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                                                            pph_vars.$pph_demerit_cutoff$.bind(new_demerit_cutoff, thread);
                                                            new_output_list = generate_genformat_arg_with_arg_order_list(arg2, number_utilities.f_1X(j), arg_order_list, formula, arg_position_map, phrase);
                                                        }
                                                        finally {
                                                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_3, thread);
                                                            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
                                                            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$56, thread);
                                                        }
                                                        pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str16$__New_paraphrase_with_full_precis, arg2, new_output_list, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                    }
                                                    if (pph_methods_formulas.NIL != pph_disambiguation.pph_new_olist_better_than_oldP(new_output_list, ConsesLow.nth(j, output_lists_$54), arg2)) {
                                                        pph_disambiguation.pph_disambiguation_note((SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$str17$__Changing_output_list_for__S_fro, arg2, ConsesLow.nth(j, output_lists_$54), new_output_list);
                                                        ConsesLow.set_nth(j, output_lists_$54, new_output_list);
                                                        pph_disambiguation.note_pph_output_list_for_disambiguation(j, new_output_list);
                                                    }
                                                    cdolist_list_var_$56 = cdolist_list_var_$56.rest();
                                                    j = cdolist_list_var_$56.first();
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                dupe_index_list = cdolist_list_var.first();
                                            }
                                            SubLObject cdolist_list_var2 = args;
                                            arg = (SubLObject)pph_methods_formulas.NIL;
                                            arg = cdolist_list_var2.first();
                                            while (pph_methods_formulas.NIL != cdolist_list_var2) {
                                                pph_drs.pph_possibly_add_reference_marker(arg);
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                arg = cdolist_list_var2.first();
                                            }
                                            output_lists = ConsesLow.append(output_lists, output_lists_$54);
                                        }
                                    }
                                    finally {
                                        pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_0_$54, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$53, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$52, thread);
                        }
                        if (new_or_reused == pph_methods_formulas.$kw18$NEW && pph_methods_formulas.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$51, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (pph_methods_formulas.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$50, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        if (!output_lists.isList()) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_methods_formulas.$str155$__Couldn_t_paraphrase_args__S_wit, args, arg_order_list);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return (SubLObject)pph_methods_formulas.$kw7$FAILURE;
        }
        output_lists = list_utilities.remove_if_not((SubLObject)pph_methods_formulas.$sym156$PPH_PHRASE_OUTPUT_LIST_P, output_lists, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject unparaphrased = list_utilities.find_if_not(Symbols.symbol_function((SubLObject)pph_methods_formulas.$sym157$PPH_STRING_P), output_lists, (SubLObject)pph_methods_formulas.$sym158$PPH_PHRASE_OUTPUT_LIST_STRING, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != unparaphrased) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_methods_formulas.$str159$__Couldn_t_paraphrase__S___, unparaphrased);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return (SubLObject)pph_methods_formulas.$kw7$FAILURE;
        }
        SubLObject cdolist_list_var3 = arg_order_list;
        SubLObject arg_order_sublist = (SubLObject)pph_methods_formulas.NIL;
        arg_order_sublist = cdolist_list_var3.first();
        while (pph_methods_formulas.NIL != cdolist_list_var3) {
            final SubLObject index = Sequences.find_if(Symbols.symbol_function((SubLObject)pph_methods_formulas.$sym9$INTEGERP), arg_order_sublist, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject _prev_bind_4 = pph_vars.$pph_introduce_anaphorsP$.currentBinding(thread);
            try {
                pph_vars.$pph_introduce_anaphorsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != pph_vars.$pph_introduce_anaphorsP$.getDynamicValue(thread) && pph_methods_formulas.NIL == Sequences.find(index, indexes_done, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)), thread);
                final SubLObject arg3 = (SubLObject)((pph_methods_formulas.NIL != index) ? cycl_utilities.formula_arg(formula, index, (SubLObject)pph_methods_formulas.$kw95$REGULARIZE) : pph_methods_formulas.NIL);
                SubLObject simpler_arg = (SubLObject)pph_methods_formulas.NIL;
                SubLObject keys = (SubLObject)pph_methods_formulas.NIL;
                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.THREE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str160$__PROCESS_GEN_FORMAT_ARGLIST____W, arg3, terms_done, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                if (pph_methods_formulas.NIL != pph_vars.$pph_introduce_anaphorsP$.getDynamicValue(thread)) {
                    thread.resetMultipleValues();
                    final SubLObject simpler_arg_$61 = pph_introduce_anaphor(arg3, terms_done);
                    final SubLObject keys_$62 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    simpler_arg = simpler_arg_$61;
                    keys = keys_$62;
                }
                if (pph_methods_formulas.NIL != pph_vars.$pph_introduce_anaphorsP$.getDynamicValue(thread) && (!arg3.equal(simpler_arg) || pph_methods_formulas.NIL != keys)) {
                    assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(index, formula)) : pph_utilities.paraphrase_precision_for_arg(index, formula);
                    final SubLObject _prev_bind_0_$59 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_precision$.bind(pph_utilities.paraphrase_precision_for_arg(index, formula), thread);
                        ans = (SubLObject)ConsesLow.cons(generate_genformat_arg(arg3, ConsesLow.append(keys, arg_order_sublist), formula, arg_position_map, phrase), ans);
                    }
                    finally {
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$59, thread);
                    }
                }
                else if (pph_methods_formulas.NIL != subl_promotions.positive_integer_p(index)) {
                    SubLObject output_list = pph_find_output_list_matching_arg_num(output_lists, index);
                    if (pph_methods_formulas.NIL != subl_promotions.memberP(output_list, ans, Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUAL), (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str161$Making_copy_of_reused_output_item, output_list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        output_list = Mapping.mapcar((SubLObject)pph_methods_formulas.$sym162$PPH_PHRASE_OUTPUT_ITEM_COPY, output_list);
                    }
                    ans = (SubLObject)ConsesLow.cons(output_list, ans);
                }
                else {
                    ans = (SubLObject)ConsesLow.cons(generate_genformat_arg(arg3, arg_order_sublist, formula, arg_position_map, phrase), ans);
                }
                terms_done = (SubLObject)ConsesLow.cons(arg3, terms_done);
                if (pph_methods_formulas.NIL != index) {
                    indexes_done = (SubLObject)ConsesLow.cons(index, indexes_done);
                }
            }
            finally {
                pph_vars.$pph_introduce_anaphorsP$.rebind(_prev_bind_4, thread);
            }
            cdolist_list_var3 = cdolist_list_var3.rest();
            arg_order_sublist = cdolist_list_var3.first();
        }
        ans = Sequences.nreverse(ans);
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 44173L)
    public static SubLObject pph_find_output_list_matching_arg_num(final SubLObject output_lists, final SubLObject arg_num) {
        return ConsesLow.nth(number_utilities.f_1_(arg_num), output_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 44350L)
    public static SubLObject generate_genformat_arg_with_arg_order_list(final SubLObject arg, final SubLObject i, final SubLObject arg_order_list, final SubLObject formula, SubLObject arg_position_map, SubLObject phrase) {
        if (arg_position_map == pph_methods_formulas.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_methods_formulas.NIL;
        }
        if (phrase == pph_methods_formulas.UNPROVIDED) {
            phrase = (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_vars.current_generation_level().isPositive() && !pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED).equal(pph_vars.pph_top_level_cycl()) && pph_methods_formulas.NIL == pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(phrase), (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_methods_formulas.$str163$Generating_with___genFormat_for_m, phrase);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        final SubLObject sublist = conses_high.assoc(i, arg_order_list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg(i, formula)) : pph_utilities.paraphrase_precision_for_arg(i, formula);
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(pph_utilities.paraphrase_precision_for_arg(i, formula), thread);
            ans = (SubLObject)((pph_methods_formulas.NIL != sublist) ? generate_genformat_arg(arg, sublist, formula, arg_position_map, phrase) : pph_methods_formulas.NIL);
        }
        finally {
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((pph_methods_formulas.NIL != pph_phrase.pph_phrase_output_list_p(ans)) ? ans : pph_methods_formulas.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 45101L)
    public static SubLObject pph_introduce_anaphor(final SubLObject arg, final SubLObject terms_done) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simpler = (SubLObject)pph_methods_formulas.NIL;
        SubLObject keys = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != el_utilities.el_formula_with_operator_p(arg, pph_methods_formulas.$const164$TheInstance)) {
            final SubLObject col = cycl_utilities.formula_arg1(arg, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (pph_methods_formulas.NIL != el_utilities.el_formula_with_operator_p(col, pph_methods_formulas.$const165$SubcollectionOfWithRelationFromFn) && pph_methods_formulas.NIL != pph_utilities.pph_genl_predicateP(cycl_utilities.formula_arg2(col, (SubLObject)pph_methods_formulas.UNPROVIDED), pph_methods_formulas.$const166$possessiveRelation, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL == simpler) {
                    SubLObject csome_list_var = terms_done;
                    SubLObject done_term = (SubLObject)pph_methods_formulas.NIL;
                    done_term = csome_list_var.first();
                    while (pph_methods_formulas.NIL == simpler && pph_methods_formulas.NIL != csome_list_var) {
                        if (done_term.equalp(cycl_utilities.formula_arg3(col, (SubLObject)pph_methods_formulas.UNPROVIDED))) {
                            final SubLObject gender = pph_methods.pph_gender(done_term);
                            final SubLObject number = pph_methods.pph_number(done_term);
                            final SubLObject pronoun = pph_poss_pronoun(gender, number);
                            simpler = cycl_utilities.formula_arg1(col, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            keys = (SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.$kw167$NON_PLURAL_GENERIC, pronoun);
                        }
                        csome_list_var = csome_list_var.rest();
                        done_term = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pph_methods_formulas.NIL != el_utilities.el_formula_with_operator_p(arg, pph_methods_formulas.$const168$SomeFn)) {
            final SubLObject col = cycl_utilities.formula_arg1(arg, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (pph_methods_formulas.NIL != el_utilities.el_formula_with_operator_p(col, pph_methods_formulas.$const165$SubcollectionOfWithRelationFromFn) && pph_methods_formulas.NIL != pph_utilities.pph_genl_predicateP(cycl_utilities.formula_arg2(col, (SubLObject)pph_methods_formulas.UNPROVIDED), pph_methods_formulas.$const166$possessiveRelation, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                    final SubLObject possessor = cycl_utilities.formula_arg3(col, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    if (pph_methods_formulas.NIL == simpler) {
                        SubLObject csome_list_var2 = terms_done;
                        SubLObject done_term2 = (SubLObject)pph_methods_formulas.NIL;
                        done_term2 = csome_list_var2.first();
                        while (pph_methods_formulas.NIL == simpler && pph_methods_formulas.NIL != csome_list_var2) {
                            if (pph_methods_formulas.NIL != el_utilities.el_formula_with_operator_p(done_term2, pph_methods_formulas.$const168$SomeFn) && pph_methods_formulas.NIL != pph_utilities.pph_isaP(possessor, cycl_utilities.formula_arg1(done_term2, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                simpler = cycl_utilities.formula_arg1(col, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                keys = (SubLObject)pph_methods_formulas.$list169;
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            done_term2 = csome_list_var2.first();
                        }
                    }
                }
                else if (pph_methods_formulas.NIL == simpler) {
                    SubLObject csome_list_var = terms_done;
                    SubLObject done_term = (SubLObject)pph_methods_formulas.NIL;
                    done_term = csome_list_var.first();
                    while (pph_methods_formulas.NIL == simpler && pph_methods_formulas.NIL != csome_list_var) {
                        if (pph_methods_formulas.NIL != el_utilities.el_formula_with_operator_p(done_term, pph_methods_formulas.$const164$TheInstance) && pph_methods_formulas.NIL != pph_utilities.pph_isaP(done_term, col, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                            simpler = col;
                            keys = (SubLObject)pph_methods_formulas.$list170;
                        }
                        csome_list_var = csome_list_var.rest();
                        done_term = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else if (pph_methods_formulas.NIL == pph_utilities.pph_collectionP(arg) && terms_done.equalp((SubLObject)ConsesLow.list(arg))) {
            final SubLObject gender2 = pph_methods.pph_gender(arg);
            final SubLObject number2 = pph_methods.pph_number(arg);
            simpler = pph_reflexive_string(gender2, number2);
        }
        return (pph_methods_formulas.NIL != simpler) ? Values.values(simpler, keys) : Values.values(arg, (SubLObject)pph_methods_formulas.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 47342L)
    public static SubLObject pph_reflexive_string(final SubLObject gender, final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pronoun_agr = pph_methods_lexicon.new_pph_pronoun_agr(pph_methods_formulas.$const171$ThirdPerson_NLAttr, number, gender);
        final SubLObject pronoun_nart = pph_methods_lexicon.pph_pronoun_nart(pronoun_agr, pph_methods_formulas.$const172$ReflexivePronoun);
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        SubLObject wu = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != kb_indexing_datastructures.indexed_term_p(pronoun_nart)) {
            wu = pph_methods_lexicon.pph_pronoun_wu(pronoun_nart);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = (SubLObject)((pph_methods_formulas.NIL != wu) ? pph_methods_lexicon.pph_get_strings_of_type(wu, pph_methods_formulas.$const172$ReflexivePronoun).first() : pph_methods_formulas.NIL);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 47794L)
    public static SubLObject pph_poss_pronoun(final SubLObject gender, final SubLObject number) {
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject pronoun_agr = pph_methods_lexicon.new_pph_pronoun_agr(pph_methods_formulas.$const171$ThirdPerson_NLAttr, number, gender);
        final SubLObject pronoun_nart = pph_methods_lexicon.pph_pronoun_nart(pronoun_agr, pph_methods_formulas.$const172$ReflexivePronoun);
        ans = pph_methods_lexicon.pph_pronoun_wu(pronoun_nart);
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject generate_date_naut(final SubLObject phrase) {
        final SubLObject date_naut = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != pph_date_naut_ok_for_generate_date_naut_p(date_naut)) {
            SubLObject olist = (SubLObject)pph_methods_formulas.NIL;
            if (pph_methods_formulas.NIL != pph_types.pph_time_p(date_naut)) {
                olist = pph_time_naut_olist(date_naut, pph_phrase.pph_phrase_arg_position_map(phrase));
                if (pph_methods_formulas.NIL != date_utilities.date_p(date_naut)) {
                    if (pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED)) {
                        olist = list_utilities.add_to_end(pph_data_structures.new_pph_phrase_output_item((SubLObject)pph_methods_formulas.$str149$on, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), olist);
                    }
                    else {
                        olist = pph_phrase_output_list_add_comma(olist);
                    }
                }
            }
            final SubLObject day_naut_template = pph_date_naut_strip_time(date_naut);
            pph_phrase.pph_phrase_reset_cycl(phrase, day_naut_template);
            olist = ConsesLow.append(olist, pph_date_phrase_olist(phrase));
            pph_phrase.pph_phrase_set_cycl(phrase, date_naut);
            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_non_empty_output_list_p(olist)) {
                pph_phrase.pph_phrase_set_output_list(phrase, olist, (SubLObject)pph_methods_formulas.UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject generate_english_year_naut(final SubLObject phrase) {
        if (pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject arg_position = pph_utilities.pph_top_level_arg_position(pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject olist = generate_english_year_olist(cycl, arg_position);
            pph_phrase.pph_phrase_set_output_list(phrase, olist, (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject generate_english_year_olist(final SubLObject year_naut, final SubLObject arg_position) {
        final SubLObject year = cycl_utilities.nat_arg1(year_naut, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject string = print_high.princ_to_string(year);
        if (pph_methods_formulas.NIL != pph_utilities.pph_top_level_preciseP()) {
            string = pph_date_add_english_disambiguation_string(string, (SubLObject)pph_methods_formulas.$kw177$YEAR);
        }
        final SubLObject olist = (SubLObject)ConsesLow.list(pph_data_structures.new_pph_phrase_output_item(string, arg_position, year_naut, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL));
        return olist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject generate_english_month_naut(final SubLObject phrase) {
        if (pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject month_arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list180, pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject month = cycl_utilities.nat_arg1(cycl, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject year_naut = cycl_utilities.nat_arg2(cycl, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject year_arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list181, pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject olist = generate_english_month_olist(month, month_arg_position, year_naut, year_arg_position);
            pph_phrase.pph_phrase_set_output_list(phrase, olist, (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_english_month_name(final SubLObject month) {
        return list_utilities.alist_lookup_without_values(pph_methods_formulas.$pph_english_month_names$.getGlobalValue(), month, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject generate_english_month_olist(final SubLObject month, final SubLObject month_arg_position, final SubLObject year_naut, final SubLObject year_arg_position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = pph_english_month_name(month);
        SubLObject year_olist = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != pph_utilities.pph_top_level_preciseP()) {
            string = pph_date_add_english_disambiguation_string(string, (SubLObject)pph_methods_formulas.$kw183$MONTH);
        }
        assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p((SubLObject)pph_methods_formulas.NIL) : pph_methods_formulas.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind((SubLObject)pph_methods_formulas.NIL, thread);
            year_olist = generate_english_year_olist(year_naut, year_arg_position);
        }
        finally {
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        final SubLObject olist = (SubLObject)ConsesLow.cons(pph_data_structures.new_pph_phrase_output_item(string, month_arg_position, month, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL), year_olist);
        return olist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject generate_english_day_naut(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED) && (pph_methods_formulas.NIL == pph_vars.$pph_use_indexical_datesP$.getDynamicValue(thread) || !cycl.equal(date_utilities.indexical_today()))) {
            final SubLObject day_arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list180, pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject day = cycl_utilities.nat_arg1(cycl, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject month = cycl_utilities.nat_arg1(cycl_utilities.nat_arg2(cycl, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject month_arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list186, pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject year_naut = cycl_utilities.nat_arg2(cycl_utilities.nat_arg2(cycl, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject year_arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list187, pph_phrase.pph_phrase_arg_position_map(phrase));
            final SubLObject olist = generate_english_day_olist(day, day_arg_position, month, month_arg_position, year_naut, year_arg_position);
            pph_phrase.pph_phrase_set_output_list(phrase, olist, (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject generate_english_day_olist(final SubLObject day, final SubLObject day_arg_position, final SubLObject month, final SubLObject month_arg_position, final SubLObject year_naut, final SubLObject year_arg_position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject day_string = print_high.princ_to_string(day);
        final SubLObject month_string = pph_english_month_name(month);
        SubLObject year_olist = (SubLObject)pph_methods_formulas.NIL;
        assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p((SubLObject)pph_methods_formulas.NIL) : pph_methods_formulas.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind((SubLObject)pph_methods_formulas.NIL, thread);
            year_olist = generate_english_year_olist(year_naut, year_arg_position);
        }
        finally {
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        SubLObject olist = ConsesLow.append((SubLObject)ConsesLow.list(pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(pph_data_structures.new_pph_phrase_output_item(month_string, month_arg_position, month, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL), month), pph_data_structures.new_pph_phrase_output_item(day_string, day_arg_position, day, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL), pph_comma_item()), year_olist);
        if (pph_methods_formulas.NIL != pph_utilities.pph_top_level_preciseP()) {
            final SubLObject disambiguation_string = pph_english_date_disambiguation_string((SubLObject)pph_methods_formulas.$kw188$DAY);
            if (pph_methods_formulas.NIL != string_utilities.non_empty_string_p(disambiguation_string)) {
                olist = (SubLObject)ConsesLow.cons(pph_question.new_pph_phrase_filler_item(disambiguation_string), olist);
            }
        }
        return olist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_date_phrase_olist(final SubLObject phrase) {
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject olist = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject info = pph_types.pph_method_info((SubLObject)pph_methods_formulas.$sym173$GENERATE_DATE_NAUT, (SubLObject)pph_methods_formulas.NIL);
        pph_types.pph_deregister_method_info((SubLObject)pph_methods_formulas.$sym173$GENERATE_DATE_NAUT, info);
        try {
            pph_main.pph_phrase_generate(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)pph_methods_formulas.T);
                final SubLObject _values = Values.getValuesAsVector();
                pph_types.pph_register_method_info((SubLObject)pph_methods_formulas.$sym173$GENERATE_DATE_NAUT, info);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        pph_methods_formulas.$pph_dates$.setGlobalValue((SubLObject)ConsesLow.cons(cycl, pph_methods_formulas.$pph_dates$.getGlobalValue()));
        olist = pph_phrase.pph_phrase_output_list(phrase);
        return olist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_date_naut_ok_for_generate_date_naut_p(final SubLObject date_naut) {
        if (pph_methods_formulas.NIL != conses_high.member(cycl_utilities.nat_functor(date_naut), (SubLObject)pph_methods_formulas.$list189, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL == el_utilities.groundP(date_naut, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        return (SubLObject)pph_methods_formulas.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_time_naut_olist(final SubLObject date_naut, final SubLObject map) {
        final SubLObject time_phrase = pph_phrase.new_pph_phrase_for_cycl(date_naut, map, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject precision = pph_date_precision(date_naut);
        return generate_time_naut_millisecond(time_phrase, precision);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_time_output_item(final SubLObject num, final SubLObject argpos) {
        return pph_data_structures.new_pph_phrase_output_item(PrintLow.format((SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.$str190$_2__0D, num), argpos, num, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_defining_time_unit(final SubLObject interval_type) {
        SubLObject unit = date_utilities.defining_time_unit(interval_type);
        if (pph_methods_formulas.NIL == unit && interval_type.eql(pph_methods_formulas.$const191$CalendarMilliSecond)) {
            unit = pph_methods_formulas.$const192$MillisecondsDuration;
        }
        return unit;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_smaller_interval_type_than(final SubLObject type1, final SubLObject type2) {
        final SubLObject unit1 = pph_defining_time_unit(type1);
        final SubLObject unit2 = pph_defining_time_unit(type2);
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != unit1 && pph_methods_formulas.NIL != unit2 && pph_methods_formulas.NIL != quantities.smaller_unit_than(unit1, unit2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject generate_time_naut_millisecond_internal(final SubLObject time, SubLObject precision, SubLObject map) {
        if (precision == pph_methods_formulas.UNPROVIDED) {
            precision = pph_methods_formulas.$const191$CalendarMilliSecond;
        }
        if (map == pph_methods_formulas.UNPROVIDED) {
            map = pph_utilities.pph_new_identity_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject olist = (SubLObject)pph_methods_formulas.NIL;
        SubLObject granularity = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
        SubLObject argpos = pph_utilities.pph_arg_position_lookup(pph_utilities.pph_arg_position_from_template((SubLObject)pph_methods_formulas.$kw193$ARG1), map);
        thread.resetMultipleValues();
        final SubLObject time_type = date_utilities.explode_calendar_time(time);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        SubLObject min = thread.sixthMultipleValue();
        SubLObject sec = thread.seventhMultipleValue();
        SubLObject millisec = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        if (pph_methods_formulas.NIL != millisec) {
            granularity = (SubLObject)pph_methods_formulas.THREE_INTEGER;
        }
        else if (pph_methods_formulas.NIL != sec) {
            granularity = (SubLObject)pph_methods_formulas.TWO_INTEGER;
            millisec = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
        }
        else if (pph_methods_formulas.NIL != min) {
            granularity = (SubLObject)pph_methods_formulas.ONE_INTEGER;
            sec = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            millisec = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
        }
        else {
            granularity = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            min = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            sec = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            millisec = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
        }
        if (pph_methods_formulas.NIL != pph_smaller_interval_type_than(precision, pph_methods_formulas.$const194$CalendarSecond)) {
            olist = (SubLObject)ConsesLow.cons(pph_time_output_item(PrintLow.format((SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.$str195$_3__0D, millisec), granularity.numGE((SubLObject)pph_methods_formulas.THREE_INTEGER) ? argpos : pph_utilities.pph_unknown_arg_position()), olist);
            olist = (SubLObject)ConsesLow.cons(pph_question.new_pph_phrase_filler_item((SubLObject)pph_methods_formulas.$str44$_), olist);
        }
        if (granularity.numGE((SubLObject)pph_methods_formulas.THREE_INTEGER)) {
            argpos = pph_utilities.pph_contextualize_arg_position(pph_utilities.pph_arg_position_from_template((SubLObject)pph_methods_formulas.$kw196$ARG2), argpos);
        }
        if (pph_methods_formulas.NIL != pph_smaller_interval_type_than(precision, pph_methods_formulas.$const197$CalendarMinute)) {
            olist = (SubLObject)ConsesLow.cons(pph_time_output_item(sec, granularity.numGE((SubLObject)pph_methods_formulas.TWO_INTEGER) ? argpos : pph_utilities.pph_unknown_arg_position()), olist);
            olist = (SubLObject)ConsesLow.cons(pph_question.new_pph_phrase_filler_item((SubLObject)pph_methods_formulas.$str198$_), olist);
        }
        if (granularity.numGE((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
            argpos = pph_utilities.pph_contextualize_arg_position(pph_utilities.pph_arg_position_from_template((SubLObject)pph_methods_formulas.$kw196$ARG2), argpos);
        }
        olist = (SubLObject)ConsesLow.cons(pph_time_output_item(min, granularity.numGE((SubLObject)pph_methods_formulas.ONE_INTEGER) ? argpos : pph_utilities.pph_unknown_arg_position()), olist);
        olist = (SubLObject)ConsesLow.cons(pph_question.new_pph_phrase_filler_item((SubLObject)pph_methods_formulas.$str198$_), olist);
        if (granularity.numGE((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            argpos = pph_utilities.pph_contextualize_arg_position(pph_utilities.pph_arg_position_from_template((SubLObject)pph_methods_formulas.$kw196$ARG2), argpos);
        }
        olist = (SubLObject)ConsesLow.cons(pph_time_output_item(hour, argpos), olist);
        return (SubLObject)ConsesLow.list(pph_data_structures.new_pph_phrase_output_item_nospace_group(olist));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject generate_time_naut_millisecond(final SubLObject phrase, SubLObject precision) {
        if (precision == pph_methods_formulas.UNPROVIDED) {
            precision = pph_methods_formulas.$const191$CalendarMilliSecond;
        }
        return generate_time_naut_millisecond_internal(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), precision, pph_phrase.pph_phrase_arg_position_map(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_date_precision(final SubLObject date_naut) {
        if (pph_methods_formulas.NIL != date_utilities.date_p(date_naut)) {
            return date_utilities.date_precision(date_naut);
        }
        return pph_date_precision_for_fn(cycl_utilities.nat_functor(date_naut));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_date_precision_for_fn(final SubLObject fn) {
        return pph_utilities.pph_ask_variable((SubLObject)pph_methods_formulas.$sym199$_PRECISION, (SubLObject)ConsesLow.listS(pph_methods_formulas.$const200$and, (SubLObject)ConsesLow.listS(pph_methods_formulas.$const201$resultIsa, fn, (SubLObject)pph_methods_formulas.$list202), (SubLObject)pph_methods_formulas.$list203), pph_methods_formulas.$const204$BaseKB, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_date_naut_strip_time(SubLObject date_naut) {
        SubLObject template = pph_utilities.pph_identity_template();
        SubLObject doneP = (SubLObject)pph_methods_formulas.NIL;
        while (pph_methods_formulas.NIL == doneP) {
            if (pph_methods_formulas.NIL == narts_high.naut_p(date_naut)) {
                doneP = (SubLObject)pph_methods_formulas.T;
            }
            else if (pph_methods_formulas.NIL != pph_types.pph_time_p(date_naut)) {
                template = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.TWO_INTEGER, template);
                date_naut = cycl_utilities.formula_arg2(date_naut, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            else {
                doneP = (SubLObject)pph_methods_formulas.T;
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_english_date_disambiguation_string(final SubLObject type) {
        return conses_high.getf(pph_methods_formulas.$pph_english_date_disambiguation_strings$.getGlobalValue(), type, string_utilities.$empty_string$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 48107L)
    public static SubLObject pph_date_add_english_disambiguation_string(final SubLObject date_string, final SubLObject type) {
        final SubLObject disambiguation_string = pph_english_date_disambiguation_string(type);
        return Sequences.cconcatenate(disambiguation_string, date_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 59066L)
    public static SubLObject generate_nl_tagged_term(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_phrase.pph_phrase_set_agr_pred(phrase, pph_methods_formulas.$const209$nounStrings, (SubLObject)pph_methods_formulas.UNPROVIDED);
        pph_macros.clear_pph_suspended_methods_for_cycl(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED));
        final SubLObject info = pph_types.pph_method_info((SubLObject)pph_methods_formulas.$sym207$GENERATE_NL_TAGGED_TERM, (SubLObject)pph_methods_formulas.NIL);
        pph_types.pph_deregister_method_info((SubLObject)pph_methods_formulas.$sym207$GENERATE_NL_TAGGED_TERM, info);
        try {
            final SubLObject top_levelP = pph_macros.handling_pph_method_failures_top_level_p();
            final SubLObject _prev_bind_0 = pph_macros.$suspended_paraphrase_methods$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_macros.$handling_pph_method_failuresP$.currentBinding(thread);
            try {
                pph_macros.$suspended_paraphrase_methods$.bind((pph_methods_formulas.NIL != top_levelP) ? set.new_set(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUAL), pph_macros.max_suspended_method_depth()) : pph_macros.$suspended_paraphrase_methods$.getDynamicValue(thread), thread);
                pph_macros.$handling_pph_method_failuresP$.bind((SubLObject)pph_methods_formulas.T, thread);
                for (SubLObject failed_method = (SubLObject)pph_methods_formulas.NIL, tried_oneP = (SubLObject)pph_methods_formulas.NIL; pph_methods_formulas.NIL != failed_method || pph_methods_formulas.NIL == tried_oneP; tried_oneP = (SubLObject)pph_methods_formulas.T) {
                    if (pph_methods_formulas.NIL != failed_method) {
                        pph_macros.note_suspended_paraphrase_method_plist(failed_method);
                        failed_method = (SubLObject)pph_methods_formulas.NIL;
                    }
                    try {
                        thread.throwStack.push(pph_methods_formulas.$kw210$PPH_METHOD_FAILURE);
                        pph_main.pph_phrase_generate(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    catch (Throwable ccatch_env_var) {
                        failed_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)pph_methods_formulas.$kw210$PPH_METHOD_FAILURE);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
            }
            finally {
                pph_macros.$handling_pph_method_failuresP$.rebind(_prev_bind_2, thread);
                pph_macros.$suspended_paraphrase_methods$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                pph_types.pph_register_method_info((SubLObject)pph_methods_formulas.$sym207$GENERATE_NL_TAGGED_TERM, info);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 62643L)
    public static SubLObject pph_maybe_add_gaf_to_top_20(final SubLObject gaf_sentence, final SubLObject nl_preds, final SubLObject time) {
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 64198L)
    public static SubLObject generate_phrase_from_template(final SubLObject original_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && pph_methods_formulas.NIL != pph_phrase.pph_phrase_has_dtrsP(original_phrase)) {
            Errors.error((SubLObject)pph_methods_formulas.$str211$GENERATE_PHRASE_FROM_TEMPLATE_cal, original_phrase);
        }
        final SubLObject formula = pph_phrase.pph_phrase_cycl(original_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(original_phrase);
        if (pph_methods_formulas.NIL == el_utilities.formula_with_sequence_termP(formula) && pph_methods_formulas.NIL == el_utilities.el_universal_p(formula)) {
            SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(original_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject focus_arg = pph_phrase.pph_phrase_focus_arg(original_phrase);
            final SubLObject keep_existing_arg0P = pph_phrase.pph_current_arg0_specified_p();
            final SubLObject new_arg0 = (pph_methods_formulas.NIL != keep_existing_arg0P) ? pph_vars.$pph_current_arg0$.getDynamicValue(thread) : cycl_utilities.formula_arg0(formula);
            SubLObject tried_anyP = (SubLObject)pph_methods_formulas.NIL;
            SubLObject doneP = (SubLObject)pph_methods_formulas.NIL;
            SubLObject alternative_count = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            SubLObject time = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            agr_preds = pph_methods.pph_revised_nl_preds_for_phrase(original_phrase, agr_preds);
            final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0$.bind((SubLObject)((pph_methods_formulas.NIL != pph_macros.pph_ok_arg0_for_linkingP(new_arg0)) ? new_arg0 : pph_methods_formulas.$kw212$UNSPECIFIED), thread);
                final SubLObject time_var = Time.get_internal_real_time();
                final SubLObject _prev_bind_0_$64 = pph_vars.$pph_search_limit$.currentBinding(thread);
                try {
                    pph_vars.$pph_search_limit$.bind((SubLObject)((pph_methods_formulas.NIL != pph_vars.pph_inside_downward_entailing_environmentP()) ? pph_methods_formulas.ZERO_INTEGER : pph_vars.$pph_search_limit$.getDynamicValue(thread)), thread);
                    final SubLObject generator = pph_data_structures.get_pph_phrase_template_generator(formula, focus_arg, (SubLObject)pph_methods_formulas.NIL, agr_preds, arg_position_map, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL == pph_data_structures.pph_phrase_template_generator_done_p(generator)) {
                        thread.resetMultipleValues();
                        final SubLObject phrase_template = pph_templates.pph_phrase_template_generator_next(generator);
                        final SubLObject ignore_me = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(phrase_template, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                            final SubLObject best_phrase = pph_templates.pph_customize_template_macro_helper(phrase_template, formula, arg_position_map, agr_preds);
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str213$__GENERATE_PHRASE_FROM_TEMPLATE_t, best_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            final SubLObject phrase = (pph_methods_formulas.NIL != pph_vars.pph_generate_alternative_phrasesP()) ? pph_phrase.pph_phrase_copy(original_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) : original_phrase;
                            pph_phrase.pph_phrase_sanity_check_cycl(best_phrase);
                            final SubLObject _prev_bind_0_$65 = pph_vars.$pph_var_types$.currentBinding(thread);
                            try {
                                pph_vars.$pph_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                                final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                                final SubLObject _prev_bind_0_$66 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                                try {
                                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                                    pph_vars.$pph_noted_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL), (SubLObject)pph_methods_formulas.SIXTEEN_INTEGER), thread);
                                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    }
                                    try {
                                        pph_phrase_transfer_old_onto_new(phrase, best_phrase);
                                        do_generate_phrase_from_template(best_phrase);
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            final SubLObject local_vars = conses_high.set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                            }
                                            pph_macros.pph_handle_local_vars(local_vars);
                                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                        }
                                    }
                                }
                                finally {
                                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$66, thread);
                                }
                            }
                            finally {
                                pph_vars.$pph_var_types$.rebind(_prev_bind_0_$65, thread);
                            }
                            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(best_phrase) && pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(original_phrase)) {
                                pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(phrase);
                                if (pph_methods_formulas.NIL != pph_vars.pph_too_many_demerits_p(pph_phrase.pph_phrase_demerits(phrase), (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.THREE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                                        Errors.warn((SubLObject)pph_methods_formulas.$str214$__GENERATE_PHRASE_FROM_TEMPLATE__);
                                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                    }
                                    pph_phrase.pph_phrase_remove_all_dtrs(phrase);
                                    pph_phrase.pph_phrase_note_not_done(phrase);
                                }
                                else {
                                    if (pph_methods_formulas.NIL != pph_vars.pph_generate_alternative_phrasesP()) {
                                        pph_phrase.pph_phrase_copy(best_phrase, original_phrase, (SubLObject)pph_methods_formulas.NIL);
                                        pph_phrase.pph_phrase_set_dtrs(original_phrase, pph_phrase.pph_phrase_dtrs(best_phrase));
                                    }
                                    SubLObject cdolist_list_var = conses_high.copy_list(pph_phrase.pph_phrase_justification(best_phrase));
                                    SubLObject just = (SubLObject)pph_methods_formulas.NIL;
                                    just = cdolist_list_var.first();
                                    while (pph_methods_formulas.NIL != cdolist_list_var) {
                                        pph_phrase.pph_phrase_add_justification(original_phrase, just);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        just = cdolist_list_var.first();
                                    }
                                    pph_phrase.pph_phrase_note_done(original_phrase);
                                    if (pph_methods_formulas.NIL != el_utilities.el_negation_p(formula)) {
                                        final SubLObject position = pph_phrase.pph_phrase_arg_position(original_phrase);
                                        final SubLObject neg_position = (pph_methods_formulas.NIL != pph_utilities.pph_known_arg_position_p(position)) ? ConsesLow.append(position, (SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.ZERO_INTEGER)) : pph_utilities.pph_unknown_arg_position();
                                        pph_vars.note_unexpressed_negation_expressed(neg_position, (SubLObject)pph_methods_formulas.$sym206$GENERATE_PHRASE_FROM_TEMPLATE);
                                    }
                                    if (pph_methods_formulas.NIL == pph_vars.pph_generate_alternative_phrasesP()) {
                                        doneP = (SubLObject)pph_methods_formulas.T;
                                    }
                                }
                            }
                            else if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(best_phrase)) {
                                pph_phrase.pph_phrase_add_alternative(original_phrase, best_phrase);
                                alternative_count = Numbers.add(alternative_count, (SubLObject)pph_methods_formulas.ONE_INTEGER);
                            }
                            else {
                                pph_phrase.pph_phrase_remove_all_dtrs(phrase);
                            }
                            tried_anyP = (SubLObject)pph_methods_formulas.T;
                        }
                    }
                    pph_data_structures.free_pph_phrase_template_generator(generator);
                }
                finally {
                    pph_vars.$pph_search_limit$.rebind(_prev_bind_0_$64, thread);
                }
                time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            }
            finally {
                pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
            }
            if (alternative_count.isPositive() && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str215$Added__D_template_alternatives_to, alternative_count, original_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            if (pph_methods_formulas.NIL == tried_anyP) {
                pph_phrase.pph_phrase_maybe_note_problem(original_phrase, (SubLObject)pph_methods_formulas.$sym206$GENERATE_PHRASE_FROM_TEMPLATE, (SubLObject)pph_methods_formulas.$kw216$NO_GEN_TEMPLATES, (SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.$kw217$CYCL, formula));
            }
            else if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(original_phrase)) {
                pph_phrase.pph_phrase_maybe_note_problem(original_phrase, (SubLObject)pph_methods_formulas.$sym206$GENERATE_PHRASE_FROM_TEMPLATE, (SubLObject)pph_methods_formulas.$kw218$EXISTING_GEN_TEMPLATES_FAILED, (SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.$kw217$CYCL, formula));
            }
            else if (pph_methods_formulas.NIL != el_utilities.gafP(formula)) {
                pph_maybe_add_gaf_to_top_20(formula, agr_preds, time);
            }
        }
        final SubLObject original_preds = pph_phrase.pph_phrase_agr_preds(original_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(original_phrase) && pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != pph_utilities.pph_filter_preds((SubLObject)pph_methods_formulas.$list219, original_preds, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL == pph_utilities.pph_filter_preds((SubLObject)pph_methods_formulas.$list220, original_preds, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject backup = pph_phrase.pph_phrase_create_backup(original_phrase);
            pph_phrase.pph_phrase_set_agr_preds(original_phrase, (SubLObject)pph_methods_formulas.$list220, (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase.pph_phrase_update_category(original_phrase, pph_utilities.pph_vbar_category(), (SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.T);
            generate_phrase_from_template(original_phrase);
            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(original_phrase)) {
                pph_phrase.pph_phrase_set_agr_pred(original_phrase, pph_methods_formulas.$const221$gerund, (SubLObject)pph_methods_formulas.UNPROVIDED);
                pph_phrase.pph_phrase_update_category(original_phrase, pph_utilities.pph_nbar_category(), (SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.T);
                pph_phrase.pph_phrase_add_justification(original_phrase, (SubLObject)pph_methods_formulas.$sym222$COERCED_GERUND_FROM_PRESENT_PARTICIPLE);
            }
            else {
                pph_phrase.pph_phrase_revert_to_backup(original_phrase, backup);
            }
        }
        return pph_phrase.pph_phrase_output_list(original_phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 69127L)
    public static SubLObject pph_phrase_transfer_old_onto_new(final SubLObject old_phrase, final SubLObject new_phrase) {
        final SubLObject old_category = pph_phrase.pph_phrase_category(old_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject old_agr = pph_phrase.pph_phrase_agr(old_phrase);
        final SubLObject old_case = pph_phrase.pph_phrase_case(old_phrase);
        final SubLObject old_just = conses_high.copy_list(pph_phrase.pph_phrase_justification(old_phrase));
        final SubLObject old_just_count = Sequences.length(old_just);
        SubLObject stopP = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_has_dtrsP(old_phrase)) {
            pph_phrase.pph_phrase_remove_all_dtrs(old_phrase);
        }
        pph_phrase.pph_phrase_add_dtr_to_terminal(old_phrase, new_phrase);
        SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
        SubLObject just = (SubLObject)pph_methods_formulas.NIL;
        SubLObject i = (SubLObject)pph_methods_formulas.NIL;
        list_var = old_just;
        just = list_var.first();
        for (i = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL == stopP && pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), just = list_var.first(), i = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, i)) {
            if (i.numGE(old_just_count)) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_methods_formulas.$str223$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_methods_formulas.ONE_INTEGER), pph_methods_formulas.$str224$__, format_nil.format_nil_a_no_copy((SubLObject)pph_methods_formulas.$str225$Adding_too_many_justifications__O) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(old_just));
                stopP = (SubLObject)pph_methods_formulas.T;
            }
            else {
                pph_phrase.pph_phrase_add_justification(new_phrase, just);
            }
        }
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_agr(new_phrase)) {
            pph_phrase.pph_phrase_set_agr(new_phrase, old_agr, (SubLObject)pph_methods_formulas.NIL);
        }
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str226$__Initial_paraphrase_agr_is__S__, pph_phrase.pph_phrase_agr(new_phrase), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_category(new_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            pph_phrase.pph_phrase_set_category(new_phrase, old_category, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str227$__Initial_paraphrase_category_is_, pph_phrase.pph_phrase_category(new_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_case(new_phrase) && pph_methods_formulas.NIL != old_case) {
            pph_phrase.pph_phrase_set_case(new_phrase, old_case, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str228$__Initial_paraphrase_case_is__S__, pph_phrase.pph_phrase_case(new_phrase), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        return new_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 70461L)
    public static SubLObject new_pph_phrase_for_formula_and_gen_template_assertion(final SubLObject formula, final SubLObject gen_template_as, SubLObject force) {
        if (force == pph_methods_formulas.UNPROVIDED) {
            force = (SubLObject)pph_methods_formulas.$kw229$DEFAULT;
        }
        final SubLObject map = pph_utilities.pph_identity_map();
        final SubLObject nl_preds = (SubLObject)pph_methods_formulas.$kw94$ANY;
        final SubLObject phrase = pph_methods_formulas.$const230$genTemplate_QuerySentence.eql(assertions_high.gaf_arg0(gen_template_as)) ? pph_question.pph_phrase_for_query_sentence_from_gtqs_as(gen_template_as, formula, map) : pph_templates.pph_phrase_from_assertion(gen_template_as, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == phrase) {
            if (pph_methods_formulas.$const230$genTemplate_QuerySentence.eql(assertions_high.gaf_arg0(gen_template_as)) && pph_methods_formulas.NIL == pph_question.gtqs_assertion_bindings_for_query_sentence(gen_template_as, formula, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                Errors.error((SubLObject)pph_methods_formulas.$str231$_S___does_not_appear_to_match_tem, formula, assertions_high.gaf_arg1(gen_template_as));
            }
            else {
                Errors.error((SubLObject)pph_methods_formulas.$str232$Couldn_t_generate_a_PPH_phrase_fr);
            }
        }
        pph_templates.pph_template_customize_template_for_formula(phrase, formula, map, nl_preds);
        if (!pph_methods_formulas.$const230$genTemplate_QuerySentence.eql(assertions_high.gaf_arg0(gen_template_as)) && pph_methods_formulas.NIL != conses_high.member(force, (SubLObject)pph_methods_formulas.$list233, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject question_template = pph_question.make_question_template(phrase, el_utilities.expression_free_variables(formula, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL == question_template) {
                Errors.error((SubLObject)pph_methods_formulas.$str234$Couldn_t_generate_a_question_from);
            }
            pph_main.pph_phrase_generate(question_template, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        else {
            do_generate_phrase_from_template(phrase);
        }
        pph_phrase_resolution.pph_phrase_add_sentential_force(phrase, force);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 71982L)
    public static SubLObject do_generate_phrase_from_template(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject consolidateP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != pph_vars.$pph_consolidate_output_list_for_natP$.getDynamicValue(thread) && pph_methods_formulas.NIL != cycl_grammar.cycl_nat_p(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED)) && pph_methods_formulas.NIL != pph_utilities.pph_known_arg_position_p(pph_phrase.pph_phrase_arg_position(phrase)));
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind((SubLObject)((pph_methods_formulas.NIL != consolidateP) ? pph_methods_formulas.$kw93$TEXT : pph_vars.$paraphrase_mode$.getDynamicValue(thread)), thread);
            assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p((SubLObject)pph_methods_formulas.NIL) : pph_methods_formulas.NIL;
            final SubLObject _prev_bind_0_$68 = pph_vars.$paraphrase_precision$.currentBinding(thread);
            try {
                pph_vars.$paraphrase_precision$.bind((SubLObject)pph_methods_formulas.NIL, thread);
                pph_phrase_resolution.pph_phrase_get_string(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                if (pph_methods_formulas.NIL != consolidateP) {
                    pph_phrase.pph_phrase_consolidate_output_list(phrase, pph_phrase.pph_phrase_arg_position(phrase), (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL, pph_phrase.pph_phrase_agr_pred(phrase));
                    pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                }
            }
            finally {
                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$68, thread);
            }
        }
        finally {
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
        if (pph_methods_formulas.NIL != pph_vars.pph_too_many_demerits_p(pph_phrase.pph_phrase_demerits(phrase), (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_methods_formulas.$str235$__DO_GENERATE_PHRASE_FROM_TEMPLAT);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            pph_phrase.pph_phrase_note_not_done(phrase);
        }
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str236$__GENERATE_PHRASE_FROM_TEMPLATE_f, pph_string.pph_string_to_output_format(pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str237$__Updated_AGR_is__S___, pph_phrase.pph_phrase_agr_pred(phrase), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 73275L)
    public static SubLObject generate_simple_negation(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject inner_formula = cycl_utilities.formula_arg1(original_formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject map = pph_utilities.pph_figure_new_arg_position_map(pph_phrase.pph_phrase_arg_position_map(phrase), (SubLObject)pph_methods_formulas.$kw193$ARG1);
        thread.resetMultipleValues();
        final SubLObject new_formula_template = remove_var_typing_clauses(inner_formula, (SubLObject)pph_methods_formulas.NIL, map, (SubLObject)pph_methods_formulas.T);
        final SubLObject just = thread.secondMultipleValue();
        final SubLObject vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (pph_methods_formulas.NIL != new_formula_template) {
            inner_formula = pph_utilities.pph_apply_template(new_formula_template, inner_formula);
            map = pph_utilities.pph_figure_new_arg_position_map(map, new_formula_template);
        }
        if (pph_methods_formulas.NIL != just) {
            pph_phrase.pph_phrase_add_justification(phrase, just);
        }
        if (pph_methods_formulas.NIL == el_utilities.atomic_sentenceP(inner_formula)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_operator_scope_context$.currentBinding(thread);
        try {
            pph_vars.$pph_operator_scope_context$.bind((SubLObject)ConsesLow.cons((SubLObject)pph_methods_formulas.$kw240$NO, pph_vars.$pph_operator_scope_context$.getDynamicValue(thread)), thread);
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str241$Inside_operator_scope__S, (SubLObject)pph_methods_formulas.$kw240$NO, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            final SubLObject position = pph_phrase.pph_phrase_arg_position(phrase);
            final SubLObject neg_position = (pph_methods_formulas.NIL != pph_utilities.pph_known_arg_position_p(position)) ? pph_utilities.pph_contextualize_arg_position(position, pph_utilities.pph_arg_position_from_template((SubLObject)pph_methods_formulas.$kw242$ARG0)) : pph_utilities.pph_unknown_arg_position();
            final SubLObject phrase_copy = pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_vars.note_unexpressed_negation(neg_position, (SubLObject)pph_methods_formulas.$sym238$GENERATE_SIMPLE_NEGATION);
            pph_phrase.pph_phrase_reset_cycl(phrase_copy, (SubLObject)pph_methods_formulas.$kw193$ARG1);
            pph_phrase.pph_phrase_reset_cycl(phrase_copy, new_formula_template);
            final SubLObject matrix_rms = pph_drs.pph_discourse_context_rms((SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject _prev_bind_0_$69 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.pph_discourse_context_copy(), thread);
                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str243$__Shadowing_discourse_context____, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                pph_main.pph_phrase_generate(phrase_copy, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0_$69, thread);
            }
            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase_copy) && (pph_methods_formulas.NIL == pph_vars.unexpressed_negationP(neg_position) || pph_methods_formulas.NIL != pph_try_to_express_negation(phrase_copy, neg_position))) {
                pph_phrase.pph_phrase_copy(phrase_copy, phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str244$Leaving_operator_scope__S, (SubLObject)pph_methods_formulas.$kw240$NO, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        finally {
            pph_vars.$pph_operator_scope_context$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 74872L)
    public static SubLObject pph_try_to_express_negation(final SubLObject phrase, final SubLObject neg_position) {
        final SubLObject subj = pph_phrase.pph_phrase_subject_dtr(phrase);
        if (pph_methods_formulas.NIL != pph_phrase.pph_det_nbarP(subj)) {
            final SubLObject new_subj = pph_det_nbar_switch_quantifer(subj, phrase, pph_methods_formulas.$const245$Some_NLAttr, pph_methods_formulas.$const246$No_NLAttr, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != new_subj) {
                pph_switch_non_subj_determiners(phrase, new_subj, pph_methods_formulas.$const245$Some_NLAttr, pph_methods_formulas.$const247$Any_NLAttr, pph_methods_formulas.$const248$nonPlural_Generic, (SubLObject)pph_methods_formulas.UNPROVIDED);
                pph_vars.note_unexpressed_negation_expressed(neg_position, (SubLObject)pph_methods_formulas.$sym249$PPH_TRY_TO_EXPRESS_NEGATION);
                return (SubLObject)pph_methods_formulas.T;
            }
        }
        final SubLObject backup = pph_phrase.pph_phrase_create_backup(phrase);
        maybe_add_do_support(phrase);
        add_not_to_phrase(phrase);
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            pph_vars.note_unexpressed_negation_expressed(neg_position, (SubLObject)pph_methods_formulas.$sym249$PPH_TRY_TO_EXPRESS_NEGATION);
            return (SubLObject)pph_methods_formulas.T;
        }
        pph_phrase.pph_phrase_revert_to_backup(phrase, backup);
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 75772L)
    public static SubLObject pph_switch_non_subj_determiners(final SubLObject phrase, final SubLObject subj, final SubLObject old_quant, final SubLObject new_quant, SubLObject new_nbar_agr_pred, SubLObject matrix_phrase) {
        if (new_nbar_agr_pred == pph_methods_formulas.UNPROVIDED) {
            new_nbar_agr_pred = (SubLObject)pph_methods_formulas.NIL;
        }
        if (matrix_phrase == pph_methods_formulas.UNPROVIDED) {
            matrix_phrase = phrase;
        }
        if (!phrase.eql(subj) && pph_methods_formulas.NIL != pph_phrase.pph_det_nbarP(phrase)) {
            pph_det_nbar_switch_quantifer(phrase, matrix_phrase, old_quant, new_quant, new_nbar_agr_pred);
        }
        SubLObject dtr_num = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_methods_formulas.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_methods_formulas.NIL, v_iteration = (SubLObject)pph_methods_formulas.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                element_num = ((pph_methods_formulas.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_methods_formulas.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                pph_switch_non_subj_determiners(dtr, subj, old_quant, new_quant, new_nbar_agr_pred, matrix_phrase);
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_methods_formulas.ONE_INTEGER);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 76239L)
    public static SubLObject pph_det_nbar_switch_quantifer(final SubLObject np, final SubLObject matrix_phrase, final SubLObject old_quant, final SubLObject new_quant, SubLObject new_nbar_agr_pred) {
        if (new_nbar_agr_pred == pph_methods_formulas.UNPROVIDED) {
            new_nbar_agr_pred = (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLObject det_dtr = pph_phrase.pph_phrase_nth_dtr(np, (SubLObject)pph_methods_formulas.ZERO_INTEGER);
        final SubLObject det_cycl = pph_phrase.pph_phrase_cycl(det_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject old_np_string = pph_phrase.pph_phrase_string(np, (SubLObject)pph_methods_formulas.NIL);
        if (det_cycl.eql(old_quant)) {
            final SubLObject new_det_dtr = pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.NIL, new_quant, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject nbar_dtr = pph_phrase.pph_phrase_nth_dtr(np, (SubLObject)pph_methods_formulas.ONE_INTEGER);
            final SubLObject new_np = pph_templates.pph_new_np_from_det_and_nbar(new_det_dtr, nbar_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject np_mother = pph_phrase.pph_phrase_mother(np);
            SubLObject np_position = (SubLObject)pph_methods_formulas.NIL;
            if (pph_methods_formulas.NIL != new_nbar_agr_pred) {
                pph_phrase.pph_phrase_set_agr_pred(nbar_dtr, new_nbar_agr_pred, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            SubLObject dtr_num = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            if (document.sign_constituents(np_mother).isVector()) {
                final SubLObject vector_var = document.sign_constituents(np_mother);
                final SubLObject backwardP_var = (SubLObject)pph_methods_formulas.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_methods_formulas.NIL, v_iteration = (SubLObject)pph_methods_formulas.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                    element_num = ((pph_methods_formulas.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_methods_formulas.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (dtr.eql(np)) {
                        np_position = dtr_num;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_methods_formulas.ONE_INTEGER);
                }
            }
            if (pph_methods_formulas.NIL != np_position) {
                pph_phrase.pph_phrase_remove_dtr(np_mother, np);
                pph_phrase.pph_phrase_insert_dtr(np_mother, new_np, np_position);
            }
            pph_phrase.pph_phrase_note_not_done(np_mother);
            pph_main.pph_phrase_generate(matrix_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(matrix_phrase)) {
                Errors.warn((SubLObject)pph_methods_formulas.$str250$Converted__S_to__S, old_np_string, pph_phrase.pph_phrase_string(new_np, (SubLObject)pph_methods_formulas.NIL));
                return new_np;
            }
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 77321L)
    public static SubLObject maybe_add_do_support(final SubLObject template) {
        final SubLObject head_dtr = pph_sentence.pph_sentence_head_verb(template);
        if (pph_methods_formulas.NIL != head_dtr) {
            pph_phrase.pph_phrase_find_or_set_category(head_dtr);
            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_verbP(head_dtr) && pph_methods_formulas.NIL != pph_utilities.needs_do_supportP(template)) {
                pph_utilities.pph_phrase_add_do_support(template);
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 77634L)
    public static SubLObject add_not_to_phrase(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_phrase.pph_phrase_note_not_done(template);
        if (pph_methods_formulas.NIL != pph_vars.$pph_allow_contractionsP$.getDynamicValue(thread)) {
            final SubLObject matrix_rms = pph_drs.pph_discourse_context_rms((SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.pph_discourse_context_copy(), thread);
                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str243$__Shadowing_discourse_context____, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                generate_negation_with_contracted_negative_auxiliary(template);
            }
            finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0, thread);
            }
        }
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(template)) {
            final SubLObject matrix_rms = pph_drs.pph_discourse_context_rms((SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.pph_discourse_context_copy(), thread);
                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str243$__Shadowing_discourse_context____, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                generate_negation_with_not(template);
            }
            finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0, thread);
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 78059L)
    public static SubLObject generate_negation_with_contracted_negative_auxiliary(final SubLObject template) {
        final SubLObject new_template = pph_phrase.pph_phrase_copy(template, pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.T);
        final SubLObject head_verb = pph_sentence.pph_sentence_head_verb(new_template);
        if (pph_methods_formulas.NIL != head_verb) {
            final SubLObject word_unit = pph_phrase.pph_phrase_wu(head_verb, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject neg_word_unit = el_utilities.make_formula(pph_methods_formulas.$const251$WordWithSuffixFn, (SubLObject)ConsesLow.list(word_unit, pph_methods_formulas.$const252$Nt_TheSuffix), (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase.pph_phrase_set_wu(head_verb, neg_word_unit);
            pph_phrase.pph_phrase_update_category(head_verb, pph_methods_formulas.$const253$Aux_Negated, (SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.T);
            pph_phrase.pph_phrase_note_not_done(head_verb);
            pph_main.pph_phrase_generate(new_template, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(head_verb)) {
                pph_phrase.pph_phrase_copy(new_template, template, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 78716L)
    public static SubLObject generate_negation_with_not(final SubLObject template) {
        final SubLObject neg_phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.$str254$not, pph_methods_formulas.$const255$not, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject head_verb = pph_sentence.pph_sentence_head_verb(template);
        if (pph_methods_formulas.NIL != head_verb) {
            final SubLObject head_verb_mother = pph_phrase.pph_phrase_mother(head_verb);
            final SubLObject location = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, pph_phrase.pph_phrase_head_dtr_num(head_verb_mother));
            pph_phrase.pph_phrase_set_arg_position(neg_phrase, (SubLObject)pph_methods_formulas.$list100);
            pph_phrase.pph_phrase_insert_dtr(head_verb_mother, neg_phrase, location);
            pph_phrase.pph_phrase_note_not_done(head_verb_mother);
            pph_main.pph_phrase_generate(template, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 79340L)
    public static SubLObject generate_fn_to_arg_0(final SubLObject phrase) {
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject fn2arg = cycl_utilities.nat_function(v_object);
        final SubLObject argnum = cycl_utilities.nat_arg1(fn2arg, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject pred = cycl_utilities.nat_arg2(fn2arg, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject args = cycl_utilities.nat_args(v_object, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject pred_string = (SubLObject)pph_methods_formulas.NIL;
        SubLObject arg_string = (SubLObject)pph_methods_formulas.NIL;
        SubLObject ans = (SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.$str258$the);
        if (pph_methods_formulas.NIL == pred_string) {
            SubLObject csome_list_var = list_utilities.alist_lookup(relational_noun_args_for_pred(pred, (SubLObject)pph_methods_formulas.UNPROVIDED), argnum, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject data = (SubLObject)pph_methods_formulas.NIL;
            data = csome_list_var.first();
            while (pph_methods_formulas.NIL == pred_string && pph_methods_formulas.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = data;
                SubLObject leading_strings = (SubLObject)pph_methods_formulas.NIL;
                SubLObject wu = (SubLObject)pph_methods_formulas.NIL;
                SubLObject following_strings = (SubLObject)pph_methods_formulas.NIL;
                SubLObject pos = (SubLObject)pph_methods_formulas.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list259);
                leading_strings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list259);
                wu = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list259);
                following_strings = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list259);
                pos = current.first();
                current = current.rest();
                if (pph_methods_formulas.NIL == current) {
                    if (pph_methods_formulas.NIL != wu && pph_methods_formulas.NIL != pos && pph_methods_formulas.NIL != list_utilities.empty_list_p(leading_strings) && pph_methods_formulas.NIL != list_utilities.empty_list_p(following_strings)) {
                        pred_string = pph_methods_lexicon.pph_first_string_of_wordXspeech_part(wu, pos, (SubLObject)pph_methods_formulas.$list78, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list259);
                }
                csome_list_var = csome_list_var.rest();
                data = csome_list_var.first();
            }
        }
        if (pred_string.isString()) {
            ans = (SubLObject)ConsesLow.cons(pred_string, ans);
            if (pph_methods_formulas.NIL != args) {
                ans = (SubLObject)ConsesLow.cons((SubLObject)pph_methods_formulas.$str80$of, ans);
                arg_string = generate_juncts(args, (SubLObject)pph_methods_formulas.$list260, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                ans = (SubLObject)ConsesLow.cons(arg_string, ans);
            }
            pph_phrase.pph_phrase_set_string(phrase, string_utilities.bunge(Sequences.nreverse(ans), (SubLObject)pph_methods_formulas.UNPROVIDED));
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 80272L)
    public static SubLObject get_np_gen_formula(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = pph_methods_formulas.$const106$genFormat_NP;
            if (pph_methods_formulas.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, (SubLObject)pph_methods_formulas.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, (SubLObject)pph_methods_formulas.ONE_INTEGER, pred_var);
                SubLObject done_var = assertion;
                final SubLObject token_var = (SubLObject)pph_methods_formulas.NIL;
                while (pph_methods_formulas.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (pph_methods_formulas.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)pph_methods_formulas.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_methods_formulas.$kw129$GAF, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL);
                            SubLObject done_var_$70 = assertion;
                            final SubLObject token_var_$71 = (SubLObject)pph_methods_formulas.NIL;
                            while (pph_methods_formulas.NIL == done_var_$70) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$71);
                                final SubLObject valid_$72 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$71.eql(as));
                                if (pph_methods_formulas.NIL != valid_$72) {
                                    assertion = as;
                                }
                                done_var_$70 = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == valid_$72 || pph_methods_formulas.NIL != assertion);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (pph_methods_formulas.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == valid || pph_methods_formulas.NIL != assertion);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((pph_methods_formulas.NIL != assertion) ? uncanonicalizer.assertion_el_formula(assertion) : pph_methods_formulas.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 80652L)
    public static SubLObject generate_np_from_formula(final SubLObject formula, final SubLObject scoping_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_operator(formula);
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject format_formula = get_np_gen_formula(pred);
        SubLObject format_string = (SubLObject)pph_methods_formulas.NIL;
        SubLObject arg_order_list = (SubLObject)pph_methods_formulas.NIL;
        SubLObject processed_args = (SubLObject)pph_methods_formulas.NIL;
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == format_formula) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pred.eql(pph_methods_formulas.$const261$importFromAmountDuring) && pph_methods_formulas.NIL != conses_high.member(conses_high.third(args), scoping_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            format_string = (SubLObject)pph_methods_formulas.$str262$_a_export_to__a_during__a;
            arg_order_list = (SubLObject)pph_methods_formulas.$list263;
        }
        else {
            thread.resetMultipleValues();
            final SubLObject format_string_$74 = get_genformat_string_and_list_from_formula(format_formula);
            final SubLObject arg_order_list_$75 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            format_string = format_string_$74;
            arg_order_list = arg_order_list_$75;
        }
        if (pph_methods_formulas.NIL != format_string) {
            if (pph_methods_formulas.NIL != forts.valid_fortP(pred) && pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_methods_formulas.$kw39$HTML) {
                format_string = pph_html.string_term_anchor(format_string, pred);
            }
            processed_args = process_genformat_arglist(formula, pred, args, arg_order_list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != list_utilities.proper_list_p(processed_args)) {
                ans = Functions.apply(Symbols.symbol_function((SubLObject)pph_methods_formulas.$sym264$FORMAT), (SubLObject)pph_methods_formulas.NIL, (SubLObject)ConsesLow.cons(format_string, Mapping.mapcar((SubLObject)pph_methods_formulas.$sym265$PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS, processed_args)));
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 82029L)
    public static SubLObject generate_kappa(final SubLObject phrase) {
        final SubLObject kappa_formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject formula = cycl_utilities.formula_arg2(kappa_formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject scoping_vars = cycl_utilities.formula_arg1(kappa_formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_operator(formula);
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject constant_args = Sequences.remove_if((SubLObject)pph_methods_formulas.$sym268$EL_VAR_, args, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject pred_string = (SubLObject)pph_methods_formulas.NIL;
        SubLObject arg_string = (SubLObject)pph_methods_formulas.NIL;
        SubLObject ans = generate_np_from_formula(formula, scoping_vars);
        if (pph_methods_formulas.NIL != ans) {
            pph_phrase.pph_phrase_set_string(phrase, ans);
            return phrase;
        }
        if (pph_methods_formulas.NIL != collection_defns.cycl_atomic_sentenceP(formula)) {
            pred_string = pph_main.pph_phrase_generate_string_from_cycl(pred, (SubLObject)pph_methods_formulas.$list78, (SubLObject)pph_methods_formulas.UNPROVIDED);
            ans = (SubLObject)ConsesLow.cons(pred_string, ans);
            if (pph_methods_formulas.NIL != constant_args) {
                ans = (SubLObject)ConsesLow.cons((SubLObject)pph_methods_formulas.$str269$for, ans);
                final SubLObject juncts_string = generate_juncts(constant_args, (SubLObject)pph_methods_formulas.$list260, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                if (juncts_string.isString()) {
                    arg_string = juncts_string;
                    ans = (SubLObject)ConsesLow.cons(arg_string, ans);
                }
                else {
                    ans = (SubLObject)pph_methods_formulas.NIL;
                }
            }
            ans = string_utilities.bunge(Sequences.nreverse(ans), (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase.pph_phrase_set_string(phrase, ans);
        }
        if (pph_methods_formulas.NIL == ans) {
            generate_atomic_formula(phrase);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 83494L)
    public static SubLObject generate_existential(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_compatible_with_predsP(phrase, (SubLObject)pph_methods_formulas.$list272)) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
            try {
                pph_vars.$pph_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                final SubLObject _prev_bind_0_$76 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                try {
                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                    pph_vars.$pph_noted_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL), (SubLObject)pph_methods_formulas.SIXTEEN_INTEGER), thread);
                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    try {
                        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
                        SubLObject cdolist_list_var = pph_utilities.pph_vars_to_quantify(formula);
                        SubLObject free_var = (SubLObject)pph_methods_formulas.NIL;
                        free_var = cdolist_list_var.first();
                        while (pph_methods_formulas.NIL != cdolist_list_var) {
                            pph_variable_handling.pph_register_var_quantifier(free_var, (SubLObject)pph_methods_formulas.$kw273$UNIVERSAL);
                            cdolist_list_var = cdolist_list_var.rest();
                            free_var = cdolist_list_var.first();
                        }
                        thread.resetMultipleValues();
                        final SubLObject new_formula_template = remove_var_typing_clauses_from_existential(formula, arg_position_map);
                        final SubLObject just = thread.secondMultipleValue();
                        final SubLObject vars = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (pph_methods_formulas.$kw116$ERROR != new_formula_template && pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                            final SubLObject original_phrase = pph_phrase.pph_phrase_create_backup(phrase);
                            pph_phrase.pph_phrase_reset_cycl(phrase, new_formula_template);
                            if (pph_methods_formulas.NIL != just) {
                                pph_phrase.pph_phrase_add_justification(phrase, just);
                            }
                            if (!pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED).equal(formula)) {
                                pph_main.pph_phrase_generate(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            SubLObject missed_oneP = (SubLObject)pph_methods_formulas.NIL;
                            if (pph_methods_formulas.NIL == missed_oneP) {
                                SubLObject csome_list_var = vars;
                                SubLObject var = (SubLObject)pph_methods_formulas.NIL;
                                var = csome_list_var.first();
                                while (pph_methods_formulas.NIL == missed_oneP && pph_methods_formulas.NIL != csome_list_var) {
                                    if (pph_methods_formulas.NIL != pph_variable_handling.pph_var_paraphrased_explicitlyP(var)) {
                                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                                            Errors.warn((SubLObject)pph_methods_formulas.$str274$Failed_to_paraphrase__S_with_type, var);
                                            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                        }
                                        missed_oneP = (SubLObject)pph_methods_formulas.T;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    var = csome_list_var.first();
                                }
                            }
                            if (pph_methods_formulas.NIL != missed_oneP || pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                                pph_phrase.pph_phrase_revert_to_backup(phrase, original_phrase);
                                pph_phrase.pph_phrase_note_not_done(phrase);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            final SubLObject local_vars = conses_high.set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            pph_macros.pph_handle_local_vars(local_vars);
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                        }
                    }
                }
                finally {
                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$76, thread);
                }
            }
            finally {
                pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 85201L)
    public static SubLObject generate_english_explicit_existential(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject original_map = pph_phrase.pph_phrase_arg_position_map(phrase);
        final SubLObject original_dtrs = pph_phrase.pph_phrase_dtr_list(phrase);
        thread.resetMultipleValues();
        final SubLObject var_pairs = pph_phrase_strip_explicit_cycl_quants(phrase, (SubLObject)pph_methods_formulas.$kw271$EXISTENTIAL);
        final SubLObject core_formula = thread.secondMultipleValue();
        final SubLObject keep_explicitP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (!core_formula.equal(original_formula)) {
            final SubLObject filtered_vars = pph_filter_quantified_vars(list_utilities.alist_keys(var_pairs), (SubLObject)pph_methods_formulas.$kw271$EXISTENTIAL, keep_explicitP);
            final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
            SubLObject dtrs = (SubLObject)pph_methods_formulas.NIL;
            if (pph_methods_formulas.NIL != filtered_vars) {
                final SubLObject quant_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list100, original_map);
                final SubLObject quant = pph_methods_formulas.$const275$thereExists;
                final SubLObject quant_phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.$str276$there_is_some, quant, (SubLObject)pph_methods_formulas.UNPROVIDED);
                pph_phrase.pph_phrase_set_arg_position(quant_phrase, quant_position);
                pph_phrase.pph_phrase_maybe_add_anchor_tags(quant_phrase);
                dtrs = (SubLObject)ConsesLow.cons(quant_phrase, dtrs);
                dtrs = (SubLObject)ConsesLow.cons(quant_vars_phrase(filtered_vars, var_pairs), dtrs);
                if (pph_methods_formulas.NIL != list_utilities.lengthG(filtered_vars, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                    dtrs = (SubLObject)ConsesLow.cons(pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.$str0$_, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), dtrs);
                }
                dtrs = (SubLObject)ConsesLow.cons(pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.$str277$such_that, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), dtrs);
            }
            dtrs = (SubLObject)ConsesLow.cons(quant_body_phrase(core_formula, map), dtrs);
            dtrs = Sequences.nreverse(dtrs);
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, dtrs, (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase_resolution.pph_phrase_get_string(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_methods_formulas.$str278$Failed_to_generate_explicit_exist, original_formula);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, original_dtrs, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 87000L)
    public static SubLObject pph_phrase_output_list_add_comma(final SubLObject output_list) {
        final SubLObject new_item = pph_question.new_pph_phrase_filler_item((SubLObject)pph_methods_formulas.$str0$_);
        if (pph_methods_formulas.NIL != pph_utilities.pph_bulleted_list_end_itemP(list_utilities.last_one(output_list))) {
            final SubLObject insert_position = Numbers.subtract(Sequences.length(output_list), (SubLObject)((pph_methods_formulas.NIL != pph_utilities.pph_bulleted_list_item_end_itemP(list_utilities.penultimate_one(output_list))) ? pph_methods_formulas.TWO_INTEGER : pph_methods_formulas.ONE_INTEGER));
            return list_utilities.ninsert_by_position(new_item, output_list, insert_position);
        }
        return list_utilities.snoc(new_item, output_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 87473L)
    public static SubLObject quant_vars_phrase(final SubLObject vars, final SubLObject var_pairs) {
        SubLObject var_phrases = (SubLObject)pph_methods_formulas.NIL;
        SubLObject cdolist_list_var = vars;
        SubLObject var = (SubLObject)pph_methods_formulas.NIL;
        var = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            var_phrases = (SubLObject)ConsesLow.cons(quant_var_phrase(var, var_pairs), var_phrases);
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        var_phrases = Sequences.nreverse(var_phrases);
        return pph_phrase.new_pph_coordination_phrase_low(var_phrases, (SubLObject)pph_methods_formulas.$kw5$AND, (SubLObject)pph_methods_formulas.$kw6$UNORDERED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 87892L)
    public static SubLObject quant_var_phrase(final SubLObject var, final SubLObject var_pairs) {
        final SubLObject var_phrase = pph_phrase.new_pph_phrase_for_cycl(var, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject arg_position = list_utilities.alist_lookup(var_pairs, var, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        pph_phrase.pph_phrase_set_arg_position(var_phrase, arg_position);
        return var_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 88210L)
    public static SubLObject quant_body_phrase(final SubLObject formula, final SubLObject map) {
        return pph_phrase.new_pph_phrase_for_cycl(formula, map, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 88411L)
    public static SubLObject pph_phrase_strip_explicit_cycl_quants(final SubLObject phrase, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject var_pairs = pph_strip_explicit_cycl_quants(formula, type);
        final SubLObject core_template = thread.secondMultipleValue();
        final SubLObject keep_explicitP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        pph_phrase.pph_phrase_reset_cycl(phrase, core_template);
        return Values.values(var_pairs, formula, keep_explicitP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 89107L)
    public static SubLObject pph_strip_explicit_cycl_quants(SubLObject formula, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula_test_fn = (SubLObject)((type == pph_methods_formulas.$kw271$EXISTENTIAL) ? pph_methods_formulas.$sym279$EL_EXISTENTIAL_P : pph_methods_formulas.$sym280$EL_UNIVERSAL_P);
        final SubLObject other_test_fn = (SubLObject)((type == pph_methods_formulas.$kw271$EXISTENTIAL) ? pph_methods_formulas.$sym281$PPH_UNIVERSAL_P : pph_methods_formulas.$sym282$PPH_EXISTENTIAL_P);
        SubLObject core_template = pph_utilities.pph_identity_template();
        SubLObject var_position = (SubLObject)pph_methods_formulas.$list180;
        SubLObject var_pairs = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject keep_explicitP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == pph_vars.$pph_hide_explicit_universalsP$.getDynamicValue(thread) || pph_methods_formulas.NIL != pph_vars.pph_maximize_linksP() || pph_methods_formulas.NIL != cycl_utilities.expression_find_if(other_test_fn, formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
        SubLObject minimizedP = (SubLObject)pph_methods_formulas.NIL;
        while (pph_methods_formulas.NIL == minimizedP && pph_methods_formulas.NIL != Functions.funcall(formula_test_fn, formula)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject var = (SubLObject)pph_methods_formulas.NIL;
            SubLObject body = (SubLObject)pph_methods_formulas.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list283);
            var = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list283);
            body = current.first();
            current = current.rest();
            if (pph_methods_formulas.NIL == current) {
                if (pph_methods_formulas.NIL != pph_variable_handling.pph_var_registered_as_defaultP(var)) {
                    final SubLObject type_$78 = pph_variable_handling.pph_min_variable_isa_constraint(var, body, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    final SubLObject type_arg_position = pph_utilities.pph_arg_position(type_$78, body, Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUAL));
                    final SubLObject type_template = pph_utilities.pph_cycl_template_from_arg_position(type_arg_position);
                    final SubLObject type_map = pph_utilities.pph_figure_new_arg_position_map(pph_utilities.pph_new_identity_map(), type_template);
                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str284$Registering__S_as__S___with_map__, var, type_$78, type_map, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    pph_variable_handling.pph_register_var(var, type_$78, type_map);
                }
                if (pph_methods_formulas.NIL != keep_explicitP) {
                    pph_register_var_as_exception(var);
                }
                if (pph_methods_formulas.NIL != el_utilities.el_disjunction_p(body)) {
                    minimizedP = (SubLObject)pph_methods_formulas.T;
                }
                else if (pph_methods_formulas.NIL != pph_negative_polarity_sentenceP(body)) {
                    minimizedP = (SubLObject)pph_methods_formulas.T;
                }
                else {
                    var_pairs = list_utilities.alist_enter(var_pairs, var, var_position, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    var_position = pph_utilities.pph_contextualize_arg_position((SubLObject)pph_methods_formulas.$list181, var_position);
                    formula = body;
                    core_template = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.TWO_INTEGER, core_template);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list283);
            }
        }
        return Values.values(var_pairs, core_template, keep_explicitP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 91053L)
    public static SubLObject pph_filter_quantified_vars(final SubLObject quantified_vars, final SubLObject qtype, SubLObject keep_explicitP) {
        if (keep_explicitP == pph_methods_formulas.UNPROVIDED) {
            keep_explicitP = (SubLObject)pph_methods_formulas.NIL;
        }
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        SubLObject cdolist_list_var = quantified_vars;
        SubLObject var = (SubLObject)pph_methods_formulas.NIL;
        var = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            if (pph_methods_formulas.NIL != keep_explicitP) {
                ans = (SubLObject)ConsesLow.cons(var, ans);
            }
            else if (pph_methods_formulas.NIL == pph_exceptional_var_p(var)) {
                pph_variable_handling.pph_register_var_quantifier(var, qtype);
            }
            else if (pph_methods_formulas.NIL == subl_promotions.memberP(pph_variable_handling.pph_var_type(var), quantified_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                ans = (SubLObject)ConsesLow.cons(var, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 91629L)
    public static SubLObject fix_vars_output_list(final SubLObject vars_list, final SubLObject local_map) {
        SubLObject cdolist_list_var = vars_list;
        SubLObject item = (SubLObject)pph_methods_formulas.NIL;
        item = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            final SubLObject var = pph_data_structures.pph_phrase_output_item_cycl(item);
            final SubLObject local_arg_position = list_utilities.alist_lookup(local_map, var, Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL), pph_utilities.pph_unknown_arg_position());
            pph_data_structures.pph_phrase_output_item_set_arg_position(item, local_arg_position);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return vars_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 92048L)
    public static SubLObject remove_var_typing_clauses_from_existential(final SubLObject formula, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject vars = (SubLObject)pph_methods_formulas.NIL;
        SubLObject core_restr = formula;
        SubLObject core_restr_template = pph_utilities.pph_identity_template();
        SubLObject just = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject abortP = (SubLObject)pph_methods_formulas.NIL;
        SubLObject minimizedP = pph_formula_contains_universalP(core_restr);
        pph_register_exception_vars(formula);
        while (pph_methods_formulas.NIL == minimizedP && pph_methods_formulas.NIL == abortP && pph_methods_formulas.NIL != el_utilities.el_existential_p(core_restr)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(core_restr, (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject var = (SubLObject)pph_methods_formulas.NIL;
            SubLObject restr = (SubLObject)pph_methods_formulas.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list285);
            var = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list285);
            restr = current.first();
            current = current.rest();
            if (pph_methods_formulas.NIL == current) {
                if (pph_methods_formulas.NIL != pph_exceptional_var_p(var)) {
                    minimizedP = (SubLObject)pph_methods_formulas.T;
                }
                else if (pph_methods_formulas.NIL != pph_variable_handling.pph_use_explicit_varP(var)) {
                    minimizedP = (SubLObject)pph_methods_formulas.T;
                }
                else if (pph_methods_formulas.NIL != pph_negative_polarity_sentenceP(restr)) {
                    minimizedP = (SubLObject)pph_methods_formulas.T;
                }
                else {
                    core_restr = restr;
                    core_restr_template = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.TWO_INTEGER, core_restr_template);
                    pph_variable_handling.pph_register_var_quantifier(var, (SubLObject)pph_methods_formulas.$kw271$EXISTENTIAL);
                    vars = (SubLObject)ConsesLow.cons(var, vars);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list285);
            }
        }
        SubLObject registered_vars = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject core_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, core_restr_template);
        thread.resetMultipleValues();
        final SubLObject curr_template = remove_var_typing_clauses(core_restr, (SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(formula, (SubLObject)pph_methods_formulas.UNPROVIDED)), core_map, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject curr_just = thread.secondMultipleValue();
        final SubLObject extracted_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (pph_methods_formulas.NIL != pph_utilities.pph_cycl_template_p(curr_template) && pph_methods_formulas.NIL == pph_utilities.pph_identity_template_p(curr_template)) {
            core_restr_template = pph_utilities.pph_apply_template(curr_template, core_restr_template);
            core_restr = pph_utilities.pph_apply_template(curr_template, core_restr);
            if (pph_methods_formulas.NIL == just) {
                just = curr_just;
            }
            registered_vars = ConsesLow.append(extracted_vars, registered_vars);
        }
        if (pph_methods_formulas.NIL != abortP || pph_methods_formulas.NIL == core_restr) {
            pph_variable_handling.pph_deregister_vars(Mapping.mapcar(Symbols.symbol_function((SubLObject)pph_methods_formulas.$sym286$CAR), registered_vars));
        }
        else {
            SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(formula, (SubLObject)pph_methods_formulas.UNPROVIDED));
            SubLObject var2 = (SubLObject)pph_methods_formulas.NIL;
            var2 = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                if (pph_methods_formulas.NIL != pph_variable_handling.pph_var_registered_as_defaultP(var2)) {
                    maybe_register_var_by_arg_constraints(var2, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                pph_variable_handling.pph_note_if_var_is_used_only_once_in_formula(var2, formula);
                cdolist_list_var = cdolist_list_var.rest();
                var2 = cdolist_list_var.first();
            }
        }
        final SubLObject big_existential_formula = put_back_wide_scope_existentials(core_restr_template, Sequences.length(vars));
        if (pph_methods_formulas.NIL != el_utilities.el_implication_p(core_restr) || pph_methods_formulas.NIL != el_utilities.el_universal_p(core_restr)) {
            core_restr_template = big_existential_formula;
        }
        else if (pph_methods_formulas.NIL != core_restr_template && core_restr_template.isList()) {
            core_restr_template = cycl_utilities.formula_arg2(big_existential_formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return Values.values(core_restr_template, just, vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 94798L)
    public static SubLObject put_back_wide_scope_existentials(final SubLObject core_restr_template, final SubLObject how_many) {
        return put_back_wide_scope_quants(core_restr_template, how_many, pph_methods_formulas.$const275$thereExists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 95024L)
    public static SubLObject put_back_wide_scope_quants(SubLObject core_restr_template, final SubLObject how_many, final SubLObject quant) {
        SubLObject how_many_left;
        SubLObject var_template;
        SubLObject i;
        for (how_many_left = (SubLObject)pph_methods_formulas.NIL, how_many_left = number_utilities.f_1_(how_many); !how_many_left.numL((SubLObject)pph_methods_formulas.ZERO_INTEGER); how_many_left = number_utilities.f_1_(how_many_left)) {
            var_template = (SubLObject)pph_methods_formulas.$kw287$SELF;
            for (i = (SubLObject)pph_methods_formulas.NIL, i = (SubLObject)pph_methods_formulas.ZERO_INTEGER; i.numL(how_many_left); i = Numbers.add(i, (SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                var_template = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.TWO_INTEGER, var_template);
            }
            var_template = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.ONE_INTEGER, var_template);
            core_restr_template = el_utilities.make_binary_formula(quant, var_template, core_restr_template);
        }
        return core_restr_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 95596L)
    public static SubLObject pph_formula_ok_for_relational_nounP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str288$__Checking_formula_for_relational, formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        SubLObject badP = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (pph_methods_formulas.NIL == el_utilities.el_atomic_sentenceP(formula) && pph_methods_formulas.NIL == el_utilities.el_binary_formula_p(formula)) {
                badP = (SubLObject)pph_methods_formulas.T;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (pph_methods_formulas.NIL == badP) {
            SubLObject i = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.$kw96$IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = (SubLObject)pph_methods_formulas.NIL, rest = args; pph_methods_formulas.NIL == badP && pph_methods_formulas.NIL != rest; rest = rest.rest()) {
                arg = rest.first();
                i = Numbers.add(i, (SubLObject)pph_methods_formulas.ONE_INTEGER);
                if (pph_methods_formulas.NIL != el_utilities.el_formula_p(arg) || (pph_methods_formulas.NIL != cycl_variables.el_varP(arg) && (pph_methods_formulas.NIL == pph_variable_handling.pph_var_registeredP(arg) || !pph_variable_handling.pph_var_type(arg).eql(pph_variable_handling.pph_min_variable_isa_constraint(arg, formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) || pph_methods_formulas.NIL == pph_argnum_and_pred_ok_for_relational_nounP(number_utilities.f_1X(i), pred)))) {
                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str289$___S_not_suitable_for_relational_, arg, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    badP = (SubLObject)pph_methods_formulas.T;
                }
            }
        }
        if (pph_methods_formulas.NIL != badP) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str290$__Suitable_for_relational_noun_pa, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return (SubLObject)pph_methods_formulas.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 96661L)
    public static SubLObject pph_argnum_and_pred_ok_for_relational_nounP(final SubLObject argnum, final SubLObject pred) {
        final SubLObject relational_noun_args = relational_noun_args_for_pred(pred, (SubLObject)pph_methods_formulas.UNPROVIDED);
        return list_utilities.sublisp_boolean(conses_high.assoc(argnum, relational_noun_args, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 96866L)
    public static SubLObject relational_noun_args_for_pred_internal(final SubLObject pred, SubLObject mt) {
        if (mt == pph_methods_formulas.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        SubLObject gafs = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(mt, thread);
            gafs = pph_utilities.pph_sort_assertions(arg_in_reln_assertions_for_pred(pred), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = gafs;
        SubLObject gaf = (SubLObject)pph_methods_formulas.NIL;
        gaf = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject leading_strings = lexicon_utilities.parse_denot_formula(assertions_high.assertion_formula(gaf));
            final SubLObject wu = thread.secondMultipleValue();
            final SubLObject following_strings = thread.thirdMultipleValue();
            final SubLObject pos = thread.fourthMultipleValue();
            final SubLObject denot = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject argnum = list_utilities.last_one(assertions_high.gaf_args(gaf));
            final SubLObject data = (SubLObject)ConsesLow.list(leading_strings, wu, following_strings, pos);
            ans = list_utilities.alist_pushnew(ans, argnum, data, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 96866L)
    public static SubLObject relational_noun_args_for_pred(final SubLObject pred, SubLObject mt) {
        if (mt == pph_methods_formulas.UNPROVIDED) {
            mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == v_memoization_state) {
            return relational_noun_args_for_pred_internal(pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_methods_formulas.$sym291$RELATIONAL_NOUN_ARGS_FOR_PRED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_methods_formulas.$sym291$RELATIONAL_NOUN_ARGS_FOR_PRED, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.EQUAL, (SubLObject)pph_methods_formulas.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_methods_formulas.$sym291$RELATIONAL_NOUN_ARGS_FOR_PRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_methods_formulas.NIL;
            collision = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_methods_formulas.NIL != cached_args && pph_methods_formulas.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(relational_noun_args_for_pred_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 97717L)
    public static SubLObject generate_existential_with_relational_noun(final SubLObject phrase, final SubLObject new_formula) {
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str292$__Paraphrasing__S_with_relational, new_formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        final SubLObject phrase_naut = pph_phrase_naut_for_relational_noun_formula(new_formula);
        if (pph_methods_formulas.NIL != phrase_naut) {
            pph_phrase.pph_phrase_set_cycl(phrase, phrase_naut);
            pph_main.pph_phrase_generate(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 98320L)
    public static SubLObject pph_phrase_naut_for_relational_noun_formula(final SubLObject formula) {
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        SubLObject bound_arg = (SubLObject)pph_methods_formulas.NIL;
        SubLObject pos = (SubLObject)pph_methods_formulas.NIL;
        SubLObject wu = (SubLObject)pph_methods_formulas.NIL;
        SubLObject leading_strings = (SubLObject)pph_methods_formulas.NIL;
        SubLObject following_strings = (SubLObject)pph_methods_formulas.NIL;
        SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
        SubLObject arg = (SubLObject)pph_methods_formulas.NIL;
        SubLObject i = (SubLObject)pph_methods_formulas.NIL;
        list_var = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        arg = list_var.first();
        for (i = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), i = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, i)) {
            final SubLObject argnum = number_utilities.f_1X(i);
            if (pph_methods_formulas.NIL != cycl_variables.el_varP(arg)) {
                final SubLObject datum_evaluated_var = list_utilities.alist_lookup(relational_noun_args_for_pred(pred, (SubLObject)pph_methods_formulas.UNPROVIDED), argnum, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                leading_strings = datum_evaluated_var.first();
                wu = conses_high.cadr(datum_evaluated_var);
                following_strings = conses_high.cddr(datum_evaluated_var).first();
                pos = conses_high.cadr(conses_high.cddr(datum_evaluated_var));
            }
            else {
                if (pph_methods_formulas.NIL != bound_arg) {
                    final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_methods_formulas.$str223$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_methods_formulas.ONE_INTEGER), pph_methods_formulas.$str224$__, format_nil.format_nil_a_no_copy((SubLObject)pph_methods_formulas.$str293$Bad_arg___S_in__S___) });
                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(arg, formula));
                    return (SubLObject)pph_methods_formulas.NIL;
                }
                bound_arg = arg;
            }
        }
        if (pph_methods_formulas.NIL == bound_arg || pph_methods_formulas.NIL == pos || pph_methods_formulas.NIL == wu) {
            final SubLObject new_format_string2 = Sequences.cconcatenate((SubLObject)pph_methods_formulas.$str223$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_methods_formulas.ONE_INTEGER), pph_methods_formulas.$str224$__, format_nil.format_nil_a_no_copy((SubLObject)pph_methods_formulas.$str294$Don_t_know_how_to_form_a_relation) });
            pph_error.pph_handle_error(new_format_string2, (SubLObject)ConsesLow.list(formula));
            return (SubLObject)pph_methods_formulas.NIL;
        }
        SubLObject nbar_phrases = (SubLObject)pph_methods_formulas.NIL;
        SubLObject cdolist_list_var = leading_strings;
        SubLObject leading_string = (SubLObject)pph_methods_formulas.NIL;
        leading_string = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            nbar_phrases = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pph_functions.bestnlphraseofstringfn(), leading_string), nbar_phrases);
            cdolist_list_var = cdolist_list_var.rest();
            leading_string = cdolist_list_var.first();
        }
        nbar_phrases = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pph_functions.headwordofphrasefn(), (SubLObject)ConsesLow.list(pph_functions.bestnlwordformoflexemefn_constrained(), pos, wu)), nbar_phrases);
        cdolist_list_var = following_strings;
        SubLObject following_string = (SubLObject)pph_methods_formulas.NIL;
        following_string = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            nbar_phrases = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pph_functions.bestnlphraseofstringfn(), following_string), nbar_phrases);
            cdolist_list_var = cdolist_list_var.rest();
            following_string = cdolist_list_var.first();
        }
        nbar_phrases = Sequences.nreverse(nbar_phrases);
        return (SubLObject)ConsesLow.list(pph_functions.phraseformfn(), pph_methods_formulas.$const295$NLSentence, (SubLObject)ConsesLow.list(pph_functions.concatenatephrasesfn(), (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn_np(), bound_arg), reader.bq_cons(pph_functions.bestheadverbforinitialsubjectfn(), (SubLObject)pph_methods_formulas.$list296), (SubLObject)ConsesLow.list(pph_functions.bestdetnbarfn_indefinite(), reader.bq_cons(pph_functions.concatenatephrasesfn(), nbar_phrases))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 99978L)
    public static SubLObject generate_implication_smart(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_formula;
        final SubLObject old_formula = new_formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
        final SubLObject _prev_bind_0 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        try {
            pph_vars.$pph_use_smart_variable_replacementP$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.T.eql(pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread)) && pph_methods_formulas.NIL != pph_allow_var_typingP(old_formula, (SubLObject)pph_methods_formulas.UNPROVIDED)), thread);
            if (pph_methods_formulas.NIL == pph_utilities.pph_formula_with_dotsP(old_formula)) {
                pph_register_exception_vars(old_formula);
                final SubLObject formula_free_vars = pph_utilities.pph_vars_to_quantify(old_formula);
                final SubLObject _prev_bind_0_$79 = pph_vars.$pph_var_types$.currentBinding(thread);
                try {
                    pph_vars.$pph_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                    final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                    final SubLObject _prev_bind_0_$80 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                    try {
                        pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                        pph_vars.$pph_noted_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL), (SubLObject)pph_methods_formulas.SIXTEEN_INTEGER), thread);
                        pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        try {
                            SubLObject cdolist_list_var = formula_free_vars;
                            SubLObject free_var = (SubLObject)pph_methods_formulas.NIL;
                            free_var = cdolist_list_var.first();
                            while (pph_methods_formulas.NIL != cdolist_list_var) {
                                pph_variable_handling.pph_register_var_quantifier(free_var, (SubLObject)pph_methods_formulas.$kw273$UNIVERSAL);
                                cdolist_list_var = cdolist_list_var.rest();
                                free_var = cdolist_list_var.first();
                            }
                            thread.resetMultipleValues();
                            final SubLObject new_formula_template = remove_var_typing_clauses_from_implication(old_formula, arg_position_map);
                            final SubLObject just = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject rephraseP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == pph_utilities.pph_identity_template_p(new_formula_template));
                            final SubLObject new_precision = (SubLObject)((pph_methods_formulas.NIL != rephraseP) ? pph_methods_formulas.NIL : pph_utilities.pph_current_precision());
                            if (pph_methods_formulas.NIL != rephraseP) {
                                pph_phrase.pph_phrase_reset_cycl(phrase, new_formula_template);
                                if (pph_methods_formulas.NIL != just) {
                                    pph_phrase.pph_phrase_add_justification(phrase, just);
                                }
                                new_formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str299$__Removed_var_typing_clauses_in__, old_formula, new_formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                }
                            }
                            final SubLObject info = pph_types.pph_method_info((SubLObject)pph_methods_formulas.$sym297$GENERATE_IMPLICATION_SMART, (SubLObject)pph_methods_formulas.$kw298$IMPLICATION);
                            pph_types.pph_deregister_method_info((SubLObject)pph_methods_formulas.$sym297$GENERATE_IMPLICATION_SMART, info);
                            try {
                                final SubLObject _prev_bind_0_$81 = pph_vars.$pph_operator_scope_context$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_operator_scope_context$.bind((SubLObject)ConsesLow.cons((SubLObject)pph_methods_formulas.$kw300$IMPLIES, pph_vars.$pph_operator_scope_context$.getDynamicValue(thread)), thread);
                                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str241$Inside_operator_scope__S, (SubLObject)pph_methods_formulas.$kw300$IMPLIES, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    }
                                    assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p(new_precision) : new_precision;
                                    final SubLObject _prev_bind_0_$82 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                                    try {
                                        pph_vars.$paraphrase_precision$.bind(new_precision, thread);
                                        pph_main.pph_phrase_generate(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    }
                                    finally {
                                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$82, thread);
                                    }
                                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str244$Leaving_operator_scope__S, (SubLObject)pph_methods_formulas.$kw300$IMPLIES, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    }
                                }
                                finally {
                                    pph_vars.$pph_operator_scope_context$.rebind(_prev_bind_0_$81, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    pph_types.pph_register_method_info((SubLObject)pph_methods_formulas.$sym297$GENERATE_IMPLICATION_SMART, info);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                final SubLObject local_vars = conses_high.set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                }
                                pph_macros.pph_handle_local_vars(local_vars);
                                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                            }
                        }
                    }
                    finally {
                        pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                        pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                        pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$80, thread);
                    }
                }
                finally {
                    pph_vars.$pph_var_types$.rebind(_prev_bind_0_$79, thread);
                }
            }
        }
        finally {
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 101527L)
    public static SubLObject pph_register_different_vars(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL == el_utilities.el_formula_p(formula)) {
            return formula;
        }
        if (pph_methods_formulas.NIL == el_utilities.el_binary_formula_p(formula) || pph_methods_formulas.NIL == cycl_variables.el_varP(cycl_utilities.formula_arg1(formula, (SubLObject)pph_methods_formulas.UNPROVIDED)) || pph_methods_formulas.NIL == cycl_variables.el_varP(cycl_utilities.formula_arg2(formula, (SubLObject)pph_methods_formulas.UNPROVIDED))) {
            SubLObject ans = el_utilities.map_formula_terms((SubLObject)pph_methods_formulas.$sym304$PPH_REGISTER_DIFFERENT_VARS, formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != list_utilities.proper_list_p(ans)) {
                ans = Sequences.remove((SubLObject)pph_methods_formulas.NIL, ans, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            return ans;
        }
        SubLObject op = (SubLObject)pph_methods_formulas.NIL;
        SubLObject arg1 = (SubLObject)pph_methods_formulas.NIL;
        SubLObject arg2 = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(formula, formula, (SubLObject)pph_methods_formulas.$list301);
        op = formula.first();
        SubLObject current = formula.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)pph_methods_formulas.$list301);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, formula, (SubLObject)pph_methods_formulas.$list301);
        arg2 = current.first();
        current = current.rest();
        if (pph_methods_formulas.NIL == current) {
            if (pph_methods_formulas.NIL != forts.fort_p(op) && pph_methods_formulas.NIL != pph_utilities.pph_genl_predicateP(op, pph_methods_formulas.$const302$different, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str303$__Registering__S_and__S_as_differ, arg1, arg2, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                pph_variable_handling.pph_register_vars_as_different(arg1, arg2);
            }
            return (SubLObject)(op.eql(pph_methods_formulas.$const302$different) ? pph_methods_formulas.NIL : formula);
        }
        cdestructuring_bind.cdestructuring_bind_error(formula, (SubLObject)pph_methods_formulas.$list301);
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 102263L)
    public static SubLObject remove_var_typing_clauses_from_implication(final SubLObject formula, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = pph_utilities.pph_identity_template();
        SubLObject just = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != el_utilities.el_implication_p(formula)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject antecedent = (SubLObject)pph_methods_formulas.NIL;
            SubLObject consequent = (SubLObject)pph_methods_formulas.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list305);
            antecedent = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list305);
            consequent = current.first();
            current = current.rest();
            if (pph_methods_formulas.NIL == current) {
                if (pph_methods_formulas.NIL != el_utilities.el_formula_p(antecedent) && pph_methods_formulas.NIL != pph_ok_consequentP(consequent)) {
                    thread.resetMultipleValues();
                    SubLObject antecedent_template = remove_var_typing_clauses(antecedent, (SubLObject)pph_methods_formulas.NIL, pph_utilities.pph_figure_new_arg_position_map(arg_position_map, (SubLObject)pph_methods_formulas.$kw193$ARG1), (SubLObject)pph_methods_formulas.NIL);
                    final SubLObject antecedent_just = thread.secondMultipleValue();
                    final SubLObject vars = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (antecedent_template != pph_methods_formulas.$kw116$ERROR) {
                        SubLObject cdolist_list_var = cycl_utilities.expression_gather(antecedent_template, (SubLObject)pph_methods_formulas.$sym307$GENERIC_ARG_P, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        SubLObject generic_arg = (SubLObject)pph_methods_formulas.NIL;
                        generic_arg = cdolist_list_var.first();
                        while (pph_methods_formulas.NIL != cdolist_list_var) {
                            antecedent_template = conses_high.subst(pph_utilities.make_formula_arg_naut(at_utilities.generic_arg_num(generic_arg), (SubLObject)pph_methods_formulas.$kw306$ANTECEDENT), generic_arg, antecedent_template, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            generic_arg = cdolist_list_var.first();
                        }
                        if (pph_methods_formulas.NIL == antecedent_template) {
                            template = (SubLObject)pph_methods_formulas.$kw196$ARG2;
                        }
                        else if (pph_methods_formulas.NIL != pph_utilities.pph_identity_template_p(antecedent_template)) {
                            template = pph_utilities.pph_identity_template();
                        }
                        else {
                            antecedent_template = conses_high.subst((SubLObject)pph_methods_formulas.$kw193$ARG1, (SubLObject)pph_methods_formulas.$kw306$ANTECEDENT, antecedent_template, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            template = el_utilities.make_implication(antecedent_template, (SubLObject)pph_methods_formulas.$kw196$ARG2);
                        }
                        just = antecedent_just;
                        final SubLObject new_antecedent = (SubLObject)((pph_methods_formulas.NIL != antecedent_template) ? pph_utilities.pph_apply_template(antecedent_template, formula) : pph_methods_formulas.NIL);
                        SubLObject cdolist_list_var2 = vars;
                        SubLObject pair = (SubLObject)pph_methods_formulas.NIL;
                        pair = cdolist_list_var2.first();
                        while (pph_methods_formulas.NIL != cdolist_list_var2) {
                            SubLObject current_$86;
                            final SubLObject datum_$85 = current_$86 = pair;
                            SubLObject var = (SubLObject)pph_methods_formulas.NIL;
                            SubLObject local_arg_position = (SubLObject)pph_methods_formulas.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$86, datum_$85, (SubLObject)pph_methods_formulas.$list308);
                            var = current_$86.first();
                            current_$86 = current_$86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$86, datum_$85, (SubLObject)pph_methods_formulas.$list308);
                            local_arg_position = current_$86.first();
                            current_$86 = current_$86.rest();
                            if (pph_methods_formulas.NIL == current_$86) {
                                if (pph_methods_formulas.NIL == cycl_utilities.expression_find(var, new_antecedent, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                    pph_variable_handling.pph_register_var_quantifier(var, (SubLObject)pph_methods_formulas.$kw273$UNIVERSAL);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$85, (SubLObject)pph_methods_formulas.$list308);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            pair = cdolist_list_var2.first();
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list305);
            }
        }
        return Values.values(template, just);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 104128L)
    public static SubLObject pph_ok_consequentP(final SubLObject consequent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL == el_utilities.el_formula_p(consequent)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL != cycl_utilities.expression_find_if((SubLObject)pph_methods_formulas.$sym309$EL_GENERAL_EXISTENTIAL_P, consequent, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != pph_vars.$paraphrase_precision$.getDynamicValue(thread)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL != cycl_utilities.expression_find_if((SubLObject)pph_methods_formulas.$sym310$EL_DISJUNCTION_P, consequent, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL != cycl_utilities.expression_find_if((SubLObject)pph_methods_formulas.$sym311$PPH_EXISTENTIAL_RMP_SENTENCE_, consequent, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        return (SubLObject)pph_methods_formulas.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 104710L)
    public static SubLObject pph_existential_rmp_sentenceP(final SubLObject v_object) {
        SubLObject badP = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != el_utilities.el_formula_p(v_object)) {
            SubLObject rest;
            SubLObject cons;
            SubLObject current;
            SubLObject datum;
            SubLObject quant;
            SubLObject arg_position;
            for (rest = (SubLObject)pph_methods_formulas.NIL, rest = quant_over_arg_tuples(cycl_utilities.formula_arg0(v_object)); pph_methods_formulas.NIL == badP && pph_methods_formulas.NIL != rest; badP = (SubLObject)SubLObjectFactory.makeBoolean(quant.eql(pph_methods_formulas.$const245$Some_NLAttr) && pph_methods_formulas.NIL != cycl_variables.el_varP(list_utilities.get_nested_nth(v_object, arg_position, (SubLObject)pph_methods_formulas.UNPROVIDED))), rest = rest.rest()) {
                cons = rest.first();
                datum = (current = cons);
                quant = (SubLObject)pph_methods_formulas.NIL;
                arg_position = (SubLObject)pph_methods_formulas.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list312);
                quant = current.first();
                current = (arg_position = current.rest());
            }
        }
        return badP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 105126L)
    public static SubLObject pph_universal_rmp_sentenceP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != el_utilities.el_formula_p(v_object)) {
            final SubLObject pred_tuples = quant_over_arg_tuples(cycl_utilities.formula_arg0(v_object));
            SubLObject rest;
            SubLObject cons;
            SubLObject current;
            SubLObject datum;
            SubLObject quant;
            SubLObject arg_position;
            for (rest = (SubLObject)pph_methods_formulas.NIL, rest = pred_tuples; pph_methods_formulas.NIL == ans && pph_methods_formulas.NIL != rest; ans = Equality.eq(quant, pph_methods_formulas.$const313$Every_NLAttr), rest = rest.rest()) {
                cons = rest.first();
                datum = (current = cons);
                quant = (SubLObject)pph_methods_formulas.NIL;
                arg_position = (SubLObject)pph_methods_formulas.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list312);
                quant = current.first();
                current = (arg_position = current.rest());
            }
            if (pph_methods_formulas.NIL == ans) {
                final SubLObject expansion = verbosifier.el_expansion_one_step(v_object, mt_relevance_macros.$mt$.getDynamicValue(thread));
                if (!v_object.equal(expansion)) {
                    ans = pph_universal_rmp_sentenceP(expansion);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 105774L)
    public static SubLObject pph_formula_contains_universalP(final SubLObject sentence) {
        return cycl_utilities.expression_find_if((SubLObject)pph_methods_formulas.$sym281$PPH_UNIVERSAL_P, sentence, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 105890L)
    public static SubLObject pph_universal_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != el_utilities.el_formula_p(obj) && (pph_methods_formulas.NIL != pph_types.pph_syntactic_universal_p(obj) || pph_methods_formulas.NIL != pph_universal_rmp_sentenceP(obj)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 106046L)
    public static SubLObject maybe_register_var_by_arg_constraints(final SubLObject var, SubLObject formula) {
        if (formula == pph_methods_formulas.UNPROVIDED) {
            formula = (SubLObject)pph_methods_formulas.$kw314$USE_CONTEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_vars.$register_vars_by_arg_constraintsP$.getDynamicValue(thread) && pph_methods_formulas.T.eql(pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread)) && pph_methods_formulas.NIL != pph_variable_handling.pph_var_registered_as_defaultP(var)) {
            register_var_by_arg_constraints(var, formula);
        }
        return pph_variable_handling.pph_var_type(var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 106507L)
    public static SubLObject register_var_by_arg_constraints(final SubLObject var, SubLObject formula) {
        if (formula == pph_methods_formulas.UNPROVIDED) {
            formula = (SubLObject)pph_methods_formulas.$kw314$USE_CONTEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constraint = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject use_var_typing_clausesP = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject directlyP = (SubLObject)pph_methods_formulas.T;
        final SubLObject validity_test = (SubLObject)pph_methods_formulas.$sym315$PPH_VALID_RELEVANT_VAR_TYPE_;
        if (pph_methods_formulas.NIL != el_utilities.el_formula_p(formula)) {
            constraint = pph_variable_handling.pph_min_variable_isa_constraint(var, formula, pph_vars.$pph_domain_mt$.getDynamicValue(thread), use_var_typing_clausesP, directlyP, validity_test);
        }
        else if (pph_methods_formulas.$kw314$USE_CONTEXT == formula) {
            SubLObject cdolist_list_var = pph_vars.$pph_cycls$.getDynamicValue(thread);
            SubLObject formula_$87 = (SubLObject)pph_methods_formulas.NIL;
            formula_$87 = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                if (pph_methods_formulas.NIL != el_utilities.el_formula_p(formula_$87)) {
                    final SubLObject this_constraint = pph_variable_handling.pph_min_variable_isa_constraint(var, formula_$87, pph_vars.$pph_domain_mt$.getDynamicValue(thread), use_var_typing_clausesP, directlyP, validity_test);
                    if (pph_methods_formulas.NIL == constraint) {
                        constraint = this_constraint;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                formula_$87 = cdolist_list_var.first();
            }
        }
        else {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_methods_formulas.$str223$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_methods_formulas.ONE_INTEGER), pph_methods_formulas.$str224$__, format_nil.format_nil_a_no_copy((SubLObject)pph_methods_formulas.$str316$Bad_FORMULA_argument_to_REGISTER_) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(formula));
        }
        if (pph_methods_formulas.NIL != constraint) {
            final SubLObject collection = (pph_methods_formulas.NIL != pph_vars.$pph_use_basic_var_typesP$.getDynamicValue(thread)) ? pph_basic_var_type_for_collection(constraint) : constraint;
            pph_variable_handling.pph_register_var(var, collection, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return pph_variable_handling.pph_var_type(var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 107851L)
    public static SubLObject pph_basic_var_type_for_collection(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return genls.min_genls_among(col, pph_vars.$pph_basic_var_types$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), (SubLObject)pph_methods_formulas.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 107985L)
    public static SubLObject remove_var_typing_clauses(final SubLObject formula, SubLObject specified_vars, SubLObject arg_position_map, SubLObject leave_sole_var_clausesP) {
        if (specified_vars == pph_methods_formulas.UNPROVIDED) {
            specified_vars = (SubLObject)pph_methods_formulas.NIL;
        }
        if (arg_position_map == pph_methods_formulas.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        if (leave_sole_var_clausesP == pph_methods_formulas.UNPROVIDED) {
            leave_sole_var_clausesP = (SubLObject)pph_methods_formulas.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = pph_utilities.pph_identity_template();
        SubLObject badP = (SubLObject)pph_methods_formulas.NIL;
        SubLObject paraphrase_formula_clauses = (SubLObject)pph_methods_formulas.NIL;
        SubLObject vars = (SubLObject)pph_methods_formulas.NIL;
        if (!pph_methods_formulas.T.eql(pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread))) {
            return Values.values(template, (SubLObject)pph_methods_formulas.NIL, vars);
        }
        if (pph_methods_formulas.NIL != pph_utilities.pph_var_typing_clauseP(formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject new_paraphrase_formula_clause = handle_var_typing_clause(formula, arg_position_map, pph_utilities.pph_identity_template(), leave_sole_var_clausesP, specified_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject new_var = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_methods_formulas.NIL != new_paraphrase_formula_clause) {
                paraphrase_formula_clauses = (SubLObject)ConsesLow.cons(new_paraphrase_formula_clause, paraphrase_formula_clauses);
            }
            if (pph_methods_formulas.NIL != new_var) {
                vars = (SubLObject)ConsesLow.cons(new_var, vars);
            }
        }
        else if (pph_methods_formulas.NIL != el_utilities.el_conjunction_p(formula)) {
            if (!specified_vars.isList()) {
                specified_vars = (SubLObject)ConsesLow.list(specified_vars);
            }
            pph_register_exception_vars(formula);
            final SubLObject v_clauses = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
            SubLObject clause = (SubLObject)pph_methods_formulas.NIL;
            SubLObject clause_num = (SubLObject)pph_methods_formulas.NIL;
            list_var = v_clauses;
            clause = list_var.first();
            for (clause_num = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL == badP && pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), clause = list_var.first(), clause_num = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, clause_num)) {
                final SubLObject generic_arg = at_utilities.get_generic_arg(number_utilities.f_1X(clause_num));
                final SubLObject clause_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, generic_arg);
                if (pph_methods_formulas.NIL != el_utilities.el_negation_p(clause) || pph_methods_formulas.NIL != el_utilities.el_disjunction_p(clause)) {
                    badP = (SubLObject)pph_methods_formulas.T;
                }
                else if (pph_methods_formulas.NIL != pph_utilities.pph_var_typing_clauseP(clause, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject new_paraphrase_formula_clause2 = handle_var_typing_clause(clause, clause_map, generic_arg, leave_sole_var_clausesP, specified_vars, clause_num, v_clauses, paraphrase_formula_clauses);
                    final SubLObject new_var2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (pph_methods_formulas.NIL != new_paraphrase_formula_clause2) {
                        paraphrase_formula_clauses = (SubLObject)ConsesLow.cons(new_paraphrase_formula_clause2, paraphrase_formula_clauses);
                    }
                    if (pph_methods_formulas.NIL != new_var2) {
                        vars = (SubLObject)ConsesLow.cons(new_var2, vars);
                    }
                }
                else if (pph_methods_formulas.NIL != generic_arg) {
                    paraphrase_formula_clauses = (SubLObject)ConsesLow.cons(generic_arg, paraphrase_formula_clauses);
                }
                else {
                    paraphrase_formula_clauses = (SubLObject)ConsesLow.cons(pph_utilities.pph_identity_template(), paraphrase_formula_clauses);
                }
            }
        }
        else {
            paraphrase_formula_clauses = (SubLObject)ConsesLow.cons(pph_utilities.pph_identity_template(), paraphrase_formula_clauses);
        }
        paraphrase_formula_clauses = Sequences.nreverse(paraphrase_formula_clauses);
        if (pph_methods_formulas.NIL != badP) {
            template = (SubLObject)pph_methods_formulas.$kw116$ERROR;
            SubLObject cdolist_list_var = vars;
            SubLObject var = (SubLObject)pph_methods_formulas.NIL;
            var = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                pph_variable_handling.pph_deregister_var(var);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            }
            vars = (SubLObject)pph_methods_formulas.NIL;
        }
        else if (pph_methods_formulas.NIL == paraphrase_formula_clauses) {
            template = (SubLObject)pph_methods_formulas.NIL;
        }
        else if (pph_methods_formulas.NIL != list_utilities.singletonP(paraphrase_formula_clauses)) {
            template = paraphrase_formula_clauses.first();
        }
        else if (pph_methods_formulas.NIL == vars) {
            template = pph_utilities.pph_identity_template();
        }
        else {
            final SubLObject arg0_template = pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_methods_formulas.$list100);
            template = el_utilities.make_el_formula(arg0_template, paraphrase_formula_clauses, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        if (pph_methods_formulas.NIL != pph_utilities.pph_cycl_template_p(template)) {
            pph_register_different_vars(pph_utilities.pph_apply_template(template, formula));
        }
        return Values.values(template, (SubLObject)((pph_methods_formulas.NIL != pph_utilities.pph_identity_template_p(template)) ? pph_methods_formulas.NIL : pph_phrase.pph_code_justification((SubLObject)pph_methods_formulas.$sym317$REMOVE_VAR_TYPING_CLAUSES, (SubLObject)pph_methods_formulas.UNPROVIDED)), vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 110986L)
    public static SubLObject handle_var_typing_clause(final SubLObject clause, final SubLObject clause_map, final SubLObject template, final SubLObject leave_sole_var_clausesP, final SubLObject specified_vars, SubLObject clause_num, SubLObject v_clauses, SubLObject paraphrase_formula_clauses) {
        if (clause_num == pph_methods_formulas.UNPROVIDED) {
            clause_num = (SubLObject)pph_methods_formulas.NIL;
        }
        if (v_clauses == pph_methods_formulas.UNPROVIDED) {
            v_clauses = (SubLObject)pph_methods_formulas.NIL;
        }
        if (paraphrase_formula_clauses == pph_methods_formulas.UNPROVIDED) {
            paraphrase_formula_clauses = (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paraphrase_formula_clause = (SubLObject)pph_methods_formulas.NIL;
        SubLObject new_var = (SubLObject)pph_methods_formulas.NIL;
        thread.resetMultipleValues();
        final SubLObject var = pph_utilities.pph_parse_var_typing_clause(clause, clause_map);
        final SubLObject type = thread.secondMultipleValue();
        final SubLObject type_map = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str318$__Found_a_var_typing_clause__with, var, type, type_map, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        if (pph_methods_formulas.NIL != specified_vars && pph_methods_formulas.NIL == subl_promotions.memberP(var, specified_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str319$___S_does_not_type__S__Keeping_it, clause, specified_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            paraphrase_formula_clause = template;
        }
        else if (pph_methods_formulas.NIL != leave_sole_var_clausesP && pph_methods_formulas.NIL != pph_sole_var_clause_p(var, clause_num, v_clauses, paraphrase_formula_clauses)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str320$___S_is_only_remaining_var_typing, clause, var, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            pph_variable_handling.pph_note_var_type(var, type);
            paraphrase_formula_clause = template;
        }
        else if (pph_methods_formulas.NIL != pph_variable_handling.pph_var_registeredP(var) && (pph_methods_formulas.NIL != pph_variable_handling.pph_var_registered_as_defaultP(var) || pph_methods_formulas.NIL != pph_utilities.pph_genlP(type, pph_variable_handling.pph_var_type(var), pph_vars.$pph_domain_mt$.getDynamicValue(thread)))) {
            pph_variable_handling.pph_register_var(var, type, type_map);
            final SubLObject arg_position_template = (SubLObject)((pph_methods_formulas.NIL != template) ? pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.TWO_INTEGER, template) : pph_methods_formulas.$kw196$ARG2);
            final SubLObject arg_position = pph_utilities.pph_arg_position_from_template(arg_position_template);
            new_var = (SubLObject)ConsesLow.list(var, arg_position);
        }
        else if (pph_methods_formulas.NIL != pph_variable_handling.pph_var_registeredP(var) && pph_methods_formulas.NIL != pph_utilities.pph_genlP(pph_variable_handling.pph_var_type(var), type, pph_vars.$pph_domain_mt$.getDynamicValue(thread))) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str321$___S_is_already_registered_as__S_, var, pph_variable_handling.pph_var_type(var), clause, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        else if (pph_methods_formulas.NIL != pph_variable_handling.pph_var_registeredP(var)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str322$___S_is_already_registered_as__S_, var, pph_variable_handling.pph_var_type(var), clause, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            paraphrase_formula_clause = template;
        }
        else {
            pph_variable_handling.pph_register_var(var, type, type_map);
            final SubLObject arg_position_template = (SubLObject)((pph_methods_formulas.NIL != pph_utilities.pph_identity_template_p(template)) ? pph_methods_formulas.$kw196$ARG2 : pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.TWO_INTEGER, template));
            final SubLObject arg_position = pph_utilities.pph_arg_position_from_template(arg_position_template);
            new_var = (SubLObject)ConsesLow.list(var, arg_position);
        }
        return Values.values(paraphrase_formula_clause, new_var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 113642L)
    public static SubLObject pph_var_has_better_typing_clause_p(final SubLObject var, final SubLObject clause_num, final SubLObject v_clauses) {
        final SubLObject current = ConsesLow.nth(clause_num, v_clauses);
        SubLObject foundP = (SubLObject)pph_methods_formulas.NIL;
        SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
        SubLObject clause = (SubLObject)pph_methods_formulas.NIL;
        SubLObject current_num = (SubLObject)pph_methods_formulas.NIL;
        list_var = v_clauses;
        clause = list_var.first();
        for (current_num = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL == foundP && pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), clause = list_var.first(), current_num = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, current_num)) {
            if (current_num.numG(clause_num)) {
                foundP = pph_better_typing_clause_p(clause, current, var);
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 114096L)
    public static SubLObject pph_better_typing_clause_p(final SubLObject clause, final SubLObject current, final SubLObject var) {
        SubLObject betterP = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != pph_utilities.pph_var_typing_clauseP(clause, var, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject type = pph_utilities.pph_var_type_from_asent(clause);
            final SubLObject current_type = pph_utilities.pph_var_type_from_asent(current);
            betterP = pph_better_var_type_p(type, current_type);
        }
        return betterP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 114481L)
    public static SubLObject pph_better_var_type_p(final SubLObject type, final SubLObject current_type) {
        if (pph_methods_formulas.NIL != cycl_variables.el_varP(current_type) && pph_methods_formulas.NIL == cycl_variables.el_varP(type)) {
            return (SubLObject)pph_methods_formulas.T;
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 114640L)
    public static SubLObject pph_sole_var_clause_p(final SubLObject var, final SubLObject clause_num, final SubLObject v_clauses, final SubLObject paraphrase_formula_clauses) {
        SubLObject foundP = (SubLObject)pph_methods_formulas.NIL;
        SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
        SubLObject clause = (SubLObject)pph_methods_formulas.NIL;
        SubLObject current_num = (SubLObject)pph_methods_formulas.NIL;
        list_var = v_clauses;
        clause = list_var.first();
        for (current_num = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL == foundP && pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), clause = list_var.first(), current_num = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, current_num)) {
            if (current_num.numL(clause_num)) {
                foundP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != subl_promotions.memberP(at_utilities.get_generic_arg(number_utilities.f_1X(current_num)), paraphrase_formula_clauses, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != cycl_utilities.expression_find(var, clause, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
            }
            else if (current_num.numG(clause_num)) {
                foundP = cycl_utilities.expression_find(var, clause, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == foundP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 115315L)
    public static SubLObject pph_register_exception_vars(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_exception_vars = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != cycl_utilities.expression_find_if((SubLObject)pph_methods_formulas.$sym323$POSSIBLY_NEW_EXCEPTIONAL_VAR_P, formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = pph_methods_formulas.$pph_new_exception_vars$.currentBinding(thread);
            try {
                pph_methods_formulas.$pph_new_exception_vars$.bind((SubLObject)pph_methods_formulas.NIL, thread);
                pph_register_exception_vars_recursive(formula);
                new_exception_vars = pph_methods_formulas.$pph_new_exception_vars$.getDynamicValue(thread);
            }
            finally {
                pph_methods_formulas.$pph_new_exception_vars$.rebind(_prev_bind_0, thread);
            }
        }
        return new_exception_vars;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 115739L)
    public static SubLObject pph_register_exception_vars_recursive(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_operator(formula);
        final SubLObject allow_type_level_varsP = (SubLObject)pph_methods_formulas.T;
        final SubLObject opaqueP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != fort_types_interface.function_in_any_mtP(operator) || pph_methods_formulas.NIL != pph_opaque_predP(operator, (SubLObject)pph_methods_formulas.UNPROVIDED));
        if (pph_methods_formulas.NIL != opaqueP) {
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(formula, (SubLObject)pph_methods_formulas.$sym323$POSSIBLY_NEW_EXCEPTIONAL_VAR_P, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject var = (SubLObject)pph_methods_formulas.NIL;
            var = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                pph_register_var_as_exception(var);
                cdolist_list_var = cdolist_list_var.rest();
                var = cdolist_list_var.first();
            }
        }
        else {
            SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
            SubLObject arg = (SubLObject)pph_methods_formulas.NIL;
            SubLObject i = (SubLObject)pph_methods_formulas.NIL;
            list_var = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
            arg = list_var.first();
            for (i = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), i = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, i)) {
                if (pph_methods_formulas.NIL == allow_type_level_varsP && pph_methods_formulas.NIL != possibly_new_exceptional_var_p(arg)) {
                    final SubLObject argnum = number_utilities.f_1X(i);
                    if (pph_methods_formulas.NIL != pph_reln_type_level_in_argP(operator, argnum, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                        pph_register_var_as_exception(arg);
                    }
                }
                else if (pph_methods_formulas.NIL != pph_vars.$pph_register_exception_vars_recursivelyP$.getDynamicValue(thread) && pph_methods_formulas.NIL != el_utilities.el_formula_p(arg)) {
                    pph_register_exception_vars_recursive(arg);
                }
            }
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 116726L)
    public static SubLObject possibly_new_exceptional_var_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != cycl_variables.el_varP(obj) && pph_methods_formulas.NIL == pph_exceptional_var_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 116932L)
    public static SubLObject pph_opaque_predP_internal(final SubLObject obj, SubLObject mt) {
        if (mt == pph_methods_formulas.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != fort_types_interface.predicateP(obj) && (pph_methods_formulas.NIL != pph_utilities.pph_genl_predicateP(obj, pph_methods_formulas.$const325$sentenceImplies, mt) || pph_methods_formulas.NIL != pph_utilities.pph_removal_ask_boolean((SubLObject)ConsesLow.listS(pph_methods_formulas.$const326$genlInverse, obj, (SubLObject)pph_methods_formulas.$list327), mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 116932L)
    public static SubLObject pph_opaque_predP(final SubLObject obj, SubLObject mt) {
        if (mt == pph_methods_formulas.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == v_memoization_state) {
            return pph_opaque_predP_internal(obj, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_methods_formulas.$sym324$PPH_OPAQUE_PRED_, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_methods_formulas.$sym324$PPH_OPAQUE_PRED_, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$int328$98, (SubLObject)pph_methods_formulas.EQL, (SubLObject)pph_methods_formulas.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_methods_formulas.$sym324$PPH_OPAQUE_PRED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(obj, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_methods_formulas.NIL;
            collision = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (obj.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_methods_formulas.NIL != cached_args && pph_methods_formulas.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_opaque_predP_internal(obj, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(obj, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 117330L)
    public static SubLObject pph_reln_type_level_in_argP_internal(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == pph_methods_formulas.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != kb_accessors.argn_genl(reln, argnum, mt) || pph_methods_formulas.NIL != Sequences.find(pph_methods_formulas.$const330$Collection, kb_accessors.argn_isa(reln, argnum, mt), (SubLObject)pph_methods_formulas.$sym331$SPEC_, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 117330L)
    public static SubLObject pph_reln_type_level_in_argP(final SubLObject reln, final SubLObject argnum, SubLObject mt) {
        if (mt == pph_methods_formulas.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == v_memoization_state) {
            return pph_reln_type_level_in_argP_internal(reln, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_methods_formulas.$sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_methods_formulas.$sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_, (SubLObject)pph_methods_formulas.THREE_INTEGER, (SubLObject)pph_methods_formulas.$int332$200, (SubLObject)pph_methods_formulas.EQL, (SubLObject)pph_methods_formulas.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_methods_formulas.$sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(reln, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_methods_formulas.NIL;
            collision = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (reln.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pph_methods_formulas.NIL != cached_args && pph_methods_formulas.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_reln_type_level_in_argP_internal(reln, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(reln, argnum, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 117551L)
    public static SubLObject pph_register_var_as_exception(final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_methods_formulas.$pph_new_exception_vars$.setDynamicValue((SubLObject)ConsesLow.cons(var, pph_methods_formulas.$pph_new_exception_vars$.getDynamicValue(thread)), thread);
        return pph_variable_handling.pph_register_var(var, (SubLObject)pph_methods_formulas.$kw333$EXCEPTION, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 117686L)
    public static SubLObject pph_exceptional_var_p(final SubLObject var) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != pph_vars.pph_tracking_var_types_p() && pph_methods_formulas.$kw333$EXCEPTION.eql(pph_variable_handling.pph_var_type(var)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 117888L)
    public static SubLObject generate_cf_implication(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_object = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject if_arg = cycl_utilities.formula_arg1(v_object, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject then_arg = cycl_utilities.formula_arg2(v_object, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject if_negatedP = el_utilities.el_negation_p(if_arg);
        final SubLObject then_negatedP = el_utilities.el_negation_p(then_arg);
        SubLObject not_string = (SubLObject)pph_methods_formulas.NIL;
        SubLObject if_not = (SubLObject)pph_methods_formulas.NIL;
        SubLObject then_not = (SubLObject)pph_methods_formulas.NIL;
        SubLObject format_string = (SubLObject)pph_methods_formulas.NIL;
        format_string = (SubLObject)pph_methods_formulas.$str336$if_it_had_a_been_the_case_that__a;
        not_string = Sequences.cconcatenate((SubLObject)pph_methods_formulas.$str3$_, pph_main.pph_phrase_generate_string_from_cycl(pph_methods_formulas.$const255$not, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_methods_formulas.$kw39$HTML) {
            format_string = pph_html.string_term_anchor(format_string, pph_methods_formulas.$const337$cfImplies);
        }
        if (pph_methods_formulas.NIL != if_negatedP) {
            if_arg = conses_high.second(if_arg);
            if_not = not_string;
        }
        else {
            if_not = string_utilities.$empty_string$.getGlobalValue();
        }
        if (pph_methods_formulas.NIL != then_negatedP) {
            then_arg = conses_high.second(then_arg);
            then_not = not_string;
        }
        else {
            then_not = string_utilities.$empty_string$.getGlobalValue();
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_operator_scope_context$.currentBinding(thread);
        try {
            pph_vars.$pph_operator_scope_context$.bind((SubLObject)ConsesLow.cons((SubLObject)pph_methods_formulas.$kw300$IMPLIES, pph_vars.$pph_operator_scope_context$.getDynamicValue(thread)), thread);
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str241$Inside_operator_scope__S, (SubLObject)pph_methods_formulas.$kw300$IMPLIES, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_string(phrase, PrintLow.format((SubLObject)pph_methods_formulas.NIL, format_string, new SubLObject[] { if_not, pph_main.pph_phrase_generate_string_from_cycl(if_arg, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), then_not, pph_main.pph_phrase_generate_string_from_cycl(then_arg, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) }));
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str244$Leaving_operator_scope__S, (SubLObject)pph_methods_formulas.$kw300$IMPLIES, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        finally {
            pph_vars.$pph_operator_scope_context$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 119180L)
    public static SubLObject generate_subcollection_with_relational_noun(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subcol_naut = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject subcol_fn = cycl_utilities.nat_functor(subcol_naut);
        final SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject bin_pred = cycl_utilities.formula_arg2(subcol_naut, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject bin_pred_supercollection_argnum = (SubLObject)((pph_methods_formulas.NIL != isa.isaP(subcol_fn, pph_methods_formulas.$const340$SubcollectionRelationFunction_Inv, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) ? pph_methods_formulas.TWO_INTEGER : pph_methods_formulas.ONE_INTEGER);
        final SubLObject bin_pred_modifier_argnum = Numbers.subtract((SubLObject)pph_methods_formulas.THREE_INTEGER, bin_pred_supercollection_argnum);
        final SubLObject supercollection_arg = cycl_utilities.nat_arg1(subcol_naut, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject modifier_arg = cycl_utilities.nat_arg3(subcol_naut, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != subl_promotions.memberP(supercollection_arg, kb_accessors.argn_isa(bin_pred, bin_pred_supercollection_argnum, pph_vars.$pph_domain_mt$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str341$Generating_relational_noun_phrase, bin_pred, modifier_arg, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            SubLObject doneP = (SubLObject)pph_methods_formulas.NIL;
            final SubLObject assertions = pph_utilities.pph_sort_assertions(arg_in_reln_assertions_for_pred(bin_pred), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL == doneP) {
                SubLObject csome_list_var = assertions;
                SubLObject arg_in_reln_as = (SubLObject)pph_methods_formulas.NIL;
                arg_in_reln_as = csome_list_var.first();
                while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var) {
                    if (pph_methods_formulas.NIL != arg_in_reln_assertion_matches_head_of_subcollection_nautP(arg_in_reln_as, subcol_naut)) {
                        final SubLObject head_phrase = pph_methods_lexicon.pph_phrase_from_lexical_as(arg_in_reln_as, agr_preds, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        final SubLObject head_arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list181, pph_phrase.pph_phrase_arg_position_map(phrase));
                        SubLObject dtrs = (SubLObject)pph_methods_formulas.NIL;
                        pph_phrase.pph_phrase_set_cycl(head_phrase, bin_pred);
                        pph_phrase.pph_phrase_set_arg_position(head_phrase, head_arg_position);
                        if (pph_methods_formulas.NIL == pph_utilities.pph_precise_in_argP((SubLObject)pph_methods_formulas.THREE_INTEGER) && pph_methods_formulas.NIL != subl_promotions.memberP(modifier_arg, kb_accessors.argn_isa(bin_pred, bin_pred_modifier_argnum, pph_vars.$pph_domain_mt$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                            dtrs = (SubLObject)ConsesLow.list(head_phrase);
                        }
                        else {
                            final SubLObject instance_levelP = pph_utilities.pph_isaP(subcol_fn, pph_methods_formulas.$const342$SubcollectionRelationFunction_Ins, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            final SubLObject arg3_phrase = (SubLObject)((pph_methods_formulas.NIL != instance_levelP) ? reader.bq_cons(pph_functions.termparaphrasefn_np(), (SubLObject)pph_methods_formulas.$list343) : ConsesLow.list(pph_functions.bestppfn(), pph_methods_formulas.$const344$Of_TheWord, (SubLObject)ConsesLow.list(pph_functions.bestdetnbarfn_indefinite(), reader.bq_cons(pph_functions.termparaphrasefn_constrained(), (SubLObject)pph_methods_formulas.$list345))));
                            final SubLObject modifier_phrase = pph_templates.pph_phrasify_phrase_naut(arg3_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            pph_templates.pph_template_phrase_set_cycl(modifier_phrase, subcol_naut, pph_phrase.pph_phrase_arg_position_map(phrase), (SubLObject)pph_methods_formulas.NIL);
                            dtrs = (SubLObject)ConsesLow.list(head_phrase, modifier_phrase);
                        }
                        pph_phrase.set_pph_phrase_dtrs_from_list(phrase, dtrs, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                        try {
                            pph_vars.$pph_demerit_cutoff$.bind((SubLObject)pph_methods_formulas.TWO_INTEGER, thread);
                            pph_main.pph_phrase_generate(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        finally {
                            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                        }
                        doneP = pph_phrase.pph_phrase_doneP(phrase);
                    }
                    csome_list_var = csome_list_var.rest();
                    arg_in_reln_as = csome_list_var.first();
                }
            }
        }
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase) && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str346$Couldn_t_find_an_arg_in_reln_asse, subcol_naut, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 121710L)
    public static SubLObject arg_in_reln_assertions_for_pred(final SubLObject bin_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)pph_methods_formulas.NIL;
        SubLObject cdolist_list_var = pph_methods_lexicon.pph_arg_in_reln_preds((SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject arg_in_reln_pred = (SubLObject)pph_methods_formulas.NIL;
        arg_in_reln_pred = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            final SubLObject denotatum_arg = lexicon_utilities.denotatum_arg_of_pred_cached(arg_in_reln_pred);
            if (denotatum_arg.isInteger()) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    assertions = ConsesLow.append(assertions, kb_mapping.gather_gaf_arg_index_with_predicate(bin_pred, denotatum_arg, arg_in_reln_pred, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_in_reln_pred = cdolist_list_var.first();
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 122169L)
    public static SubLObject arg_in_reln_assertion_matches_head_of_subcollection_nautP(final SubLObject arg_in_reln_as, final SubLObject subcol_naut) {
        final SubLObject arg_in_reln_pred = assertions_high.gaf_arg0(arg_in_reln_as);
        final SubLObject v_arity = pph_utilities.pph_arity(arg_in_reln_pred);
        final SubLObject argnum = (SubLObject)((pph_methods_formulas.NIL != v_arity) ? assertions_high.gaf_arg(arg_in_reln_as, v_arity) : pph_methods_formulas.NIL);
        if (!argnum.isInteger()) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.ONE_INTEGER.eql(argnum) && pph_methods_formulas.NIL != pph_utilities.pph_isaP(cycl_utilities.nat_functor(subcol_naut), pph_methods_formulas.$const347$SubcollectionRelationFunction_Can, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return (SubLObject)pph_methods_formulas.T;
        }
        if (pph_methods_formulas.TWO_INTEGER.eql(argnum) && pph_methods_formulas.NIL != pph_utilities.pph_isaP(cycl_utilities.nat_functor(subcol_naut), pph_methods_formulas.$const340$SubcollectionRelationFunction_Inv, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return (SubLObject)pph_methods_formulas.T;
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 122854L)
    public static SubLObject generate_the_collection_with_rel_clause(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject the_col_naut = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
        SubLObject nat_rephrase_template = pph_utilities.pph_identity_template();
        SubLObject new_just = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.$list350, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.nat_args(the_col_naut, (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject var = (SubLObject)pph_methods_formulas.NIL;
            SubLObject restriction_sentence = (SubLObject)pph_methods_formulas.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list351);
            var = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list351);
            restriction_sentence = current.first();
            current = current.rest();
            if (pph_methods_formulas.NIL == current) {
                thread.resetMultipleValues();
                final SubLObject rephrase_template = remove_var_typing_clauses(restriction_sentence, (SubLObject)ConsesLow.list(var), arg_position_map, (SubLObject)pph_methods_formulas.NIL);
                final SubLObject just = thread.secondMultipleValue();
                final SubLObject pairs = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (pph_methods_formulas.NIL != rephrase_template) {
                    if (pph_methods_formulas.NIL != pph_utilities.pph_identity_template_p(rephrase_template)) {
                        final SubLObject min_isa = pph_variable_handling.pph_min_variable_isa_constraint(var, restriction_sentence, pph_vars.$pph_domain_mt$.getDynamicValue(thread), (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.$sym315$PPH_VALID_RELEVANT_VAR_TYPE_);
                        if (pph_methods_formulas.NIL != cycl_grammar.cycl_denotational_term_p(min_isa)) {
                            nat_rephrase_template = el_utilities.make_binary_formula(pph_methods_formulas.$const352$CollectionSubsetFn, min_isa, el_utilities.make_binary_formula(pph_methods_formulas.$const353$TheSetOf, (SubLObject)pph_methods_formulas.$kw193$ARG1, (SubLObject)pph_methods_formulas.$kw196$ARG2));
                        }
                    }
                    else {
                        final SubLObject type = pph_variable_handling.pph_var_type(var);
                        nat_rephrase_template = el_utilities.make_binary_formula(pph_methods_formulas.$const352$CollectionSubsetFn, type, el_utilities.make_binary_formula(pph_methods_formulas.$const353$TheSetOf, (SubLObject)pph_methods_formulas.$kw193$ARG1, pph_utilities.pph_apply_template(rephrase_template, (SubLObject)pph_methods_formulas.$kw196$ARG2)));
                        new_just = just;
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list351);
            }
            if (pph_methods_formulas.NIL == pph_utilities.pph_identity_template_p(nat_rephrase_template)) {
                pph_phrase.pph_phrase_reset_cycl(phrase, nat_rephrase_template);
                final SubLObject info = pph_types.pph_method_info((SubLObject)pph_methods_formulas.$sym348$GENERATE_THE_COLLECTION_WITH_REL_CLAUSE, (SubLObject)pph_methods_formulas.NIL);
                pph_types.pph_deregister_method_info((SubLObject)pph_methods_formulas.$sym348$GENERATE_THE_COLLECTION_WITH_REL_CLAUSE, info);
                try {
                    generate_collection_subset_with_rel_clause(phrase);
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        pph_types.pph_register_method_info((SubLObject)pph_methods_formulas.$sym348$GENERATE_THE_COLLECTION_WITH_REL_CLAUSE, info);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase) && pph_methods_formulas.NIL != new_just) {
                    pph_phrase.pph_phrase_add_justification(phrase, new_just);
                }
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 126125L)
    public static SubLObject generate_subcollection_with_rel_clause(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subcol_naut = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject agr_preds = pph_methods.pph_revised_nl_preds_for_phrase(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (cycl_utilities.formula_operator(subcol_naut).eql(pph_methods_formulas.$const352$CollectionSubsetFn)) {
            return generate_collection_subset_with_rel_clause(phrase);
        }
        if (pph_methods_formulas.NIL != pph_utilities.pph_special_handling_availableP(subcol_naut)) {
            return phrase;
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
        try {
            pph_vars.$pph_current_arg0$.bind(cycl_utilities.formula_arg0(subcol_naut), thread);
            final SubLObject subcol_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            final SubLObject _prev_bind_0_$88 = pph_vars.$pph_current_arg0_position$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0_position$.bind(pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list100, subcol_map), thread);
                final SubLObject templates = pph_rel_clause_templates(subcol_naut);
                if (pph_methods_formulas.NIL != templates) {
                    SubLObject doneP = (SubLObject)pph_methods_formulas.NIL;
                    SubLObject justifications = (SubLObject)pph_methods_formulas.NIL;
                    final SubLObject fn = cycl_utilities.nat_function(subcol_naut);
                    final SubLObject head_arg = cycl_utilities.nat_arg1(subcol_naut, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    final SubLObject embedded_sentence_template = pph_subcol_embedded_sentence_template(fn);
                    final SubLObject embedded_sentence = pph_subcol_embedded_sentence(subcol_naut);
                    final SubLObject embedded_sent_map = pph_utilities.pph_figure_new_arg_position_map(subcol_map, embedded_sentence_template);
                    final SubLObject head_arg_num = Sequences.position(head_arg, embedded_sentence, Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUAL), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
                    try {
                        pph_vars.$pph_link_arg0P$.bind((SubLObject)pph_methods_formulas.T, thread);
                        if (pph_methods_formulas.NIL == doneP) {
                            SubLObject csome_list_var = templates;
                            SubLObject template = (SubLObject)pph_methods_formulas.NIL;
                            template = csome_list_var.first();
                            while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var) {
                                if (pph_methods_formulas.NIL != pph_template_ok_for_rel_clauseP(head_arg_num, template)) {
                                    final SubLObject category = pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    final SubLObject old_precision = pph_utilities.pph_current_precision();
                                    pph_utilities.pph_reset_precision(embedded_sentence_template);
                                    thread.resetMultipleValues();
                                    final SubLObject output_list = pph_subj_rel_clause_for_subcol(head_arg_num, embedded_sentence, agr_preds, fn, template, category, subcol_naut, embedded_sent_map);
                                    final SubLObject head_pred = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(template, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(template)) {
                                        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase) && pph_methods_formulas.NIL != pph_vars.pph_generate_alternative_phrasesP()) {
                                            final SubLObject alternative = pph_phrase.pph_phrase_copy(template, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                            pph_phrase_resolution.pph_phrase_set_arg0_items(alternative, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                            pph_phrase.pph_phrase_add_alternative(phrase, alternative);
                                        }
                                        else {
                                            doneP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == pph_vars.pph_generate_alternative_phrasesP());
                                            pph_phrase.pph_phrase_copy(template, phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                            pph_phrase_resolution.pph_phrase_set_arg0_items(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                        }
                                    }
                                    else if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_non_empty_output_list_p(output_list)) {
                                        if (pph_methods_formulas.NIL != pph_utilities.pph_speech_part_predP(head_pred)) {
                                            pph_phrase.pph_phrase_set_agr_pred(phrase, head_pred, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                        }
                                        doneP = (SubLObject)pph_methods_formulas.T;
                                        pph_phrase.pph_phrase_set_output_list(phrase, output_list, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                        pph_phrase.pph_phrase_note_done(phrase);
                                        justifications = subcol_justifications_from_template(template);
                                    }
                                    else {
                                        pph_utilities.pph_set_precision(old_precision);
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                template = csome_list_var.first();
                            }
                        }
                        if (pph_methods_formulas.NIL != doneP && pph_methods_formulas.NIL != justifications) {
                            SubLObject cdolist_list_var = justifications;
                            SubLObject justification = (SubLObject)pph_methods_formulas.NIL;
                            justification = cdolist_list_var.first();
                            while (pph_methods_formulas.NIL != cdolist_list_var) {
                                pph_phrase.pph_phrase_add_justification(phrase, justification);
                                cdolist_list_var = cdolist_list_var.rest();
                                justification = cdolist_list_var.first();
                            }
                        }
                    }
                    finally {
                        pph_vars.$pph_link_arg0P$.rebind(_prev_bind_0_$89, thread);
                    }
                }
            }
            finally {
                pph_vars.$pph_current_arg0_position$.rebind(_prev_bind_0_$88, thread);
            }
        }
        finally {
            pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 129113L)
    public static SubLObject generate_collection_subset_with_rel_clause(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL == pph_methods_formulas.$pph_generate_collection_subset_with_rel_clauseP$.getDynamicValue(thread)) {
            return phrase;
        }
        final SubLObject coll_subset_naut = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != pph_utilities.pph_special_handling_availableP(coll_subset_naut)) {
            return phrase;
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_current_arg0$.currentBinding(thread);
        try {
            pph_vars.$pph_current_arg0$.bind(cycl_utilities.formula_arg0(coll_subset_naut), thread);
            final SubLObject subcol_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            final SubLObject _prev_bind_0_$90 = pph_vars.$pph_current_arg0_position$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0_position$.bind(pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list100, subcol_map), thread);
                SubLObject subsentence_template_lists = (SubLObject)pph_methods_formulas.NIL;
                SubLObject phrase_dtrs = (SubLObject)pph_methods_formulas.NIL;
                SubLObject coordination_phrase_dtrs = (SubLObject)pph_methods_formulas.NIL;
                SubLObject failP = (SubLObject)pph_methods_formulas.NIL;
                thread.resetMultipleValues();
                final SubLObject embedded_sentence = pph_destructure_coll_subset(coll_subset_naut);
                final SubLObject head_var = thread.secondMultipleValue();
                final SubLObject head_arg = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject subsentences = pph_rel_clause_embedded_sentence_subsentences_and_connective(embedded_sentence);
                final SubLObject connective = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject rest;
                SubLObject subsentence;
                SubLObject templates;
                for (rest = (SubLObject)pph_methods_formulas.NIL, rest = subsentences; pph_methods_formulas.NIL == failP && pph_methods_formulas.NIL != rest; rest = rest.rest()) {
                    subsentence = rest.first();
                    templates = pph_rel_clause_subsentence_templates(subsentence);
                    if (pph_methods_formulas.NIL != list_utilities.empty_list_p(templates)) {
                        failP = (SubLObject)pph_methods_formulas.T;
                    }
                    else {
                        subsentence_template_lists = (SubLObject)ConsesLow.cons(templates, subsentence_template_lists);
                    }
                }
                if (pph_methods_formulas.NIL == failP) {
                    subsentence_template_lists = Sequences.nreverse(subsentence_template_lists);
                    final SubLObject embedded_sentence_template = el_utilities.make_binary_formula(pph_methods_formulas.$const356$FormulaArgFn, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$kw196$ARG2);
                    final SubLObject embedded_sentence_argpos_map = pph_utilities.pph_figure_new_arg_position_map(subcol_map, embedded_sentence_template);
                    SubLObject justifications = (SubLObject)pph_methods_formulas.NIL;
                    SubLObject subsentence_index = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
                    final SubLObject single_subsentenceP = list_utilities.singletonP(subsentences);
                    SubLObject subsentence2 = (SubLObject)pph_methods_formulas.NIL;
                    SubLObject subsentence_$91 = (SubLObject)pph_methods_formulas.NIL;
                    SubLObject templates2 = (SubLObject)pph_methods_formulas.NIL;
                    SubLObject templates_$92 = (SubLObject)pph_methods_formulas.NIL;
                    subsentence2 = subsentences;
                    subsentence_$91 = subsentence2.first();
                    templates2 = subsentence_template_lists;
                    templates_$92 = templates2.first();
                    while (pph_methods_formulas.NIL != templates2 || pph_methods_formulas.NIL != subsentence2) {
                        if (pph_methods_formulas.NIL == failP) {
                            SubLObject doneP = (SubLObject)pph_methods_formulas.NIL;
                            final SubLObject first_subsentenceP = Numbers.zerop(subsentence_index);
                            SubLObject subsentence_justifications = (SubLObject)pph_methods_formulas.NIL;
                            final SubLObject subsentence_template = pph_coll_subset_embedded_sentence_subsentence_argpos_template(subsentence_$91, head_var, subsentence_index, connective);
                            final SubLObject subsentence_map = pph_utilities.pph_figure_new_arg_position_map(subcol_map, subsentence_template);
                            final SubLObject head_arg_num = Sequences.position(head_var, subsentence_$91, Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUAL), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            final SubLObject _prev_bind_0_$91 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
                            try {
                                pph_vars.$pph_link_arg0P$.bind((SubLObject)pph_methods_formulas.T, thread);
                                if (pph_methods_formulas.NIL == doneP) {
                                    SubLObject csome_list_var = templates_$92;
                                    SubLObject template = (SubLObject)pph_methods_formulas.NIL;
                                    template = csome_list_var.first();
                                    while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var) {
                                        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(template, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != pph_template_ok_for_rel_clauseP(head_arg_num, template)) {
                                            pph_phrase.pph_phrase_set_mother(template, pph_phrase.pph_phrase_mother(phrase));
                                            final SubLObject category = pph_phrase.pph_phrase_category(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                            final SubLObject old_precision = pph_utilities.pph_current_precision();
                                            pph_utilities.pph_reset_precision(subsentence_template);
                                            thread.resetMultipleValues();
                                            final SubLObject output_list = pph_rel_clause_for_coll_subset(head_arg, head_var, subsentence_$91, agr_preds, template, category, coll_subset_naut, subsentence_map, first_subsentenceP, single_subsentenceP);
                                            final SubLObject head_pred = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(template, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(template)) {
                                                doneP = (SubLObject)pph_methods_formulas.T;
                                                final SubLObject template_head_dtr = pph_phrase.pph_phrase_nth_dtr(template, (SubLObject)pph_methods_formulas.ZERO_INTEGER);
                                                if (pph_methods_formulas.NIL != first_subsentenceP) {
                                                    final SubLObject template_that_dtr = pph_phrase.pph_phrase_nth_dtr(template, (SubLObject)pph_methods_formulas.ONE_INTEGER);
                                                    phrase_dtrs = (SubLObject)ConsesLow.cons(pph_phrase.pph_phrase_copy(template_head_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), phrase_dtrs);
                                                    phrase_dtrs = (SubLObject)ConsesLow.cons(pph_phrase.pph_phrase_copy(template_that_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), phrase_dtrs);
                                                    pph_phrase.pph_phrase_set_string(template_that_dtr, string_utilities.$empty_string$.getGlobalValue());
                                                }
                                                pph_phrase.pph_phrase_set_string(template_head_dtr, string_utilities.$empty_string$.getGlobalValue());
                                                pph_phrase.pph_phrase_set_output_list(template_head_dtr, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                pph_phrase.pph_phrase_note_not_done(template);
                                                pph_phrase_resolution.pph_phrase_get_string(template, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                coordination_phrase_dtrs = (SubLObject)ConsesLow.cons(template, coordination_phrase_dtrs);
                                            }
                                            else if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_non_empty_output_list_p(output_list)) {
                                                doneP = (SubLObject)pph_methods_formulas.T;
                                                if (pph_methods_formulas.NIL != first_subsentenceP) {
                                                    if (pph_methods_formulas.NIL != pph_utilities.pph_speech_part_predP(head_pred)) {
                                                        pph_phrase.pph_phrase_set_agr_pred(phrase, head_pred, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                    }
                                                    pph_phrase.pph_phrase_set_output_list(phrase, output_list, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                }
                                                else {
                                                    pph_phrase.pph_phrase_set_output_list(phrase, ConsesLow.append(pph_phrase.pph_phrase_output_list(phrase), output_list.rest()), (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                }
                                                subsentence_justifications = subcol_justifications_from_template(template);
                                            }
                                            else {
                                                pph_utilities.pph_set_precision(old_precision);
                                            }
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        template = csome_list_var.first();
                                    }
                                }
                                if (pph_methods_formulas.NIL != doneP) {
                                    justifications = ConsesLow.append(subsentence_justifications, justifications);
                                    subsentence_index = number_utilities.f_1X(subsentence_index);
                                }
                                else {
                                    failP = (SubLObject)pph_methods_formulas.T;
                                }
                            }
                            finally {
                                pph_vars.$pph_link_arg0P$.rebind(_prev_bind_0_$91, thread);
                            }
                        }
                        subsentence2 = subsentence2.rest();
                        subsentence_$91 = subsentence2.first();
                        templates2 = templates2.rest();
                        templates_$92 = templates2.first();
                    }
                    if (pph_methods_formulas.NIL == failP) {
                        if (pph_methods_formulas.NIL != list_utilities.singletonP(coordination_phrase_dtrs)) {
                            final SubLObject coordination_phrase = list_utilities.only_one(coordination_phrase_dtrs);
                            phrase_dtrs = (SubLObject)ConsesLow.cons(coordination_phrase, phrase_dtrs);
                        }
                        else {
                            final SubLObject coordination_phrase = pph_phrase.new_pph_coordination_phrase_low(Sequences.nreverse(coordination_phrase_dtrs), pph_phrase.pph_opr_key_for_connective(connective), (SubLObject)pph_methods_formulas.$kw6$UNORDERED);
                            pph_phrase.pph_phrase_set_cycl(coordination_phrase, embedded_sentence);
                            pph_phrase.pph_phrase_set_arg_position_map(coordination_phrase, embedded_sentence_argpos_map);
                            phrase_dtrs = (SubLObject)ConsesLow.cons(coordination_phrase, phrase_dtrs);
                        }
                        pph_phrase.set_pph_phrase_dtrs_from_list(phrase, Sequences.reverse(phrase_dtrs), (SubLObject)pph_methods_formulas.ZERO_INTEGER);
                        final SubLObject phrase_copy = pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        pph_phrase_resolution.pph_phrase_get_string(phrase_copy, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        pph_phrase.pph_phrase_copy(phrase_copy, phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        SubLObject cdolist_list_var = justifications;
                        SubLObject justification = (SubLObject)pph_methods_formulas.NIL;
                        justification = cdolist_list_var.first();
                        while (pph_methods_formulas.NIL != cdolist_list_var) {
                            pph_phrase.pph_phrase_add_justification(phrase, justification);
                            cdolist_list_var = cdolist_list_var.rest();
                            justification = cdolist_list_var.first();
                        }
                    }
                }
            }
            finally {
                pph_vars.$pph_current_arg0_position$.rebind(_prev_bind_0_$90, thread);
            }
        }
        finally {
            pph_vars.$pph_current_arg0$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 135023L)
    public static SubLObject pph_subcol_embedded_sentence(final SubLObject subcol_naut) {
        final SubLObject fn = cycl_utilities.nat_function(subcol_naut);
        final SubLObject template = pph_subcol_embedded_sentence_template(fn);
        return pph_utilities.pph_apply_template(template, subcol_naut);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 135299L)
    public static SubLObject pph_destructure_coll_subset(final SubLObject coll_subset_naut) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(coll_subset_naut, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject coll = (SubLObject)pph_methods_formulas.NIL;
        SubLObject cycl_set = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list357);
        coll = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list357);
        cycl_set = current.first();
        current = current.rest();
        if (pph_methods_formulas.NIL == current) {
            if (pph_methods_formulas.NIL != cycl_grammar.cycl_nat_p(cycl_set) && cycl_utilities.nat_functor(cycl_set).eql(pph_methods_formulas.$const353$TheSetOf)) {
                SubLObject current_$95;
                final SubLObject datum_$94 = current_$95 = cycl_utilities.nat_args(cycl_set, (SubLObject)pph_methods_formulas.UNPROVIDED);
                SubLObject var = (SubLObject)pph_methods_formulas.NIL;
                SubLObject set_constraint = (SubLObject)pph_methods_formulas.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$95, datum_$94, (SubLObject)pph_methods_formulas.$list358);
                var = current_$95.first();
                current_$95 = current_$95.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$95, datum_$94, (SubLObject)pph_methods_formulas.$list358);
                set_constraint = current_$95.first();
                current_$95 = current_$95.rest();
                if (pph_methods_formulas.NIL == current_$95) {
                    return Values.values(set_constraint, var, coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$94, (SubLObject)pph_methods_formulas.$list358);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list357);
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 135637L)
    public static SubLObject pph_rel_clause_embedded_sentence_subsentences_and_connective(final SubLObject embedded_sentence) {
        if (pph_methods_formulas.NIL != el_utilities.el_junction_p(embedded_sentence)) {
            return Values.values(cycl_utilities.formula_args(embedded_sentence, (SubLObject)pph_methods_formulas.UNPROVIDED), cycl_utilities.formula_operator(embedded_sentence));
        }
        return Values.values((SubLObject)ConsesLow.list(embedded_sentence), (SubLObject)pph_methods_formulas.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 135929L)
    public static SubLObject pph_subcol_embedded_sentence_template_internal(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject canonical_arg_orderP = pph_utilities.pph_isaP(fn, pph_methods_formulas.$const347$SubcollectionRelationFunction_Can, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject type_level_arg3P = pph_utilities.pph_isaP(fn, pph_methods_formulas.$const360$SubcollectionRelationFunction_Typ, pph_vars.$pph_language_mt$.getDynamicValue(thread));
        SubLObject args = (SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.$kw193$ARG1, (SubLObject)((pph_methods_formulas.NIL != type_level_arg3P) ? pph_utilities.pph_np_cycl_for_term_type((SubLObject)pph_methods_formulas.$kw361$ARG3, (SubLObject)pph_methods_formulas.$kw362$INDEFINITE, (SubLObject)pph_methods_formulas.UNPROVIDED) : pph_methods_formulas.$kw361$ARG3));
        if (pph_methods_formulas.NIL == canonical_arg_orderP) {
            args = Sequences.nreverse(args);
        }
        return el_utilities.make_el_formula((SubLObject)pph_methods_formulas.$kw196$ARG2, args, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 135929L)
    public static SubLObject pph_subcol_embedded_sentence_template(final SubLObject fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == v_memoization_state) {
            return pph_subcol_embedded_sentence_template_internal(fn);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_methods_formulas.$sym359$PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_methods_formulas.$sym359$PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$int363$48, (SubLObject)pph_methods_formulas.EQUAL, (SubLObject)pph_methods_formulas.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_methods_formulas.$sym359$PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fn, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_subcol_embedded_sentence_template_internal(fn)));
            memoization_state.caching_state_put(caching_state, fn, results, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 136513L)
    public static SubLObject pph_coll_subset_embedded_sentence_subsentence_argpos_template(final SubLObject subsentence, final SubLObject head_var, final SubLObject subsentence_index, final SubLObject connective) {
        final SubLObject set_constraint_template = el_utilities.make_binary_formula(pph_methods_formulas.$const356$FormulaArgFn, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$kw196$ARG2);
        final SubLObject subsentence_template = (pph_methods_formulas.NIL == connective) ? set_constraint_template : el_utilities.make_binary_formula(pph_methods_formulas.$const356$FormulaArgFn, number_utilities.f_1X(subsentence_index), set_constraint_template);
        return pph_coll_subset_embedded_sentence_subsentence_argpos_template_recursive(subsentence_template, subsentence, head_var);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 137026L)
    public static SubLObject pph_coll_subset_embedded_sentence_subsentence_argpos_template_recursive(final SubLObject subsentence_template, final SubLObject subsentence, final SubLObject head_var) {
        SubLObject result = (SubLObject)pph_methods_formulas.NIL;
        SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
        SubLObject arg = (SubLObject)pph_methods_formulas.NIL;
        SubLObject argnum = (SubLObject)pph_methods_formulas.NIL;
        list_var = subsentence;
        arg = list_var.first();
        for (argnum = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, argnum)) {
            SubLObject arg_template = (SubLObject)pph_methods_formulas.NIL;
            if (arg.eql(head_var)) {
                arg_template = (SubLObject)pph_methods_formulas.$kw193$ARG1;
            }
            else if (arg.isAtom()) {
                arg_template = el_utilities.make_binary_formula(pph_methods_formulas.$const356$FormulaArgFn, argnum, subsentence_template);
            }
            else if (arg.isList()) {
                arg_template = pph_coll_subset_embedded_sentence_subsentence_argpos_template_recursive(el_utilities.make_binary_formula(pph_methods_formulas.$const356$FormulaArgFn, argnum, subsentence_template), arg, head_var);
            }
            else {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_methods_formulas.$str223$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_methods_formulas.ONE_INTEGER), pph_methods_formulas.$str224$__, format_nil.format_nil_a_no_copy((SubLObject)pph_methods_formulas.$str364$_S_is_neither_an_atom_nor_a_list_) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(arg));
            }
            result = (SubLObject)ConsesLow.cons(arg_template, result);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 137760L)
    public static SubLObject pph_rel_clause_templates(final SubLObject subcol_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject embedded_sentence = pph_subcol_embedded_sentence(subcol_naut);
        final SubLObject pred = cycl_utilities.formula_operator(embedded_sentence);
        final SubLObject args = cycl_utilities.formula_args(embedded_sentence, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject gen_format_style_templates = get_generation_template_as_list(pred, args, (SubLObject)pph_methods_formulas.NIL);
        SubLObject gen_template_style_templates = (SubLObject)pph_methods_formulas.NIL;
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p((SubLObject)pph_methods_formulas.T) : pph_methods_formulas.T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind((SubLObject)pph_methods_formulas.T, thread);
            gen_template_style_templates = pph_templates.pph_phrase_templates_for_formula(embedded_sentence, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        finally {
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        if (gen_template_style_templates.isList()) {
            SubLObject cdolist_list_var = gen_template_style_templates;
            SubLObject phrase = (SubLObject)pph_methods_formulas.NIL;
            phrase = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                    pph_phrase.pph_phrase_set_cycl(phrase, subcol_naut);
                    ans = (SubLObject)ConsesLow.cons(phrase, ans);
                    if (pph_methods_formulas.NIL != isa.isa_in_any_mtP(pred, pph_methods_formulas.$const365$SymmetricBinaryPredicate)) {
                        ans = (SubLObject)ConsesLow.cons(pph_phrase_resolution.pph_phrase_switch_arg1_and_arg2_in_dtrs(pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)), ans);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            }
            ans = Sequences.nreverse(ans);
        }
        return ConsesLow.append(ans, gen_format_style_templates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 138834L)
    public static SubLObject pph_rel_clause_subsentence_templates(final SubLObject subsentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_operator(subsentence);
        final SubLObject args = cycl_utilities.formula_args(subsentence, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        SubLObject gen_format_style_templates = (SubLObject)pph_methods_formulas.NIL;
        SubLObject gen_template_style_templates = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_search_limit$.currentBinding(thread);
        try {
            pph_vars.$pph_search_limit$.bind((SubLObject)pph_methods_formulas.ZERO_INTEGER, thread);
            gen_format_style_templates = get_generation_template_as_list(pred, args, (SubLObject)pph_methods_formulas.NIL);
            gen_template_style_templates = pph_templates.pph_phrase_templates_for_formula(subsentence, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_search_limit$.rebind(_prev_bind_0, thread);
        }
        if (gen_template_style_templates.isList()) {
            SubLObject cdolist_list_var = gen_template_style_templates;
            SubLObject phrase = (SubLObject)pph_methods_formulas.NIL;
            phrase = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                    pph_phrase.pph_phrase_set_cycl(phrase, subsentence);
                    ans = (SubLObject)ConsesLow.cons(phrase, ans);
                    if (pph_methods_formulas.NIL != isa.isa_in_any_mtP(pred, pph_methods_formulas.$const365$SymmetricBinaryPredicate)) {
                        ans = (SubLObject)ConsesLow.cons(pph_phrase_resolution.pph_phrase_switch_arg1_and_arg2_in_dtrs(pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)), ans);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            }
            ans = Sequences.nreverse(ans);
        }
        return ConsesLow.append(ans, gen_format_style_templates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 139799L)
    public static SubLObject pph_subj_rel_clause_for_subcol(final SubLObject head_arg_num, final SubLObject embedded_sentence, final SubLObject agr_preds, final SubLObject fn, final SubLObject template, final SubLObject category, final SubLObject subcol_naut, final SubLObject arg_position_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(template, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            pph_templates.pph_template_phrase_set_cycl(template, embedded_sentence, arg_position_map, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject head_arg = cycl_utilities.formula_arg(embedded_sentence, head_arg_num, (SubLObject)pph_methods_formulas.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject output_list = pph_subj_rel_clause_from_gentemplate(template, head_arg, agr_preds);
            final SubLObject pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_methods_formulas.NIL != misc_utilities.initialized_p(pph_vars.$pph_paraphrase_to_justify$.getDynamicValue(thread))) {
                pph_phrase_resolution.maybe_throw_pph_hl_supports(subcol_naut, pph_phrase.pph_phrase_string(template, (SubLObject)pph_methods_formulas.NIL), agr_preds, pph_phrase.pph_phrase_gather_supports(template));
            }
            return Values.values(output_list, pred);
        }
        if (pph_methods_formulas.NIL != assertion_handles.assertion_p(template)) {
            thread.resetMultipleValues();
            final SubLObject output_list2 = pph_subj_rel_clause_from_genformat(head_arg_num, embedded_sentence, fn, template, subcol_naut, arg_position_map);
            final SubLObject pred2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return Values.values(output_list2, pred2);
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 140997L)
    public static SubLObject pph_rel_clause_for_coll_subset(final SubLObject head_arg, final SubLObject head_var, final SubLObject subsentence, final SubLObject agr_preds, final SubLObject template, final SubLObject category, final SubLObject subcol_naut, final SubLObject arg_position_map, final SubLObject first_subsentenceP, final SubLObject only_subsentenceP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject substituted_subsentence = cycl_utilities.expression_subst(head_arg, head_var, subsentence, Symbols.symbol_function((SubLObject)pph_methods_formulas.EQ), (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(template, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            pph_templates.pph_template_phrase_set_cycl(template, substituted_subsentence, arg_position_map, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != pph_phrase.pph_conditional_phrase_p(template)) {
                pph_phrase_resolution.pph_phrase_resolve_condition(template, substituted_subsentence, pph_phrase.pph_phrase_mother(template));
                if (pph_methods_formulas.NIL != pph_phrase.pph_conditional_phrase_p(template)) {
                    return Values.values((SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.$kw94$ANY);
                }
            }
            thread.resetMultipleValues();
            final SubLObject output_list = pph_rel_clause_from_gentemplate(template, head_arg, agr_preds, first_subsentenceP, only_subsentenceP);
            final SubLObject pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return Values.values(output_list, pred);
        }
        if (pph_methods_formulas.NIL != assertion_handles.assertion_p(template)) {
            Errors.error((SubLObject)pph_methods_formulas.$str366$PPH_REL_CLAUSE_FOR_COLL_SUBSET_ca, template);
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 142333L)
    public static SubLObject subcol_justifications_from_template(final SubLObject template) {
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(template, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return pph_phrase.pph_phrase_justification(template);
        }
        if (pph_methods_formulas.NIL != assertion_handles.assertion_p(template)) {
            return (SubLObject)ConsesLow.list(template);
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 142587L)
    public static SubLObject pph_subj_rel_clause_from_gentemplate(final SubLObject template, final SubLObject head_arg, final SubLObject agr_preds) {
        return pph_rel_clause_from_gentemplate(template, head_arg, agr_preds, (SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 142897L)
    public static SubLObject pph_rel_clause_front_prepositionP(final SubLObject template, final SubLObject dtr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_methods_formulas.$pph_front_prepositionsP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 143022L)
    public static SubLObject pph_rel_clause_from_gentemplate(final SubLObject template, final SubLObject head_arg, final SubLObject agr_preds, final SubLObject first_subsentenceP, final SubLObject only_subsentenceP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject extraction_target_dtr = pph_phrase_find_extractible_dtr_with_cycl(template, head_arg);
        final SubLObject extraction_target_dtr_num = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_methods_formulas.NIL != extraction_target_dtr) {
            final SubLObject new_head_dtr = new_rel_clause_head_dtr(extraction_target_dtr, agr_preds);
            final SubLObject head_verb_dtr = pph_phrase.pph_phrase_head_dtr(template);
            final SubLObject possessiveP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != pph_phrase.pph_phrase_has_dtrsP(extraction_target_dtr) && pph_methods_formulas.NIL != pph_phrase.pph_phrase_possessiveP(pph_phrase.pph_phrase_nth_dtr(extraction_target_dtr, (SubLObject)pph_methods_formulas.ZERO_INTEGER)));
            SubLObject rel_clause_startedP = (SubLObject)pph_methods_formulas.NIL;
            SubLObject that_dtr = (SubLObject)pph_methods_formulas.NIL;
            final SubLObject use_who_or_whomP = pph_utilities.pph_genlP(head_arg, pph_methods_formulas.$const367$Person, (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject dtr_list = (SubLObject)pph_methods_formulas.NIL;
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str368$__Trying_to_make_relative_clause_, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(head_verb_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                pph_phrase_resolution.pph_phrase_unify_pos_preds(template, head_verb_dtr);
            }
            pph_phrase.pph_phrase_set_agr_preds(template, pph_phrase.pph_phrase_agr_preds(new_head_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject dtr_num = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            if (document.sign_constituents(template).isVector()) {
                final SubLObject vector_var = document.sign_constituents(template);
                final SubLObject backwardP_var = (SubLObject)pph_methods_formulas.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject whose_phrase;
                SubLObject copula;
                SubLObject that_position;
                SubLObject pronoun_case;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_methods_formulas.NIL, v_iteration = (SubLObject)pph_methods_formulas.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                    element_num = ((pph_methods_formulas.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_methods_formulas.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    if (pph_methods_formulas.NIL == possessiveP) {
                        update_relative_agrs_in_relative_clause_dtr(dtr, new_head_dtr, extraction_target_dtr);
                    }
                    if (pph_methods_formulas.NIL != possessiveP && dtr_num.eql(extraction_target_dtr_num)) {
                        whose_phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.$str369$whose, pph_phrase.pph_empty_cycl(), (SubLObject)pph_methods_formulas.UNPROVIDED);
                        pph_phrase.pph_phrase_set_category(whose_phrase, pph_methods_formulas.$const370$PossessivePhrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        pph_phrase.pph_phrase_set_nth_dtr(dtr, (SubLObject)pph_methods_formulas.ZERO_INTEGER, whose_phrase);
                        dtr_list = (SubLObject)ConsesLow.cons(new_head_dtr, dtr_list);
                        dtr_list = (SubLObject)ConsesLow.cons(dtr, dtr_list);
                        rel_clause_startedP = (SubLObject)pph_methods_formulas.T;
                    }
                    else if (dtr_num.eql(extraction_target_dtr_num)) {
                        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_ppP(dtr)) {
                            if (pph_methods_formulas.NIL != pph_rel_clause_front_prepositionP(template, dtr)) {
                                pph_phrase.pph_phrase_append(pph_data_structures.new_pph_phrase((SubLObject)((pph_methods_formulas.NIL != use_who_or_whomP) ? pph_methods_formulas.$str371$whom : pph_methods_formulas.$str372$which), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), dtr);
                                dtr_list = list_utilities.add_to_end(dtr, dtr_list);
                                dtr_list = Sequences.delete(that_dtr, dtr_list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                rel_clause_startedP = (SubLObject)pph_methods_formulas.T;
                            }
                            else {
                                dtr_list = (SubLObject)ConsesLow.cons(dtr, dtr_list);
                            }
                        }
                        if (pph_methods_formulas.NIL != pph_phrase_resolution.pph_copular_complementP(dtr) && pph_methods_formulas.NIL != pph_phrase.pph_copula_phraseP(dtr_list.first()) && pph_methods_formulas.NIL != Sequences.find(that_dtr, dtr_list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str373$Moving_rel_clause_copula_to_immed, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            copula = dtr_list.first();
                            that_position = Sequences.position(that_dtr, dtr_list, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            dtr_list = list_utilities.move_nth_to_position((SubLObject)pph_methods_formulas.ZERO_INTEGER, that_position, dtr_list);
                        }
                        dtr_list = list_utilities.add_to_end(new_head_dtr, dtr_list);
                    }
                    else if (pph_methods_formulas.NIL != rel_clause_startedP) {
                        dtr_list = (SubLObject)ConsesLow.cons(dtr, dtr_list);
                    }
                    else {
                        if (pph_methods_formulas.NIL != only_subsentenceP && pph_methods_formulas.NIL != pph_subj_rel_clause_template_ok_for_copula_removalP(template)) {
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str374$__Removing_copula_from_template__, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                        }
                        else if (dtr.eql(head_verb_dtr) && pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED) && pph_phrase.pph_phrase_wu(dtr, (SubLObject)pph_methods_formulas.UNPROVIDED).eql(pph_methods_formulas.$const375$Have_TheWord)) {
                            dtr_list = (SubLObject)ConsesLow.cons(pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.$str376$with, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), dtr_list);
                        }
                        else {
                            if (pph_methods_formulas.NIL != first_subsentenceP) {
                                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str377$__Adding_relative_pronoun_to_temp, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                }
                                pronoun_case = pph_phrase.pph_phrase_case(extraction_target_dtr);
                                that_dtr = pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.$str378$that, pph_phrase.pph_empty_cycl(), (SubLObject)pph_methods_formulas.UNPROVIDED);
                                pph_phrase.pph_phrase_set_case(that_dtr, pronoun_case, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                if (pph_methods_formulas.NIL != use_who_or_whomP) {
                                    pph_question.pph_phrase_set_who_or_whom(that_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                }
                                dtr_list = (SubLObject)ConsesLow.cons(that_dtr, dtr_list);
                            }
                            dtr_list = (SubLObject)ConsesLow.cons(dtr, dtr_list);
                        }
                        rel_clause_startedP = (SubLObject)pph_methods_formulas.T;
                    }
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_methods_formulas.ONE_INTEGER);
                }
            }
            final SubLObject head_dtr_num = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
            pph_phrase.set_pph_phrase_dtrs_from_list(template, Sequences.nreverse(dtr_list), head_dtr_num);
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str379$__Template_now_has__D_dtrs___, pph_phrase.pph_phrase_dtr_count(template), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_category(template, pph_utilities.pph_nbar_category(), (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase_resolution.pph_phrase_get_string(template, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return Values.values(pph_phrase.pph_phrase_output_list(template), pph_phrase.pph_phrase_agr_preds(template, (SubLObject)pph_methods_formulas.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 147177L)
    public static SubLObject new_rel_clause_head_dtr(final SubLObject extraction_target_dtr, final SubLObject agr_preds) {
        SubLObject new_head_dtr = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_has_dtrsP(extraction_target_dtr) && pph_methods_formulas.NIL != pph_phrase.pph_phrase_possessiveP(pph_phrase.pph_phrase_nth_dtr(extraction_target_dtr, (SubLObject)pph_methods_formulas.ZERO_INTEGER))) {
            new_head_dtr = pph_phrase.pph_phrase_copy(pph_phrase.pph_phrase_nth_dtr(extraction_target_dtr, (SubLObject)pph_methods_formulas.ZERO_INTEGER), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase.pph_phrase_set_category(new_head_dtr, pph_utilities.pph_np_category(), (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        else if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_npP(extraction_target_dtr)) {
            new_head_dtr = pph_phrase.pph_phrase_copy(extraction_target_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        else if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_ppP(extraction_target_dtr)) {
            final SubLObject obj_of_prep = pph_phrase.pph_phrase_extract_dtr_num((SubLObject)pph_methods_formulas.ONE_INTEGER, extraction_target_dtr);
            new_head_dtr = pph_phrase.pph_phrase_copy(obj_of_prep, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        else {
            final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_methods_formulas.$str223$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_methods_formulas.ONE_INTEGER), pph_methods_formulas.$str224$__, format_nil.format_nil_a_no_copy((SubLObject)pph_methods_formulas.$str380$Can_t_determine_relative_clause_h) });
            pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(extraction_target_dtr));
        }
        if (pph_methods_formulas.NIL != new_head_dtr) {
            pph_phrase.pph_phrase_set_category(new_head_dtr, pph_methods_formulas.$const381$Noun, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject head_agr_preds = pph_utilities.pph_filter_preds(agr_preds, (SubLObject)pph_methods_formulas.$list350, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject agr_constraint = pph_phrase.pph_phrase_agr_constraint_for_preds(head_agr_preds);
            pph_phrase.pph_phrase_set_agr(new_head_dtr, pph_data_structures.new_pph_phrase_agr(agr_constraint, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return new_head_dtr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 148292L)
    public static SubLObject update_relative_agrs_in_relative_clause_dtr(final SubLObject dtr, final SubLObject new_head_dtr, final SubLObject extraction_target_dtr) {
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(new_head_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            SubLObject cdolist_list_var = pph_utilities.pph_relative_agr_constraint_types();
            SubLObject constraint_type = (SubLObject)pph_methods_formulas.NIL;
            constraint_type = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                if (extraction_target_dtr.eql(pph_phrase.pph_phrase_agr_target_of_type(dtr, constraint_type))) {
                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str382$Updating__S_of__S___to__S, constraint_type, dtr, new_head_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    pph_phrase.pph_phrase_set_agr_constraint(dtr, pph_utilities.new_pph_agr_constraint(constraint_type, new_head_dtr), (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint_type = cdolist_list_var.first();
            }
        }
        return new_head_dtr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 149094L)
    public static SubLObject pph_subj_rel_clause_template_ok_for_copula_removalP(final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL == pph_methods_formulas.$pph_allow_copula_removalP$.getDynamicValue(thread)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (!pph_phrase.pph_phrase_wu(pph_phrase.pph_phrase_nth_dtr(template, (SubLObject)pph_methods_formulas.ONE_INTEGER), (SubLObject)pph_methods_formulas.UNPROVIDED).eql(pph_methods_formulas.$const383$Be_TheWord)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL != list_utilities.lengthG(pph_phrase.pph_phrase_dtrs(template), (SubLObject)pph_methods_formulas.THREE_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL == pph_utilities.pph_npP(pph_phrase.pph_phrase_find_or_set_category(pph_phrase.pph_phrase_nth_dtr(template, (SubLObject)pph_methods_formulas.TWO_INTEGER)))) {
            return (SubLObject)pph_methods_formulas.T;
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 149506L)
    public static SubLObject pph_subj_rel_clause_from_genformat(final SubLObject head_arg_num, final SubLObject embedded_sentence, final SubLObject fn, final SubLObject template, final SubLObject subcol_naut, SubLObject arg_position_map) {
        if (arg_position_map == pph_methods_formulas.UNPROVIDED) {
            arg_position_map = pph_utilities.pph_new_empty_map();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject format_string = get_genformat_string_and_list(template);
        final SubLObject arg_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject output_list = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject arg_list_processing_result = process_genformat_arglist(embedded_sentence, fn, cycl_utilities.formula_args(embedded_sentence, (SubLObject)pph_methods_formulas.UNPROVIDED), arg_list, arg_position_map, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject head_arg_string = (SubLObject)pph_methods_formulas.NIL;
        SubLObject head_pred = (SubLObject)pph_methods_formulas.NIL;
        SubLObject head_arg_justification = (SubLObject)pph_methods_formulas.NIL;
        SubLObject head_arg_olist = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != list_utilities.proper_list_p(arg_list_processing_result)) {
            assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p(pph_utilities.paraphrase_precision_for_arg((SubLObject)pph_methods_formulas.ONE_INTEGER, subcol_naut)) : pph_utilities.paraphrase_precision_for_arg((SubLObject)pph_methods_formulas.ONE_INTEGER, subcol_naut);
            final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
            try {
                pph_vars.$paraphrase_precision$.bind(pph_utilities.paraphrase_precision_for_arg((SubLObject)pph_methods_formulas.ONE_INTEGER, subcol_naut), thread);
                final SubLObject head_arg_position = (SubLObject)ConsesLow.list(head_arg_num);
                final SubLObject head_arg_position_template = pph_utilities.pph_cycl_template_from_arg_position(head_arg_position);
                final SubLObject head_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, head_arg_position_template);
                thread.resetMultipleValues();
                final SubLObject head_arg_string_$96 = pph_main.pph_phrase_generate_string_from_cycl(cycl_utilities.formula_arg(embedded_sentence, head_arg_num, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.$list78, head_map);
                final SubLObject head_pred_$97 = thread.secondMultipleValue();
                final SubLObject head_arg_justification_$98 = thread.thirdMultipleValue();
                final SubLObject head_arg_olist_$99 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                head_arg_string = head_arg_string_$96;
                head_pred = head_pred_$97;
                head_arg_justification = head_arg_justification_$98;
                head_arg_olist = head_arg_olist_$99;
            }
            finally {
                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
            }
            final SubLObject all_arg_olists = arg_list_processing_result;
            final SubLObject non_head_arg_olists = all_arg_olists.rest();
            final SubLObject embedded_arg0 = cycl_utilities.formula_arg0(embedded_sentence);
            final SubLObject _prev_bind_2 = pph_vars.$pph_current_arg0$.currentBinding(thread);
            try {
                pph_vars.$pph_current_arg0$.bind(embedded_arg0, thread);
                format_string = pph_subj_rel_clause_adjust_format_string(format_string);
                output_list = pph_output_list_from_format_string_and_args(format_string, embedded_arg0, (SubLObject)ConsesLow.cons(head_arg_olist, non_head_arg_olists), arg_position_map);
            }
            finally {
                pph_vars.$pph_current_arg0$.rebind(_prev_bind_2, thread);
            }
        }
        return Values.values(output_list, head_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 151369L)
    public static SubLObject pph_subj_rel_clause_adjust_format_string(SubLObject format_string) {
        final SubLObject format_string_rest = string_utilities.pre_remove(format_string, (SubLObject)pph_methods_formulas.$str384$_a_, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject format_strings_rest = string_utilities.string_tokenize(format_string_rest, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != list_utilities.lengthG(format_strings_rest, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != string_utilities.starts_with(format_string_rest, (SubLObject)pph_methods_formulas.$str385$is_) && pph_methods_formulas.NIL == pph_variable_handling.pph_string_is_posP(conses_high.second(format_strings_rest), pph_methods_formulas.$const386$Determiner, (SubLObject)pph_methods_formulas.$kw387$NEVER, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL == pph_variable_handling.pph_string_is_posP(conses_high.second(format_strings_rest), pph_methods_formulas.$const388$Adverb, (SubLObject)pph_methods_formulas.$kw387$NEVER, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL == pph_variable_handling.pph_string_is_posP(conses_high.second(format_strings_rest), pph_methods_formulas.$const389$Adjective, (SubLObject)pph_methods_formulas.$kw387$NEVER, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            format_string = Sequences.cconcatenate((SubLObject)pph_methods_formulas.$str384$_a_, string_utilities.pre_remove(format_string_rest, (SubLObject)pph_methods_formulas.$str385$is_, (SubLObject)pph_methods_formulas.UNPROVIDED));
        }
        else {
            format_string = Sequences.cconcatenate((SubLObject)pph_methods_formulas.$str390$_a_that_, format_string_rest);
        }
        return format_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 152112L)
    public static SubLObject pph_template_ok_for_rel_clauseP(final SubLObject head_arg_num, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != assertion_handles.assertion_p(template)) {
            thread.resetMultipleValues();
            final SubLObject template_string = get_genformat_string_and_list(template);
            final SubLObject arg_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return (SubLObject)SubLObjectFactory.makeBoolean(((head_arg_num.eql((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == arg_list) || arg_list.first().eql(head_arg_num)) && pph_methods_formulas.NIL != genformat_string_arg_initialP(template_string) && pph_methods_formulas.NIL != conses_high.member(pph_methods_formulas.$const391$thirdPersonSg_Present, pph_preds_of_string(conses_high.second(string_utilities.split_string(template_string, (SubLObject)pph_methods_formulas.UNPROVIDED))), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
        }
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(template, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject cycl_template = pph_utilities.pph_cycl_template_from_arg_position((SubLObject)ConsesLow.list(head_arg_num));
            return pph_phrase_has_extractible_dtr_with_cyclP(template, cycl_template);
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 152980L)
    public static SubLObject pph_preds_of_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject local_state = pph_macros.find_or_create_pph_external_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$100 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                try {
                    lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                    preds = lexicon_utilities.preds_of_string(string, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                finally {
                    lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$100, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$101 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 153228L)
    public static SubLObject pph_phrase_has_extractible_dtr_with_cyclP(final SubLObject phrase, final SubLObject cycl) {
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL == pph_phrase.pph_conditional_phrase_p(phrase)) {
            return list_utilities.sublisp_boolean(pph_phrase_find_extractible_dtr_with_cycl(phrase, cycl));
        }
        SubLObject current;
        final SubLObject datum = current = pph_phrase.pph_conditional_phrase_values(phrase);
        SubLObject phrase_if = (SubLObject)pph_methods_formulas.NIL;
        SubLObject phrase_if_not = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list392);
        phrase_if = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list392);
        phrase_if_not = current.first();
        current = current.rest();
        if (pph_methods_formulas.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != pph_phrase_has_extractible_dtr_with_cyclP(phrase_if, cycl) && pph_methods_formulas.NIL != pph_phrase_has_extractible_dtr_with_cyclP(phrase_if_not, cycl));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list392);
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 153809L)
    public static SubLObject pph_phrase_find_extractible_dtr_with_cycl(final SubLObject phrase, final SubLObject cycl) {
        SubLObject extractible_dtr = (SubLObject)pph_methods_formulas.NIL;
        SubLObject extractible_dtr_num = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            pph_phrase_resolution.pph_phrase_resolve_condition(phrase, cycl, (SubLObject)pph_methods_formulas.NIL);
        }
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            if (pph_methods_formulas.NIL == pph_phrase.pph_conditional_phrase_p(phrase)) {
                SubLObject dtr_num = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = (SubLObject)pph_methods_formulas.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject dtr;
                    SubLObject first_dtr;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_methods_formulas.NIL, v_iteration = (SubLObject)pph_methods_formulas.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                        element_num = ((pph_methods_formulas.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_methods_formulas.ONE_INTEGER) : v_iteration);
                        dtr = Vectors.aref(vector_var, element_num);
                        if (pph_methods_formulas.NIL == extractible_dtr) {
                            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_npP(dtr) && cycl.equal(pph_phrase.pph_phrase_cycl(dtr, (SubLObject)pph_methods_formulas.UNPROVIDED))) {
                                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str393$Found_extractible_dtr______S, dtr, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                }
                                extractible_dtr = dtr;
                                extractible_dtr_num = dtr_num;
                            }
                            else if (dtr_num.eql((SubLObject)pph_methods_formulas.ZERO_INTEGER) && pph_methods_formulas.NIL != pph_phrase.pph_phrase_npP(dtr) && pph_methods_formulas.NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
                                first_dtr = pph_phrase.pph_phrase_nth_dtr(dtr, (SubLObject)pph_methods_formulas.ZERO_INTEGER);
                                if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_possessiveP(first_dtr) && cycl.equal(pph_phrase.pph_phrase_cycl(first_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED))) {
                                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str393$Found_extractible_dtr______S, dtr, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    }
                                    extractible_dtr = dtr;
                                    extractible_dtr_num = dtr_num;
                                }
                            }
                            else if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_ppP(dtr) && pph_methods_formulas.NIL != pph_phrase_has_extractible_dtr_with_cyclP(dtr, cycl)) {
                                extractible_dtr = dtr;
                                extractible_dtr_num = dtr_num;
                            }
                        }
                        dtr_num = Numbers.add(dtr_num, (SubLObject)pph_methods_formulas.ONE_INTEGER);
                    }
                }
            }
        }
        return Values.values(extractible_dtr, extractible_dtr_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 155202L)
    public static SubLObject pph_phrase_cycl_containsP(final SubLObject phrase, final SubLObject item, SubLObject penetrate_hl_structuresP, SubLObject test, SubLObject key) {
        if (penetrate_hl_structuresP == pph_methods_formulas.UNPROVIDED) {
            penetrate_hl_structuresP = (SubLObject)pph_methods_formulas.NIL;
        }
        if (test == pph_methods_formulas.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL);
        }
        if (key == pph_methods_formulas.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)pph_methods_formulas.IDENTITY);
        }
        if (pph_methods_formulas.NIL != cycl_utilities.expression_find(item, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), penetrate_hl_structuresP, test, key)) {
            return (SubLObject)pph_methods_formulas.T;
        }
        SubLObject foundP = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == foundP) {
            SubLObject csome_list_var;
            SubLObject dtr;
            for (csome_list_var = pph_phrase.pph_phrase_dtr_list(phrase), dtr = (SubLObject)pph_methods_formulas.NIL, dtr = csome_list_var.first(); pph_methods_formulas.NIL == foundP && pph_methods_formulas.NIL != csome_list_var; foundP = pph_phrase_cycl_containsP(dtr, item, penetrate_hl_structuresP, test, key), csome_list_var = csome_list_var.rest(), dtr = csome_list_var.first()) {}
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 155758L)
    public static SubLObject generate_phrase_naut(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abortP = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(pph_vars.$pph_language_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str396$__In_GENERATE_PHRASE_NAUT___, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str397$__Precision_is__S___, pph_utilities.pph_current_precision(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            final SubLObject phrase_naut = pph_templates.pph_expand_phrase_nauts(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED));
            final SubLObject old_agr = pph_phrase.pph_phrase_agr(phrase);
            final SubLObject v_pph_phrase = pph_phrase.new_pph_phrase_for_cycl(phrase_naut, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            abortP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == pph_phrase.pph_phrase_p(v_pph_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED));
            if (pph_methods_formulas.NIL == abortP) {
                pph_phrase.pph_phrase_copy(v_pph_phrase, phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_agr(phrase)) {
                    pph_phrase.pph_phrase_set_agr(phrase, old_agr, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (pph_methods_formulas.NIL == abortP) {
            do_generate_phrase_from_template(phrase);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 156597L)
    public static SubLObject generate_specified_scope_sentence(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.$list272, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject rmp_formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject rmp = cycl_utilities.formula_arg0(rmp_formula);
            final SubLObject unambiguousP = scopally_unambiguousP(rmp);
            if (pph_methods_formulas.NIL != kb_indexing_datastructures.indexed_term_p(rmp)) {
                final SubLObject wide_scope_argnum = wide_scope_arg_in_pred(rmp);
                final SubLObject new_sent_template = intermediate_cycl_template_for_rmp_formula(rmp_formula);
                final SubLObject plural_subjectP = (SubLObject)pph_methods_formulas.NIL;
                if (pph_methods_formulas.NIL == pph_utilities.pph_identity_template_p(new_sent_template)) {
                    final SubLObject spec_scope_phrase = pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    pph_phrase.pph_phrase_reset_cycl(spec_scope_phrase, new_sent_template);
                    final SubLObject new_sent = pph_phrase.pph_phrase_cycl(spec_scope_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str400$__Replacing_rule_macro_formula___, rmp_formula, new_sent, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p(pph_utilities.pph_current_precision()) : pph_utilities.pph_current_precision();
                    final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
                    try {
                        pph_vars.$paraphrase_precision$.bind(pph_utilities.pph_current_precision(), thread);
                        pph_utilities.pph_reset_precision(new_sent_template);
                        pph_phrase_generate_with_proper_scope(spec_scope_phrase, new_sent, wide_scope_argnum, plural_subjectP, unambiguousP);
                    }
                    finally {
                        pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
                    }
                    if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(spec_scope_phrase)) {
                        final SubLObject original_map = pph_phrase.pph_phrase_arg_position_map(phrase);
                        pph_add_arg0_links_for_specified_scope_phrase(spec_scope_phrase, rmp, original_map);
                        pph_phrase.pph_phrase_copy(spec_scope_phrase, phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                }
                if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase) && pph_methods_formulas.NIL == unambiguousP) {
                    final SubLObject info = pph_types.pph_method_info((SubLObject)pph_methods_formulas.$sym297$GENERATE_IMPLICATION_SMART, (SubLObject)pph_methods_formulas.$kw298$IMPLICATION);
                    pph_types.pph_deregister_method_info((SubLObject)pph_methods_formulas.$sym297$GENERATE_IMPLICATION_SMART, info);
                    try {
                        generate_rmp_sentence_via_expansion(phrase);
                    }
                    finally {
                        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            pph_types.pph_register_method_info((SubLObject)pph_methods_formulas.$sym297$GENERATE_IMPLICATION_SMART, info);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
            }
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str401$__GENERATE_SPECIFIED_SCOPE_SENTEN, pph_phrase.pph_phrase_string(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 158484L)
    public static SubLObject pph_add_arg0_links_for_specified_scope_phrase(final SubLObject spec_scope_phrase, final SubLObject rmp, final SubLObject map) {
        final SubLObject arg0_pos = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list100, map);
        SubLObject cdolist_list_var = pph_phrase.pph_phrase_output_list(spec_scope_phrase);
        SubLObject item = (SubLObject)pph_methods_formulas.NIL;
        item = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            if (pph_methods_formulas.NIL == pph_data_structures.pph_phrase_output_item_arg_position(item) && pph_methods_formulas.NIL == pph_data_structures.pph_phrase_output_item_cycl(item)) {
                pph_data_structures.pph_phrase_output_item_set_arg_position(item, arg0_pos);
                pph_data_structures.pph_phrase_output_item_set_cycl(item, rmp);
                pph_phrase.pph_phrase_output_item_maybe_add_anchor_tags(item, rmp);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return pph_phrase.pph_phrase_output_list(spec_scope_phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 159143L)
    public static SubLObject generate_rmp_sentence_via_expansion(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
        assert pph_methods_formulas.NIL != pph_utilities.pph_precision_p((SubLObject)pph_methods_formulas.T) : pph_methods_formulas.T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind((SubLObject)pph_methods_formulas.T, thread);
            pph_vars.$pph_ambiguous_strings$.bind((pph_methods_formulas.NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread)) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUALP), (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
            pph_utilities.pph_phrase_rephrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        final SubLObject expanded_sent = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (!expanded_sent.equal(original_cycl) && pph_methods_formulas.NIL == cycl_utilities.expression_find_if((SubLObject)pph_methods_formulas.$sym404$COMMON_NON_SKOLEM_INDETERMINATE_TERM_DENOTING_FUNCTION_, expanded_sent, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str405$Replacing_rule_macro_formula____S, original_cycl, expanded_sent, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            final SubLObject _prev_bind_3 = pph_vars.$pph_var_types$.currentBinding(thread);
            try {
                pph_vars.$pph_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                final SubLObject _prev_bind_0_$102 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                final SubLObject _prev_bind_4 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                final SubLObject _prev_bind_5 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                try {
                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                    pph_vars.$pph_noted_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL), (SubLObject)pph_methods_formulas.SIXTEEN_INTEGER), thread);
                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    try {
                        if (pph_methods_formulas.NIL != el_utilities.el_implication_p(expanded_sent)) {
                            SubLObject cdolist_list_var = pph_utilities.pph_vars_to_quantify(expanded_sent);
                            SubLObject free_var = (SubLObject)pph_methods_formulas.NIL;
                            free_var = cdolist_list_var.first();
                            while (pph_methods_formulas.NIL != cdolist_list_var) {
                                pph_variable_handling.pph_register_var_quantifier(free_var, (SubLObject)pph_methods_formulas.$kw271$EXISTENTIAL);
                                cdolist_list_var = cdolist_list_var.rest();
                                free_var = cdolist_list_var.first();
                            }
                        }
                        pph_main.pph_phrase_generate(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            final SubLObject local_vars = conses_high.set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            pph_macros.pph_handle_local_vars(local_vars);
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                        }
                    }
                }
                finally {
                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_5, thread);
                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_4, thread);
                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$102, thread);
                }
            }
            finally {
                pph_vars.$pph_var_types$.rebind(_prev_bind_3, thread);
            }
        }
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
            final SubLObject current_arg0 = cycl_utilities.formula_arg0(original_cycl);
            final SubLObject current_arg0_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list100, map);
            final SubLObject justs = pph_phrase.pph_phrase_justification(phrase);
            SubLObject expansion_justs = (SubLObject)pph_methods_formulas.NIL;
            SubLObject cdolist_list_var2 = justs;
            SubLObject just = (SubLObject)pph_methods_formulas.NIL;
            just = cdolist_list_var2.first();
            while (pph_methods_formulas.NIL != cdolist_list_var2) {
                if (pph_methods_formulas.NIL != assertion_handles.assertion_p(just) && pph_methods_formulas.NIL != assertions_high.gaf_assertionP(just) && assertions_high.gaf_arg0(just).eql(pph_methods_formulas.$const406$expansion) && assertions_high.gaf_arg1(just).eql(current_arg0)) {
                    expansion_justs = (SubLObject)ConsesLow.cons(just, expansion_justs);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                just = cdolist_list_var2.first();
            }
            cdolist_list_var2 = pph_phrase.pph_phrase_output_list(phrase);
            SubLObject item = (SubLObject)pph_methods_formulas.NIL;
            item = cdolist_list_var2.first();
            while (pph_methods_formulas.NIL != cdolist_list_var2) {
                if (pph_data_structures.pph_phrase_output_item_arg_position(item).equal(current_arg0_position) && !pph_data_structures.pph_phrase_output_item_cycl(item).equal(current_arg0)) {
                    pph_data_structures.pph_phrase_output_item_set_cycl(item, current_arg0);
                    pph_data_structures.pph_phrase_output_item_set_arg_position(item, current_arg0_position);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                item = cdolist_list_var2.first();
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 160828L)
    public static SubLObject pph_phrase_generate_with_proper_scope(final SubLObject phrase, final SubLObject intermediate_cycl_formula, final SubLObject wide_scope_argnum, final SubLObject plural_subjectP, final SubLObject unambiguousP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str407$__Looking_for_a_template_for__S__, intermediate_cycl_formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        pph_phrase_generate_with_proper_scopeXpred(phrase, intermediate_cycl_formula, (SubLObject)pph_methods_formulas.NIL, wide_scope_argnum, plural_subjectP, unambiguousP);
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            if (pph_methods_formulas.NIL != unambiguousP) {
                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str408$Abandoning_search_because__S_is_u, intermediate_cycl_formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
            }
            else {
                final SubLObject original_pred = cycl_utilities.formula_arg0(intermediate_cycl_formula);
                SubLObject doneP = (SubLObject)pph_methods_formulas.NIL;
                final SubLObject tgps = pph_utilities.pph_typed_genl_preds(original_pred, (SubLObject)pph_methods_formulas.UNPROVIDED);
                SubLObject search_level = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
                final SubLObject search_limit = pph_utilities.pph_search_limit();
                if (pph_methods_formulas.NIL == doneP) {
                    SubLObject csome_list_var = tgps;
                    SubLObject tgp = (SubLObject)pph_methods_formulas.NIL;
                    tgp = csome_list_var.first();
                    while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var) {
                        final SubLObject formula = el_utilities.replace_formula_arg((SubLObject)pph_methods_formulas.ZERO_INTEGER, tgp, intermediate_cycl_formula);
                        pph_phrase_generate_with_proper_scopeXpred(phrase, formula, (SubLObject)pph_methods_formulas.NIL, wide_scope_argnum, plural_subjectP, unambiguousP);
                        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                            pph_phrase_adjust_arg0_links(phrase, tgp, original_pred);
                            doneP = (SubLObject)pph_methods_formulas.T;
                        }
                        else if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str409$__No_template_found_for__S___, tgp, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        csome_list_var = csome_list_var.rest();
                        tgp = csome_list_var.first();
                    }
                }
                if (pph_methods_formulas.NIL == doneP) {
                    final SubLObject module = sbhl_module_vars.get_sbhl_module(pph_methods_formulas.$const109$genlPreds);
                    final SubLObject node_var = original_pred;
                    final SubLObject deck_type = (SubLObject)((pph_methods_formulas.$kw111$DEPTH == pph_methods_formulas.$kw111$DEPTH) ? pph_methods_formulas.$kw112$STACK : pph_methods_formulas.$kw113$QUEUE);
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = (SubLObject)pph_methods_formulas.NIL;
                    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$104 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = pph_methods_formulas.$const114$True_JustificationTruth;
                                final SubLObject _prev_bind_0_$105 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$106 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind((pph_methods_formulas.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((pph_methods_formulas.NIL != tv_var) ? pph_methods_formulas.$sym115$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                    if (pph_methods_formulas.NIL != tv_var && pph_methods_formulas.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && pph_methods_formulas.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql((SubLObject)pph_methods_formulas.$kw116$ERROR)) {
                                            sbhl_paranoia.sbhl_error((SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$str117$_A_is_not_a__A, tv_var, (SubLObject)pph_methods_formulas.$sym118$SBHL_TRUE_TV_P, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)pph_methods_formulas.$kw119$CERROR)) {
                                            sbhl_paranoia.sbhl_cerror((SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$str120$continue_anyway, (SubLObject)pph_methods_formulas.$str117$_A_is_not_a__A, tv_var, (SubLObject)pph_methods_formulas.$sym118$SBHL_TRUE_TV_P, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                        }
                                        else if (pcase_var.eql((SubLObject)pph_methods_formulas.$kw121$WARN)) {
                                            Errors.warn((SubLObject)pph_methods_formulas.$str117$_A_is_not_a__A, tv_var, (SubLObject)pph_methods_formulas.$sym118$SBHL_TRUE_TV_P);
                                        }
                                        else {
                                            Errors.warn((SubLObject)pph_methods_formulas.$str122$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror((SubLObject)pph_methods_formulas.$str120$continue_anyway, (SubLObject)pph_methods_formulas.$str117$_A_is_not_a__A, tv_var, (SubLObject)pph_methods_formulas.$sym118$SBHL_TRUE_TV_P);
                                        }
                                    }
                                    final SubLObject _prev_bind_0_$106 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$107 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$109 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_methods_formulas.NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                        if (pph_methods_formulas.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || pph_methods_formulas.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(original_pred, sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED))) {
                                            final SubLObject _prev_bind_0_$107 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$108 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$110 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)pph_methods_formulas.NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(original_pred, sbhl_search_vars.genl_inverse_mode_p()); pph_methods_formulas.NIL != node_and_predicate_mode && pph_methods_formulas.NIL == doneP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                    final SubLObject node_var_$113 = node_and_predicate_mode.first();
                                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                                    final SubLObject genl_pred = node_var_$113;
                                                    final SubLObject _prev_bind_0_$108 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                        final SubLObject inverseP = predicate_mode;
                                                        if (!original_pred.eql(genl_pred)) {
                                                            if (pph_methods_formulas.NIL == conses_high.member(genl_pred, tgps, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                if (search_level.numGE(search_limit)) {
                                                                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                                                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str410$__Search_limit_exceeded___, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                    }
                                                                    doneP = (SubLObject)pph_methods_formulas.T;
                                                                }
                                                                else {
                                                                    final SubLObject formula2 = el_utilities.replace_formula_arg((SubLObject)pph_methods_formulas.ZERO_INTEGER, genl_pred, intermediate_cycl_formula);
                                                                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                                                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str411$__Search_level_is__S_of__S__, search_level, search_limit, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                    }
                                                                    pph_phrase_generate_with_proper_scopeXpred(phrase, formula2, inverseP, wide_scope_argnum, plural_subjectP, unambiguousP);
                                                                    if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                                                                        pph_phrase_adjust_arg0_links(phrase, genl_pred, original_pred);
                                                                        doneP = (SubLObject)pph_methods_formulas.T;
                                                                    }
                                                                    else {
                                                                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                                                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str409$__No_template_found_for__S___, genl_pred, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                        }
                                                                        search_level = Numbers.add(search_level, (SubLObject)pph_methods_formulas.ONE_INTEGER);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                        SubLObject rest;
                                                        SubLObject module_var;
                                                        SubLObject _prev_bind_0_$109;
                                                        SubLObject _prev_bind_1_$109;
                                                        SubLObject node;
                                                        SubLObject d_link;
                                                        SubLObject mt_links;
                                                        SubLObject iteration_state;
                                                        SubLObject mt;
                                                        SubLObject tv_links;
                                                        SubLObject _prev_bind_0_$110;
                                                        SubLObject iteration_state_$118;
                                                        SubLObject tv;
                                                        SubLObject link_nodes;
                                                        SubLObject _prev_bind_0_$111;
                                                        SubLObject sol;
                                                        SubLObject set_contents_var;
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject node_vars_link_node;
                                                        SubLObject csome_list_var2;
                                                        SubLObject node_vars_link_node2;
                                                        SubLObject new_list;
                                                        SubLObject rest_$120;
                                                        SubLObject generating_fn;
                                                        SubLObject _prev_bind_0_$112;
                                                        SubLObject sol2;
                                                        SubLObject link_nodes2;
                                                        SubLObject set_contents_var2;
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject node_vars_link_node3;
                                                        SubLObject csome_list_var3;
                                                        SubLObject node_vars_link_node4;
                                                        for (rest = (SubLObject)pph_methods_formulas.NIL, rest = accessible_modules; pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != rest; rest = rest.rest()) {
                                                            module_var = rest.first();
                                                            _prev_bind_0_$109 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$109 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((pph_methods_formulas.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                                node = function_terms.naut_to_nart(node_var_$113);
                                                                if (pph_methods_formulas.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED));
                                                                    if (pph_methods_formulas.NIL != d_link) {
                                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED));
                                                                        if (pph_methods_formulas.NIL != mt_links) {
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (pph_methods_formulas.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    _prev_bind_0_$110 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        for (iteration_state_$118 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$118); iteration_state_$118 = dictionary_contents.do_dictionary_contents_next(iteration_state_$118)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$118);
                                                                                            link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (pph_methods_formulas.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                _prev_bind_0_$111 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    sol = link_nodes;
                                                                                                    if (pph_methods_formulas.NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)pph_methods_formulas.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if (pph_methods_formulas.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && pph_methods_formulas.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else if (sol.isList()) {
                                                                                                        if (pph_methods_formulas.NIL == doneP) {
                                                                                                            csome_list_var2 = sol;
                                                                                                            node_vars_link_node2 = (SubLObject)pph_methods_formulas.NIL;
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                            while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var2) {
                                                                                                                if (pph_methods_formulas.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                }
                                                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    else {
                                                                                                        Errors.error((SubLObject)pph_methods_formulas.$str123$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }
                                                                                                }
                                                                                                finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$111, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$118);
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$110, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    }
                                                                    else {
                                                                        sbhl_paranoia.sbhl_error((SubLObject)pph_methods_formulas.FIVE_INTEGER, (SubLObject)pph_methods_formulas.$str124$attempting_to_bind_direction_link, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                    }
                                                                }
                                                                else if (pph_methods_formulas.NIL != obsolete.cnat_p(node, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                    new_list = ((pph_methods_formulas.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED)));
                                                                    for (rest_$120 = (SubLObject)pph_methods_formulas.NIL, rest_$120 = new_list; pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != rest_$120; rest_$120 = rest_$120.rest()) {
                                                                        generating_fn = rest_$120.first();
                                                                        _prev_bind_0_$112 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                            if (pph_methods_formulas.NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)pph_methods_formulas.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if (pph_methods_formulas.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && pph_methods_formulas.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            }
                                                                            else if (sol2.isList()) {
                                                                                if (pph_methods_formulas.NIL == doneP) {
                                                                                    csome_list_var3 = sol2;
                                                                                    node_vars_link_node4 = (SubLObject)pph_methods_formulas.NIL;
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                    while (pph_methods_formulas.NIL == doneP && pph_methods_formulas.NIL != csome_list_var3) {
                                                                                        if (pph_methods_formulas.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                    }
                                                                                }
                                                                            }
                                                                            else {
                                                                                Errors.error((SubLObject)pph_methods_formulas.$str123$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$112, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$109, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$109, thread);
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$108, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$110, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$108, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$107, thread);
                                            }
                                        }
                                        else {
                                            sbhl_paranoia.sbhl_warn((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.$str125$Node__a_does_not_pass_sbhl_type_t, original_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)pph_methods_formulas.UNPROVIDED)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$109, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$107, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$106, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$106, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$105, thread);
                                }
                            }
                            finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$104, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 163287L)
    public static SubLObject pph_phrase_adjust_arg0_links(final SubLObject phrase, final SubLObject bad_arg0, final SubLObject good_arg0) {
        final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
        final SubLObject arg0_pos = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list100, map);
        SubLObject cdolist_list_var = pph_phrase.pph_phrase_output_list(phrase);
        SubLObject item = (SubLObject)pph_methods_formulas.NIL;
        item = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            if (pph_data_structures.pph_phrase_output_item_arg_position(item).equal(arg0_pos) && pph_data_structures.pph_phrase_output_item_cycl(item).equal(bad_arg0)) {
                pph_data_structures.pph_phrase_output_item_set_cycl(item, good_arg0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 163943L)
    public static SubLObject scopally_unambiguousP_internal(final SubLObject rmp) {
        final SubLObject unambiguousP = list_utilities.singletonP(quant_over_arg_tuples(rmp));
        if (pph_methods_formulas.NIL != unambiguousP && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str413$___S_is_not_ambiguous_with_respec, rmp, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return unambiguousP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 163943L)
    public static SubLObject scopally_unambiguousP(final SubLObject rmp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == v_memoization_state) {
            return scopally_unambiguousP_internal(rmp);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_methods_formulas.$sym412$SCOPALLY_UNAMBIGUOUS_, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_methods_formulas.$sym412$SCOPALLY_UNAMBIGUOUS_, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$int414$212, (SubLObject)pph_methods_formulas.EQL, (SubLObject)pph_methods_formulas.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_methods_formulas.$sym412$SCOPALLY_UNAMBIGUOUS_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rmp, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(scopally_unambiguousP_internal(rmp)));
            memoization_state.caching_state_put(caching_state, rmp, results, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 164406L)
    public static SubLObject pph_phrase_generate_with_proper_scopeXpred(final SubLObject phrase, final SubLObject formula, final SubLObject inverseP, final SubLObject wide_scope_argnum, final SubLObject plural_subjectP, final SubLObject unambiguousP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var_types_shadow = dictionary_utilities.copy_dictionary(pph_vars.$pph_var_types$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$pph_var_types_counter$.currentBinding(thread);
        try {
            pph_vars.$pph_noted_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL), (SubLObject)pph_methods_formulas.SIXTEEN_INTEGER), thread);
            pph_macros.$pph_var_types_counter$.bind(number_utilities.f_1X(pph_macros.$pph_var_types_counter$.getDynamicValue(thread)), thread);
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str415$__Entering_PPH_SETTING_VAR_TYPES_, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            try {
                final SubLObject _prev_bind_0_$123 = pph_vars.$pph_var_types$.currentBinding(thread);
                try {
                    pph_vars.$pph_var_types$.bind(var_types_shadow, thread);
                    final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
                    final SubLObject solution = find_proper_scope_gentemplate_phrase(formula, inverseP, wide_scope_argnum, unambiguousP, arg_position_map);
                    if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(solution, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str416$__Paraphrasing_formula__S__, pph_phrase.pph_phrase_cycl(solution, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        pph_phrase.pph_phrase_add_agr_preds(solution, pph_phrase.pph_phrase_absolute_agr_preds(phrase), (SubLObject)pph_methods_formulas.UNPROVIDED);
                        do_generate_phrase_from_template(solution);
                        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(solution)) {
                            pph_phrase.pph_phrase_copy(solution, phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                    }
                    else if (solution == pph_methods_formulas.$kw417$GEN_FORMAT && pph_methods_formulas.NIL == plural_subjectP) {
                        final SubLObject genformat = some_proper_scope_genformat(formula, inverseP, wide_scope_argnum, unambiguousP);
                        if (pph_methods_formulas.NIL != genformat) {
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str418$__Found_assertion__S_for_formula_, genformat, formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            pph_phrase.pph_phrase_set_cycl(phrase, formula);
                            pph_phrase.pph_phrase_add_justification(phrase, genformat);
                            final SubLObject genformat_result = generate_atomic_formula_from_genformat(formula, genformat, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_non_empty_output_list_p(genformat_result)) {
                                pph_phrase.pph_phrase_set_output_list(phrase, genformat_result, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                pph_phrase.pph_phrase_note_done(phrase);
                            }
                        }
                    }
                }
                finally {
                    pph_vars.$pph_var_types$.rebind(_prev_bind_0_$123, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$124 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str419$__Leaving_PPH_SETTING_VAR_TYPES_I, pph_macros.$pph_var_types_counter$.getDynamicValue(thread), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase)) {
                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str420$___Output_list___S__, pph_phrase.pph_phrase_output_list(phrase), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str421$___Setting__S_to____S, pph_vars.$pph_var_types$.getDynamicValue(thread), dictionary.dictionary_values(var_types_shadow), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        pph_macros.pph_reset_var_types(var_types_shadow);
                    }
                    else if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str422$___Leaving__PPH_VAR_TYPES___S, dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$124, thread);
                }
            }
        }
        finally {
            pph_macros.$pph_var_types_counter$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_noted_var_types$.rebind(_prev_bind_0, thread);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 165921L)
    public static SubLObject wide_scope_arg_in_pred(final SubLObject rmp) {
        final SubLObject wide_scope_argnum = specified_wide_scope_argnum(rmp);
        return (SubLObject)((pph_methods_formulas.NIL != wide_scope_argnum) ? associated_arg_in_pred(rmp, wide_scope_argnum) : pph_methods_formulas.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 166312L)
    public static SubLObject specified_wide_scope_argnum(final SubLObject pred) {
        return kb_mapping_utilities.fpred_value_in_any_mt(pred, pph_methods_formulas.$const423$generateArgWithOutsideScope, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 166519L)
    public static SubLObject associated_arg_in_pred(final SubLObject rmp, final SubLObject arg) {
        return conses_high.second(conses_high.assoc(arg, arg_mapping_tuples(rmp), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 166817L)
    public static SubLObject arg_mapping_tuples(final SubLObject rmp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != constant_handles.valid_constantP(constants_high.find_constant((SubLObject)pph_methods_formulas.$str424$relatedArgPositions), (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
            ans = kb_mapping_utilities.pred_value_tuples_in_any_mt(rmp, pph_methods_formulas.$const425$relatedArgPositions, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$list426, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL == ans) {
                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_methods_formulas.$str427$Couldn_t_find___relatedArgPositio, rmp);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
            }
            else if (pph_methods_formulas.NIL == list_utilities.lengthE(ans, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)pph_methods_formulas.$str223$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)pph_methods_formulas.ONE_INTEGER), pph_methods_formulas.$str224$__, format_nil.format_nil_a_no_copy((SubLObject)pph_methods_formulas.$str428$Wrong_number_of___relatedArgPosit) });
                pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(rmp, Sequences.length(ans)));
            }
            return ans;
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 167432L)
    public static SubLObject intermediate_cycl_template_for_rmp_formula(final SubLObject formula) {
        final SubLObject rmp = cycl_utilities.formula_operator(formula);
        final SubLObject quant_tuples = ordered_quant_tuples(rmp);
        SubLObject args = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject pcase_var = Sequences.length(quant_tuples);
        if (pcase_var.eql((SubLObject)pph_methods_formulas.ZERO_INTEGER)) {
            return pph_utilities.pph_identity_template();
        }
        SubLObject cdolist_list_var = quant_tuples;
        SubLObject tuple = (SubLObject)pph_methods_formulas.NIL;
        tuple = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            if (tuple.first() == pph_methods_formulas.$kw429$ITSELF) {
                args = (SubLObject)ConsesLow.cons(at_utilities.get_generic_arg(conses_high.second(tuple)), args);
            }
            else {
                SubLObject current;
                final SubLObject datum = current = tuple;
                SubLObject quant_nl_attr = (SubLObject)pph_methods_formulas.NIL;
                SubLObject argnum = (SubLObject)pph_methods_formulas.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list430);
                quant_nl_attr = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list430);
                argnum = current.first();
                current = current.rest();
                if (pph_methods_formulas.NIL == current) {
                    if (quant_nl_attr.eql(pph_methods_formulas.$const313$Every_NLAttr) && pph_methods_formulas.NIL != cycl_variables.el_varP(cycl_utilities.formula_arg(formula, argnum, (SubLObject)pph_methods_formulas.UNPROVIDED)) && pph_methods_formulas.$kw240$NO == pph_variable_handling.pph_var_quantifier(cycl_utilities.formula_arg(formula, argnum, (SubLObject)pph_methods_formulas.UNPROVIDED))) {
                        quant_nl_attr = pph_methods_formulas.$const246$No_NLAttr;
                    }
                    args = (SubLObject)ConsesLow.cons(make_det_nbar(quant_nl_attr, at_utilities.get_generic_arg(argnum)), args);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list430);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return pph_templates.pph_expand_phrase_nauts(el_utilities.make_el_formula((SubLObject)pph_methods_formulas.$kw193$ARG1, Sequences.nreverse(args), (SubLObject)pph_methods_formulas.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 168477L)
    public static SubLObject make_det_nbar(final SubLObject det, SubLObject nbar) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_types.pph_set_nautP(nbar)) {
            final SubLObject subcol_naut = pph_set_to_subcollection(nbar);
            if (pph_methods_formulas.NIL != subcol_naut) {
                nbar = subcol_naut;
            }
        }
        if (det.eql(pph_methods_formulas.$const431$BareForm_NLAttr)) {
            return (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn_constrained(), pph_methods_formulas.$const432$nonSingular_Generic, nbar);
        }
        if (nbar.eql(pph_methods_formulas.$const433$Thing) && det.eql(pph_methods_formulas.$const313$Every_NLAttr)) {
            return pph_types.pph_phrase_naut_for_string((SubLObject)pph_methods_formulas.$str434$everything);
        }
        final SubLObject constraints = det_agr_constraints(det);
        SubLObject agr = (pph_methods_formulas.NIL != constraints) ? constraints.first() : pph_methods_formulas.$const209$nounStrings;
        if (pph_methods_formulas.NIL != pph_utilities.pph_genl_pos_predP(pph_methods_formulas.$const248$nonPlural_Generic, agr, pph_vars.$pph_language_mt$.getDynamicValue(thread))) {
            agr = pph_methods_formulas.$const248$nonPlural_Generic;
        }
        return (SubLObject)ConsesLow.list(pph_functions.bestdetnbarfn(), (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn(), det), (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn_constrained(), agr, nbar));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 169388L)
    public static SubLObject det_agr_constraints(final SubLObject det) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
            final SubLObject words = (SubLObject)((pph_methods_formulas.NIL != kb_indexing_datastructures.indexed_term_p(det)) ? kb_mapping_utilities.pred_values_in_any_mt(det, pph_methods_formulas.$const63$denotation, (SubLObject)pph_methods_formulas.FOUR_INTEGER, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED) : pph_methods_formulas.NIL);
            final SubLObject agrs = Sequences.remove_duplicates(list_utilities.mapappend((SubLObject)pph_methods_formulas.$sym435$AGREEMENT_LOOKUP, words), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            ans = genl_predicates.min_ceiling_predicates(agrs, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 169953L)
    public static SubLObject clear_quant_over_arg_tuples() {
        final SubLObject cs = pph_methods_formulas.$quant_over_arg_tuples_caching_state$.getGlobalValue();
        if (pph_methods_formulas.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 169953L)
    public static SubLObject remove_quant_over_arg_tuples(final SubLObject rmp) {
        return memoization_state.caching_state_remove_function_results_with_args(pph_methods_formulas.$quant_over_arg_tuples_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(rmp), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 169953L)
    public static SubLObject quant_over_arg_tuples_internal(final SubLObject rmp) {
        return (SubLObject)((pph_methods_formulas.NIL != kb_indexing_datastructures.indexed_term_p(rmp)) ? kb_mapping_utilities.pred_value_tuples_in_any_mt(rmp, pph_methods_formulas.$const437$generateQuantOverArg, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$list426, (SubLObject)pph_methods_formulas.UNPROVIDED) : pph_methods_formulas.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 169953L)
    public static SubLObject quant_over_arg_tuples(final SubLObject rmp) {
        SubLObject caching_state = pph_methods_formulas.$quant_over_arg_tuples_caching_state$.getGlobalValue();
        if (pph_methods_formulas.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)pph_methods_formulas.$sym436$QUANT_OVER_ARG_TUPLES, (SubLObject)pph_methods_formulas.$sym438$_QUANT_OVER_ARG_TUPLES_CACHING_STATE_, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.EQ, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.$int65$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, rmp, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(quant_over_arg_tuples_internal(rmp)));
            memoization_state.caching_state_put(caching_state, rmp, results, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 170190L)
    public static SubLObject ordered_quant_tuples(final SubLObject rmp) {
        final SubLObject arg_map = Sort.sort(arg_mapping_tuples(rmp), (SubLObject)pph_methods_formulas.$sym439$_, (SubLObject)pph_methods_formulas.$sym440$SECOND);
        final SubLObject unordered_quant_tuples = Mapping.mapcar((SubLObject)pph_methods_formulas.$sym441$REVERSE, quant_over_arg_tuples(rmp));
        SubLObject ordered_quant_tuples = (SubLObject)pph_methods_formulas.NIL;
        SubLObject cdolist_list_var = arg_map;
        SubLObject pair = (SubLObject)pph_methods_formulas.NIL;
        pair = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject in = (SubLObject)pph_methods_formulas.NIL;
            SubLObject out = (SubLObject)pph_methods_formulas.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list442);
            in = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list442);
            out = current.first();
            current = current.rest();
            if (pph_methods_formulas.NIL == current) {
                final SubLObject associated_tuple = conses_high.assoc(in, unordered_quant_tuples, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                ordered_quant_tuples = (SubLObject)ConsesLow.cons((SubLObject)((pph_methods_formulas.NIL != associated_tuple) ? associated_tuple : ConsesLow.list(in, (SubLObject)pph_methods_formulas.$kw429$ITSELF)), ordered_quant_tuples);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list442);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return Sequences.reverse(Mapping.mapcar((SubLObject)pph_methods_formulas.$sym441$REVERSE, ordered_quant_tuples));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 170989L)
    public static SubLObject some_proper_scope_genformat(final SubLObject formula, final SubLObject inverseP, final SubLObject wide_scope_argnum, final SubLObject unambiguousP) {
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject assertions = get_generation_template_as_list_for_relation_only(pred, args, (SubLObject)pph_methods_formulas.NIL);
        SubLObject genformat = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == genformat) {
            SubLObject csome_list_var = assertions;
            SubLObject as = (SubLObject)pph_methods_formulas.NIL;
            as = csome_list_var.first();
            while (pph_methods_formulas.NIL == genformat && pph_methods_formulas.NIL != csome_list_var) {
                if (pph_methods_formulas.NIL != genformat_has_correct_scopeP(as, pred, inverseP, wide_scope_argnum)) {
                    genformat = as;
                }
                csome_list_var = csome_list_var.rest();
                as = csome_list_var.first();
            }
        }
        if (pph_methods_formulas.NIL == genformat && pph_methods_formulas.NIL != unambiguousP) {
            genformat = get_best_generation_template_as(pred, cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED));
        }
        return genformat;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 172031L)
    public static SubLObject genformat_has_correct_scopeP(final SubLObject as, final SubLObject pred, final SubLObject inverseP, final SubLObject wide_scope_argnum) {
        return argnum_is_initial_in_genformatP(pred, as, inverseP, wide_scope_argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 172192L)
    public static SubLObject find_proper_scope_gentemplate_phrase(final SubLObject formula, final SubLObject inverseP, final SubLObject wide_scope_argnum, final SubLObject unambiguousP, final SubLObject arg_position_map) {
        final SubLObject pred = cycl_utilities.formula_arg0(formula);
        SubLObject v_answer = pph_templates.pph_best_phrase_template_for_formula_wXreln(formula, pred, arg_position_map, inverseP, wide_scope_argnum);
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_p(v_answer, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != unambiguousP) {
            v_answer = pph_templates.pph_best_phrase_template_for_formula_wXreln(formula, pred, inverseP, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(v_answer, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str443$__Found_a_genTemplate_for__S___, pred, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            pph_templates.pph_template_phrase_set_cycl(v_answer, formula, arg_position_map, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        else if (v_answer == pph_methods_formulas.$kw417$GEN_FORMAT) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str444$__Passing_up_genTemplates_for__S_, pred, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
        }
        else if (pph_methods_formulas.NIL == v_answer && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str445$__Couldn_t_find_any_generation_te, formula, wide_scope_argnum, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 173154L)
    public static SubLObject pph_phrase_has_focal_argnumP(final SubLObject phrase, final SubLObject focus_argnum) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == focus_argnum || (pph_methods_formulas.NIL != phrase && pph_methods_formulas.NIL != pph_phrase_argnum_has_focusP(phrase, focus_argnum)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 173333L)
    public static SubLObject pph_phrase_argnum_has_focusP(final SubLObject phrase, final SubLObject argnum) {
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED) && document.sign_length(phrase).numG((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_phrase.pph_phrase_string(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_methods_formulas.ONE_INTEGER), (SubLObject)pph_methods_formulas.UNPROVIDED).equal((SubLObject)pph_methods_formulas.$str1$and)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL != pph_phrase.pph_coordination_phrase_p(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_methods_formulas.ZERO_INTEGER))) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL != pph_phrase.pph_conditional_phrase_p(phrase)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != pph_phrase_argnum_has_focusP(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_methods_formulas.ZERO_INTEGER), argnum) && pph_methods_formulas.NIL != pph_phrase_argnum_has_focusP(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)pph_methods_formulas.ONE_INTEGER), argnum));
        }
        final SubLObject argnum_key = at_utilities.get_generic_arg(argnum);
        SubLObject dtr_num = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)pph_methods_formulas.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            SubLObject dtr_keys;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_methods_formulas.NIL, v_iteration = (SubLObject)pph_methods_formulas.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                element_num = ((pph_methods_formulas.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_methods_formulas.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                dtr_keys = list_utilities.remove_if_not((SubLObject)pph_methods_formulas.$sym307$GENERIC_ARG_P, pph_phrase.pph_phrase_cycl_gather(dtr, Symbols.symbol_function((SubLObject)pph_methods_formulas.$sym446$KEYWORDP), Symbols.symbol_function((SubLObject)pph_methods_formulas.EQ)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                if (dtr_keys.equal((SubLObject)ConsesLow.list(argnum_key))) {
                    return (SubLObject)pph_methods_formulas.T;
                }
                if (argnum_key.equal(list_utilities.last_one(dtr_keys))) {
                    return (SubLObject)pph_methods_formulas.T;
                }
                if (dtr_keys.isCons()) {
                    return (SubLObject)pph_methods_formulas.NIL;
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_methods_formulas.ONE_INTEGER);
            }
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 174545L)
    public static SubLObject argnum_is_initial_in_genformatP(final SubLObject pred, final SubLObject genformat_as, final SubLObject inverseP, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject str = get_genformat_string_and_list(genformat_as);
        SubLObject arg_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_methods_formulas.NIL == arg_list) {
            arg_list = default_genformat_arglist(pred);
            if (pph_methods_formulas.NIL != inverseP) {
                arg_list = Sequences.reverse(arg_list);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != genformat_string_arg_initialP(str) && argnum.eql(arg_list.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 175037L)
    public static SubLObject genformat_string_arg_initialP(final SubLObject genformat_string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != string_utilities.starts_with_by_test(genformat_string, (SubLObject)pph_methods_formulas.$str447$_a, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL == string_utilities.starts_with_by_test(genformat_string, (SubLObject)pph_methods_formulas.$str448$_a_and, (SubLObject)pph_methods_formulas.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 175328L)
    public static SubLObject default_genformat_arglist(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_arity = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_methods_formulas.$sym449$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_methods_formulas.$const450$EverythingPSC, thread);
            v_arity = arity.max_arity(pred);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((pph_methods_formulas.NIL != v_arity) ? conses_high.copy_list(list_utilities.num_list(v_arity, (SubLObject)pph_methods_formulas.ONE_INTEGER)) : pph_methods_formulas.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 175587L)
    public static SubLObject pph_allow_var_typingP_internal(final SubLObject old_formula, SubLObject mt) {
        if (mt == pph_methods_formulas.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        SubLObject types = (SubLObject)pph_methods_formulas.NIL;
        SubLObject cdolist_list_var = obsolete.formula_variables(old_formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject var = (SubLObject)pph_methods_formulas.NIL;
        var = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            SubLObject types_$125 = pph_variable_handling.pph_variable_isa_constraints(var, old_formula, mt, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != pph_variable_handling.pph_var_registeredP(var)) {
                types_$125 = list_utilities.delete_subsumed_items((SubLObject)ConsesLow.cons(pph_variable_handling.pph_var_type(var), types_$125), (SubLObject)pph_methods_formulas.$sym452$PPH_GENL_, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            SubLObject cdolist_list_var_$126 = types;
            SubLObject type = (SubLObject)pph_methods_formulas.NIL;
            type = cdolist_list_var_$126.first();
            while (pph_methods_formulas.NIL != cdolist_list_var_$126) {
                types = list_utilities.alist_pushnew(types, type, var, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                cdolist_list_var_$126 = cdolist_list_var_$126.rest();
                type = cdolist_list_var_$126.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        }
        cdolist_list_var = types;
        SubLObject cons = (SubLObject)pph_methods_formulas.NIL;
        cons = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject type2 = (SubLObject)pph_methods_formulas.NIL;
            SubLObject vars = (SubLObject)pph_methods_formulas.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list453);
            type2 = current.first();
            current = (vars = current.rest());
            if (pph_methods_formulas.NIL != list_utilities.lengthG(vars, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                return (SubLObject)pph_methods_formulas.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)pph_methods_formulas.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 175587L)
    public static SubLObject pph_allow_var_typingP(final SubLObject old_formula, SubLObject mt) {
        if (mt == pph_methods_formulas.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == v_memoization_state) {
            return pph_allow_var_typingP_internal(old_formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_methods_formulas.$sym451$PPH_ALLOW_VAR_TYPING_, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_methods_formulas.$sym451$PPH_ALLOW_VAR_TYPING_, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.EQUAL, (SubLObject)pph_methods_formulas.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_methods_formulas.$sym451$PPH_ALLOW_VAR_TYPING_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(old_formula, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_methods_formulas.NIL;
            collision = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (old_formula.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_methods_formulas.NIL != cached_args && pph_methods_formulas.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_allow_var_typingP_internal(old_formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(old_formula, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 176255L)
    public static SubLObject generate_universal(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.$list272, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject scopally_unambiguousP = (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL == pph_formula_contains_existentialP(cycl));
            final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
            final SubLObject backup_phrase = pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject _prev_bind_0 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
            try {
                pph_vars.$pph_use_smart_variable_replacementP$.bind((SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.T.eql(pph_vars.$pph_use_smart_variable_replacementP$.getDynamicValue(thread)) && pph_methods_formulas.NIL != pph_allow_var_typingP(cycl, (SubLObject)pph_methods_formulas.UNPROVIDED)), thread);
                pph_register_exception_vars(cycl);
                final SubLObject _prev_bind_0_$127 = pph_vars.$pph_var_types$.currentBinding(thread);
                try {
                    pph_vars.$pph_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                    final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                    final SubLObject _prev_bind_0_$128 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                    try {
                        pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                        pph_vars.$pph_noted_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL), (SubLObject)pph_methods_formulas.SIXTEEN_INTEGER), thread);
                        pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        try {
                            thread.resetMultipleValues();
                            final SubLObject new_formula_template = remove_var_typing_clauses_from_universal(cycl, arg_position_map);
                            final SubLObject just = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (pph_methods_formulas.NIL == pph_utilities.pph_identity_template_p(new_formula_template)) {
                                pph_phrase.pph_phrase_reset_cycl(phrase, new_formula_template);
                                if (pph_methods_formulas.NIL != just) {
                                    pph_phrase.pph_phrase_add_justification(phrase, just);
                                }
                                final SubLObject new_formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                if (pph_methods_formulas.NIL != pph_types.pph_universal_with_atomic_scopeP(new_formula)) {
                                    generate_universal_with_atomic_scope(phrase, scopally_unambiguousP);
                                }
                            }
                            if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                                final SubLObject new_formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                thread.resetMultipleValues();
                                final SubLObject new_cycl_template = maybe_simplify_explicit_universal(new_formula, scopally_unambiguousP, arg_position_map);
                                final SubLObject _prev_bind_0_$129 = pph_vars.$pph_operator_scope_context$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_operator_scope_context$.bind(thread.secondMultipleValue(), thread);
                                    thread.resetMultipleValues();
                                    if (pph_methods_formulas.NIL == pph_utilities.pph_identity_template_p(new_cycl_template)) {
                                        pph_phrase.pph_phrase_reset_cycl(phrase, new_cycl_template);
                                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str455$__Changed_phrase_cycl_from__S___t, cycl, new_formula, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                        }
                                    }
                                    if (new_formula.equal(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED))) {
                                        pph_variable_handling.pph_register_var_quantifier(cycl_utilities.formula_arg1(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.$kw273$UNIVERSAL);
                                    }
                                    if (pph_methods_formulas.NIL != pph_phrase_ok_for_generate_english_explicit_universalP(phrase)) {
                                        generate_english_explicit_universal(phrase);
                                    }
                                    if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                                        final SubLObject info = pph_types.pph_method_info((SubLObject)pph_methods_formulas.$sym454$GENERATE_UNIVERSAL, (SubLObject)pph_methods_formulas.$kw273$UNIVERSAL);
                                        pph_types.pph_deregister_method_info((SubLObject)pph_methods_formulas.$sym454$GENERATE_UNIVERSAL, info);
                                        try {
                                            pph_main.pph_phrase_generate(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$130 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                                                final SubLObject _values = Values.getValuesAsVector();
                                                pph_types.pph_register_method_info((SubLObject)pph_methods_formulas.$sym454$GENERATE_UNIVERSAL, info);
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    pph_vars.$pph_operator_scope_context$.rebind(_prev_bind_0_$129, thread);
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                final SubLObject local_vars = conses_high.set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                }
                                pph_macros.pph_handle_local_vars(local_vars);
                                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                            }
                        }
                    }
                    finally {
                        pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                        pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                        pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$128, thread);
                    }
                }
                finally {
                    pph_vars.$pph_var_types$.rebind(_prev_bind_0_$127, thread);
                }
                if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                    pph_phrase.pph_phrase_revert_to_backup(phrase, backup_phrase);
                }
            }
            finally {
                pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 178360L)
    public static SubLObject pph_phrase_ok_for_generate_english_explicit_universalP(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != el_utilities.el_universal_p(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED)) && pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED) && (pph_methods_formulas.NIL == cycl_utilities.expression_find_if((SubLObject)pph_methods_formulas.$sym456$EL_IMPLICATION_P, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) || pph_methods_formulas.NIL == pph_utilities.pph_top_level_preciseP()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 178650L)
    public static SubLObject generate_english_explicit_universal(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject original_dtrs = pph_phrase.pph_phrase_dtr_list(phrase);
        thread.resetMultipleValues();
        final SubLObject var_pairs = pph_phrase_strip_explicit_cycl_quants(phrase, (SubLObject)pph_methods_formulas.$kw273$UNIVERSAL);
        final SubLObject core_formula = thread.secondMultipleValue();
        final SubLObject keep_explicitP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (!core_formula.equal(original_formula)) {
            final SubLObject filtered_vars = pph_filter_quantified_vars(list_utilities.alist_keys(var_pairs), (SubLObject)pph_methods_formulas.$kw271$EXISTENTIAL, keep_explicitP);
            final SubLObject map = pph_phrase.pph_phrase_arg_position_map(phrase);
            SubLObject dtrs = (SubLObject)pph_methods_formulas.NIL;
            if (pph_methods_formulas.NIL != filtered_vars) {
                final SubLObject quant_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list100, pph_phrase.pph_phrase_arg_position_map(phrase));
                final SubLObject quant = pph_methods_formulas.$const457$forAll;
                final SubLObject quant_phrase = pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.$str458$for_every, quant, (SubLObject)pph_methods_formulas.UNPROVIDED);
                pph_phrase.pph_phrase_set_arg_position(quant_phrase, quant_position);
                pph_phrase.pph_phrase_maybe_add_anchor_tags(quant_phrase);
                dtrs = (SubLObject)ConsesLow.cons(quant_phrase, dtrs);
                dtrs = (SubLObject)ConsesLow.cons(quant_vars_phrase(filtered_vars, var_pairs), dtrs);
                dtrs = (SubLObject)ConsesLow.cons(pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.$str0$_, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), dtrs);
            }
            dtrs = (SubLObject)ConsesLow.cons(quant_body_phrase(core_formula, map), dtrs);
            dtrs = Sequences.nreverse(dtrs);
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, dtrs, (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase_resolution.pph_phrase_get_string(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_methods_formulas.$str459$Failed_to_generate_explicit_unive, original_formula);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            pph_phrase.set_pph_phrase_dtrs_from_list(phrase, original_dtrs, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 180308L)
    public static SubLObject pph_formula_contains_existentialP(final SubLObject formula) {
        return list_utilities.sublisp_boolean(cycl_utilities.expression_find_if((SubLObject)pph_methods_formulas.$sym460$PPH_EXISTENTIAL_FORMULA_P, formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 180444L)
    public static SubLObject pph_existential_formula_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != el_utilities.el_formula_p(obj) && (pph_methods_formulas.NIL != pph_existential_p(obj) || pph_methods_formulas.NIL != pph_existential_p(pph_utilities.find_el_macro_expansion(obj, (SubLObject)pph_methods_formulas.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 180652L)
    public static SubLObject pph_existential_p(final SubLObject formula) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != el_utilities.el_formula_p(formula) && pph_methods_formulas.NIL != pph_existential_operator_p(cycl_utilities.formula_arg0(formula)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 180859L)
    public static SubLObject pph_existential_operator_p(final SubLObject op) {
        if (pph_methods_formulas.$pph_existential_operators$.getGlobalValue() == pph_methods_formulas.$kw461$UNINITIALIZED) {
            pph_methods_formulas.$pph_existential_operators$.setGlobalValue(isa.all_fort_instances(pph_methods_formulas.$const462$ExistentialQuantifier, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
        }
        return subl_promotions.memberP(op, pph_methods_formulas.$pph_existential_operators$.getGlobalValue(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 181105L)
    public static SubLObject pph_ok_bare_universalP(final SubLObject formula) {
        return pph_ok_consequentP(formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 181334L)
    public static SubLObject maybe_simplify_explicit_universal(final SubLObject universal, final SubLObject unambiguousP, final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject formula = universal;
        SubLObject template = pph_utilities.pph_identity_template();
        final SubLObject new_operator_scope_context = pph_vars.$pph_operator_scope_context$.getDynamicValue(thread);
        SubLObject universal_count = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
        SubLObject minimizedP = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == pph_vars.$paraphrase_precision$.getDynamicValue(thread) || pph_methods_formulas.NIL != unambiguousP) {
            while (pph_methods_formulas.NIL == minimizedP) {
                if (pph_methods_formulas.NIL == el_utilities.el_universal_p(formula)) {
                    minimizedP = (SubLObject)pph_methods_formulas.T;
                }
                else {
                    SubLObject current;
                    final SubLObject datum = current = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    SubLObject var = (SubLObject)pph_methods_formulas.NIL;
                    SubLObject body = (SubLObject)pph_methods_formulas.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list283);
                    var = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list283);
                    body = current.first();
                    current = current.rest();
                    if (pph_methods_formulas.NIL == current) {
                        if (pph_methods_formulas.NIL != pph_exceptional_var_p(var) || pph_methods_formulas.NIL != pph_variable_handling.pph_use_explicit_varP(var) || pph_methods_formulas.NIL == pph_ok_bare_universalP(body)) {
                            minimizedP = (SubLObject)pph_methods_formulas.T;
                        }
                        else {
                            final SubLObject var_quant = (SubLObject)pph_methods_formulas.$kw273$UNIVERSAL;
                            template = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.TWO_INTEGER, template);
                            formula = body;
                            universal_count = Numbers.add(universal_count, (SubLObject)pph_methods_formulas.ONE_INTEGER);
                            pph_variable_handling.pph_register_var_quantifier(var, var_quant);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list283);
                    }
                }
            }
        }
        if (pph_methods_formulas.NIL != pph_existential_p(formula)) {
            template = put_back_wide_scope_universals(template, universal_count);
        }
        return Values.values(template, new_operator_scope_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 182551L)
    public static SubLObject pph_negative_polarity_sentenceP(final SubLObject sentence) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != el_utilities.formula_arityE(sentence, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED) && (pph_methods_formulas.NIL != el_utilities.el_negation_p(sentence) || pph_methods_formulas.NIL != el_utilities.el_formula_with_operator_p(sentence, pph_methods_formulas.$const463$unknownSentence)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 182854L)
    public static SubLObject put_back_wide_scope_universals(final SubLObject core_restr_template, final SubLObject how_many) {
        return put_back_wide_scope_quants(core_restr_template, how_many, pph_methods_formulas.$const457$forAll);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 183071L)
    public static SubLObject generate_universal_with_atomic_scope(final SubLObject phrase, SubLObject scopally_unambiguousP) {
        if (scopally_unambiguousP == pph_methods_formulas.UNPROVIDED) {
            scopally_unambiguousP = (SubLObject)pph_methods_formulas.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject core_formula = cycl_utilities.formula_arg2(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject core_formula_template = (SubLObject)pph_methods_formulas.$kw196$ARG2;
        final SubLObject var = cycl_utilities.formula_arg1(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject wide_scope_arg = Sequences.position(var, core_formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != wide_scope_arg) {
            final SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
            try {
                pph_vars.$pph_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
                final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
                final SubLObject _prev_bind_0_$132 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
                final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
                try {
                    pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                    pph_vars.$pph_noted_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL), (SubLObject)pph_methods_formulas.SIXTEEN_INTEGER), thread);
                    pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                    if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                        format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                    try {
                        if (pph_methods_formulas.NIL == pph_variable_handling.pph_var_registeredP(var)) {
                            pph_variable_handling.pph_register_var(var, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        pph_variable_handling.pph_register_var_quantifier(var, (SubLObject)pph_methods_formulas.$kw273$UNIVERSAL);
                        final SubLObject new_template = intermediate_cycl_template_for_rmp_formula(core_formula);
                        if (pph_methods_formulas.NIL != new_template) {
                            core_formula_template = pph_utilities.pph_apply_template(new_template, core_formula_template);
                            wide_scope_arg = Sequences.position(var, pph_utilities.pph_apply_template(new_template, formula), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            core_formula = pph_utilities.pph_apply_template(new_template, core_formula);
                        }
                        final SubLObject phrase_copy = pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        pph_phrase.pph_phrase_reset_cycl(phrase_copy, core_formula_template);
                        pph_phrase_generate_with_proper_scope(phrase, core_formula, wide_scope_arg, (SubLObject)pph_methods_formulas.NIL, scopally_unambiguousP);
                        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase_copy)) {
                            pph_phrase.pph_phrase_copy(phrase_copy, phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$133 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            final SubLObject local_vars = conses_high.set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            pph_macros.pph_handle_local_vars(local_vars);
                            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$133, thread);
                        }
                    }
                }
                finally {
                    pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                    pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                    pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$132, thread);
                }
            }
            finally {
                pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 184352L)
    public static SubLObject remove_var_typing_clauses_from_universal(final SubLObject universal, SubLObject arg_position_map) {
        if (arg_position_map == pph_methods_formulas.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject template = remove_var_typing_clauses_from_universal_recursive(universal, arg_position_map, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject just = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(template, just);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 184730L)
    public static SubLObject remove_var_typing_clauses_from_universal_recursive(final SubLObject universal, SubLObject arg_position_map, SubLObject macro_vars) {
        if (arg_position_map == pph_methods_formulas.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_methods_formulas.NIL;
        }
        if (macro_vars == pph_methods_formulas.UNPROVIDED) {
            macro_vars = (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = pph_utilities.pph_identity_template();
        final SubLObject just = (SubLObject)pph_methods_formulas.NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(universal, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject var = (SubLObject)pph_methods_formulas.NIL;
        SubLObject body = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list283);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list283);
        body = current.first();
        current = current.rest();
        if (pph_methods_formulas.NIL == current) {
            final SubLObject vars_to_type = (SubLObject)ConsesLow.cons(var, macro_vars);
            SubLObject body_template = (SubLObject)pph_methods_formulas.$kw196$ARG2;
            final SubLObject body_map = pph_utilities.pph_figure_new_arg_position_map(arg_position_map, body_template);
            if (pph_methods_formulas.NIL != el_utilities.el_implication_p(body)) {
                SubLObject current_$135;
                final SubLObject datum_$134 = current_$135 = cycl_utilities.formula_args(body, (SubLObject)pph_methods_formulas.UNPROVIDED);
                SubLObject antecedent = (SubLObject)pph_methods_formulas.NIL;
                SubLObject consequent = (SubLObject)pph_methods_formulas.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$135, datum_$134, (SubLObject)pph_methods_formulas.$list305);
                antecedent = current_$135.first();
                current_$135 = current_$135.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$135, datum_$134, (SubLObject)pph_methods_formulas.$list305);
                consequent = current_$135.first();
                current_$135 = current_$135.rest();
                if (pph_methods_formulas.NIL == current_$135) {
                    if (pph_methods_formulas.NIL != pph_ok_consequentP(consequent)) {
                        final SubLObject antecedent_map = pph_utilities.pph_figure_new_arg_position_map(body_map, (SubLObject)pph_methods_formulas.$kw193$ARG1);
                        thread.resetMultipleValues();
                        SubLObject new_antecedent_template = remove_var_typing_clauses(antecedent, vars_to_type, antecedent_map, (SubLObject)pph_methods_formulas.NIL);
                        final SubLObject just_$136 = thread.secondMultipleValue();
                        final SubLObject vars_typed = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject cdolist_list_var = vars_typed;
                        SubLObject pair = (SubLObject)pph_methods_formulas.NIL;
                        pair = cdolist_list_var.first();
                        while (pph_methods_formulas.NIL != cdolist_list_var) {
                            SubLObject current_$136;
                            final SubLObject datum_$135 = current_$136 = pair;
                            SubLObject var_typed = (SubLObject)pph_methods_formulas.NIL;
                            SubLObject arg_position = (SubLObject)pph_methods_formulas.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$136, datum_$135, (SubLObject)pph_methods_formulas.$list464);
                            var_typed = current_$136.first();
                            current_$136 = current_$136.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$136, datum_$135, (SubLObject)pph_methods_formulas.$list464);
                            arg_position = current_$136.first();
                            current_$136 = current_$136.rest();
                            if (pph_methods_formulas.NIL == current_$136) {
                                pph_variable_handling.pph_register_var_quantifier(var_typed, (SubLObject)pph_methods_formulas.$kw273$UNIVERSAL);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$135, (SubLObject)pph_methods_formulas.$list464);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            pair = cdolist_list_var.first();
                        }
                        if (pph_methods_formulas.NIL != pph_utilities.pph_identity_template_p(new_antecedent_template)) {
                            body_template = pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_methods_formulas.$list181);
                        }
                        else if (pph_methods_formulas.NIL != pph_utilities.pph_cycl_template_p(new_antecedent_template)) {
                            new_antecedent_template = pph_utilities.pph_apply_template(new_antecedent_template, pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_methods_formulas.$list186));
                            final SubLObject arg0_template = pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_methods_formulas.$list465);
                            final SubLObject consequent_template = pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_methods_formulas.$list187);
                            body_template = el_utilities.make_binary_formula(arg0_template, new_antecedent_template, consequent_template);
                        }
                        else if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                            Errors.warn((SubLObject)pph_methods_formulas.$str466$Couldn_t_remove_var_typing_clause, universal);
                            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$134, (SubLObject)pph_methods_formulas.$list305);
                }
            }
            else if (pph_methods_formulas.NIL != el_utilities.el_existential_p(body)) {
                final SubLObject exis_template = remove_var_typing_clauses_from_existential(body, body_map);
                body_template = pph_utilities.pph_apply_template(exis_template, body_template);
            }
            else if (pph_methods_formulas.NIL != el_utilities.el_universal_p(body)) {
                final SubLObject univ_template = remove_var_typing_clauses_from_universal_recursive(body, body_map, vars_to_type);
                body_template = pph_utilities.pph_apply_template(univ_template, body_template);
            }
            if (!body_template.eql(pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_methods_formulas.$list181))) {
                final SubLObject new_body = pph_utilities.pph_apply_template(body_template, universal);
                if (pph_methods_formulas.NIL != pph_variable_handling.pph_var_registeredP(var)) {
                    pph_variable_handling.pph_note_if_var_is_used_only_once_in_formula(var, new_body);
                }
                maybe_register_var_by_arg_constraints(var, body);
                template = el_utilities.make_universal((SubLObject)pph_methods_formulas.$kw193$ARG1, body_template);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list283);
        }
        return Values.values(template, just);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 187414L)
    public static SubLObject pph_gather_antecedents(final SubLObject formula) {
        final SubLObject cnf = clausifier.clausal_form(formula, (SubLObject)pph_methods_formulas.$kw467$CNF, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL == list_utilities.singletonP(cnf)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLObject clause = cnf.first();
        final SubLObject neglits = clause.first();
        return neglits;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 187835L)
    public static SubLObject generate_unicode_naut(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject naut = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject subl_string = cycl_utilities.nat_arg1(naut, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_methods_formulas.$kw39$HTML) {
            final SubLObject html_string = unicode_strings.unicode_display_to_html(subl_string);
            pph_phrase.pph_phrase_set_string(phrase, html_string);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        else if (pph_vars.$paraphrase_mode$.getDynamicValue(thread) == pph_methods_formulas.$kw93$TEXT && pph_methods_formulas.NIL != pph_vars.$allow_utf8_in_pph_text_mode$.getDynamicValue(thread)) {
            final SubLObject utf8_string = unicode_strings.unicode_display_to_utf8(subl_string);
            pph_phrase.pph_phrase_set_string(phrase, utf8_string);
            pph_phrase.pph_phrase_note_done(phrase);
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 188584L)
    public static SubLObject pph_set_to_subcollection(final SubLObject formula) {
        return pph_utilities.pph_apply_template(pph_set_to_subcol_template(formula), formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 188961L)
    public static SubLObject pph_set_to_subcol_template(final SubLObject formula) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject var = (SubLObject)pph_methods_formulas.NIL;
        SubLObject restr = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list285);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list285);
        restr = current.first();
        current = current.rest();
        if (pph_methods_formulas.NIL == current) {
            if (conses_high.butlast(restr, (SubLObject)pph_methods_formulas.UNPROVIDED).equal((SubLObject)ConsesLow.list(pph_methods_formulas.$const470$genls, var))) {
                final SubLObject supercol_template = pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_methods_formulas.$list187);
                return pph_utilities.pph_make_type_level(supercol_template);
            }
            if (pph_methods_formulas.NIL == el_utilities.el_binary_formula_p(restr) || pph_methods_formulas.NIL == conses_high.member(var, cycl_utilities.atomic_sentence_args(restr, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                return (SubLObject)pph_methods_formulas.NIL;
            }
            SubLObject current_$140;
            final SubLObject datum_$139 = current_$140 = cycl_utilities.formula_args(restr, (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject from_arg = (SubLObject)pph_methods_formulas.NIL;
            SubLObject to_arg = (SubLObject)pph_methods_formulas.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$140, datum_$139, (SubLObject)pph_methods_formulas.$list471);
            from_arg = current_$140.first();
            current_$140 = current_$140.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$140, datum_$139, (SubLObject)pph_methods_formulas.$list471);
            to_arg = current_$140.first();
            current_$140 = current_$140.rest();
            if (pph_methods_formulas.NIL == current_$140) {
                final SubLObject subcol_fn = var.eql(from_arg) ? pph_methods_formulas.$const472$SubcollectionOfWithRelationToFn : pph_methods_formulas.$const165$SubcollectionOfWithRelationFromFn;
                final SubLObject binary_pred_template = pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_methods_formulas.$list465);
                final SubLObject other_arg_template = var.eql(to_arg) ? pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_methods_formulas.$list186) : pph_utilities.pph_cycl_template_from_arg_position((SubLObject)pph_methods_formulas.$list187);
                final SubLObject super_col = pph_variable_handling.pph_min_variable_isa_constraint(var, restr, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                return el_utilities.make_ternary_formula(subcol_fn, super_col, binary_pred_template, other_arg_template);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$139, (SubLObject)pph_methods_formulas.$list471);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list285);
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 190240L)
    public static SubLObject generate_set_naut(final SubLObject phrase) {
        if (pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED)) {
            final SubLObject naut = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject subcol_template = pph_set_to_subcol_template(naut);
            if (pph_methods_formulas.NIL != subcol_template) {
                final SubLObject new_phrase = pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                pph_phrase.pph_phrase_reset_cycl(new_phrase, subcol_template);
                pph_phrase.pph_phrase_set_agr_pred(new_phrase, pph_methods_formulas.$const432$nonSingular_Generic, (SubLObject)pph_methods_formulas.UNPROVIDED);
                generate_subcollection_with_rel_clause(new_phrase);
                if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(new_phrase)) {
                    pph_phrase.pph_phrase_set_output_list(new_phrase, (SubLObject)ConsesLow.cons(pph_data_structures.new_pph_phrase_output_item((SubLObject)pph_methods_formulas.$str475$the_set_of, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), pph_phrase.pph_phrase_output_list(new_phrase)), (SubLObject)pph_methods_formulas.UNPROVIDED);
                    pph_phrase.pph_phrase_set_agr_pred(new_phrase, pph_methods_formulas.$const476$singular, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    pph_phrase.pph_phrase_copy(new_phrase, phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 191166L)
    public static SubLObject generate_with_holds_of(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != generate_with_holds_of_paraphrase_operatorP(cycl_utilities.formula_operator(formula)) || pph_methods_formulas.NIL != pph_utilities.pph_genl_mtP(pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_methods_formulas.$const480$CyclishParaphraseMt)) {
            if (pph_vars.current_generation_level().isPositive() && !formula.equal(pph_vars.pph_top_level_cycl()) && pph_methods_formulas.NIL == pph_phrase.pph_phrase_p(pph_phrase.pph_phrase_mother(phrase), (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER) && pph_methods_formulas.NIL == pph_error.suppress_pph_warningsP()) {
                Errors.warn((SubLObject)pph_methods_formulas.$str481$Generating_with_holds_of_for_moth, phrase);
                streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            final SubLObject nl_preds_for_formula = pph_utilities.pph_default_nl_preds_for_term(formula);
            final SubLObject nl_preds = pph_utilities.pph_filter_preds(nl_preds_for_formula, pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL != nl_preds) {
                missing_knowledge_discovery_events.post_unlexified_term_discovery_event(formula, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), nl_preds);
                if (pph_methods_formulas.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_methods_formulas.UNPROVIDED)) {
                    final SubLObject arg_position_map = pph_phrase.pph_phrase_arg_position_map(phrase);
                    thread.resetMultipleValues();
                    final SubLObject output_list = do_generate_with_holds_of(formula, nl_preds, arg_position_map, phrase);
                    final SubLObject agr_pred = thread.secondMultipleValue();
                    final SubLObject support = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_non_empty_output_list_p(output_list)) {
                        pph_phrase.pph_phrase_set_output_list(phrase, output_list, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        pph_phrase.pph_phrase_set_agr_pred(phrase, agr_pred, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        pph_phrase.pph_phrase_note_done(phrase);
                    }
                    if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(phrase)) {
                        pph_phrase.pph_phrase_destroy_dtrs_metered(phrase);
                        pph_phrase.pph_phrase_remove_all_dtrs(phrase);
                        return (SubLObject)pph_methods_formulas.NIL;
                    }
                }
            }
        }
        return pph_phrase.pph_phrase_output_list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 192736L)
    public static SubLObject do_generate_with_holds_of(final SubLObject formula, SubLObject nl_preds, SubLObject arg_position_map, SubLObject phrase) {
        if (nl_preds == pph_methods_formulas.UNPROVIDED) {
            nl_preds = (SubLObject)pph_methods_formulas.NIL;
        }
        if (arg_position_map == pph_methods_formulas.UNPROVIDED) {
            arg_position_map = (SubLObject)pph_methods_formulas.NIL;
        }
        if (phrase == pph_methods_formulas.UNPROVIDED) {
            phrase = (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(formula, (SubLObject)pph_methods_formulas.$kw95$REGULARIZE);
        SubLObject operator = (SubLObject)pph_methods_formulas.NIL;
        SubLObject args = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list482);
        operator = current.first();
        current = (args = current.rest());
        final SubLObject operator_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(operator, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject arg0_arg_position = pph_utilities.pph_arg_position_lookup((SubLObject)pph_methods_formulas.$list100, arg_position_map);
        pph_phrase.pph_phrase_set_mother(operator_phrase, phrase);
        pph_phrase.pph_phrase_set_only_dtr(phrase, operator_phrase);
        if (pph_methods_formulas.NIL != generate_with_holds_of_paraphrase_operatorP(operator)) {
            pph_main.pph_phrase_generate(operator_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        else {
            pph_methods.generate_princ(operator_phrase);
        }
        pph_phrase.pph_phrase_set_arg_position(operator_phrase, arg0_arg_position);
        final SubLObject negation_to_express = set_utilities.set_arbitrary_element_without_values(pph_vars.$pph_unexpressed_negations$.getDynamicValue(thread), (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject head_verb_string = (SubLObject)((pph_methods_formulas.NIL != negation_to_express) ? ((pph_methods_formulas.NIL != pph_vars.pph_allow_contractionsP()) ? pph_methods_formulas.$str483$doesn_t_hold : pph_methods_formulas.$str484$does_not_hold) : pph_methods_formulas.$str485$holds);
        if (pph_methods_formulas.NIL != negation_to_express) {
            pph_vars.note_unexpressed_negation_expressed(negation_to_express, (SubLObject)pph_methods_formulas.$sym486$DO_GENERATE_WITH_HOLDS_OF);
        }
        pph_phrase.pph_phrase_append(pph_data_structures.new_pph_phrase(head_verb_string, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), phrase);
        if (pph_methods_formulas.NIL != list_utilities.lengthG(args, (SubLObject)pph_methods_formulas.ZERO_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            pph_phrase.pph_phrase_append(pph_data_structures.new_pph_phrase((SubLObject)pph_methods_formulas.$str80$of, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), phrase);
            final SubLObject args_formula = el_utilities.make_el_formula(pph_methods_formulas.$const487$TheCoordinationSet, args, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject args_phrase = pph_phrase.pph_phrase_copy(pph_phrase.new_pph_phrase_for_cycl(args_formula, arg_position_map, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            pph_phrase.pph_phrase_set_mother(args_phrase, phrase);
            pph_phrase.pph_phrase_append(args_phrase, phrase);
            pph_main.pph_phrase_generate(args_phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(args_phrase)) {
                return (SubLObject)pph_methods_formulas.NIL;
            }
        }
        pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(phrase);
        return Values.values(pph_phrase.pph_phrase_output_list(phrase), pph_methods_formulas.$const391$thirdPersonSg_Present);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 194977L)
    public static SubLObject generate_with_holds_of_paraphrase_operatorP(final SubLObject operator) {
        if (pph_methods_formulas.NIL != rkf_domain_examples.rkf_generic_example_p(operator)) {
            return (SubLObject)pph_methods_formulas.T;
        }
        return cycl_variables.el_varP(operator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 195311L)
    public static SubLObject generate_conjunction_head_driven(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_compatible_with_predsP(phrase, (SubLObject)pph_methods_formulas.$list490)) {
            final SubLObject sentence = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
            final SubLObject nl_preds = pph_utilities.pph_filter_preds(pph_phrase.pph_phrase_agr_preds(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.$list490, (SubLObject)pph_methods_formulas.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject new_dtrs = generate_conjunction_head_driven_internal(sentence, nl_preds);
            final SubLObject head_dtr_num = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_methods_formulas.NIL != new_dtrs) {
                SubLObject failedP = (SubLObject)pph_methods_formulas.NIL;
                if (pph_methods_formulas.NIL == failedP) {
                    SubLObject csome_list_var = new_dtrs;
                    SubLObject new_dtr = (SubLObject)pph_methods_formulas.NIL;
                    new_dtr = csome_list_var.first();
                    while (pph_methods_formulas.NIL == failedP && pph_methods_formulas.NIL != csome_list_var) {
                        pph_main.pph_phrase_generate(new_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        if (pph_methods_formulas.NIL == pph_phrase.pph_phrase_doneP(new_dtr)) {
                            failedP = (SubLObject)pph_methods_formulas.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        new_dtr = csome_list_var.first();
                    }
                }
                if (pph_methods_formulas.NIL == failedP) {
                    pph_phrase.set_pph_phrase_dtrs_from_list(phrase, new_dtrs, head_dtr_num);
                    pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(phrase);
                }
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 196105L)
    public static SubLObject generate_conjunction_head_driven_internal(final SubLObject sentence, final SubLObject nl_preds) {
        SubLObject new_dtrs = (SubLObject)pph_methods_formulas.NIL;
        SubLObject head_dtr_num = (SubLObject)pph_methods_formulas.NIL;
        SubLObject argnum = (SubLObject)pph_methods_formulas.ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(sentence, (SubLObject)pph_methods_formulas.$kw96$IGNORE);
        SubLObject rest;
        SubLObject head_clause;
        for (rest = (SubLObject)pph_methods_formulas.NIL, rest = args; pph_methods_formulas.NIL == head_dtr_num && pph_methods_formulas.NIL != rest; rest = rest.rest()) {
            head_clause = rest.first();
            argnum = Numbers.add(argnum, (SubLObject)pph_methods_formulas.ONE_INTEGER);
            if (pph_methods_formulas.NIL != pph_utilities.pph_var_typing_clauseP(head_clause, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                new_dtrs = generate_conjunction_head_driven_with_head_clause(sentence, nl_preds, head_clause);
                if (pph_methods_formulas.NIL != new_dtrs) {
                    head_dtr_num = argnum;
                }
            }
        }
        return Values.values(new_dtrs, head_dtr_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 196550L)
    public static SubLObject generate_conjunction_head_driven_with_head_clause(final SubLObject sentence, final SubLObject nl_preds, final SubLObject head_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject remaining_clauses = Sequences.remove(head_clause, cycl_utilities.formula_args(sentence, (SubLObject)pph_methods_formulas.UNPROVIDED), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject new_dtrs = (SubLObject)pph_methods_formulas.NIL;
        SubLObject head_dtr = (SubLObject)pph_methods_formulas.NIL;
        thread.resetMultipleValues();
        final SubLObject head_var = pph_utilities.pph_parse_var_typing_clause(head_clause, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject head_type = thread.secondMultipleValue();
        final SubLObject head_type_arg_position = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (pph_methods_formulas.NIL == head_dtr) {
            SubLObject csome_list_var = pph_methods_lexicon.pph_lexifications_for_term(head_type, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            SubLObject head_lex = (SubLObject)pph_methods_formulas.NIL;
            head_lex = csome_list_var.first();
            while (pph_methods_formulas.NIL == head_dtr && pph_methods_formulas.NIL != csome_list_var) {
                final SubLObject head_item = pph_methods_lexicon.generate_phrase_from_as(head_lex, head_type, nl_preds, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                if (pph_methods_formulas.NIL != head_item) {
                    final SubLObject head_string = pph_data_structures.pph_phrase_output_item_string(head_item);
                    if (pph_methods_formulas.NIL != pph_head_string_okP(head_string)) {
                        final SubLObject head_agr = pph_data_structures.new_pph_phrase_agr(pph_utilities.new_pph_agr_constraint((SubLObject)pph_methods_formulas.$kw491$POS_PRED, pph_data_structures.pph_phrase_output_item_agr_pred(head_item)), (SubLObject)pph_methods_formulas.UNPROVIDED);
                        head_dtr = pph_data_structures.new_pph_phrase(head_string, head_type, head_agr);
                        pph_phrase.pph_phrase_set_arg_position(head_dtr, head_type_arg_position);
                        new_dtrs = (SubLObject)ConsesLow.cons(head_dtr, new_dtrs);
                        thread.resetMultipleValues();
                        final SubLObject new_dtrs_$141 = pph_maybe_add_subject_for_head(head_dtr, head_var, remaining_clauses);
                        final SubLObject remaining_clauses_$142 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        new_dtrs = new_dtrs_$141;
                        remaining_clauses = remaining_clauses_$142;
                    }
                }
                csome_list_var = csome_list_var.rest();
                head_lex = csome_list_var.first();
            }
        }
        if (pph_methods_formulas.NIL == list_utilities.empty_list_p(remaining_clauses)) {
            return Values.values((SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL);
        }
        return Values.values(new_dtrs, head_dtr);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 197703L)
    public static SubLObject pph_head_string_okP(final SubLObject head_string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_methods_formulas.NIL != pph_string.pph_string_p(head_string) && pph_methods_formulas.NIL == pph_string.pph_substringP((SubLObject)pph_methods_formulas.$str3$_, head_string, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 197910L)
    public static SubLObject pph_maybe_add_subject_for_head(final SubLObject head_dtr, final SubLObject head_var, SubLObject remaining_clauses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_dtrs = (SubLObject)ConsesLow.list(head_dtr);
        SubLObject subj_dtr = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL == subj_dtr) {
            SubLObject csome_list_var = remaining_clauses;
            SubLObject subj_clause = (SubLObject)pph_methods_formulas.NIL;
            subj_clause = csome_list_var.first();
            while (pph_methods_formulas.NIL == subj_dtr && pph_methods_formulas.NIL != csome_list_var) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(subj_clause, pph_subj_clause_pattern(head_var));
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (pph_methods_formulas.NIL != success) {
                    final SubLObject subj = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_methods_formulas.$sym492$SUBJ, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    if (pph_methods_formulas.NIL != cycl_variables.el_varP(subj)) {
                        if (pph_methods_formulas.NIL == subj_dtr) {
                            SubLObject csome_list_var_$143 = remaining_clauses;
                            SubLObject subj_type_clause = (SubLObject)pph_methods_formulas.NIL;
                            subj_type_clause = csome_list_var_$143.first();
                            while (pph_methods_formulas.NIL == subj_dtr && pph_methods_formulas.NIL != csome_list_var_$143) {
                                if (pph_methods_formulas.NIL != pph_utilities.pph_var_typing_clauseP(subj_type_clause, subj, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                    thread.resetMultipleValues();
                                    final SubLObject subj_var = pph_utilities.pph_parse_var_typing_clause(subj_type_clause, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    final SubLObject subj_type = thread.secondMultipleValue();
                                    final SubLObject subj_type_arg_position = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    subj_dtr = pph_templates.pph_phrasify_phrase_naut((SubLObject)ConsesLow.list(pph_functions.bestdetnbarfn_indefinite(), (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn_constrained(), pph_methods_formulas.$const248$nonPlural_Generic, subj_type)), (SubLObject)pph_methods_formulas.UNPROVIDED);
                                    pph_phrase.pph_phrase_set_arg_position(subj_dtr, subj_type_arg_position);
                                    remaining_clauses = Sequences.delete(subj_type_clause, remaining_clauses, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                                }
                                csome_list_var_$143 = csome_list_var_$143.rest();
                                subj_type_clause = csome_list_var_$143.first();
                            }
                        }
                    }
                    else if (pph_methods_formulas.NIL != isa.isaP(subj, pph_methods_formulas.$const493$Individual, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                        subj_dtr = pph_templates.pph_phrasify_phrase_naut((SubLObject)ConsesLow.list(pph_functions.bestdetnbarfn_indefinite(), (SubLObject)ConsesLow.list(pph_functions.termparaphrasefn_np(), subj)), (SubLObject)pph_methods_formulas.UNPROVIDED);
                    }
                }
                if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_p(subj_dtr, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                    remaining_clauses = Sequences.delete(subj_clause, remaining_clauses, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    new_dtrs = pph_add_subj_dtr(new_dtrs, subj_dtr);
                }
                csome_list_var = csome_list_var.rest();
                subj_clause = csome_list_var.first();
            }
        }
        return Values.values(new_dtrs, remaining_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 199137L)
    public static SubLObject pph_subj_clause_pattern(final SubLObject head_var) {
        return (SubLObject)ConsesLow.listS((SubLObject)pph_methods_formulas.$list494, head_var, (SubLObject)pph_methods_formulas.$list495);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 199253L)
    public static SubLObject pph_add_subj_dtr(SubLObject new_dtrs, final SubLObject subj_dtr) {
        new_dtrs = (SubLObject)ConsesLow.cons(subj_dtr, new_dtrs);
        return new_dtrs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 199590L)
    public static SubLObject generate_possibly_reduced_coordination(final SubLObject phrase) {
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject pos = pph_reducible_coordination(cycl);
        if (pph_methods_formulas.NIL != pos) {
            final SubLObject template = pph_create_coordination_template(cycl, pos);
            if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str498$__Created_coordination_template_f, cycl, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            }
            pph_phrase.pph_phrase_reset_cycl(phrase, template);
            return pph_main.pph_phrase_generate(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        }
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 199983L)
    public static SubLObject pph_create_coordination_template(final SubLObject formula, SubLObject position) {
        SubLObject map = (SubLObject)pph_methods_formulas.NIL;
        final SubLObject first = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED).first();
        SubLObject operator = (SubLObject)pph_methods_formulas.NIL;
        if (pph_methods_formulas.NIL != el_utilities.el_disjunction_p(formula)) {
            operator = pph_methods_formulas.$const499$TheDisjunctiveCoordinationSet;
        }
        else if (pph_methods_formulas.NIL != el_utilities.el_conjunction_p(formula)) {
            operator = pph_methods_formulas.$const487$TheCoordinationSet;
        }
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject coord_map;
        SubLObject cdotimes_end_var_$144;
        SubLObject index_$145;
        SubLObject keyword;
        for (cdotimes_end_var = Sequences.length(first), index = (SubLObject)pph_methods_formulas.NIL, index = (SubLObject)pph_methods_formulas.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)pph_methods_formulas.ONE_INTEGER)) {
            if (index.eql(position)) {
                coord_map = (SubLObject)pph_methods_formulas.NIL;
                for (cdotimes_end_var_$144 = Sequences.length(formula), index_$145 = (SubLObject)pph_methods_formulas.NIL, index_$145 = (SubLObject)pph_methods_formulas.ZERO_INTEGER; index_$145.numL(cdotimes_end_var_$144); index_$145 = Numbers.add(index_$145, (SubLObject)pph_methods_formulas.ONE_INTEGER)) {
                    if (!index_$145.eql((SubLObject)pph_methods_formulas.ZERO_INTEGER)) {
                        keyword = pph_utilities.make_formula_arg_naut(index_$145, (SubLObject)pph_methods_formulas.$kw287$SELF);
                        coord_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pph_methods_formulas.$const356$FormulaArgFn, position, keyword), coord_map);
                    }
                }
                map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(operator, Sequences.reverse(coord_map)), map);
            }
            else {
                map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pph_methods_formulas.$const356$FormulaArgFn, index, (SubLObject)pph_methods_formulas.$kw193$ARG1), map);
            }
        }
        return Sequences.reverse(map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 200721L)
    public static SubLObject pph_reducible_coordination(final SubLObject formula) {
        if (pph_methods_formulas.NIL == el_utilities.el_disjunction_p(formula) && pph_methods_formulas.NIL == el_utilities.el_conjunction_p(formula)) {
            return (SubLObject)pph_methods_formulas.NIL;
        }
        final SubLObject args = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject bad = list_utilities.find_if_not((SubLObject)pph_methods_formulas.$sym500$CYCL_ATOMIC_SENTENCE_P, args, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject position = (SubLObject)((pph_methods_formulas.NIL != bad) ? pph_methods_formulas.NIL : list_utilities.unique_difference_among_lists(args));
        return (SubLObject)((pph_methods_formulas.NIL != subl_promotions.positive_integer_p(position)) ? position : pph_methods_formulas.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 201660L)
    public static SubLObject generate_existential_with_thecollectionof(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_var_types$.currentBinding(thread);
        try {
            pph_vars.$pph_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_var_types$.getDynamicValue(thread) : dictionary.new_dictionary((SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED), thread);
            final SubLObject old_pph_vars = pph_variable_handling.pph_registered_vars();
            final SubLObject _prev_bind_0_$146 = pph_variable_handling.$pph_different_vars$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_noted_var_types$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_vars.$pph_possibly_binding_variables_counter$.currentBinding(thread);
            try {
                pph_variable_handling.$pph_different_vars$.bind(pph_variable_handling.$pph_different_vars$.getDynamicValue(thread), thread);
                pph_vars.$pph_noted_var_types$.bind((pph_methods_formulas.NIL != dictionary.dictionary_p(pph_vars.$pph_noted_var_types$.getDynamicValue(thread))) ? pph_vars.$pph_noted_var_types$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)pph_methods_formulas.EQL), (SubLObject)pph_methods_formulas.SIXTEEN_INTEGER), thread);
                pph_vars.$pph_possibly_binding_variables_counter$.bind(number_utilities.f_1X(pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread)), thread);
                if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str86$__Entering_PPH_POSSIBLY_BINDING_V, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), dictionary.dictionary_values(pph_vars.$pph_var_types$.getDynamicValue(thread)), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                }
                try {
                    final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                    final SubLObject template = pph_reformulate_existential_with_thecollectionof(cycl, pph_utilities.pph_identity_template());
                    if (pph_methods_formulas.NIL == pph_utilities.pph_impossible_template_p(template) && pph_methods_formulas.NIL == pph_utilities.pph_identity_template_p(template)) {
                        final SubLObject phrase_copy = pph_phrase.pph_phrase_copy(phrase, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        pph_phrase.pph_phrase_reset_cycl(phrase_copy, template);
                        pph_main.pph_phrase_generate(phrase_copy, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        if (pph_methods_formulas.NIL != pph_phrase.pph_phrase_doneP(phrase_copy)) {
                            final SubLObject phrase_copy_string = pph_phrase.pph_phrase_string(phrase_copy, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            if (pph_methods_formulas.NIL == string_utilities.substringP((SubLObject)pph_methods_formulas.$str502$such_that__X, phrase_copy_string, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                                pph_phrase.pph_phrase_copy(phrase_copy, phrase, (SubLObject)pph_methods_formulas.UNPROVIDED);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$147 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_methods_formulas.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        final SubLObject local_vars = conses_high.set_difference(pph_variable_handling.pph_registered_vars(), old_pph_vars, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str88$__Leaving_PPH_POSSIBLY_BINDING_VA, pph_vars.$pph_possibly_binding_variables_counter$.getDynamicValue(thread), pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        pph_macros.pph_handle_local_vars(local_vars);
                        if (pph_methods_formulas.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_methods_formulas.TWO_INTEGER)) {
                            format_nil.force_format((SubLObject)pph_methods_formulas.T, (SubLObject)pph_methods_formulas.$str89$______and__pph_var_types__are_now, pph_variable_handling.pph_registered_vars(), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$147, thread);
                    }
                }
            }
            finally {
                pph_vars.$pph_possibly_binding_variables_counter$.rebind(_prev_bind_3, thread);
                pph_vars.$pph_noted_var_types$.rebind(_prev_bind_2, thread);
                pph_variable_handling.$pph_different_vars$.rebind(_prev_bind_0_$146, thread);
            }
        }
        finally {
            pph_vars.$pph_var_types$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 202469L)
    public static SubLObject pph_reformulate_existential_with_thecollectionof(final SubLObject formula, SubLObject path) {
        if (path == pph_methods_formulas.UNPROVIDED) {
            path = pph_utilities.pph_identity_template();
        }
        if (pph_methods_formulas.NIL == el_utilities.el_existential_p(formula)) {
            return pph_utilities.pph_impossible_template();
        }
        final SubLObject var = cycl_utilities.formula_arg(formula, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED);
        final SubLObject scope_path = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.TWO_INTEGER, path);
        final SubLObject scope_reformulation = pph_reformulate_conjunction_with_thecollectionof(cycl_utilities.formula_arg(formula, (SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED), var, scope_path, formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
        if (pph_methods_formulas.NIL != scope_reformulation && !scope_reformulation.equal((SubLObject)pph_methods_formulas.$kw116$ERROR) && pph_methods_formulas.NIL == cycl_utilities.expression_find((SubLObject)pph_methods_formulas.$kw116$ERROR, scope_reformulation, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) && pph_methods_formulas.NIL == cycl_utilities.expression_find(pph_methods_formulas.$const356$FormulaArgFn, pph_utilities.pph_apply_template(scope_reformulation, formula), (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.ZERO_INTEGER, path), pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.ONE_INTEGER, path), scope_reformulation);
        }
        return pph_utilities.pph_impossible_template();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 203329L)
    public static SubLObject pph_reformulate_conjunction_with_thecollectionof(final SubLObject formula, final SubLObject var, final SubLObject path, SubLObject orig_formula, SubLObject var_path, SubLObject descend_into_existentialsP) {
        if (var_path == pph_methods_formulas.UNPROVIDED) {
            var_path = (SubLObject)pph_methods_formulas.NIL;
        }
        if (descend_into_existentialsP == pph_methods_formulas.UNPROVIDED) {
            descend_into_existentialsP = (SubLObject)pph_methods_formulas.T;
        }
        if (pph_methods_formulas.NIL == orig_formula) {
            orig_formula = formula;
        }
        if (pph_methods_formulas.NIL == var_path) {
            var_path = pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.ONE_INTEGER, pph_utilities.pph_identity_template());
        }
        if (pph_methods_formulas.NIL != descend_into_existentialsP && pph_methods_formulas.NIL != el_utilities.el_existential_p(formula)) {
            return (SubLObject)ConsesLow.list(pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.ZERO_INTEGER, path), pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.ONE_INTEGER, path), pph_reformulate_conjunction_with_thecollectionof(cycl_utilities.formula_arg2(formula, (SubLObject)pph_methods_formulas.UNPROVIDED), var, pph_utilities.make_formula_arg_naut((SubLObject)pph_methods_formulas.TWO_INTEGER, path), orig_formula, descend_into_existentialsP, (SubLObject)pph_methods_formulas.UNPROVIDED));
        }
        if (pph_methods_formulas.NIL == el_utilities.el_conjunction_p(formula)) {
            return (SubLObject)pph_methods_formulas.$kw116$ERROR;
        }
        if (pph_methods_formulas.NIL == var) {
            return (SubLObject)pph_methods_formulas.$kw116$ERROR;
        }
        final SubLObject v_clauses = cycl_utilities.formula_args(formula, (SubLObject)pph_methods_formulas.UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = pph_partition_clauses_for_thecollectionof(v_clauses, path, var);
        SubLObject includes = (SubLObject)pph_methods_formulas.NIL;
        SubLObject excludes = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list503);
        includes = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list503);
        excludes = current.first();
        current = current.rest();
        if (pph_methods_formulas.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list503);
            return (SubLObject)pph_methods_formulas.NIL;
        }
        if (pph_methods_formulas.NIL != includes && pph_methods_formulas.NIL != list_utilities.same_length_p(ConsesLow.append(includes, excludes), v_clauses)) {
            final SubLObject thecollection_naut = make_the_collection_naut_map(includes, orig_formula, var);
            final SubLObject thecollection_isa_clause = el_utilities.make_binary_formula(pph_methods_formulas.$const504$isa, var_path, thecollection_naut);
            return el_utilities.make_conjunction((SubLObject)ConsesLow.cons(thecollection_isa_clause, excludes));
        }
        return (SubLObject)pph_methods_formulas.$kw116$ERROR;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 204692L)
    public static SubLObject pph_partition_clauses_for_thecollectionof(final SubLObject v_clauses, final SubLObject path, final SubLObject var) {
        SubLObject includes = (SubLObject)pph_methods_formulas.NIL;
        SubLObject excludes = (SubLObject)pph_methods_formulas.NIL;
        SubLObject current;
        final SubLObject datum = current = pph_parse_variable_uses(var, v_clauses, path);
        SubLObject single_mentions = (SubLObject)pph_methods_formulas.NIL;
        SubLObject multiple_mentions = (SubLObject)pph_methods_formulas.NIL;
        SubLObject var_typing_clauses = (SubLObject)pph_methods_formulas.NIL;
        SubLObject nonmentions = (SubLObject)pph_methods_formulas.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list505);
        single_mentions = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list505);
        multiple_mentions = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list505);
        var_typing_clauses = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_methods_formulas.$list505);
        nonmentions = current.first();
        current = current.rest();
        if (pph_methods_formulas.NIL == current) {
            final SubLObject all_mentions = ConsesLow.append(single_mentions, multiple_mentions);
            if (pph_methods_formulas.NIL == single_mentions || !Sequences.length(all_mentions).equal((SubLObject)pph_methods_formulas.TWO_INTEGER) || pph_methods_formulas.NIL == var_typing_clauses) {
                return (SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.NIL, (SubLObject)pph_methods_formulas.NIL);
            }
            includes = (SubLObject)ConsesLow.cons(all_mentions.first(), includes);
            excludes = (SubLObject)ConsesLow.cons(conses_high.second(all_mentions), excludes);
            if (pph_methods_formulas.NIL != var_typing_clauses) {
                includes = (SubLObject)ConsesLow.cons(var_typing_clauses.first(), includes);
                if (pph_methods_formulas.NIL != var_typing_clauses.rest()) {
                    SubLObject cdolist_list_var = var_typing_clauses.rest();
                    SubLObject clause = (SubLObject)pph_methods_formulas.NIL;
                    clause = cdolist_list_var.first();
                    while (pph_methods_formulas.NIL != cdolist_list_var) {
                        excludes = (SubLObject)ConsesLow.cons(clause, excludes);
                        cdolist_list_var = cdolist_list_var.rest();
                        clause = cdolist_list_var.first();
                    }
                }
            }
            SubLObject cdolist_list_var = nonmentions;
            SubLObject clause = (SubLObject)pph_methods_formulas.NIL;
            clause = cdolist_list_var.first();
            while (pph_methods_formulas.NIL != cdolist_list_var) {
                excludes = (SubLObject)ConsesLow.cons(clause, excludes);
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_methods_formulas.$list505);
        }
        return (SubLObject)ConsesLow.list(includes, excludes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 205795L)
    public static SubLObject make_the_collection_naut_map(final SubLObject positions, final SubLObject formula, final SubLObject old_var) {
        final SubLObject new_var = cycl_variables.make_el_var((SubLObject)pph_methods_formulas.$str506$X);
        SubLObject conjuncts = (SubLObject)pph_methods_formulas.NIL;
        SubLObject cdolist_list_var = positions;
        SubLObject position = (SubLObject)pph_methods_formulas.NIL;
        position = cdolist_list_var.first();
        while (pph_methods_formulas.NIL != cdolist_list_var) {
            final SubLObject subformula = pph_utilities.pph_apply_template(position, formula);
            conjuncts = (SubLObject)ConsesLow.cons(pph_template_for_var_substitution(subformula, old_var, new_var, position), conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        }
        return el_utilities.make_binary_formula(pph_methods_formulas.$const507$TheCollectionOf, new_var, simplifier.conjoin(conjuncts, (SubLObject)pph_methods_formulas.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 206261L)
    public static SubLObject pph_parse_variable_uses(final SubLObject var, final SubLObject formulas, SubLObject path) {
        if (path == pph_methods_formulas.UNPROVIDED) {
            path = (SubLObject)pph_methods_formulas.NIL;
        }
        SubLObject arg1_mentions = (SubLObject)pph_methods_formulas.NIL;
        SubLObject other_mentions = (SubLObject)pph_methods_formulas.NIL;
        SubLObject var_typing_clauses = (SubLObject)pph_methods_formulas.NIL;
        SubLObject multiple_mentions = (SubLObject)pph_methods_formulas.NIL;
        SubLObject nonmentions = (SubLObject)pph_methods_formulas.NIL;
        SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
        SubLObject formula = (SubLObject)pph_methods_formulas.NIL;
        SubLObject index = (SubLObject)pph_methods_formulas.NIL;
        list_var = formulas;
        formula = list_var.first();
        for (index = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), formula = list_var.first(), index = Numbers.add((SubLObject)pph_methods_formulas.ONE_INTEGER, index)) {
            final SubLObject argnum = Numbers.add(index, (SubLObject)pph_methods_formulas.ONE_INTEGER);
            final SubLObject new_path = pph_utilities.make_formula_arg_naut(argnum, path);
            final SubLObject free_vars = el_utilities.sentence_free_variables(formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED);
            if (free_vars.equal((SubLObject)ConsesLow.list(var))) {
                if (pph_methods_formulas.NIL != pph_utilities.pph_var_typing_clauseP(formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED) && cycl_utilities.formula_arg(formula, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED).equal(var)) {
                    var_typing_clauses = (SubLObject)ConsesLow.cons(new_path, var_typing_clauses);
                }
                else if (cycl_utilities.formula_arg(formula, (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.UNPROVIDED).equal(var)) {
                    arg1_mentions = (SubLObject)ConsesLow.cons(new_path, arg1_mentions);
                }
                else {
                    other_mentions = (SubLObject)ConsesLow.cons(new_path, other_mentions);
                }
            }
            else if (pph_methods_formulas.NIL != Sequences.find(var, free_vars, (SubLObject)pph_methods_formulas.EQUAL, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
                multiple_mentions = (SubLObject)ConsesLow.cons(new_path, multiple_mentions);
            }
            else {
                nonmentions = (SubLObject)ConsesLow.cons(pph_utilities.make_formula_arg_naut(argnum, path), nonmentions);
            }
        }
        return (SubLObject)ConsesLow.list(ConsesLow.append(arg1_mentions, other_mentions), multiple_mentions, var_typing_clauses, nonmentions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-methods-formulas.lisp", position = 207382L)
    public static SubLObject pph_template_for_var_substitution(final SubLObject formula, final SubLObject old_var, final SubLObject new_var, SubLObject path) {
        if (path == pph_methods_formulas.UNPROVIDED) {
            path = (SubLObject)pph_methods_formulas.NIL;
        }
        if (formula.equal(old_var)) {
            return new_var;
        }
        if (formula.isAtom()) {
            return path;
        }
        if (pph_methods_formulas.NIL != cycl_utilities.formula_find(old_var, formula, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED, (SubLObject)pph_methods_formulas.UNPROVIDED)) {
            SubLObject submaps = (SubLObject)pph_methods_formulas.NIL;
            final SubLObject terms = cycl_utilities.formula_terms(formula, (SubLObject)pph_methods_formulas.$kw96$IGNORE);
            SubLObject list_var = (SubLObject)pph_methods_formulas.NIL;
            SubLObject arg = (SubLObject)pph_methods_formulas.NIL;
            SubLObject n = (SubLObject)pph_methods_formulas.NIL;
            list_var = terms;
            arg = list_var.first();
            for (n = (SubLObject)pph_methods_formulas.ZERO_INTEGER; pph_methods_formulas.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), n = number_utilities.f_1X(n)) {
                submaps = (SubLObject)ConsesLow.cons(pph_template_for_var_substitution(arg, old_var, new_var, pph_utilities.make_formula_arg_naut(n, path)), submaps);
            }
            return Sequences.reverse(submaps);
        }
        return path;
    }
    
    public static SubLObject declare_pph_methods_formulas_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_string_with_comma", "GENERATE-STRING-WITH-COMMA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_conjunctive_sequence", "GENERATE-CONJUNCTIVE-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_disjunctive_sequence", "GENERATE-DISJUNCTIVE-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_sequence", "GENERATE-SEQUENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_juncts", "GENERATE-JUNCTS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_juncts_output_list", "GENERATE-JUNCTS-OUTPUT-LIST", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_use_bullets_for_junct_listsP", "PPH-USE-BULLETS-FOR-JUNCT-LISTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_junct_lists_too_short_for_bulletsP", "PPH-JUNCT-LISTS-TOO-SHORT-FOR-BULLETS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_junct_olist_from_olists", "PPH-JUNCT-OLIST-FROM-OLISTS", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_methods_formulas", "add_to_junct_olist", "ADD-TO-JUNCT-OLIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_junct_olist_from_2_olists", "PPH-JUNCT-OLIST-FROM-2-OLISTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_junct_olist_from_3_or_more_olists", "PPH-JUNCT-OLIST-FROM-3-OR-MORE-OLISTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_comma_item", "PPH-COMMA-ITEM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_add_bullet_list_tags", "PPH-ADD-BULLET-LIST-TAGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_start_list_item", "PPH-START-LIST-ITEM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_end_list_item", "PPH-END-LIST-ITEM", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_start_list_tag", "PPH-START-LIST-TAG", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_end_list_tag", "PPH-END-LIST-TAG", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_start_list_item_item", "PPH-START-LIST-ITEM-ITEM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_end_list_item_item", "PPH-END-LIST-ITEM-ITEM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_operator_string_from_key", "PPH-OPERATOR-STRING-FROM-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_contextualize_junct_arg_positions", "PPH-CONTEXTUALIZE-JUNCT-ARG-POSITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_add_cycl_to_junct_olists", "PPH-ADD-CYCL-TO-JUNCT-OLISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "ordinal_form", "ORDINAL-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "ordinal_word", "ORDINAL-WORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "english_ordinal_suffix", "ENGLISH-ORDINAL-SUFFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_nth_expr", "GENERATE-NTH-EXPR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_atomic_formula", "GENERATE-ATOMIC-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "do_generate_atomic_formula", "DO-GENERATE-ATOMIC-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_all_phrases_for_formula", "GENERATE-ALL-PHRASES-FOR-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "genformat_assertion_fits_formulaP", "GENFORMAT-ASSERTION-FITS-FORMULA?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_agr_preds_for_cycl", "PPH-AGR-PREDS-FOR-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_atomic_formula_from_genformat", "GENERATE-ATOMIC-FORMULA-FROM-GENFORMAT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_atomic_formula_from_format_string_and_arg_order_list", "GENERATE-ATOMIC-FORMULA-FROM-FORMAT-STRING-AND-ARG-ORDER-LIST", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_output_list_from_format_string_and_args", "PPH-OUTPUT-LIST-FROM-FORMAT-STRING-AND-ARGS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_list_from_formula", "GET-LIST-FROM-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_genformat_string_and_list", "GET-GENFORMAT-STRING-AND-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_genformat_string_and_list_from_formula", "GET-GENFORMAT-STRING-AND-LIST-FROM-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_best_generation_template_as", "GET-BEST-GENERATION-TEMPLATE-AS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_generation_template_as_list", "GET-GENERATION-TEMPLATE-AS-LIST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "genformat_args_okP", "GENFORMAT-ARGS-OK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "genformat_precision_okP", "GENFORMAT-PRECISION-OK?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_reln_has_precise_templateP", "PPH-RELN-HAS-PRECISE-TEMPLATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_generation_template_as_list_for_relation_only", "GET-GENERATION-TEMPLATE-AS-LIST-FOR-RELATION-ONLY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_genformat_as_list", "GET-GENFORMAT-AS-LIST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_genformat_formula", "GET-GENFORMAT-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_genformat_arg", "GENERATE-GENFORMAT-ARG", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_connective_p", "PPH-CONNECTIVE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_get_connective", "PPH-GET-CONNECTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_genformat_arg_int", "GENERATE-GENFORMAT-ARG-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_maybe_add_determiner", "PPH-PHRASE-MAYBE-ADD-DETERMINER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_genformat_arg_finish", "GENERATE-GENFORMAT-ARG-FINISH", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_possessivize_output_item", "PPH-POSSESSIVIZE-OUTPUT-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_locativize_output_item", "PPH-LOCATIVIZE-OUTPUT-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_locativize_temporal_output_item", "PPH-LOCATIVIZE-TEMPORAL-OUTPUT-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_english_locative_preposition_for_temporal_denot", "PPH-ENGLISH-LOCATIVE-PREPOSITION-FOR-TEMPORAL-DENOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "arg_finish_leave_arg_position_aloneP", "ARG-FINISH-LEAVE-ARG-POSITION-ALONE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_determiner", "GET-DETERMINER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "word_sense_indicator", "WORD-SENSE-INDICATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "word_sense_indicators", "WORD-SENSE-INDICATORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_preferred_senses", "GET-PREFERRED-SENSES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "regularize_genformat_arglist", "REGULARIZE-GENFORMAT-ARGLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "process_genformat_arglist", "PROCESS-GENFORMAT-ARGLIST", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_find_output_list_matching_arg_num", "PPH-FIND-OUTPUT-LIST-MATCHING-ARG-NUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_genformat_arg_with_arg_order_list", "GENERATE-GENFORMAT-ARG-WITH-ARG-ORDER-LIST", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_introduce_anaphor", "PPH-INTRODUCE-ANAPHOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_reflexive_string", "PPH-REFLEXIVE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_poss_pronoun", "PPH-POSS-PRONOUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_date_naut", "GENERATE-DATE-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_english_year_naut", "GENERATE-ENGLISH-YEAR-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_english_year_olist", "GENERATE-ENGLISH-YEAR-OLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_english_month_naut", "GENERATE-ENGLISH-MONTH-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_english_month_name", "PPH-ENGLISH-MONTH-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_english_month_olist", "GENERATE-ENGLISH-MONTH-OLIST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_english_day_naut", "GENERATE-ENGLISH-DAY-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_english_day_olist", "GENERATE-ENGLISH-DAY-OLIST", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_date_phrase_olist", "PPH-DATE-PHRASE-OLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_date_naut_ok_for_generate_date_naut_p", "PPH-DATE-NAUT-OK-FOR-GENERATE-DATE-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_time_naut_olist", "PPH-TIME-NAUT-OLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_time_output_item", "PPH-TIME-OUTPUT-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_defining_time_unit", "PPH-DEFINING-TIME-UNIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_smaller_interval_type_than", "PPH-SMALLER-INTERVAL-TYPE-THAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_time_naut_millisecond_internal", "GENERATE-TIME-NAUT-MILLISECOND-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_time_naut_millisecond", "GENERATE-TIME-NAUT-MILLISECOND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_date_precision", "PPH-DATE-PRECISION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_date_precision_for_fn", "PPH-DATE-PRECISION-FOR-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_date_naut_strip_time", "PPH-DATE-NAUT-STRIP-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_english_date_disambiguation_string", "PPH-ENGLISH-DATE-DISAMBIGUATION-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_date_add_english_disambiguation_string", "PPH-DATE-ADD-ENGLISH-DISAMBIGUATION-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_nl_tagged_term", "GENERATE-NL-TAGGED-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_maybe_add_gaf_to_top_20", "PPH-MAYBE-ADD-GAF-TO-TOP-20", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_phrase_from_template", "GENERATE-PHRASE-FROM-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_transfer_old_onto_new", "PPH-PHRASE-TRANSFER-OLD-ONTO-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "new_pph_phrase_for_formula_and_gen_template_assertion", "NEW-PPH-PHRASE-FOR-FORMULA-AND-GEN-TEMPLATE-ASSERTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "do_generate_phrase_from_template", "DO-GENERATE-PHRASE-FROM-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_simple_negation", "GENERATE-SIMPLE-NEGATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_try_to_express_negation", "PPH-TRY-TO-EXPRESS-NEGATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_switch_non_subj_determiners", "PPH-SWITCH-NON-SUBJ-DETERMINERS", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_det_nbar_switch_quantifer", "PPH-DET-NBAR-SWITCH-QUANTIFER", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "maybe_add_do_support", "MAYBE-ADD-DO-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "add_not_to_phrase", "ADD-NOT-TO-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_negation_with_contracted_negative_auxiliary", "GENERATE-NEGATION-WITH-CONTRACTED-NEGATIVE-AUXILIARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_negation_with_not", "GENERATE-NEGATION-WITH-NOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_fn_to_arg_0", "GENERATE-FN-TO-ARG-0", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "get_np_gen_formula", "GET-NP-GEN-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_np_from_formula", "GENERATE-NP-FROM-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_kappa", "GENERATE-KAPPA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_existential", "GENERATE-EXISTENTIAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_english_explicit_existential", "GENERATE-ENGLISH-EXPLICIT-EXISTENTIAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_output_list_add_comma", "PPH-PHRASE-OUTPUT-LIST-ADD-COMMA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "quant_vars_phrase", "QUANT-VARS-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "quant_var_phrase", "QUANT-VAR-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "quant_body_phrase", "QUANT-BODY-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_strip_explicit_cycl_quants", "PPH-PHRASE-STRIP-EXPLICIT-CYCL-QUANTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_strip_explicit_cycl_quants", "PPH-STRIP-EXPLICIT-CYCL-QUANTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_filter_quantified_vars", "PPH-FILTER-QUANTIFIED-VARS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "fix_vars_output_list", "FIX-VARS-OUTPUT-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "remove_var_typing_clauses_from_existential", "REMOVE-VAR-TYPING-CLAUSES-FROM-EXISTENTIAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "put_back_wide_scope_existentials", "PUT-BACK-WIDE-SCOPE-EXISTENTIALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "put_back_wide_scope_quants", "PUT-BACK-WIDE-SCOPE-QUANTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_formula_ok_for_relational_nounP", "PPH-FORMULA-OK-FOR-RELATIONAL-NOUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_argnum_and_pred_ok_for_relational_nounP", "PPH-ARGNUM-AND-PRED-OK-FOR-RELATIONAL-NOUN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "relational_noun_args_for_pred_internal", "RELATIONAL-NOUN-ARGS-FOR-PRED-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "relational_noun_args_for_pred", "RELATIONAL-NOUN-ARGS-FOR-PRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_existential_with_relational_noun", "GENERATE-EXISTENTIAL-WITH-RELATIONAL-NOUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_naut_for_relational_noun_formula", "PPH-PHRASE-NAUT-FOR-RELATIONAL-NOUN-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_implication_smart", "GENERATE-IMPLICATION-SMART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_register_different_vars", "PPH-REGISTER-DIFFERENT-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "remove_var_typing_clauses_from_implication", "REMOVE-VAR-TYPING-CLAUSES-FROM-IMPLICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_ok_consequentP", "PPH-OK-CONSEQUENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_existential_rmp_sentenceP", "PPH-EXISTENTIAL-RMP-SENTENCE?", 1, 0, false);
        new $pph_existential_rmp_sentenceP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_universal_rmp_sentenceP", "PPH-UNIVERSAL-RMP-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_formula_contains_universalP", "PPH-FORMULA-CONTAINS-UNIVERSAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_universal_p", "PPH-UNIVERSAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "maybe_register_var_by_arg_constraints", "MAYBE-REGISTER-VAR-BY-ARG-CONSTRAINTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "register_var_by_arg_constraints", "REGISTER-VAR-BY-ARG-CONSTRAINTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_basic_var_type_for_collection", "PPH-BASIC-VAR-TYPE-FOR-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "remove_var_typing_clauses", "REMOVE-VAR-TYPING-CLAUSES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "handle_var_typing_clause", "HANDLE-VAR-TYPING-CLAUSE", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_var_has_better_typing_clause_p", "PPH-VAR-HAS-BETTER-TYPING-CLAUSE-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_better_typing_clause_p", "PPH-BETTER-TYPING-CLAUSE-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_better_var_type_p", "PPH-BETTER-VAR-TYPE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_sole_var_clause_p", "PPH-SOLE-VAR-CLAUSE-P", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_register_exception_vars", "PPH-REGISTER-EXCEPTION-VARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_register_exception_vars_recursive", "PPH-REGISTER-EXCEPTION-VARS-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "possibly_new_exceptional_var_p", "POSSIBLY-NEW-EXCEPTIONAL-VAR-P", 1, 0, false);
        new $possibly_new_exceptional_var_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_opaque_predP_internal", "PPH-OPAQUE-PRED?-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_opaque_predP", "PPH-OPAQUE-PRED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_reln_type_level_in_argP_internal", "PPH-RELN-TYPE-LEVEL-IN-ARG?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_reln_type_level_in_argP", "PPH-RELN-TYPE-LEVEL-IN-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_register_var_as_exception", "PPH-REGISTER-VAR-AS-EXCEPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_exceptional_var_p", "PPH-EXCEPTIONAL-VAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_cf_implication", "GENERATE-CF-IMPLICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_subcollection_with_relational_noun", "GENERATE-SUBCOLLECTION-WITH-RELATIONAL-NOUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "arg_in_reln_assertions_for_pred", "ARG-IN-RELN-ASSERTIONS-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "arg_in_reln_assertion_matches_head_of_subcollection_nautP", "ARG-IN-RELN-ASSERTION-MATCHES-HEAD-OF-SUBCOLLECTION-NAUT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_the_collection_with_rel_clause", "GENERATE-THE-COLLECTION-WITH-REL-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_subcollection_with_rel_clause", "GENERATE-SUBCOLLECTION-WITH-REL-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_collection_subset_with_rel_clause", "GENERATE-COLLECTION-SUBSET-WITH-REL-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_subcol_embedded_sentence", "PPH-SUBCOL-EMBEDDED-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_destructure_coll_subset", "PPH-DESTRUCTURE-COLL-SUBSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_rel_clause_embedded_sentence_subsentences_and_connective", "PPH-REL-CLAUSE-EMBEDDED-SENTENCE-SUBSENTENCES-AND-CONNECTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_subcol_embedded_sentence_template_internal", "PPH-SUBCOL-EMBEDDED-SENTENCE-TEMPLATE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_subcol_embedded_sentence_template", "PPH-SUBCOL-EMBEDDED-SENTENCE-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_coll_subset_embedded_sentence_subsentence_argpos_template", "PPH-COLL-SUBSET-EMBEDDED-SENTENCE-SUBSENTENCE-ARGPOS-TEMPLATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_coll_subset_embedded_sentence_subsentence_argpos_template_recursive", "PPH-COLL-SUBSET-EMBEDDED-SENTENCE-SUBSENTENCE-ARGPOS-TEMPLATE-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_rel_clause_templates", "PPH-REL-CLAUSE-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_rel_clause_subsentence_templates", "PPH-REL-CLAUSE-SUBSENTENCE-TEMPLATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_subj_rel_clause_for_subcol", "PPH-SUBJ-REL-CLAUSE-FOR-SUBCOL", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_rel_clause_for_coll_subset", "PPH-REL-CLAUSE-FOR-COLL-SUBSET", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "subcol_justifications_from_template", "SUBCOL-JUSTIFICATIONS-FROM-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_subj_rel_clause_from_gentemplate", "PPH-SUBJ-REL-CLAUSE-FROM-GENTEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_rel_clause_front_prepositionP", "PPH-REL-CLAUSE-FRONT-PREPOSITION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_rel_clause_from_gentemplate", "PPH-REL-CLAUSE-FROM-GENTEMPLATE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "new_rel_clause_head_dtr", "NEW-REL-CLAUSE-HEAD-DTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "update_relative_agrs_in_relative_clause_dtr", "UPDATE-RELATIVE-AGRS-IN-RELATIVE-CLAUSE-DTR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_subj_rel_clause_template_ok_for_copula_removalP", "PPH-SUBJ-REL-CLAUSE-TEMPLATE-OK-FOR-COPULA-REMOVAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_subj_rel_clause_from_genformat", "PPH-SUBJ-REL-CLAUSE-FROM-GENFORMAT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_subj_rel_clause_adjust_format_string", "PPH-SUBJ-REL-CLAUSE-ADJUST-FORMAT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_template_ok_for_rel_clauseP", "PPH-TEMPLATE-OK-FOR-REL-CLAUSE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_preds_of_string", "PPH-PREDS-OF-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_has_extractible_dtr_with_cyclP", "PPH-PHRASE-HAS-EXTRACTIBLE-DTR-WITH-CYCL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_find_extractible_dtr_with_cycl", "PPH-PHRASE-FIND-EXTRACTIBLE-DTR-WITH-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_cycl_containsP", "PPH-PHRASE-CYCL-CONTAINS?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_phrase_naut", "GENERATE-PHRASE-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_specified_scope_sentence", "GENERATE-SPECIFIED-SCOPE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_add_arg0_links_for_specified_scope_phrase", "PPH-ADD-ARG0-LINKS-FOR-SPECIFIED-SCOPE-PHRASE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_rmp_sentence_via_expansion", "GENERATE-RMP-SENTENCE-VIA-EXPANSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_generate_with_proper_scope", "PPH-PHRASE-GENERATE-WITH-PROPER-SCOPE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_adjust_arg0_links", "PPH-PHRASE-ADJUST-ARG0-LINKS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "scopally_unambiguousP_internal", "SCOPALLY-UNAMBIGUOUS?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "scopally_unambiguousP", "SCOPALLY-UNAMBIGUOUS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_generate_with_proper_scopeXpred", "PPH-PHRASE-GENERATE-WITH-PROPER-SCOPE&PRED", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "wide_scope_arg_in_pred", "WIDE-SCOPE-ARG-IN-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "specified_wide_scope_argnum", "SPECIFIED-WIDE-SCOPE-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "associated_arg_in_pred", "ASSOCIATED-ARG-IN-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "arg_mapping_tuples", "ARG-MAPPING-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "intermediate_cycl_template_for_rmp_formula", "INTERMEDIATE-CYCL-TEMPLATE-FOR-RMP-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "make_det_nbar", "MAKE-DET-NBAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "det_agr_constraints", "DET-AGR-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "clear_quant_over_arg_tuples", "CLEAR-QUANT-OVER-ARG-TUPLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "remove_quant_over_arg_tuples", "REMOVE-QUANT-OVER-ARG-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "quant_over_arg_tuples_internal", "QUANT-OVER-ARG-TUPLES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "quant_over_arg_tuples", "QUANT-OVER-ARG-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "ordered_quant_tuples", "ORDERED-QUANT-TUPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "some_proper_scope_genformat", "SOME-PROPER-SCOPE-GENFORMAT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "genformat_has_correct_scopeP", "GENFORMAT-HAS-CORRECT-SCOPE?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "find_proper_scope_gentemplate_phrase", "FIND-PROPER-SCOPE-GENTEMPLATE-PHRASE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_has_focal_argnumP", "PPH-PHRASE-HAS-FOCAL-ARGNUM?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_argnum_has_focusP", "PPH-PHRASE-ARGNUM-HAS-FOCUS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "argnum_is_initial_in_genformatP", "ARGNUM-IS-INITIAL-IN-GENFORMAT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "genformat_string_arg_initialP", "GENFORMAT-STRING-ARG-INITIAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "default_genformat_arglist", "DEFAULT-GENFORMAT-ARGLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_allow_var_typingP_internal", "PPH-ALLOW-VAR-TYPING?-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_allow_var_typingP", "PPH-ALLOW-VAR-TYPING?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_universal", "GENERATE-UNIVERSAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_phrase_ok_for_generate_english_explicit_universalP", "PPH-PHRASE-OK-FOR-GENERATE-ENGLISH-EXPLICIT-UNIVERSAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_english_explicit_universal", "GENERATE-ENGLISH-EXPLICIT-UNIVERSAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_formula_contains_existentialP", "PPH-FORMULA-CONTAINS-EXISTENTIAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_existential_formula_p", "PPH-EXISTENTIAL-FORMULA-P", 1, 0, false);
        new $pph_existential_formula_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_existential_p", "PPH-EXISTENTIAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_existential_operator_p", "PPH-EXISTENTIAL-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_ok_bare_universalP", "PPH-OK-BARE-UNIVERSAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "maybe_simplify_explicit_universal", "MAYBE-SIMPLIFY-EXPLICIT-UNIVERSAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_negative_polarity_sentenceP", "PPH-NEGATIVE-POLARITY-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "put_back_wide_scope_universals", "PUT-BACK-WIDE-SCOPE-UNIVERSALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_universal_with_atomic_scope", "GENERATE-UNIVERSAL-WITH-ATOMIC-SCOPE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "remove_var_typing_clauses_from_universal", "REMOVE-VAR-TYPING-CLAUSES-FROM-UNIVERSAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "remove_var_typing_clauses_from_universal_recursive", "REMOVE-VAR-TYPING-CLAUSES-FROM-UNIVERSAL-RECURSIVE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_gather_antecedents", "PPH-GATHER-ANTECEDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_unicode_naut", "GENERATE-UNICODE-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_set_to_subcollection", "PPH-SET-TO-SUBCOLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_set_to_subcol_template", "PPH-SET-TO-SUBCOL-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_set_naut", "GENERATE-SET-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_with_holds_of", "GENERATE-WITH-HOLDS-OF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "do_generate_with_holds_of", "DO-GENERATE-WITH-HOLDS-OF", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_with_holds_of_paraphrase_operatorP", "GENERATE-WITH-HOLDS-OF-PARAPHRASE-OPERATOR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_conjunction_head_driven", "GENERATE-CONJUNCTION-HEAD-DRIVEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_conjunction_head_driven_internal", "GENERATE-CONJUNCTION-HEAD-DRIVEN-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_conjunction_head_driven_with_head_clause", "GENERATE-CONJUNCTION-HEAD-DRIVEN-WITH-HEAD-CLAUSE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_head_string_okP", "PPH-HEAD-STRING-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_maybe_add_subject_for_head", "PPH-MAYBE-ADD-SUBJECT-FOR-HEAD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_subj_clause_pattern", "PPH-SUBJ-CLAUSE-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_add_subj_dtr", "PPH-ADD-SUBJ-DTR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_possibly_reduced_coordination", "GENERATE-POSSIBLY-REDUCED-COORDINATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_create_coordination_template", "PPH-CREATE-COORDINATION-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_reducible_coordination", "PPH-REDUCIBLE-COORDINATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "generate_existential_with_thecollectionof", "GENERATE-EXISTENTIAL-WITH-THECOLLECTIONOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_reformulate_existential_with_thecollectionof", "PPH-REFORMULATE-EXISTENTIAL-WITH-THECOLLECTIONOF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_reformulate_conjunction_with_thecollectionof", "PPH-REFORMULATE-CONJUNCTION-WITH-THECOLLECTIONOF", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_partition_clauses_for_thecollectionof", "PPH-PARTITION-CLAUSES-FOR-THECOLLECTIONOF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "make_the_collection_naut_map", "MAKE-THE-COLLECTION-NAUT-MAP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_parse_variable_uses", "PPH-PARSE-VARIABLE-USES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_methods_formulas", "pph_template_for_var_substitution", "PPH-TEMPLATE-FOR-VAR-SUBSTITUTION", 3, 1, false);
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    public static SubLObject init_pph_methods_formulas_file() {
        pph_methods_formulas.$pph_allow_subl_listsP$ = SubLFiles.deflexical("*PPH-ALLOW-SUBL-LISTS?*", (SubLObject)pph_methods_formulas.T);
        pph_methods_formulas.$pph_connectives$ = SubLFiles.defconstant("*PPH-CONNECTIVES*", (SubLObject)pph_methods_formulas.$list140);
        pph_methods_formulas.$pph_english_month_names$ = SubLFiles.deflexical("*PPH-ENGLISH-MONTH-NAMES*", (SubLObject)pph_methods_formulas.$list182);
        pph_methods_formulas.$pph_dates$ = SubLFiles.deflexical("*PPH-DATES*", (SubLObject)pph_methods_formulas.NIL);
        pph_methods_formulas.$pph_english_date_disambiguation_strings$ = SubLFiles.deflexical("*PPH-ENGLISH-DATE-DISAMBIGUATION-STRINGS*", (SubLObject)pph_methods_formulas.$list205);
        pph_methods_formulas.$pph_new_exception_vars$ = SubLFiles.defparameter("*PPH-NEW-EXCEPTION-VARS*", (SubLObject)pph_methods_formulas.NIL);
        pph_methods_formulas.$pph_generate_collection_subset_with_rel_clauseP$ = SubLFiles.defparameter("*PPH-GENERATE-COLLECTION-SUBSET-WITH-REL-CLAUSE?*", (SubLObject)pph_methods_formulas.T);
        pph_methods_formulas.$pph_front_prepositionsP$ = SubLFiles.defparameter("*PPH-FRONT-PREPOSITIONS?*", (SubLObject)pph_methods_formulas.T);
        pph_methods_formulas.$pph_allow_copula_removalP$ = SubLFiles.defparameter("*PPH-ALLOW-COPULA-REMOVAL?*", (SubLObject)pph_methods_formulas.NIL);
        pph_methods_formulas.$quant_over_arg_tuples_caching_state$ = SubLFiles.deflexical("*QUANT-OVER-ARG-TUPLES-CACHING-STATE*", (SubLObject)pph_methods_formulas.NIL);
        pph_methods_formulas.$pph_existential_operators$ = SubLFiles.deflexical("*PPH-EXISTENTIAL-OPERATORS*", (SubLObject)pph_methods_formulas.$kw461$UNINITIALIZED);
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    public static SubLObject setup_pph_methods_formulas_file() {
        generic_testing.define_test_case_table_int((SubLObject)pph_methods_formulas.$sym53$ORDINAL_FORM, (SubLObject)ConsesLow.list(new SubLObject[] { pph_methods_formulas.$kw54$TEST, Symbols.symbol_function((SubLObject)pph_methods_formulas.EQUAL), pph_methods_formulas.$kw55$OWNER, pph_methods_formulas.NIL, pph_methods_formulas.$kw56$CLASSES, pph_methods_formulas.$list57, pph_methods_formulas.$kw58$KB, pph_methods_formulas.$kw59$FULL, pph_methods_formulas.$kw60$WORKING_, pph_methods_formulas.T }), (SubLObject)pph_methods_formulas.$list61);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym70$GENERATE_NTH_EXPR, (SubLObject)pph_methods_formulas.$kw71$NTH_EXPR, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym81$GENERATE_ATOMIC_FORMULA, (SubLObject)pph_methods_formulas.$kw82$CYCL_SENTENCE, (SubLObject)pph_methods_formulas.$kw83$DECENT);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym81$GENERATE_ATOMIC_FORMULA, (SubLObject)pph_methods_formulas.$kw84$NAUT, (SubLObject)pph_methods_formulas.$kw83$DECENT);
        access_macros.define_obsolete_register((SubLObject)pph_methods_formulas.$sym91$GENERATE_ALL_PHRASES_FOR_FORMULA, (SubLObject)pph_methods_formulas.$list92);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym173$GENERATE_DATE_NAUT, (SubLObject)pph_methods_formulas.$kw174$DATE_NAUT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym175$GENERATE_ENGLISH_YEAR_NAUT, (SubLObject)pph_methods_formulas.$kw176$YEAR_NAUT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym178$GENERATE_ENGLISH_MONTH_NAUT, (SubLObject)pph_methods_formulas.$kw179$MONTH_NAUT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym184$GENERATE_ENGLISH_DAY_NAUT, (SubLObject)pph_methods_formulas.$kw185$DAY_NAUT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym206$GENERATE_PHRASE_FROM_TEMPLATE, (SubLObject)pph_methods_formulas.$kw82$CYCL_SENTENCE, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym206$GENERATE_PHRASE_FROM_TEMPLATE, (SubLObject)pph_methods_formulas.$kw84$NAUT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym207$GENERATE_NL_TAGGED_TERM, (SubLObject)pph_methods_formulas.$kw208$NL_TAGGED_TERM, (SubLObject)pph_methods_formulas.$kw83$DECENT);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_methods_formulas.$sym207$GENERATE_NL_TAGGED_TERM);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym238$GENERATE_SIMPLE_NEGATION, (SubLObject)pph_methods_formulas.$kw239$NEGATION, (SubLObject)pph_methods_formulas.$kw72$BEST);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_methods_formulas.$sym238$GENERATE_SIMPLE_NEGATION);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym256$GENERATE_FN_TO_ARG_0, (SubLObject)pph_methods_formulas.$kw257$FN_TO_ARG_0, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym266$GENERATE_KAPPA, (SubLObject)pph_methods_formulas.$kw267$KAPPA_EXPR, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym270$GENERATE_EXISTENTIAL, (SubLObject)pph_methods_formulas.$kw271$EXISTENTIAL, (SubLObject)pph_methods_formulas.$kw83$DECENT);
        memoization_state.note_memoized_function((SubLObject)pph_methods_formulas.$sym291$RELATIONAL_NOUN_ARGS_FOR_PRED);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym297$GENERATE_IMPLICATION_SMART, (SubLObject)pph_methods_formulas.$kw298$IMPLICATION, (SubLObject)pph_methods_formulas.$kw72$BEST);
        memoization_state.note_memoized_function((SubLObject)pph_methods_formulas.$sym324$PPH_OPAQUE_PRED_);
        memoization_state.note_memoized_function((SubLObject)pph_methods_formulas.$sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym334$GENERATE_CF_IMPLICATION, (SubLObject)pph_methods_formulas.$kw335$CF_IMPLICATION, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym338$GENERATE_SUBCOLLECTION_WITH_RELATIONAL_NOUN, (SubLObject)pph_methods_formulas.$kw339$RELATIONAL_NOUN_SUBCOLLECTION_NAUT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym348$GENERATE_THE_COLLECTION_WITH_REL_CLAUSE, (SubLObject)pph_methods_formulas.$kw349$THE_COLLECTION_OF_NAT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym354$GENERATE_SUBCOLLECTION_WITH_REL_CLAUSE, (SubLObject)pph_methods_formulas.$kw355$SUBCOLLECTION_RELATION_NAUT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        memoization_state.note_memoized_function((SubLObject)pph_methods_formulas.$sym359$PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym394$GENERATE_PHRASE_NAUT, (SubLObject)pph_methods_formulas.$kw395$PHRASE_DENOTING_NAUT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym398$GENERATE_SPECIFIED_SCOPE_SENTENCE, (SubLObject)pph_methods_formulas.$kw399$SPECIFIED_SCOPE_SENTENCE, (SubLObject)pph_methods_formulas.$kw83$DECENT);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym402$GENERATE_RMP_SENTENCE_VIA_EXPANSION, (SubLObject)pph_methods_formulas.$kw403$RMP_SENTENCE, (SubLObject)pph_methods_formulas.$kw83$DECENT);
        memoization_state.note_memoized_function((SubLObject)pph_methods_formulas.$sym412$SCOPALLY_UNAMBIGUOUS_);
        memoization_state.note_globally_cached_function((SubLObject)pph_methods_formulas.$sym436$QUANT_OVER_ARG_TUPLES);
        memoization_state.note_memoized_function((SubLObject)pph_methods_formulas.$sym451$PPH_ALLOW_VAR_TYPING_);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym454$GENERATE_UNIVERSAL, (SubLObject)pph_methods_formulas.$kw273$UNIVERSAL, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym468$GENERATE_UNICODE_NAUT, (SubLObject)pph_methods_formulas.$kw469$UNICODE_NAUT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym473$GENERATE_SET_NAUT, (SubLObject)pph_methods_formulas.$kw474$SET_NAUT, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym477$GENERATE_WITH_HOLDS_OF, (SubLObject)pph_methods_formulas.$kw478$ATOMIC_SENTENCE, (SubLObject)pph_methods_formulas.$kw479$FALLBACK);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym488$GENERATE_CONJUNCTION_HEAD_DRIVEN, (SubLObject)pph_methods_formulas.$kw489$CONJUNCTION, (SubLObject)pph_methods_formulas.$kw72$BEST);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_methods_formulas.$sym488$GENERATE_CONJUNCTION_HEAD_DRIVEN);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym496$GENERATE_POSSIBLY_REDUCED_COORDINATION, (SubLObject)pph_methods_formulas.$kw497$COORDINATION, (SubLObject)pph_methods_formulas.$kw72$BEST);
        pph_types.pph_register_method((SubLObject)pph_methods_formulas.$sym501$GENERATE_EXISTENTIAL_WITH_THECOLLECTIONOF, (SubLObject)pph_methods_formulas.$kw271$EXISTENTIAL, (SubLObject)pph_methods_formulas.$kw72$BEST);
        return (SubLObject)pph_methods_formulas.NIL;
    }
    
    public void declareFunctions() {
        declare_pph_methods_formulas_file();
    }
    
    public void initializeVariables() {
        init_pph_methods_formulas_file();
    }
    
    public void runTopLevelForms() {
        setup_pph_methods_formulas_file();
    }
    
    static {
        me = (SubLFile)new pph_methods_formulas();
        pph_methods_formulas.$pph_allow_subl_listsP$ = null;
        pph_methods_formulas.$pph_connectives$ = null;
        pph_methods_formulas.$pph_english_month_names$ = null;
        pph_methods_formulas.$pph_dates$ = null;
        pph_methods_formulas.$pph_english_date_disambiguation_strings$ = null;
        pph_methods_formulas.$pph_new_exception_vars$ = null;
        pph_methods_formulas.$pph_generate_collection_subset_with_rel_clauseP$ = null;
        pph_methods_formulas.$pph_front_prepositionsP$ = null;
        pph_methods_formulas.$pph_allow_copula_removalP$ = null;
        pph_methods_formulas.$quant_over_arg_tuples_caching_state$ = null;
        pph_methods_formulas.$pph_existential_operators$ = null;
        $str0$_ = SubLObjectFactory.makeString(",");
        $str1$and = SubLObjectFactory.makeString("and");
        $str2$or = SubLObjectFactory.makeString("or");
        $str3$_ = SubLObjectFactory.makeString(" ");
        $sym4$GENERATE_STRING_WITH_COMMA = SubLObjectFactory.makeSymbol("GENERATE-STRING-WITH-COMMA");
        $kw5$AND = SubLObjectFactory.makeKeyword("AND");
        $kw6$UNORDERED = SubLObjectFactory.makeKeyword("UNORDERED");
        $kw7$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $str8$__Trying_default_precision___S___ = SubLObjectFactory.makeString("~&Trying default precision: ~S.~%");
        $sym9$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str10$__Working_on_dupe_list___S__ = SubLObjectFactory.makeString("~&Working on dupe list: ~S~%");
        $str11$__Trying_to_reparaphrase__S___ = SubLObjectFactory.makeString("~&Trying to reparaphrase ~S.~%");
        $str12$__Trying_targeted_precision__S_fo = SubLObjectFactory.makeString("~&Trying targeted precision ~S for ~S");
        $sym13$PPH_PRECISION_P = SubLObjectFactory.makeSymbol("PPH-PRECISION-P");
        $str14$__New_paraphrase_with_precision__ = SubLObjectFactory.makeString("~&New paraphrase with precision ~S for ~S:~% ~S");
        $str15$__Trying_full_precision_for__S = SubLObjectFactory.makeString("~&Trying full precision for ~S");
        $str16$__New_paraphrase_with_full_precis = SubLObjectFactory.makeString("~&New paraphrase with full precision for ~S:~% ~S");
        $str17$__Changing_output_list_for__S_fro = SubLObjectFactory.makeString("~&Changing output-list for ~S from~% ~S to~% ~S.~%");
        $kw18$NEW = SubLObjectFactory.makeKeyword("NEW");
        $sym19$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $str20$__Suspending_bullet_use_for____S_ = SubLObjectFactory.makeString("~&Suspending bullet use for~% ~S~%");
        $str21$__Turning_bullet_use_back_on___ = SubLObjectFactory.makeString("~&Turning bullet use back on.~%");
        $str22$__Not_using_bullets____PPH_USE_BU = SubLObjectFactory.makeString("~&Not using bullets - *PPH-USE-BULLETED-LISTS?* is NIL.~%");
        $str23$__Not_using_bullets___list_is_too = SubLObjectFactory.makeString("~&Not using bullets - list is too short~%");
        $sym24$GREATER_LENGTH_P = SubLObjectFactory.makeSymbol("GREATER-LENGTH-P");
        $const25$verbStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbStrings"));
        $str26$__Found_verb__S__Using_bullets_fo = SubLObjectFactory.makeString("~&Found verb ~S. Using bullets for ~%");
        $str27$____S__ = SubLObjectFactory.makeString("~& ~S~%");
        $sym28$PPH_PHRASE_OUTPUT_ITEM_STRING = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-STRING");
        $str29$__Not_using_bullets___Failed_to_f = SubLObjectFactory.makeString("~&Not using bullets - Failed to find a verb.~%");
        $int30$40 = SubLObjectFactory.makeInteger(40);
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANS"), (SubLObject)SubLObjectFactory.makeSymbol("AS-LIST-ITEM?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym32$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym33$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym34$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-START-LIST-ITEM-ITEM"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-END-LIST-ITEM-ITEM"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-LIST"));
        $sym38$ALPHA_CHAR_P = SubLObjectFactory.makeSymbol("ALPHA-CHAR-P");
        $kw39$HTML = SubLObjectFactory.makeKeyword("HTML");
        $str40$_ = SubLObjectFactory.makeString(">");
        $kw41$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw42$SPACE = SubLObjectFactory.makeKeyword("SPACE");
        $kw43$PERIOD = SubLObjectFactory.makeKeyword("PERIOD");
        $str44$_ = SubLObjectFactory.makeString(".");
        $kw45$OR = SubLObjectFactory.makeKeyword("OR");
        $kw46$AND_OR = SubLObjectFactory.makeKeyword("AND-OR");
        $str47$and_or = SubLObjectFactory.makeString("and/or");
        $kw48$BUT = SubLObjectFactory.makeKeyword("BUT");
        $str49$but = SubLObjectFactory.makeString("but");
        $const50$OrdinalAdjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OrdinalAdjective"));
        $list51 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("determinerStrings")));
        $str52$Can_t_generate_ordinal_form_of__S = SubLObjectFactory.makeString("Can't generate ordinal form of ~S in ~S.");
        $sym53$ORDINAL_FORM = SubLObjectFactory.makeSymbol("ORDINAL-FORM");
        $kw54$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw55$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw56$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-TEST-CASE-TABLES"));
        $kw58$KB = SubLObjectFactory.makeKeyword("KB");
        $kw59$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw60$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.FOUR_INTEGER), (SubLObject)SubLObjectFactory.makeString("fourth")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(444)), (SubLObject)SubLObjectFactory.makeString("444th")));
        $sym62$_WU = SubLObjectFactory.makeSymbol("?WU");
        $const63$denotation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation"));
        $sym64$_SENSE = SubLObjectFactory.makeSymbol("?SENSE");
        $int65$100 = SubLObjectFactory.makeInteger(100);
        $str66$st = SubLObjectFactory.makeString("st");
        $str67$nd = SubLObjectFactory.makeString("nd");
        $str68$rd = SubLObjectFactory.makeString("rd");
        $str69$th = SubLObjectFactory.makeString("th");
        $sym70$GENERATE_NTH_EXPR = SubLObjectFactory.makeSymbol("GENERATE-NTH-EXPR");
        $kw71$NTH_EXPR = SubLObjectFactory.makeKeyword("NTH-EXPR");
        $kw72$BEST = SubLObjectFactory.makeKeyword("BEST");
        $const73$nthLargestElement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nthLargestElement"));
        $str74$largest = SubLObjectFactory.makeString("largest");
        $str75$smallest = SubLObjectFactory.makeString("smallest");
        $str76$all = SubLObjectFactory.makeString("all");
        $list77 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic")));
        $list78 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")));
        $str79$has_the = SubLObjectFactory.makeString("has the");
        $str80$of = SubLObjectFactory.makeString("of");
        $sym81$GENERATE_ATOMIC_FORMULA = SubLObjectFactory.makeSymbol("GENERATE-ATOMIC-FORMULA");
        $kw82$CYCL_SENTENCE = SubLObjectFactory.makeKeyword("CYCL-SENTENCE");
        $kw83$DECENT = SubLObjectFactory.makeKeyword("DECENT");
        $kw84$NAUT = SubLObjectFactory.makeKeyword("NAUT");
        $str85$GENERATE_ATOMIC_FORMULA_called_on = SubLObjectFactory.makeString("GENERATE-ATOMIC-FORMULA called on PPH phrase with dtrs:~% ~S~%");
        $str86$__Entering_PPH_POSSIBLY_BINDING_V = SubLObjectFactory.makeString("~&Entering PPH-POSSIBLY-BINDING-VARIABLES(~S), *pph-var-types* are~% ~S~%");
        $kw87$GENERATE_ATOMIC_FORMULA_WITH_AGR = SubLObjectFactory.makeKeyword("GENERATE-ATOMIC-FORMULA-WITH-AGR");
        $str88$__Leaving_PPH_POSSIBLY_BINDING_VA = SubLObjectFactory.makeString("~&Leaving PPH-POSSIBLY-BINDING-VARIABLES(~S), vars in local *pph-var-types* were ~s ");
        $str89$______and__pph_var_types__are_now = SubLObjectFactory.makeString("~&... and *pph-var-types* are now ~S~%");
        $str90$__Using_template_assertion___S___ = SubLObjectFactory.makeString("~&Using template assertion: ~S.~%");
        $sym91$GENERATE_ALL_PHRASES_FOR_FORMULA = SubLObjectFactory.makeSymbol("GENERATE-ALL-PHRASES-FOR-FORMULA");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-PHRASES-FOR-FORMULA"));
        $kw93$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw94$ANY = SubLObjectFactory.makeKeyword("ANY");
        $kw95$REGULARIZE = SubLObjectFactory.makeKeyword("REGULARIZE");
        $kw96$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str97$Can_t_use__S_with__S = SubLObjectFactory.makeString("Can't use ~S with ~S");
        $list98 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RELN"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym99$PPH_PHRASE_GENERATE_STRING_FROM_CYCL = SubLObjectFactory.makeSymbol("PPH-PHRASE-GENERATE-STRING-FROM-CYCL");
        $list100 = ConsesLow.list((SubLObject)pph_methods_formulas.ZERO_INTEGER);
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~"));
        $str102$_ = SubLObjectFactory.makeString("~");
        $sym103$EL_LIST_P = SubLObjectFactory.makeSymbol("EL-LIST-P");
        $const104$genFormat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genFormat"));
        $const105$genFormat_Precise = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genFormat-Precise"));
        $const106$genFormat_NP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genFormat-NP"));
        $const107$genQuestion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genQuestion"));
        $const108$genFormat_ArgFixed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genFormat-ArgFixed"));
        $const109$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw110$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw111$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw112$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw113$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $const114$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $sym115$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw116$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str117$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym118$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw119$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str120$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw121$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str122$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str123$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str124$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str125$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $str126$___S_not_referenced_in__S____Curr = SubLObjectFactory.makeString("~&~S not referenced in ~S.~% Current precision: ~S~%");
        $sym127$PPH_UNREGISTERED_VARIABLE_ = SubLObjectFactory.makeSymbol("PPH-UNREGISTERED-VARIABLE?");
        $sym128$RELEVANT_PRED_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EVERYTHING");
        $kw129$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym130$PPH_FORBIDDEN_LEXICAL_ASSERTION_ = SubLObjectFactory.makeSymbol("PPH-FORBIDDEN-LEXICAL-ASSERTION?");
        $sym131$GENFORMAT_PRECISION_OK_ = SubLObjectFactory.makeSymbol("GENFORMAT-PRECISION-OK?");
        $str132$__Looking_for_paraphrase_template = SubLObjectFactory.makeString("~&Looking for paraphrase templates for ~S from ~S.~%");
        $str133$__No__S_assertions_found_for__S_f = SubLObjectFactory.makeString("~&No ~S assertions found for ~S from ~S.~%");
        $str134$__Couldn_t_find_paraphrase_templa = SubLObjectFactory.makeString("~&Couldn't find paraphrase template for ~S. Using one for ~S instead.~%");
        $str135$__Paraphrasing__S_with_sublist__S = SubLObjectFactory.makeString("~&Paraphrasing ~S with sublist ~S and precision ~S.~%");
        $sym136$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $sym137$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym138$PPH_CONNECTIVE_P = SubLObjectFactory.makeSymbol("PPH-CONNECTIVE-P");
        $str139$__GENERATE_GENFORMAT_ARG_Result__ = SubLObjectFactory.makeString("~&GENERATE-GENFORMAT-ARG Result: ~S.~%");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("AND-OR"), (SubLObject)SubLObjectFactory.makeKeyword("SPACE"), (SubLObject)SubLObjectFactory.makeKeyword("PERIOD"));
        $const141$CycUniversalDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycUniversalDate"));
        $const142$CycUniversalSecond = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycUniversalSecond"));
        $str143$__a_ = SubLObjectFactory.makeString("`~a'");
        $str144$__Using_preferred_senses__S__ = SubLObjectFactory.makeString("~&Using preferred senses ~S~%");
        $list145 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)pph_methods_formulas.ONE_INTEGER);
        $const146$DurationFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DurationFn"));
        $str147$in = SubLObjectFactory.makeString("in");
        $str148$at = SubLObjectFactory.makeString("at");
        $str149$on = SubLObjectFactory.makeString("on");
        $sym150$PPH_DETERMINER_ = SubLObjectFactory.makeSymbol("PPH-DETERMINER?");
        $sym151$PPH_CASE_KW_ = SubLObjectFactory.makeSymbol("PPH-CASE-KW?");
        $sym152$WORD_SENSE_INDICATOR = SubLObjectFactory.makeSymbol("WORD-SENSE-INDICATOR");
        $list153 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnPlural")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentive-Pl")));
        $sym154$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $str155$__Couldn_t_paraphrase_args__S_wit = SubLObjectFactory.makeString("~&Couldn't paraphrase args ~S with arg-order-list ~S~%");
        $sym156$PPH_PHRASE_OUTPUT_LIST_P = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-P");
        $sym157$PPH_STRING_P = SubLObjectFactory.makeSymbol("PPH-STRING-P");
        $sym158$PPH_PHRASE_OUTPUT_LIST_STRING = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING");
        $str159$__Couldn_t_paraphrase__S___ = SubLObjectFactory.makeString("~&Couldn't paraphrase ~S.~%");
        $str160$__PROCESS_GEN_FORMAT_ARGLIST____W = SubLObjectFactory.makeString("~&PROCESS-GEN-FORMAT-ARGLIST:~% Working on ~S.~%Done: ~S.~%");
        $str161$Making_copy_of_reused_output_item = SubLObjectFactory.makeString("Making copy of reused output items:~% ~S");
        $sym162$PPH_PHRASE_OUTPUT_ITEM_COPY = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-ITEM-COPY");
        $str163$Generating_with___genFormat_for_m = SubLObjectFactory.makeString("Generating with #$genFormat for motherless phrase:~% ~S~%");
        $const164$TheInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheInstance"));
        $const165$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn"));
        $const166$possessiveRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("possessiveRelation"));
        $kw167$NON_PLURAL_GENERIC = SubLObjectFactory.makeKeyword("NON-PLURAL-GENERIC");
        $const168$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NON-PLURAL-GENERIC"), (SubLObject)SubLObjectFactory.makeKeyword("A"));
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SINGULAR-GENERIC"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Another-TheWord")));
        $const171$ThirdPerson_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThirdPerson-NLAttr"));
        $const172$ReflexivePronoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReflexivePronoun"));
        $sym173$GENERATE_DATE_NAUT = SubLObjectFactory.makeSymbol("GENERATE-DATE-NAUT");
        $kw174$DATE_NAUT = SubLObjectFactory.makeKeyword("DATE-NAUT");
        $sym175$GENERATE_ENGLISH_YEAR_NAUT = SubLObjectFactory.makeSymbol("GENERATE-ENGLISH-YEAR-NAUT");
        $kw176$YEAR_NAUT = SubLObjectFactory.makeKeyword("YEAR-NAUT");
        $kw177$YEAR = SubLObjectFactory.makeKeyword("YEAR");
        $sym178$GENERATE_ENGLISH_MONTH_NAUT = SubLObjectFactory.makeSymbol("GENERATE-ENGLISH-MONTH-NAUT");
        $kw179$MONTH_NAUT = SubLObjectFactory.makeKeyword("MONTH-NAUT");
        $list180 = ConsesLow.list((SubLObject)pph_methods_formulas.ONE_INTEGER);
        $list181 = ConsesLow.list((SubLObject)pph_methods_formulas.TWO_INTEGER);
        $list182 = ConsesLow.list(new SubLObject[] { ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)SubLObjectFactory.makeString("January")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("February")), (SubLObject)SubLObjectFactory.makeString("February")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("March")), (SubLObject)SubLObjectFactory.makeString("March")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("April")), (SubLObject)SubLObjectFactory.makeString("April")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("May")), (SubLObject)SubLObjectFactory.makeString("May")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("June")), (SubLObject)SubLObjectFactory.makeString("June")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("July")), (SubLObject)SubLObjectFactory.makeString("July")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("August")), (SubLObject)SubLObjectFactory.makeString("August")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("September")), (SubLObject)SubLObjectFactory.makeString("September")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("October")), (SubLObject)SubLObjectFactory.makeString("October")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("November")), (SubLObject)SubLObjectFactory.makeString("November")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)SubLObjectFactory.makeString("December")) });
        $kw183$MONTH = SubLObjectFactory.makeKeyword("MONTH");
        $sym184$GENERATE_ENGLISH_DAY_NAUT = SubLObjectFactory.makeSymbol("GENERATE-ENGLISH-DAY-NAUT");
        $kw185$DAY_NAUT = SubLObjectFactory.makeKeyword("DAY-NAUT");
        $list186 = ConsesLow.list((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.ONE_INTEGER);
        $list187 = ConsesLow.list((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.TWO_INTEGER);
        $kw188$DAY = SubLObjectFactory.makeKeyword("DAY");
        $list189 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecadeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CenturyFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeasonFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuarterFn")));
        $str190$_2__0D = SubLObjectFactory.makeString("~2,'0D");
        $const191$CalendarMilliSecond = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarMilliSecond"));
        $const192$MillisecondsDuration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MillisecondsDuration"));
        $kw193$ARG1 = SubLObjectFactory.makeKeyword("ARG1");
        $const194$CalendarSecond = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarSecond"));
        $str195$_3__0D = SubLObjectFactory.makeString("~3,'0D");
        $kw196$ARG2 = SubLObjectFactory.makeKeyword("ARG2");
        $const197$CalendarMinute = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarMinute"));
        $str198$_ = SubLObjectFactory.makeString(":");
        $sym199$_PRECISION = SubLObjectFactory.makeSymbol("?PRECISION");
        $const200$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const201$resultIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa"));
        $list202 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRECISION"));
        $list203 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?PRECISION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarCoveringType"))));
        $const204$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YEAR"), (SubLObject)SubLObjectFactory.makeString("the year "));
        $sym206$GENERATE_PHRASE_FROM_TEMPLATE = SubLObjectFactory.makeSymbol("GENERATE-PHRASE-FROM-TEMPLATE");
        $sym207$GENERATE_NL_TAGGED_TERM = SubLObjectFactory.makeSymbol("GENERATE-NL-TAGGED-TERM");
        $kw208$NL_TAGGED_TERM = SubLObjectFactory.makeKeyword("NL-TAGGED-TERM");
        $const209$nounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $kw210$PPH_METHOD_FAILURE = SubLObjectFactory.makeKeyword("PPH-METHOD-FAILURE");
        $str211$GENERATE_PHRASE_FROM_TEMPLATE_cal = SubLObjectFactory.makeString("GENERATE-PHRASE-FROM-TEMPLATE called on PPH phrase with dtrs:~% ~S~%");
        $kw212$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $str213$__GENERATE_PHRASE_FROM_TEMPLATE_t = SubLObjectFactory.makeString("~&GENERATE-PHRASE-FROM-TEMPLATE trying phrase: ~S~%");
        $str214$__GENERATE_PHRASE_FROM_TEMPLATE__ = SubLObjectFactory.makeString("~&GENERATE-PHRASE-FROM-TEMPLATE: too many demerits~%");
        $str215$Added__D_template_alternatives_to = SubLObjectFactory.makeString("Added ~D template alternatives to~% ~S");
        $kw216$NO_GEN_TEMPLATES = SubLObjectFactory.makeKeyword("NO-GEN-TEMPLATES");
        $kw217$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw218$EXISTING_GEN_TEMPLATES_FAILED = SubLObjectFactory.makeKeyword("EXISTING-GEN-TEMPLATES-FAILED");
        $list219 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund")));
        $list220 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple")));
        $const221$gerund = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund"));
        $sym222$COERCED_GERUND_FROM_PRESENT_PARTICIPLE = SubLObjectFactory.makeSymbol("COERCED-GERUND-FROM-PRESENT-PARTICIPLE");
        $str223$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str224$__ = SubLObjectFactory.makeString(") ");
        $str225$Adding_too_many_justifications__O = SubLObjectFactory.makeString("Adding too many justifications. Old-just: ~S.~%");
        $str226$__Initial_paraphrase_agr_is__S__ = SubLObjectFactory.makeString("~&Initial paraphrase agr is ~S~%");
        $str227$__Initial_paraphrase_category_is_ = SubLObjectFactory.makeString("~&Initial paraphrase category is ~S~%");
        $str228$__Initial_paraphrase_case_is__S__ = SubLObjectFactory.makeString("~&Initial paraphrase case is ~S~%");
        $kw229$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $const230$genTemplate_QuerySentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-QuerySentence"));
        $str231$_S___does_not_appear_to_match_tem = SubLObjectFactory.makeString("~S~% does not appear to match template~%~S");
        $str232$Couldn_t_generate_a_PPH_phrase_fr = SubLObjectFactory.makeString("Couldn't generate a PPH phrase from this genTemplate and formula.");
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERROGATIVE"), (SubLObject)SubLObjectFactory.makeKeyword("QUESTION"));
        $str234$Couldn_t_generate_a_question_from = SubLObjectFactory.makeString("Couldn't generate a question from this genTemplate and formula.");
        $str235$__DO_GENERATE_PHRASE_FROM_TEMPLAT = SubLObjectFactory.makeString("~&DO-GENERATE-PHRASE-FROM-TEMPLATE: Too many demerits.~%");
        $str236$__GENERATE_PHRASE_FROM_TEMPLATE_f = SubLObjectFactory.makeString("~&GENERATE-PHRASE-FROM-TEMPLATE found string: ~S");
        $str237$__Updated_AGR_is__S___ = SubLObjectFactory.makeString("~&Updated AGR is ~S.~%");
        $sym238$GENERATE_SIMPLE_NEGATION = SubLObjectFactory.makeSymbol("GENERATE-SIMPLE-NEGATION");
        $kw239$NEGATION = SubLObjectFactory.makeKeyword("NEGATION");
        $kw240$NO = SubLObjectFactory.makeKeyword("NO");
        $str241$Inside_operator_scope__S = SubLObjectFactory.makeString("Inside operator scope ~S");
        $kw242$ARG0 = SubLObjectFactory.makeKeyword("ARG0");
        $str243$__Shadowing_discourse_context____ = SubLObjectFactory.makeString("~&Shadowing discourse context...~%");
        $str244$Leaving_operator_scope__S = SubLObjectFactory.makeString("Leaving operator scope ~S");
        $const245$Some_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Some-NLAttr"));
        $const246$No_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("No-NLAttr"));
        $const247$Any_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Any-NLAttr"));
        $const248$nonPlural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $sym249$PPH_TRY_TO_EXPRESS_NEGATION = SubLObjectFactory.makeSymbol("PPH-TRY-TO-EXPRESS-NEGATION");
        $str250$Converted__S_to__S = SubLObjectFactory.makeString("Converted ~S to ~S");
        $const251$WordWithSuffixFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordWithSuffixFn"));
        $const252$Nt_TheSuffix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Nt-TheSuffix"));
        $const253$Aux_Negated = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aux-Negated"));
        $str254$not = SubLObjectFactory.makeString("not");
        $const255$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $sym256$GENERATE_FN_TO_ARG_0 = SubLObjectFactory.makeSymbol("GENERATE-FN-TO-ARG-0");
        $kw257$FN_TO_ARG_0 = SubLObjectFactory.makeKeyword("FN-TO-ARG-0");
        $str258$the = SubLObjectFactory.makeString("the");
        $list259 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEADING-STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("WU"), (SubLObject)SubLObjectFactory.makeSymbol("FOLLOWING-STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("POS"));
        $list260 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic")));
        $const261$importFromAmountDuring = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("importFromAmountDuring"));
        $str262$_a_export_to__a_during__a = SubLObjectFactory.makeString("~a export to ~a during ~a");
        $list263 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("NON-PLURAL-GENERIC")), (SubLObject)pph_methods_formulas.ONE_INTEGER, (SubLObject)pph_methods_formulas.FOUR_INTEGER);
        $sym264$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $sym265$PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING-NO-TAGS");
        $sym266$GENERATE_KAPPA = SubLObjectFactory.makeSymbol("GENERATE-KAPPA");
        $kw267$KAPPA_EXPR = SubLObjectFactory.makeKeyword("KAPPA-EXPR");
        $sym268$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $str269$for = SubLObjectFactory.makeString("for");
        $sym270$GENERATE_EXISTENTIAL = SubLObjectFactory.makeSymbol("GENERATE-EXISTENTIAL");
        $kw271$EXISTENTIAL = SubLObjectFactory.makeKeyword("EXISTENTIAL");
        $list272 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed")));
        $kw273$UNIVERSAL = SubLObjectFactory.makeKeyword("UNIVERSAL");
        $str274$Failed_to_paraphrase__S_with_type = SubLObjectFactory.makeString("Failed to paraphrase ~S with type.");
        $const275$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $str276$there_is_some = SubLObjectFactory.makeString("there is some");
        $str277$such_that = SubLObjectFactory.makeString("such that");
        $str278$Failed_to_generate_explicit_exist = SubLObjectFactory.makeString("Failed to generate explicit existential for~% ~S~%");
        $sym279$EL_EXISTENTIAL_P = SubLObjectFactory.makeSymbol("EL-EXISTENTIAL-P");
        $sym280$EL_UNIVERSAL_P = SubLObjectFactory.makeSymbol("EL-UNIVERSAL-P");
        $sym281$PPH_UNIVERSAL_P = SubLObjectFactory.makeSymbol("PPH-UNIVERSAL-P");
        $sym282$PPH_EXISTENTIAL_P = SubLObjectFactory.makeSymbol("PPH-EXISTENTIAL-P");
        $list283 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str284$Registering__S_as__S___with_map__ = SubLObjectFactory.makeString("Registering ~S as ~S~% with map ~S");
        $list285 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("RESTR"));
        $sym286$CAR = SubLObjectFactory.makeSymbol("CAR");
        $kw287$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str288$__Checking_formula_for_relational = SubLObjectFactory.makeString("~&Checking formula for relational noun paraphrase:~% ~S~%");
        $str289$___S_not_suitable_for_relational_ = SubLObjectFactory.makeString("~&~S not suitable for relational noun paraphrase.~%");
        $str290$__Suitable_for_relational_noun_pa = SubLObjectFactory.makeString("~&Suitable for relational noun paraphrase.~%");
        $sym291$RELATIONAL_NOUN_ARGS_FOR_PRED = SubLObjectFactory.makeSymbol("RELATIONAL-NOUN-ARGS-FOR-PRED");
        $str292$__Paraphrasing__S_with_relational = SubLObjectFactory.makeString("~&Paraphrasing ~S with relational nouns.~%");
        $str293$Bad_arg___S_in__S___ = SubLObjectFactory.makeString("Bad arg: ~S in ~S.~%");
        $str294$Don_t_know_how_to_form_a_relation = SubLObjectFactory.makeString("Don't know how to form a relational noun expression for ~S.");
        $const295$NLSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSentence"));
        $list296 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Have-TheWord")));
        $sym297$GENERATE_IMPLICATION_SMART = SubLObjectFactory.makeSymbol("GENERATE-IMPLICATION-SMART");
        $kw298$IMPLICATION = SubLObjectFactory.makeKeyword("IMPLICATION");
        $str299$__Removed_var_typing_clauses_in__ = SubLObjectFactory.makeString("~&Removed var typing clauses in ~S~%...to form ~S~%");
        $kw300$IMPLIES = SubLObjectFactory.makeKeyword("IMPLIES");
        $list301 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OP"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $const302$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $str303$__Registering__S_and__S_as_differ = SubLObjectFactory.makeString("~&Registering ~S and ~S as different.~%");
        $sym304$PPH_REGISTER_DIFFERENT_VARS = SubLObjectFactory.makeSymbol("PPH-REGISTER-DIFFERENT-VARS");
        $list305 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANTECEDENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONSEQUENT"));
        $kw306$ANTECEDENT = SubLObjectFactory.makeKeyword("ANTECEDENT");
        $sym307$GENERIC_ARG_P = SubLObjectFactory.makeSymbol("GENERIC-ARG-P");
        $list308 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-ARG-POSITION"));
        $sym309$EL_GENERAL_EXISTENTIAL_P = SubLObjectFactory.makeSymbol("EL-GENERAL-EXISTENTIAL-P");
        $sym310$EL_DISJUNCTION_P = SubLObjectFactory.makeSymbol("EL-DISJUNCTION-P");
        $sym311$PPH_EXISTENTIAL_RMP_SENTENCE_ = SubLObjectFactory.makeSymbol("PPH-EXISTENTIAL-RMP-SENTENCE?");
        $list312 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("QUANT"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION"));
        $const313$Every_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Every-NLAttr"));
        $kw314$USE_CONTEXT = SubLObjectFactory.makeKeyword("USE-CONTEXT");
        $sym315$PPH_VALID_RELEVANT_VAR_TYPE_ = SubLObjectFactory.makeSymbol("PPH-VALID-RELEVANT-VAR-TYPE?");
        $str316$Bad_FORMULA_argument_to_REGISTER_ = SubLObjectFactory.makeString("Bad FORMULA argument to REGISTER-VAR-BY-ARG-CONSTRAINTS: ~S.");
        $sym317$REMOVE_VAR_TYPING_CLAUSES = SubLObjectFactory.makeSymbol("REMOVE-VAR-TYPING-CLAUSES");
        $str318$__Found_a_var_typing_clause__with = SubLObjectFactory.makeString("~&Found a var-typing clause, with var ~s type ~s~% arg-position: ~S~%");
        $str319$___S_does_not_type__S__Keeping_it = SubLObjectFactory.makeString("~&~S does not type ~S. Keeping it.~%");
        $str320$___S_is_only_remaining_var_typing = SubLObjectFactory.makeString("~&~S is only remaining var-typing clause for ~S. Keeping it.~%");
        $str321$___S_is_already_registered_as__S_ = SubLObjectFactory.makeString("~&~S is already registered as ~S. Skipping ~S~%");
        $str322$___S_is_already_registered_as__S_ = SubLObjectFactory.makeString("~&~S is already registered as ~S. Keeping ~S~%");
        $sym323$POSSIBLY_NEW_EXCEPTIONAL_VAR_P = SubLObjectFactory.makeSymbol("POSSIBLY-NEW-EXCEPTIONAL-VAR-P");
        $sym324$PPH_OPAQUE_PRED_ = SubLObjectFactory.makeSymbol("PPH-OPAQUE-PRED?");
        $const325$sentenceImplies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceImplies"));
        $const326$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $list327 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceImplies")));
        $int328$98 = SubLObjectFactory.makeInteger(98);
        $sym329$PPH_RELN_TYPE_LEVEL_IN_ARG_ = SubLObjectFactory.makeSymbol("PPH-RELN-TYPE-LEVEL-IN-ARG?");
        $const330$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym331$SPEC_ = SubLObjectFactory.makeSymbol("SPEC?");
        $int332$200 = SubLObjectFactory.makeInteger(200);
        $kw333$EXCEPTION = SubLObjectFactory.makeKeyword("EXCEPTION");
        $sym334$GENERATE_CF_IMPLICATION = SubLObjectFactory.makeSymbol("GENERATE-CF-IMPLICATION");
        $kw335$CF_IMPLICATION = SubLObjectFactory.makeKeyword("CF-IMPLICATION");
        $str336$if_it_had_a_been_the_case_that__a = SubLObjectFactory.makeString("if it had~a been the case that ~a, it would~a be the case that ~a");
        $const337$cfImplies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cfImplies"));
        $sym338$GENERATE_SUBCOLLECTION_WITH_RELATIONAL_NOUN = SubLObjectFactory.makeSymbol("GENERATE-SUBCOLLECTION-WITH-RELATIONAL-NOUN");
        $kw339$RELATIONAL_NOUN_SUBCOLLECTION_NAUT = SubLObjectFactory.makeKeyword("RELATIONAL-NOUN-SUBCOLLECTION-NAUT");
        $const340$SubcollectionRelationFunction_Inv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-Inverse"));
        $str341$Generating_relational_noun_phrase = SubLObjectFactory.makeString("Generating relational noun phrase for ~S (of a ~S)");
        $const342$SubcollectionRelationFunction_Ins = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-InstanceLevel"));
        $list343 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARG3"));
        $const344$Of_TheWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Of-TheWord"));
        $list345 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeKeyword("ARG3"));
        $str346$Couldn_t_find_an_arg_in_reln_asse = SubLObjectFactory.makeString("Couldn't find an arg-in-reln assertion for~% ~S");
        $const347$SubcollectionRelationFunction_Can = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-Canonical"));
        $sym348$GENERATE_THE_COLLECTION_WITH_REL_CLAUSE = SubLObjectFactory.makeSymbol("GENERATE-THE-COLLECTION-WITH-REL-CLAUSE");
        $kw349$THE_COLLECTION_OF_NAT = SubLObjectFactory.makeKeyword("THE-COLLECTION-OF-NAT");
        $list350 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings")));
        $list351 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("RESTRICTION-SENTENCE"));
        $const352$CollectionSubsetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $const353$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $sym354$GENERATE_SUBCOLLECTION_WITH_REL_CLAUSE = SubLObjectFactory.makeSymbol("GENERATE-SUBCOLLECTION-WITH-REL-CLAUSE");
        $kw355$SUBCOLLECTION_RELATION_NAUT = SubLObjectFactory.makeKeyword("SUBCOLLECTION-RELATION-NAUT");
        $const356$FormulaArgFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn"));
        $list357 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLL"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-SET"));
        $list358 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONSTRAINT"));
        $sym359$PPH_SUBCOL_EMBEDDED_SENTENCE_TEMPLATE = SubLObjectFactory.makeSymbol("PPH-SUBCOL-EMBEDDED-SENTENCE-TEMPLATE");
        $const360$SubcollectionRelationFunction_Typ = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionRelationFunction-TypeLevel"));
        $kw361$ARG3 = SubLObjectFactory.makeKeyword("ARG3");
        $kw362$INDEFINITE = SubLObjectFactory.makeKeyword("INDEFINITE");
        $int363$48 = SubLObjectFactory.makeInteger(48);
        $str364$_S_is_neither_an_atom_nor_a_list_ = SubLObjectFactory.makeString("~S is neither an atom nor a list!");
        $const365$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate"));
        $str366$PPH_REL_CLAUSE_FOR_COLL_SUBSET_ca = SubLObjectFactory.makeString("PPH-REL-CLAUSE-FOR-COLL-SUBSET called with assertion-style template ~S");
        $const367$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $str368$__Trying_to_make_relative_clause_ = SubLObjectFactory.makeString("~&Trying to make relative clause from template phrase.~%");
        $str369$whose = SubLObjectFactory.makeString("whose");
        $const370$PossessivePhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PossessivePhrase"));
        $str371$whom = SubLObjectFactory.makeString("whom");
        $str372$which = SubLObjectFactory.makeString("which");
        $str373$Moving_rel_clause_copula_to_immed = SubLObjectFactory.makeString("Moving rel-clause copula to immediately follow relative pronoun.");
        $str374$__Removing_copula_from_template__ = SubLObjectFactory.makeString("~&Removing copula from template.~%");
        $const375$Have_TheWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Have-TheWord"));
        $str376$with = SubLObjectFactory.makeString("with");
        $str377$__Adding_relative_pronoun_to_temp = SubLObjectFactory.makeString("~&Adding relative pronoun to template.~%");
        $str378$that = SubLObjectFactory.makeString("that");
        $str379$__Template_now_has__D_dtrs___ = SubLObjectFactory.makeString("~&Template now has ~D dtrs.~%");
        $str380$Can_t_determine_relative_clause_h = SubLObjectFactory.makeString("Can't determine relative clause head dtr from~% ~S");
        $const381$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $str382$Updating__S_of__S___to__S = SubLObjectFactory.makeString("Updating ~S of ~S~% to ~S");
        $const383$Be_TheWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Be-TheWord"));
        $str384$_a_ = SubLObjectFactory.makeString("~a ");
        $str385$is_ = SubLObjectFactory.makeString("is ");
        $const386$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $kw387$NEVER = SubLObjectFactory.makeKeyword("NEVER");
        $const388$Adverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $const389$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $str390$_a_that_ = SubLObjectFactory.makeString("~a that ");
        $const391$thirdPersonSg_Present = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present"));
        $list392 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-IF"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-IF-NOT"));
        $str393$Found_extractible_dtr______S = SubLObjectFactory.makeString("Found extractible dtr: ~% ~S");
        $sym394$GENERATE_PHRASE_NAUT = SubLObjectFactory.makeSymbol("GENERATE-PHRASE-NAUT");
        $kw395$PHRASE_DENOTING_NAUT = SubLObjectFactory.makeKeyword("PHRASE-DENOTING-NAUT");
        $str396$__In_GENERATE_PHRASE_NAUT___ = SubLObjectFactory.makeString("~&In GENERATE-PHRASE-NAUT.~%");
        $str397$__Precision_is__S___ = SubLObjectFactory.makeString("~&Precision is ~S.~%");
        $sym398$GENERATE_SPECIFIED_SCOPE_SENTENCE = SubLObjectFactory.makeSymbol("GENERATE-SPECIFIED-SCOPE-SENTENCE");
        $kw399$SPECIFIED_SCOPE_SENTENCE = SubLObjectFactory.makeKeyword("SPECIFIED-SCOPE-SENTENCE");
        $str400$__Replacing_rule_macro_formula___ = SubLObjectFactory.makeString("~&Replacing rule-macro formula~% ~S~% with~% ~S");
        $str401$__GENERATE_SPECIFIED_SCOPE_SENTEN = SubLObjectFactory.makeString("~&GENERATE-SPECIFIED-SCOPE-SENTENCE is returning: ~S");
        $sym402$GENERATE_RMP_SENTENCE_VIA_EXPANSION = SubLObjectFactory.makeSymbol("GENERATE-RMP-SENTENCE-VIA-EXPANSION");
        $kw403$RMP_SENTENCE = SubLObjectFactory.makeKeyword("RMP-SENTENCE");
        $sym404$COMMON_NON_SKOLEM_INDETERMINATE_TERM_DENOTING_FUNCTION_ = SubLObjectFactory.makeSymbol("COMMON-NON-SKOLEM-INDETERMINATE-TERM-DENOTING-FUNCTION?");
        $str405$Replacing_rule_macro_formula____S = SubLObjectFactory.makeString("Replacing rule-macro formula~% ~S~% with expanded formula ~S");
        $const406$expansion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("expansion"));
        $str407$__Looking_for_a_template_for__S__ = SubLObjectFactory.makeString("~&Looking for a template for ~S~%");
        $str408$Abandoning_search_because__S_is_u = SubLObjectFactory.makeString("Abandoning search because ~S is unambiguous with respect to scope.~%");
        $str409$__No_template_found_for__S___ = SubLObjectFactory.makeString("~&No template found for ~S.~%");
        $str410$__Search_limit_exceeded___ = SubLObjectFactory.makeString("~&Search limit exceeded.~%");
        $str411$__Search_level_is__S_of__S__ = SubLObjectFactory.makeString("~&Search level is ~S of ~S~%");
        $sym412$SCOPALLY_UNAMBIGUOUS_ = SubLObjectFactory.makeSymbol("SCOPALLY-UNAMBIGUOUS?");
        $str413$___S_is_not_ambiguous_with_respec = SubLObjectFactory.makeString("~&~S is not ambiguous with respect to scope.~%");
        $int414$212 = SubLObjectFactory.makeInteger(212);
        $str415$__Entering_PPH_SETTING_VAR_TYPES_ = SubLObjectFactory.makeString("~&Entering PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S), *pph-var-types* are~% ~s~%");
        $str416$__Paraphrasing_formula__S__ = SubLObjectFactory.makeString("~&Paraphrasing formula ~S~%");
        $kw417$GEN_FORMAT = SubLObjectFactory.makeKeyword("GEN-FORMAT");
        $str418$__Found_assertion__S_for_formula_ = SubLObjectFactory.makeString("~&Found assertion ~S for formula ~S~%");
        $str419$__Leaving_PPH_SETTING_VAR_TYPES_I = SubLObjectFactory.makeString("~&Leaving PPH-SETTING-VAR-TYPES-IF-SUCCESSFUL(~S). ");
        $str420$___Output_list___S__ = SubLObjectFactory.makeString("~& Output list: ~S~%");
        $str421$___Setting__S_to____S = SubLObjectFactory.makeString("~& Setting ~S to~% ~S");
        $str422$___Leaving__PPH_VAR_TYPES___S = SubLObjectFactory.makeString("~% Leaving *PPH-VAR-TYPES* ~S");
        $const423$generateArgWithOutsideScope = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("generateArgWithOutsideScope"));
        $str424$relatedArgPositions = SubLObjectFactory.makeString("relatedArgPositions");
        $const425$relatedArgPositions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedArgPositions"));
        $list426 = ConsesLow.list((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.THREE_INTEGER);
        $str427$Couldn_t_find___relatedArgPositio = SubLObjectFactory.makeString("Couldn't find #$relatedArgPositions assertions for ~S");
        $str428$Wrong_number_of___relatedArgPosit = SubLObjectFactory.makeString("Wrong number of #$relatedArgPositions assertions for ~S: ~D.~%");
        $kw429$ITSELF = SubLObjectFactory.makeKeyword("ITSELF");
        $list430 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANT-NL-ATTR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"));
        $const431$BareForm_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BareForm-NLAttr"));
        $const432$nonSingular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic"));
        $const433$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $str434$everything = SubLObjectFactory.makeString("everything");
        $sym435$AGREEMENT_LOOKUP = SubLObjectFactory.makeSymbol("AGREEMENT-LOOKUP");
        $sym436$QUANT_OVER_ARG_TUPLES = SubLObjectFactory.makeSymbol("QUANT-OVER-ARG-TUPLES");
        $const437$generateQuantOverArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("generateQuantOverArg"));
        $sym438$_QUANT_OVER_ARG_TUPLES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*QUANT-OVER-ARG-TUPLES-CACHING-STATE*");
        $sym439$_ = SubLObjectFactory.makeSymbol("<");
        $sym440$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym441$REVERSE = SubLObjectFactory.makeSymbol("REVERSE");
        $list442 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IN"), (SubLObject)SubLObjectFactory.makeSymbol("OUT"));
        $str443$__Found_a_genTemplate_for__S___ = SubLObjectFactory.makeString("~&Found a genTemplate for ~S.~%");
        $str444$__Passing_up_genTemplates_for__S_ = SubLObjectFactory.makeString("~&Passing up genTemplates for ~S in favor of genFormats.~%");
        $str445$__Couldn_t_find_any_generation_te = SubLObjectFactory.makeString("~&Couldn't find any generation templates for~% ~S with wide-scope arg ~S.~%");
        $sym446$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $str447$_a = SubLObjectFactory.makeString("~a");
        $str448$_a_and = SubLObjectFactory.makeString("~a and");
        $sym449$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const450$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym451$PPH_ALLOW_VAR_TYPING_ = SubLObjectFactory.makeSymbol("PPH-ALLOW-VAR-TYPING?");
        $sym452$PPH_GENL_ = SubLObjectFactory.makeSymbol("PPH-GENL?");
        $list453 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("VARS"));
        $sym454$GENERATE_UNIVERSAL = SubLObjectFactory.makeSymbol("GENERATE-UNIVERSAL");
        $str455$__Changed_phrase_cycl_from__S___t = SubLObjectFactory.makeString("~&Changed phrase cycl from ~S~% to ~S~% to ~S~%");
        $sym456$EL_IMPLICATION_P = SubLObjectFactory.makeSymbol("EL-IMPLICATION-P");
        $const457$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $str458$for_every = SubLObjectFactory.makeString("for every");
        $str459$Failed_to_generate_explicit_unive = SubLObjectFactory.makeString("Failed to generate explicit universal for~% ~S~%");
        $sym460$PPH_EXISTENTIAL_FORMULA_P = SubLObjectFactory.makeSymbol("PPH-EXISTENTIAL-FORMULA-P");
        $kw461$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $const462$ExistentialQuantifier = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier"));
        $const463$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $list464 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-TYPED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION"));
        $list465 = ConsesLow.list((SubLObject)pph_methods_formulas.TWO_INTEGER, (SubLObject)pph_methods_formulas.ZERO_INTEGER);
        $str466$Couldn_t_remove_var_typing_clause = SubLObjectFactory.makeString("Couldn't remove var-typing clauses from universal:~% ~S");
        $kw467$CNF = SubLObjectFactory.makeKeyword("CNF");
        $sym468$GENERATE_UNICODE_NAUT = SubLObjectFactory.makeSymbol("GENERATE-UNICODE-NAUT");
        $kw469$UNICODE_NAUT = SubLObjectFactory.makeKeyword("UNICODE-NAUT");
        $const470$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list471 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("TO-ARG"));
        $const472$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"));
        $sym473$GENERATE_SET_NAUT = SubLObjectFactory.makeSymbol("GENERATE-SET-NAUT");
        $kw474$SET_NAUT = SubLObjectFactory.makeKeyword("SET-NAUT");
        $str475$the_set_of = SubLObjectFactory.makeString("the set of");
        $const476$singular = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular"));
        $sym477$GENERATE_WITH_HOLDS_OF = SubLObjectFactory.makeSymbol("GENERATE-WITH-HOLDS-OF");
        $kw478$ATOMIC_SENTENCE = SubLObjectFactory.makeKeyword("ATOMIC-SENTENCE");
        $kw479$FALLBACK = SubLObjectFactory.makeKeyword("FALLBACK");
        $const480$CyclishParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclishParaphraseMt"));
        $str481$Generating_with_holds_of_for_moth = SubLObjectFactory.makeString("Generating with holds-of for motherless phrase:~% ~S~%");
        $list482 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $str483$doesn_t_hold = SubLObjectFactory.makeString("doesn't hold");
        $str484$does_not_hold = SubLObjectFactory.makeString("does not hold");
        $str485$holds = SubLObjectFactory.makeString("holds");
        $sym486$DO_GENERATE_WITH_HOLDS_OF = SubLObjectFactory.makeSymbol("DO-GENERATE-WITH-HOLDS-OF");
        $const487$TheCoordinationSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet"));
        $sym488$GENERATE_CONJUNCTION_HEAD_DRIVEN = SubLObjectFactory.makeSymbol("GENERATE-CONJUNCTION-HEAD-DRIVEN");
        $kw489$CONJUNCTION = SubLObjectFactory.makeKeyword("CONJUNCTION");
        $list490 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present")));
        $kw491$POS_PRED = SubLObjectFactory.makeKeyword("POS-PRED");
        $sym492$SUBJ = SubLObjectFactory.makeSymbol("SUBJ");
        $const493$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $list494 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")));
        $list495 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJ")));
        $sym496$GENERATE_POSSIBLY_REDUCED_COORDINATION = SubLObjectFactory.makeSymbol("GENERATE-POSSIBLY-REDUCED-COORDINATION");
        $kw497$COORDINATION = SubLObjectFactory.makeKeyword("COORDINATION");
        $str498$__Created_coordination_template_f = SubLObjectFactory.makeString("~&Created coordination template for ~S~%");
        $const499$TheDisjunctiveCoordinationSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheDisjunctiveCoordinationSet"));
        $sym500$CYCL_ATOMIC_SENTENCE_P = SubLObjectFactory.makeSymbol("CYCL-ATOMIC-SENTENCE-P");
        $sym501$GENERATE_EXISTENTIAL_WITH_THECOLLECTIONOF = SubLObjectFactory.makeSymbol("GENERATE-EXISTENTIAL-WITH-THECOLLECTIONOF");
        $str502$such_that__X = SubLObjectFactory.makeString("such that ?X");
        $list503 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INCLUDES"), (SubLObject)SubLObjectFactory.makeSymbol("EXCLUDES"));
        $const504$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list505 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SINGLE-MENTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE-MENTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-TYPING-CLAUSES"), (SubLObject)SubLObjectFactory.makeSymbol("NONMENTIONS"));
        $str506$X = SubLObjectFactory.makeString("X");
        $const507$TheCollectionOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCollectionOf"));
    }
    
    public static final class $pph_existential_rmp_sentenceP$UnaryFunction extends UnaryFunction
    {
        public $pph_existential_rmp_sentenceP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-EXISTENTIAL-RMP-SENTENCE?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_methods_formulas.pph_existential_rmp_sentenceP(arg1);
        }
    }
    
    public static final class $possibly_new_exceptional_var_p$UnaryFunction extends UnaryFunction
    {
        public $possibly_new_exceptional_var_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("POSSIBLY-NEW-EXCEPTIONAL-VAR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_methods_formulas.possibly_new_exceptional_var_p(arg1);
        }
    }
    
    public static final class $pph_existential_formula_p$UnaryFunction extends UnaryFunction
    {
        public $pph_existential_formula_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PPH-EXISTENTIAL-FORMULA-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return pph_methods_formulas.pph_existential_formula_p(arg1);
        }
    }
}

/*

	Total time: 5109 ms
	 synthetic 
*/