package unluac.test;

public class TestFiles {

  public static final TestFile[] tests = {
    new TestFile("assign"),
    new TestFile("literal"),
    new TestFile("number01"),
    new TestFile("number02"),
    new TestFile("number03"),
    new TestFile("number04"),
    new TestFile("multiassign"),
    new TestFile("multiassign02"),
    new TestFile("multiassign03"),
    new TestFile("multiassign04"),
    new TestFile("multiassign05"),
    new TestFile("multiassign06"),
    new TestFile("multiassign07"),
    new TestFile("multiassign08"),
    new TestFile("multiassign09"),
    new TestFile("multiassign10"),
    new TestFile("multiassign11"),
    new TestFile("multiassign12"),
    new TestFile("excess01"),
    new TestFile("excess02", 0x51),
    new TestFile("excess03"),
    new TestFile("excess04"),
    new TestFile("expression"),
    new TestFile("expression02"),
    new TestFile("functioncall"),
    new TestFile("self01"),
    new TestFile("literallist"),
    new TestFile("multiliteraltarget"),
    new TestFile("closure"),
    new TestFile("ellipsis03"),
    new TestFile("ifthen"),
    new TestFile("condition"),
    new TestFile("condition02"),
    new TestFile("condition03"),
    new TestFile("condition04"),
    new TestFile("nestedif"),
    new TestFile("nestedif02"),
    new TestFile("ifthenelse"),
    new TestFile("while"),
    new TestFile("while02"),
    new TestFile("while03"),
    new TestFile("while04"),
    new TestFile("while05"),
    new TestFile("while06"),
    new TestFile("while07"),
    new TestFile("while08"),
    new TestFile("repeat"),
    new TestFile("repeat02"),
    new TestFile("repeat03"),
    new TestFile("if01"),
    new TestFile("if02"),
    new TestFile("if03"),
    new TestFile("if04"),
    new TestFile("if05"),
    new TestFile("if06"),
    new TestFile("if07"),
    new TestFile("else01"),
    new TestFile("else02"),
    new TestFile("else03"),
    new TestFile("else04"),
    new TestFile("else05"),
    new TestFile("else06"),
    new TestFile("else07"),
    new TestFile("else08"),
    new TestFile("booleanassign01"),
    new TestFile("booleanassign02"),
    new TestFile("booleanassign03"),
    new TestFile("booleanassign04"),
    new TestFile("booleanassign05"),
    new TestFile("booleanassign06"),
    new TestFile("booleanassign07"),
    new TestFile("booleanassign08"),
    new TestFile("booleanassign09"),
    new TestFile("booleanassign10"),
    new TestFile("booleanassign11"),
    new TestFile("booleanassign12"),
    new TestFile("booleanassign13"),
    new TestFile("booleanassign14"),
    new TestFile("booleanassign15"),
    new TestFile("booleanassign16"),
    new TestFile("booleanassign17"),
    new TestFile("booleanassign18"),
    new TestFile("booleanassign19"),
    new TestFile("booleanassign20"),
    new TestFile("booleanassign21"),
    new TestFile("booleanassign22"),
    new TestFile("booleanassign23"),
    new TestFile("booleanassign24"),
    new TestFile("booleanassign25"),
    new TestFile("booleanassign26"),
    new TestFile("booleanassign27"),
    new TestFile("booleanassign28"),
    new TestFile("booleanassign29"),
    new TestFile("booleanassign30"),
    new TestFile("booleanselfassign01"),
    new TestFile("booleanexpression01"),
    new TestFile("booleanexpression02"),
    new TestFile("booleanexpression03"),
    new TestFile("booleanexpression04"),
    new TestFile("booleanexpression05"),
    new TestFile("booleanexpression06"),
    new TestFile("booleanexpression07"),
    new TestFile("booleanexpression08"),
    new TestFile("booleanexpression09"),
    new TestFile("booleanexpression10"),
    new TestFile("booleanexpression11"),
    new TestFile("booleanmultiassign01"),
    new TestFile("booleanmultiassign02"),
    new TestFile("compareassign01"),
    new TestFile("compareassign02"),
    new TestFile("compareexpression"),
    new TestFile("compareexpression02"),
    new TestFile("combinebexpression01"),
    new TestFile("combinebexpression02"),
    new TestFile("combinebexpression03"),
    new TestFile("combinebexpression04"),
    new TestFile("combinebexpression05"),
    new TestFile("combinebexpression06"),
    new TestFile("combinebexpression07"),
    new TestFile("combinebassign01"),
    new TestFile("combinebassign02"),
    new TestFile("combinebassign03"),
    new TestFile("combinebassign04", TestFile.DEFAULT_VERSION, TestFile.RELAXED_SCOPE),
    new TestFile("combinebassign05"),
    new TestFile("combinebassign07"),
    new TestFile("complexassign01"),
    new TestFile("complexassign02"),
    new TestFile("complexassign03"),
    new TestFile("compare01"),
    new TestFile("compareorder01"),
    new TestFile("compareorder02"),
    new TestFile("compareorder03"),
    new TestFile("compareorder04"),
    new TestFile("compareorder05"),
    new TestFile("compareorder06"),
    new TestFile("compareorder07"),
    new TestFile("compareorder08"),
    new TestFile("table01"),
    new TestFile("table02"),
    new TestFile("table03"),
    new TestFile("table06"),
    new TestFile("table07"),
    new TestFile("table08"),
    new TestFile("localfunction01"),
    new TestFile("localfunction02"),
    new TestFile("localfunction03"),
    new TestFile("localfunction04"),
    new TestFile("localfunction05"),
    new TestFile("localfunction06"),
    new TestFile("declare"),
    new TestFile("declare02"),
    new TestFile("declare03"),
    new TestFile("declare04"),
    new TestFile("declare05"),
    new TestFile("adjust01"),
    new TestFile("adjust04"),
    new TestFile("adjust05"),
    new TestFile("adjust06"),
    new TestFile("final01"),
    new TestFile("final02"),
    new TestFile("doend01", TestFile.DEFAULT_VERSION, TestFile.RELAXED_SCOPE),
    new TestFile("doend02"),
    new TestFile("doend03"),
    new TestFile("doend04"),
    new TestFile("doend05"),
    new TestFile("doend06"),
    new TestFile("doend07", TestFile.DEFAULT_VERSION, TestFile.RELAXED_SCOPE),
    new TestFile("doend08", TestFile.DEFAULT_VERSION, TestFile.RELAXED_SCOPE),
    new TestFile("control01"),
    new TestFile("control02"),
    new TestFile("control03"),
    new TestFile("control04"),
    new TestFile("control05"),
    new TestFile("control06"),
    new TestFile("loop01"),
    new TestFile("loop02"),
    new TestFile("loop03"),
    new TestFile("loop04"),
    new TestFile("method01"),
    new TestFile("method02"),
    new TestFile("inlinefunction01"),
    new TestFile("inlinefunction02"),
    new TestFile("inlineconstant01"),
    new TestFile("string01"),
    new TestFile("string02"),
    new TestFile("string04"),
    new TestFile("string05"),
    new TestFile("upvalue01"),
    new TestFile("upvalue02"),
    new TestFile("upvalue03"),
    new TestFile("upvalue04"),
    new TestFile("upvalue05"),
    new TestFile("upvalue06", TestFile.DEFAULT_VERSION, TestFile.RELAXED_SCOPE),
    new TestFile("break01"),
    new TestFile("break02"),
    new TestFile("break03"),
    new TestFile("break04"),
    new TestFile("break05"),
    new TestFile("break06"),
    new TestFile("break07"),
    new TestFile("break08"),
    new TestFile("break09"),
    new TestFile("break10"),
    new TestFile("break11"),
    new TestFile("break12"),
    new TestFile("break13"),
    new TestFile("break14"),
    new TestFile("break15"),
    new TestFile("break16"),
    new TestFile("break17"),
    new TestFile("break19"),
    new TestFile("break20"),
    new TestFile("break21"),
    new TestFile("break22", TestFile.DEFAULT_VERSION, TestFile.RELAXED_SCOPE), //TODO: relaxed scope is maybe not necessary if scopes inform hanger resolution?
    new TestFile("break23", TestFile.DEFAULT_VERSION, TestFile.RELAXED_SCOPE), //TODO: relaxed scope is maybe not necessary if scopes inform hanger resolution?
    new TestFile("break24"),
    new TestFile("break25"),
    new TestFile("break26"),
    new TestFile("close01"),
    new TestFile("close02"),
    new TestFile("close03"),
    new TestFile("close04"),
    new TestFile("close05"),
    new TestFile("close06"),
    new TestFile("close07"),
    new TestFile("close08"),
    new TestFile("close09"),
    new TestFile("close10"),
    new TestFile("close11"),
    new TestFile("close12"),
    new TestFile("always01"),
    new TestFile("always02"),
    new TestFile("always03"),
    new TestFile("always04"),
    new TestFile("once01", TestFile.DEFAULT_VERSION, TestFile.RELAXED_SCOPE), //TODO: maybe should enforce not using goto here?
    new TestFile("once02"),
    new TestFile("once03"),
    new TestFile("once04"),
    new TestFile("once05"),
    new TestFile("unused01"),
    new TestFile("report01a"),
    new TestFile("report01b"),
    new TestFile("report01c"),
    new TestFile("report01d"),
    new TestFile("report01_full"),
    new TestFile("report02"),
    new TestFile("report02a"),
    new TestFile("report02b"),
    new TestFile("report02c"),
    new TestFile("report02d"),
    new TestFile("report02e"),
    new TestFile("report03"),
    new TestFile("report04"),
    new TestFile("report05"),
    new TestFile("report06"),
    new TestFile("scope02"),
    new TestFile("scope03"),
    new TestFile("env01"),
    new TestFile("env02"),
    new TestFile("51_expression"),
    new TestFile("51_expression2"),
    new TestFile("51_expression03"),
    new TestFile("51_string03"),
    new TestFile("51_ellipsis"),
    new TestFile("51_ellipsis02"),
    new TestFile("51_adjust02"),
    new TestFile("51_adjust03"),
    new TestFile("51_method03"),
    new TestFile("52_loadkx01"),
    new TestFile("52_goto01"),
    new TestFile("52_goto02"),
    new TestFile("52_goto03"),
    new TestFile("52_goto04"),
    new TestFile("52_goto05"),
    new TestFile("52_goto06"),
    new TestFile("52_goto08"),
    new TestFile("53_expression"),
    new TestFile("53_expression02"),
    new TestFile("54_tbc01"),
  };
  
  public static TestSuite suite = new TestSuite(null, ".\\test\\src\\", tests);
  
}
