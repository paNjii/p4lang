// This is a generated file. Not intended for manual editing.
package nl.p4lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static nl.p4lang.psi.P4Types.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class P4Parser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ACTION_CASE) {
      r = action_case(b, 0);
    }
    else if (t == ACTION_FUNCTION_DECLARATION) {
      r = action_function_declaration(b, 0);
    }
    else if (t == ACTION_HEADER) {
      r = action_header(b, 0);
    }
    else if (t == ACTION_OR_DEFAULT) {
      r = action_or_default(b, 0);
    }
    else if (t == ACTION_PROFILE_DECLARATION) {
      r = action_profile_declaration(b, 0);
    }
    else if (t == ACTION_PROFILE_SPECIFICATION) {
      r = action_profile_specification(b, 0);
    }
    else if (t == ACTION_SELECTOR_DECLARATION) {
      r = action_selector_declaration(b, 0);
    }
    else if (t == ACTION_SPECIFICATION) {
      r = action_specification(b, 0);
    }
    else if (t == ACTION_STATEMENT) {
      r = action_statement(b, 0);
    }
    else if (t == APPLY_AND_SELECT_BLOCK) {
      r = apply_and_select_block(b, 0);
    }
    else if (t == APPLY_TABLE_CALL) {
      r = apply_table_call(b, 0);
    }
    else if (t == ARG) {
      r = arg(b, 0);
    }
    else if (t == ARRAY_INSTANCE) {
      r = array_instance(b, 0);
    }
    else if (t == ATTR_ENTRY) {
      r = attr_entry(b, 0);
    }
    else if (t == ATTRIBUTE_LIST) {
      r = attribute_list(b, 0);
    }
    else if (t == BIN_OP) {
      r = bin_op(b, 0);
    }
    else if (t == BINARY_BASE) {
      r = binary_base(b, 0);
    }
    else if (t == BINARY_DIGIT) {
      r = binary_digit(b, 0);
    }
    else if (t == BINARY_VALUE) {
      r = binary_value(b, 0);
    }
    else if (t == BIT_WIDTH) {
      r = bit_width(b, 0);
    }
    else if (t == BOOL_EXPR) {
      r = bool_expr(b, 0);
    }
    else if (t == BOOL_OP) {
      r = bool_op(b, 0);
    }
    else if (t == CALC_BOOL_COND) {
      r = calc_bool_cond(b, 0);
    }
    else if (t == CALCULATED_FIELD_DECLARATION) {
      r = calculated_field_declaration(b, 0);
    }
    else if (t == CASE_ENTRY) {
      r = case_entry(b, 0);
    }
    else if (t == CASE_LIST) {
      r = case_list(b, 0);
    }
    else if (t == CASE_RETURN_VALUE_TYPE) {
      r = case_return_value_type(b, 0);
    }
    else if (t == CONST_VALUE) {
      r = const_value(b, 0);
    }
    else if (t == CONTROL_BLOCK) {
      r = control_block(b, 0);
    }
    else if (t == CONTROL_FUNCTION_DECLARATION) {
      r = control_function_declaration(b, 0);
    }
    else if (t == CONTROL_STATEMENT) {
      r = control_statement(b, 0);
    }
    else if (t == COUNTER_DECLARATION) {
      r = counter_declaration(b, 0);
    }
    else if (t == COUNTER_TYPE) {
      r = counter_type(b, 0);
    }
    else if (t == DECIMAL_DIGIT) {
      r = decimal_digit(b, 0);
    }
    else if (t == DECIMAL_VALUE) {
      r = decimal_value(b, 0);
    }
    else if (t == DIRECT_ATTRIBUTE) {
      r = direct_attribute(b, 0);
    }
    else if (t == DIRECT_OR_STATIC) {
      r = direct_or_static(b, 0);
    }
    else if (t == ELSE_BLOCK) {
      r = else_block(b, 0);
    }
    else if (t == EXP) {
      r = exp(b, 0);
    }
    else if (t == EXTRACT_OR_SET_STATEMENT) {
      r = extract_or_set_statement(b, 0);
    }
    else if (t == EXTRACT_STATEMENT) {
      r = extract_statement(b, 0);
    }
    else if (t == FIELD_DEC) {
      r = field_dec(b, 0);
    }
    else if (t == FIELD_LIST_CALCULATION_DECLARATION) {
      r = field_list_calculation_declaration(b, 0);
    }
    else if (t == FIELD_LIST_DECLARATION) {
      r = field_list_declaration(b, 0);
    }
    else if (t == FIELD_LIST_ENTRY) {
      r = field_list_entry(b, 0);
    }
    else if (t == FIELD_LIST_NAME) {
      r = field_list_name(b, 0);
    }
    else if (t == FIELD_MATCH) {
      r = field_match(b, 0);
    }
    else if (t == FIELD_MATCH_TYPE) {
      r = field_match_type(b, 0);
    }
    else if (t == FIELD_MOD) {
      r = field_mod(b, 0);
    }
    else if (t == FIELD_NAME) {
      r = field_name(b, 0);
    }
    else if (t == FIELD_OR_DATA_REF) {
      r = field_or_data_ref(b, 0);
    }
    else if (t == FIELD_OR_MASKED_REF) {
      r = field_or_masked_ref(b, 0);
    }
    else if (t == FIELD_REF) {
      r = field_ref(b, 0);
    }
    else if (t == FIELD_VALUE) {
      r = field_value(b, 0);
    }
    else if (t == HEADER_DEC_BODY) {
      r = header_dec_body(b, 0);
    }
    else if (t == HEADER_EXTRACT_INDEX) {
      r = header_extract_index(b, 0);
    }
    else if (t == HEADER_EXTRACT_REF) {
      r = header_extract_ref(b, 0);
    }
    else if (t == HEADER_INSTANCE) {
      r = header_instance(b, 0);
    }
    else if (t == HEADER_REF) {
      r = header_ref(b, 0);
    }
    else if (t == HEADER_TYPE_NAME) {
      r = header_type_name(b, 0);
    }
    else if (t == HEXADECIMAL_BASE) {
      r = hexadecimal_base(b, 0);
    }
    else if (t == HEXADECIMAL_DIGIT) {
      r = hexadecimal_digit(b, 0);
    }
    else if (t == HEXADECIMAL_VALUE) {
      r = hexadecimal_value(b, 0);
    }
    else if (t == HIT_MISS_CASE) {
      r = hit_miss_case(b, 0);
    }
    else if (t == HIT_OR_MISS) {
      r = hit_or_miss(b, 0);
    }
    else if (t == IF_COND) {
      r = if_cond(b, 0);
    }
    else if (t == IF_ELSE_STATEMENT) {
      r = if_else_statement(b, 0);
    }
    else if (t == INDEX) {
      r = index(b, 0);
    }
    else if (t == INSTANCE_DECLARATION) {
      r = instance_declaration(b, 0);
    }
    else if (t == INSTANCE_NAME) {
      r = instance_name(b, 0);
    }
    else if (t == LENGTH_BIN_OP) {
      r = length_bin_op(b, 0);
    }
    else if (t == LENGTH_EXP) {
      r = length_exp(b, 0);
    }
    else if (t == LETTER) {
      r = letter(b, 0);
    }
    else if (t == METADATA_EXPR) {
      r = metadata_expr(b, 0);
    }
    else if (t == METADATA_INITIALIZER) {
      r = metadata_initializer(b, 0);
    }
    else if (t == METADATA_INSTANCE) {
      r = metadata_instance(b, 0);
    }
    else if (t == METER_DECLARATION) {
      r = meter_declaration(b, 0);
    }
    else if (t == METER_TYPE) {
      r = meter_type(b, 0);
    }
    else if (t == P_4_DECLARATION) {
      r = p4_declaration(b, 0);
    }
    else if (t == P_4_PROGRAM) {
      r = p4_program(b, 0);
    }
    else if (t == PARAM_LIST) {
      r = param_list(b, 0);
    }
    else if (t == PARSER_EXCEPTION_DECLARATION) {
      r = parser_exception_declaration(b, 0);
    }
    else if (t == PARSER_FUNCTION_BODY) {
      r = parser_function_body(b, 0);
    }
    else if (t == PARSER_FUNCTION_DECLARATION) {
      r = parser_function_declaration(b, 0);
    }
    else if (t == REGISTER_DECLARATION) {
      r = register_declaration(b, 0);
    }
    else if (t == REL_OP) {
      r = rel_op(b, 0);
    }
    else if (t == RETURN_OR_DROP) {
      r = return_or_drop(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = return_statement(b, 0);
    }
    else if (t == RETURN_TO_CONTROL) {
      r = return_to_control(b, 0);
    }
    else if (t == RETURN_VALUE_TYPE) {
      r = return_value_type(b, 0);
    }
    else if (t == SCALAR_INSTANCE) {
      r = scalar_instance(b, 0);
    }
    else if (t == SELECT_EXP) {
      r = select_exp(b, 0);
    }
    else if (t == SET_STATEMENT) {
      r = set_statement(b, 0);
    }
    else if (t == STATIC_ATTRIBUTE) {
      r = static_attribute(b, 0);
    }
    else if (t == TABLE_ACTIONS) {
      r = table_actions(b, 0);
    }
    else if (t == TABLE_DECLARATION) {
      r = table_declaration(b, 0);
    }
    else if (t == TEXT) {
      r = text(b, 0);
    }
    else if (t == UN_OP) {
      r = un_op(b, 0);
    }
    else if (t == UNSIGNED_VALUE) {
      r = unsigned_value(b, 0);
    }
    else if (t == UPDATE_OR_VERIFY) {
      r = update_or_verify(b, 0);
    }
    else if (t == UPDATE_VERIFY_SPEC) {
      r = update_verify_spec(b, 0);
    }
    else if (t == VALUE_LIST) {
      r = value_list(b, 0);
    }
    else if (t == VALUE_OR_MASKED) {
      r = value_or_masked(b, 0);
    }
    else if (t == VALUE_SET_DECLARATION) {
      r = value_set_declaration(b, 0);
    }
    else if (t == WIDTH_DECLARATION) {
      r = width_declaration(b, 0);
    }
    else if (t == WIDTH_SPEC) {
      r = width_spec(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return header_type_declaration(b, l + 1);
  }

  /* ********************************************************** */
  // action_or_default control_block
  public static boolean action_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_case")) return false;
    if (!nextTokenIs(b, "<action case>", ACTION_NAME, DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTION_CASE, "<action case>");
    r = action_or_default(b, l + 1);
    r = r && control_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // action action_header { action_statement * }
  public static boolean action_function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_function_declaration")) return false;
    if (!nextTokenIs(b, ACTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTION);
    r = r && action_header(b, l + 1);
    r = r && action_function_declaration_2(b, l + 1);
    exit_section_(b, m, ACTION_FUNCTION_DECLARATION, r);
    return r;
  }

  // action_statement *
  private static boolean action_function_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_function_declaration_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!action_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "action_function_declaration_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // action_name "(" [ param_list ] ")"
  public static boolean action_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_header")) return false;
    if (!nextTokenIs(b, ACTION_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTION_NAME);
    r = r && consumeToken(b, "(");
    r = r && action_header_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, ACTION_HEADER, r);
    return r;
  }

  // [ param_list ]
  private static boolean action_header_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_header_2")) return false;
    param_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // action_name | default
  public static boolean action_or_default(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_or_default")) return false;
    if (!nextTokenIs(b, "<action or default>", ACTION_NAME, DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ACTION_OR_DEFAULT, "<action or default>");
    r = consumeToken(b, ACTION_NAME);
    if (!r) r = consumeToken(b, DEFAULT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // action_profile action_profile_name {
  //         action_specification
  //         [ size ":" const_value ";" ]
  // 	[ dynamic_action_selection ":" selector_name ";" ]
  //     }
  public static boolean action_profile_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_profile_declaration")) return false;
    if (!nextTokenIs(b, ACTION_PROFILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ACTION_PROFILE, ACTION_PROFILE_NAME);
    r = r && action_profile_declaration_2(b, l + 1);
    exit_section_(b, m, ACTION_PROFILE_DECLARATION, r);
    return r;
  }

  // action_specification
  //         [ size ":" const_value ";" ]
  // 	[ dynamic_action_selection ":" selector_name ";" ]
  private static boolean action_profile_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_profile_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = action_specification(b, l + 1);
    r = r && action_profile_declaration_2_1(b, l + 1);
    r = r && action_profile_declaration_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ size ":" const_value ";" ]
  private static boolean action_profile_declaration_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_profile_declaration_2_1")) return false;
    action_profile_declaration_2_1_0(b, l + 1);
    return true;
  }

  // size ":" const_value ";"
  private static boolean action_profile_declaration_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_profile_declaration_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIZE);
    r = r && consumeToken(b, ":");
    r = r && const_value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ dynamic_action_selection ":" selector_name ";" ]
  private static boolean action_profile_declaration_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_profile_declaration_2_2")) return false;
    action_profile_declaration_2_2_0(b, l + 1);
    return true;
  }

  // dynamic_action_selection ":" selector_name ";"
  private static boolean action_profile_declaration_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_profile_declaration_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DYNAMIC_ACTION_SELECTION);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, SELECTOR_NAME);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // action_profile ":" action_profile_name
  public static boolean action_profile_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_profile_specification")) return false;
    if (!nextTokenIs(b, ACTION_PROFILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTION_PROFILE);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, ACTION_PROFILE_NAME);
    exit_section_(b, m, ACTION_PROFILE_SPECIFICATION, r);
    return r;
  }

  /* ********************************************************** */
  // action_selector selector_name {
  //         selection_key ":" field_list_calculation_name ";"
  //     }
  public static boolean action_selector_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_selector_declaration")) return false;
    if (!nextTokenIs(b, ACTION_SELECTOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ACTION_SELECTOR, SELECTOR_NAME);
    r = r && action_selector_declaration_2(b, l + 1);
    exit_section_(b, m, ACTION_SELECTOR_DECLARATION, r);
    return r;
  }

  // selection_key ":" field_list_calculation_name ";"
  private static boolean action_selector_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_selector_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SELECTION_KEY);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, FIELD_LIST_CALCULATION_NAME);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // actions { [ action_name ] + }
  public static boolean action_specification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_specification")) return false;
    if (!nextTokenIs(b, ACTIONS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTIONS);
    r = r && action_specification_1(b, l + 1);
    exit_section_(b, m, ACTION_SPECIFICATION, r);
    return r;
  }

  // [ action_name ] +
  private static boolean action_specification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_specification_1")) return false;
    consumeToken(b, ACTION_NAME);
    return true;
  }

  /* ********************************************************** */
  // action_name "(" [ arg [, arg]* ] ")" ";"
  public static boolean action_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_statement")) return false;
    if (!nextTokenIs(b, ACTION_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTION_NAME);
    r = r && consumeToken(b, "(");
    r = r && action_statement_2(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, ACTION_STATEMENT, r);
    return r;
  }

  // [ arg [, arg]* ]
  private static boolean action_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_statement_2")) return false;
    action_statement_2_0(b, l + 1);
    return true;
  }

  // arg [, arg]*
  private static boolean action_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_statement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && action_statement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [, arg]
  private static boolean action_statement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "action_statement_2_0_1")) return false;
    consumeToken(b, ACTION_STATEMENT_2_0_1_0_0);
    return true;
  }

  /* ********************************************************** */
  // apply ( table_name ) { [ case_list ] }
  public static boolean apply_and_select_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apply_and_select_block")) return false;
    if (!nextTokenIs(b, APPLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, APPLY);
    r = r && consumeToken(b, TABLE_NAME);
    r = r && apply_and_select_block_2(b, l + 1);
    exit_section_(b, m, APPLY_AND_SELECT_BLOCK, r);
    return r;
  }

  // [ case_list ]
  private static boolean apply_and_select_block_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apply_and_select_block_2")) return false;
    case_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // apply ( table_name ) ";"
  public static boolean apply_table_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "apply_table_call")) return false;
    if (!nextTokenIs(b, APPLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, APPLY);
    r = r && consumeToken(b, TABLE_NAME);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, APPLY_TABLE_CALL, r);
    return r;
  }

  /* ********************************************************** */
  // param_name | field_value | field_ref | header_ref
  public static boolean arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARG, "<arg>");
    r = consumeToken(b, PARAM_NAME);
    if (!r) r = field_value(b, l + 1);
    if (!r) r = field_ref(b, l + 1);
    if (!r) r = header_ref(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // header header_type_name
  //         instance_name "[" const_value "]" ";"
  public static boolean array_instance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_instance")) return false;
    if (!nextTokenIs(b, HEADER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEADER);
    r = r && header_type_name(b, l + 1);
    r = r && instance_name(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && const_value(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, ARRAY_INSTANCE, r);
    return r;
  }

  /* ********************************************************** */
  // signed | saturating | attr_entry "," attr_entry
  public static boolean attr_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_entry")) return false;
    if (!nextTokenIs(b, "<attr entry>", SATURATING, SIGNED)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTR_ENTRY, "<attr entry>");
    r = consumeToken(b, SIGNED);
    if (!r) r = consumeToken(b, SATURATING);
    if (!r) r = attr_entry_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // attr_entry "," attr_entry
  private static boolean attr_entry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attr_entry_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attr_entry(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && attr_entry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attributes ":" attr_entry
  public static boolean attribute_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_list")) return false;
    if (!nextTokenIs(b, ATTRIBUTES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ATTRIBUTES);
    r = r && consumeToken(b, ":");
    r = r && attr_entry(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // "+" | "*" | "-" | "<<" | ">>" | "&" | "|" | "^"
  public static boolean bin_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bin_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIN_OP, "<bin op>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "<<");
    if (!r) r = consumeToken(b, ">>");
    if (!r) r = consumeToken(b, "&");
    if (!r) r = consumeToken(b, "|");
    if (!r) r = consumeToken(b, "^");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "0b" | "0B"
  public static boolean binary_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_base")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_BASE, "<binary base>");
    r = consumeToken(b, "0b");
    if (!r) r = consumeToken(b, "0B");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "_" | "0" | "1"
  public static boolean binary_digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_digit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_DIGIT, "<binary digit>");
    r = consumeToken(b, "_");
    if (!r) r = consumeToken(b, "0");
    if (!r) r = consumeToken(b, "1");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // binary_base binary_digit+
  public static boolean binary_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_VALUE, "<binary value>");
    r = binary_base(b, l + 1);
    r = r && binary_value_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // binary_digit+
  private static boolean binary_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binary_digit(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!binary_digit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "binary_value_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // const_value | "*"
  public static boolean bit_width(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bit_width")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIT_WIDTH, "<bit width>");
    r = const_value(b, l + 1);
    if (!r) r = consumeToken(b, "*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // valid ( header_ref ) | bool_expr bool_op bool_expr |
  //     not bool_expr | ( bool_expr ) | exp rel_op exp | true | false
  public static boolean bool_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, BOOL_EXPR, "<bool expr>");
    r = bool_expr_0(b, l + 1);
    if (!r) r = bool_expr_1(b, l + 1);
    if (!r) r = bool_expr_2(b, l + 1);
    if (!r) r = bool_expr_3(b, l + 1);
    if (!r) r = bool_expr_4(b, l + 1);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // valid ( header_ref )
  private static boolean bool_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALID);
    r = r && bool_expr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( header_ref )
  private static boolean bool_expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_expr_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = header_ref(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // bool_expr bool_op bool_expr
  private static boolean bool_expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bool_expr(b, l + 1);
    r = r && bool_op(b, l + 1);
    r = r && bool_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // not bool_expr
  private static boolean bool_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && bool_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( bool_expr )
  private static boolean bool_expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_expr_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bool_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // exp rel_op exp
  private static boolean bool_expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_expr_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exp(b, l + 1);
    r = r && rel_op(b, l + 1);
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "or" | "and"
  public static boolean bool_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL_OP, "<bool op>");
    r = consumeToken(b, "or");
    if (!r) r = consumeToken(b, "and");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // valid ( header_ref | field_ref ) |
  // field_ref == field_value
  public static boolean calc_bool_cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_bool_cond")) return false;
    if (!nextTokenIs(b, "<calc bool cond>", FIELD_REF____FIELD_VALUE, VALID)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALC_BOOL_COND, "<calc bool cond>");
    r = calc_bool_cond_0(b, l + 1);
    if (!r) r = consumeToken(b, FIELD_REF____FIELD_VALUE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // valid ( header_ref | field_ref )
  private static boolean calc_bool_cond_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_bool_cond_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALID);
    r = r && calc_bool_cond_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // header_ref | field_ref
  private static boolean calc_bool_cond_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calc_bool_cond_0_1")) return false;
    boolean r;
    r = header_ref(b, l + 1);
    if (!r) r = field_ref(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // calculated_field field_ref { update_verify_spec + }
  public static boolean calculated_field_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calculated_field_declaration")) return false;
    if (!nextTokenIs(b, CALCULATED_FIELD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CALCULATED_FIELD);
    r = r && field_ref(b, l + 1);
    r = r && calculated_field_declaration_2(b, l + 1);
    exit_section_(b, m, CALCULATED_FIELD_DECLARATION, r);
    return r;
  }

  // update_verify_spec +
  private static boolean calculated_field_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "calculated_field_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = update_verify_spec(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!update_verify_spec(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "calculated_field_declaration_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // value_list ":" case_return_value_type ";"
  public static boolean case_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_entry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_ENTRY, "<case entry>");
    r = value_list(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && case_return_value_type(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // action_case + | hit_miss_case +
  public static boolean case_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_LIST, "<case list>");
    r = case_list_0(b, l + 1);
    if (!r) r = case_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // action_case +
  private static boolean case_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = action_case(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!action_case(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_list_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // hit_miss_case +
  private static boolean case_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hit_miss_case(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!hit_miss_case(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "case_list_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parser_state_name |
  //     control_function_name |
  //     parse_error parser_exception_name
  public static boolean case_return_value_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_return_value_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_RETURN_VALUE_TYPE, "<case return value type>");
    r = consumeToken(b, PARSER_STATE_NAME);
    if (!r) r = consumeToken(b, CONTROL_FUNCTION_NAME);
    if (!r) r = parseTokens(b, 0, PARSE_ERROR, PARSER_EXCEPTION_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ "+" | "-" ] [ width_spec ] unsigned_value
  public static boolean const_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_VALUE, "<const value>");
    r = const_value_0(b, l + 1);
    r = r && const_value_1(b, l + 1);
    r = r && unsigned_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ "+" | "-" ]
  private static boolean const_value_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_value_0")) return false;
    const_value_0_0(b, l + 1);
    return true;
  }

  // "+" | "-"
  private static boolean const_value_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_value_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ width_spec ]
  private static boolean const_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_value_1")) return false;
    width_spec(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // control_statement *
  public static boolean control_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "control_block")) return false;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_BLOCK, "<control block>");
    while (true) {
      int c = current_position_(b);
      if (!control_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "control_block", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // control control_fn_name control_block
  public static boolean control_function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "control_function_declaration")) return false;
    if (!nextTokenIs(b, CONTROL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONTROL, CONTROL_FN_NAME);
    r = r && control_block(b, l + 1);
    exit_section_(b, m, CONTROL_FUNCTION_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // apply_table_call |
  //     apply_and_select_block |
  //     if_else_statement |
  //     control_fn_name ( ) ";"
  public static boolean control_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "control_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_STATEMENT, "<control statement>");
    r = apply_table_call(b, l + 1);
    if (!r) r = apply_and_select_block(b, l + 1);
    if (!r) r = if_else_statement(b, l + 1);
    if (!r) r = control_statement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // control_fn_name ( ) ";"
  private static boolean control_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "control_statement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONTROL_FN_NAME);
    r = r && control_statement_3_1(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( )
  private static boolean control_statement_3_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // counter counter_name {
  //         type ":" counter_type ";"
  //         [ direct_or_static ";" ]
  //         [ instance_count ":" const_expr ";" ]
  //         [ min_width ":" const_expr ";" ]
  //         [ saturating ";" ]
  //     }
  public static boolean counter_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_declaration")) return false;
    if (!nextTokenIs(b, COUNTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COUNTER, COUNTER_NAME);
    r = r && counter_declaration_2(b, l + 1);
    exit_section_(b, m, COUNTER_DECLARATION, r);
    return r;
  }

  // type ":" counter_type ";"
  //         [ direct_or_static ";" ]
  //         [ instance_count ":" const_expr ";" ]
  //         [ min_width ":" const_expr ";" ]
  //         [ saturating ";" ]
  private static boolean counter_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && consumeToken(b, ":");
    r = r && counter_type(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && counter_declaration_2_4(b, l + 1);
    r = r && counter_declaration_2_5(b, l + 1);
    r = r && counter_declaration_2_6(b, l + 1);
    r = r && counter_declaration_2_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ direct_or_static ";" ]
  private static boolean counter_declaration_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_declaration_2_4")) return false;
    counter_declaration_2_4_0(b, l + 1);
    return true;
  }

  // direct_or_static ";"
  private static boolean counter_declaration_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_declaration_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_or_static(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ instance_count ":" const_expr ";" ]
  private static boolean counter_declaration_2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_declaration_2_5")) return false;
    counter_declaration_2_5_0(b, l + 1);
    return true;
  }

  // instance_count ":" const_expr ";"
  private static boolean counter_declaration_2_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_declaration_2_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSTANCE_COUNT);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, CONST_EXPR);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ min_width ":" const_expr ";" ]
  private static boolean counter_declaration_2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_declaration_2_6")) return false;
    counter_declaration_2_6_0(b, l + 1);
    return true;
  }

  // min_width ":" const_expr ";"
  private static boolean counter_declaration_2_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_declaration_2_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MIN_WIDTH);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, CONST_EXPR);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ saturating ";" ]
  private static boolean counter_declaration_2_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_declaration_2_7")) return false;
    counter_declaration_2_7_0(b, l + 1);
    return true;
  }

  // saturating ";"
  private static boolean counter_declaration_2_7_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_declaration_2_7_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SATURATING);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // bytes | packets | packets_and_bytes
  public static boolean counter_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "counter_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COUNTER_TYPE, "<counter type>");
    r = consumeToken(b, BYTES);
    if (!r) r = consumeToken(b, PACKETS);
    if (!r) r = consumeToken(b, PACKETS_AND_BYTES);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // binary_digit | "2" | "3" | "4" | "5" | "6" | "7" | "8" | "9"
  public static boolean decimal_digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_digit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECIMAL_DIGIT, "<decimal digit>");
    r = binary_digit(b, l + 1);
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = consumeToken(b, "9");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // decimal_digit+
  public static boolean decimal_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decimal_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECIMAL_VALUE, "<decimal value>");
    r = decimal_digit(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!decimal_digit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "decimal_value", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // direct ":" table_name
  public static boolean direct_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_attribute")) return false;
    if (!nextTokenIs(b, DIRECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DIRECT);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, TABLE_NAME);
    exit_section_(b, m, DIRECT_ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // direct_attribute | static_attribute
  public static boolean direct_or_static(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_or_static")) return false;
    if (!nextTokenIs(b, "<direct or static>", DIRECT, STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECT_OR_STATIC, "<direct or static>");
    r = direct_attribute(b, l + 1);
    if (!r) r = static_attribute(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // else control_block | else if_else_statement
  public static boolean else_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_block")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = else_block_0(b, l + 1);
    if (!r) r = else_block_1(b, l + 1);
    exit_section_(b, m, ELSE_BLOCK, r);
    return r;
  }

  // else control_block
  private static boolean else_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_block_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && control_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // else if_else_statement
  private static boolean else_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "else_block_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && if_else_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // exp bin_op exp | un_op exp | field_ref |
  //     value | ( exp )
  public static boolean exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXP, "<exp>");
    r = exp_0(b, l + 1);
    if (!r) r = exp_1(b, l + 1);
    if (!r) r = field_ref(b, l + 1);
    if (!r) r = consumeToken(b, VALUE);
    if (!r) r = exp_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // exp bin_op exp
  private static boolean exp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exp(b, l + 1);
    r = r && bin_op(b, l + 1);
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // un_op exp
  private static boolean exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = un_op(b, l + 1);
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( exp )
  private static boolean exp_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // extract_statement | set_statement
  public static boolean extract_or_set_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extract_or_set_statement")) return false;
    if (!nextTokenIs(b, "<extract or set statement>", EXTRACT, SET_METADATA)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTRACT_OR_SET_STATEMENT, "<extract or set statement>");
    r = extract_statement(b, l + 1);
    if (!r) r = set_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // extract ( header_extract_ref )";"
  public static boolean extract_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extract_statement")) return false;
    if (!nextTokenIs(b, EXTRACT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTRACT);
    r = r && extract_statement_1(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, EXTRACT_STATEMENT, r);
    return r;
  }

  // ( header_extract_ref )
  private static boolean extract_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extract_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = header_extract_ref(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // field_name ":" bit_width [ ( field_mod ) ]";"
  public static boolean field_dec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_dec")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_name(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && bit_width(b, l + 1);
    r = r && field_dec_3(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, FIELD_DEC, r);
    return r;
  }

  // [ ( field_mod ) ]
  private static boolean field_dec_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_dec_3")) return false;
    field_dec_3_0(b, l + 1);
    return true;
  }

  // ( field_mod )
  private static boolean field_dec_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_dec_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_mod(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // field_list_calculation field_list_calculation_name {
  //         input {
  //             [ field_list_name ";" ] +
  //         }
  //         algorithm ":" stream_function_algorithm_name ";"
  //         output_width ":" const_value ";"
  // }
  public static boolean field_list_calculation_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_calculation_declaration")) return false;
    if (!nextTokenIs(b, FIELD_LIST_CALCULATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FIELD_LIST_CALCULATION, FIELD_LIST_CALCULATION_NAME);
    r = r && field_list_calculation_declaration_2(b, l + 1);
    exit_section_(b, m, FIELD_LIST_CALCULATION_DECLARATION, r);
    return r;
  }

  // input {
  //             [ field_list_name ";" ] +
  //         }
  //         algorithm ":" stream_function_algorithm_name ";"
  //         output_width ":" const_value ";"
  private static boolean field_list_calculation_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_calculation_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INPUT);
    r = r && field_list_calculation_declaration_2_1(b, l + 1);
    r = r && consumeToken(b, ALGORITHM);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, STREAM_FUNCTION_ALGORITHM_NAME);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, OUTPUT_WIDTH);
    r = r && consumeToken(b, ":");
    r = r && const_value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ field_list_name ";" ] +
  private static boolean field_list_calculation_declaration_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_calculation_declaration_2_1")) return false;
    field_list_calculation_declaration_2_1_0(b, l + 1);
    return true;
  }

  // field_list_name ";"
  private static boolean field_list_calculation_declaration_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_calculation_declaration_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_list_name(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // field_list field_list_name {
  //         [ field_list_entry ";" ] +
  //     }
  public static boolean field_list_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_declaration")) return false;
    if (!nextTokenIs(b, FIELD_LIST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FIELD_LIST);
    r = r && field_list_name(b, l + 1);
    r = r && field_list_declaration_2(b, l + 1);
    exit_section_(b, m, FIELD_LIST_DECLARATION, r);
    return r;
  }

  // [ field_list_entry ";" ] +
  private static boolean field_list_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_declaration_2")) return false;
    field_list_declaration_2_0(b, l + 1);
    return true;
  }

  // field_list_entry ";"
  private static boolean field_list_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_declaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_list_entry(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // field_ref | header_ref | field_value | field_list_name | payload
  public static boolean field_list_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_entry")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_LIST_ENTRY, "<field list entry>");
    r = field_ref(b, l + 1);
    if (!r) r = header_ref(b, l + 1);
    if (!r) r = field_value(b, l + 1);
    if (!r) r = field_list_name(b, l + 1);
    if (!r) r = consumeToken(b, PAYLOAD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // text
  public static boolean field_list_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_list_name")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = text(b, l + 1);
    exit_section_(b, m, FIELD_LIST_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // field_or_masked_ref ":" field_match_type ";"
  public static boolean field_match(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_match")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_or_masked_ref(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && field_match_type(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, FIELD_MATCH, r);
    return r;
  }

  /* ********************************************************** */
  // exact | ternary | lpm | range | valid
  public static boolean field_match_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_match_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_MATCH_TYPE, "<field match type>");
    r = consumeToken(b, EXACT);
    if (!r) r = consumeToken(b, TERNARY);
    if (!r) r = consumeToken(b, LPM);
    if (!r) r = consumeToken(b, RANGE);
    if (!r) r = consumeToken(b, VALID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // signed | saturating | field_mod "," field_mod
  public static boolean field_mod(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_mod")) return false;
    if (!nextTokenIs(b, "<field mod>", SATURATING, SIGNED)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_MOD, "<field mod>");
    r = consumeToken(b, SIGNED);
    if (!r) r = consumeToken(b, SATURATING);
    if (!r) r = field_mod_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // field_mod "," field_mod
  private static boolean field_mod_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_mod_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_mod(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && field_mod(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // text
  public static boolean field_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_name")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = text(b, l + 1);
    exit_section_(b, m, FIELD_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // field_ref |
  //     latest.field_name |
  //     current( const_value "," const_value )
  public static boolean field_or_data_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_or_data_ref")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_OR_DATA_REF, "<field or data ref>");
    r = field_ref(b, l + 1);
    if (!r) r = consumeToken(b, LATEST_FIELD_NAME);
    if (!r) r = field_or_data_ref_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // current( const_value "," const_value )
  private static boolean field_or_data_ref_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_or_data_ref_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CURRENT);
    r = r && field_or_data_ref_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // const_value "," const_value
  private static boolean field_or_data_ref_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_or_data_ref_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = const_value(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && const_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // header_ref | header_ref "." valid | field_ref | field_ref mask const_value
  public static boolean field_or_masked_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_or_masked_ref")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = header_ref(b, l + 1);
    if (!r) r = field_or_masked_ref_1(b, l + 1);
    if (!r) r = field_ref(b, l + 1);
    if (!r) r = field_or_masked_ref_3(b, l + 1);
    exit_section_(b, m, FIELD_OR_MASKED_REF, r);
    return r;
  }

  // header_ref "." valid
  private static boolean field_or_masked_ref_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_or_masked_ref_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = header_ref(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, VALID);
    exit_section_(b, m, null, r);
    return r;
  }

  // field_ref mask const_value
  private static boolean field_or_masked_ref_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_or_masked_ref_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_ref(b, l + 1);
    r = r && consumeToken(b, MASK);
    r = r && const_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // header_ref "." field_name
  public static boolean field_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_ref")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = header_ref(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && field_name(b, l + 1);
    exit_section_(b, m, FIELD_REF, r);
    return r;
  }

  /* ********************************************************** */
  // const_value
  public static boolean field_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_VALUE, "<field value>");
    r = const_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // fields { field_dec + }
  //     [ length ":" length_exp ";" ]
  //     [ max_length ":" const_value ";" ]
  public static boolean header_dec_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_dec_body")) return false;
    if (!nextTokenIs(b, FIELDS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FIELDS);
    r = r && header_dec_body_1(b, l + 1);
    r = r && header_dec_body_2(b, l + 1);
    r = r && header_dec_body_3(b, l + 1);
    exit_section_(b, m, HEADER_DEC_BODY, r);
    return r;
  }

  // field_dec +
  private static boolean header_dec_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_dec_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_dec(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!field_dec(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "header_dec_body_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // [ length ":" length_exp ";" ]
  private static boolean header_dec_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_dec_body_2")) return false;
    header_dec_body_2_0(b, l + 1);
    return true;
  }

  // length ":" length_exp ";"
  private static boolean header_dec_body_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_dec_body_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LENGTH);
    r = r && consumeToken(b, ":");
    r = r && length_exp(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ max_length ":" const_value ";" ]
  private static boolean header_dec_body_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_dec_body_3")) return false;
    header_dec_body_3_0(b, l + 1);
    return true;
  }

  // max_length ":" const_value ";"
  private static boolean header_dec_body_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_dec_body_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAX_LENGTH);
    r = r && consumeToken(b, ":");
    r = r && const_value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // const_value | next
  public static boolean header_extract_index(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_extract_index")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEADER_EXTRACT_INDEX, "<header extract index>");
    r = const_value(b, l + 1);
    if (!r) r = consumeToken(b, NEXT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // instance_name |
  //      instance_name "[" header_extract_index "]"
  public static boolean header_extract_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_extract_ref")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instance_name(b, l + 1);
    if (!r) r = header_extract_ref_1(b, l + 1);
    exit_section_(b, m, HEADER_EXTRACT_REF, r);
    return r;
  }

  // instance_name "[" header_extract_index "]"
  private static boolean header_extract_ref_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_extract_ref_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instance_name(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && header_extract_index(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // scalar_instance | array_instance
  public static boolean header_instance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_instance")) return false;
    if (!nextTokenIs(b, HEADER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = scalar_instance(b, l + 1);
    if (!r) r = array_instance(b, l + 1);
    exit_section_(b, m, HEADER_INSTANCE, r);
    return r;
  }

  /* ********************************************************** */
  // instance_name | instance_name "[" index "]"
  public static boolean header_ref(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_ref")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instance_name(b, l + 1);
    if (!r) r = header_ref_1(b, l + 1);
    exit_section_(b, m, HEADER_REF, r);
    return r;
  }

  // instance_name "[" index "]"
  private static boolean header_ref_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_ref_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = instance_name(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && index(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "header_type" header_type_name { header_dec_body }
  static boolean header_type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_type_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "header_type");
    r = r && header_type_name(b, l + 1);
    r = r && header_type_declaration_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // { header_dec_body }
  private static boolean header_type_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_type_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = header_dec_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // text
  public static boolean header_type_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_type_name")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = text(b, l + 1);
    exit_section_(b, m, HEADER_TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "0x" | "0X"
  public static boolean hexadecimal_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimal_base")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEXADECIMAL_BASE, "<hexadecimal base>");
    r = consumeToken(b, "0x");
    if (!r) r = consumeToken(b, "0X");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // decimal_digit | "a" | "A" | "b" | "B" | "c" | "C" | "d" | "D" | "e" | "E" | "f" | "F"
  public static boolean hexadecimal_digit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimal_digit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEXADECIMAL_DIGIT, "<hexadecimal digit>");
    r = decimal_digit(b, l + 1);
    if (!r) r = consumeToken(b, "a");
    if (!r) r = consumeToken(b, "A");
    if (!r) r = consumeToken(b, "b");
    if (!r) r = consumeToken(b, "B");
    if (!r) r = consumeToken(b, "c");
    if (!r) r = consumeToken(b, "C");
    if (!r) r = consumeToken(b, "d");
    if (!r) r = consumeToken(b, "D");
    if (!r) r = consumeToken(b, "e");
    if (!r) r = consumeToken(b, "E");
    if (!r) r = consumeToken(b, "f");
    if (!r) r = consumeToken(b, "F");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // hexadecimal_base hexadecimal_digit+
  public static boolean hexadecimal_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimal_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEXADECIMAL_VALUE, "<hexadecimal value>");
    r = hexadecimal_base(b, l + 1);
    r = r && hexadecimal_value_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // hexadecimal_digit+
  private static boolean hexadecimal_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hexadecimal_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = hexadecimal_digit(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!hexadecimal_digit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "hexadecimal_value_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // hit_or_miss control_block
  public static boolean hit_miss_case(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hit_miss_case")) return false;
    if (!nextTokenIs(b, "<hit miss case>", HIT, MISS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HIT_MISS_CASE, "<hit miss case>");
    r = hit_or_miss(b, l + 1);
    r = r && control_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // hit | miss
  public static boolean hit_or_miss(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hit_or_miss")) return false;
    if (!nextTokenIs(b, "<hit or miss>", HIT, MISS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HIT_OR_MISS, "<hit or miss>");
    r = consumeToken(b, HIT);
    if (!r) r = consumeToken(b, MISS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // if ( calc_bool_cond )
  public static boolean if_cond(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_cond")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && if_cond_1(b, l + 1);
    exit_section_(b, m, IF_COND, r);
    return r;
  }

  // ( calc_bool_cond )
  private static boolean if_cond_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_cond_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = calc_bool_cond(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // if ( bool_expr ) control_block
  //     [ else_block ]
  public static boolean if_else_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_else_statement")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && if_else_statement_1(b, l + 1);
    r = r && control_block(b, l + 1);
    r = r && if_else_statement_3(b, l + 1);
    exit_section_(b, m, IF_ELSE_STATEMENT, r);
    return r;
  }

  // ( bool_expr )
  private static boolean if_else_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_else_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bool_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ else_block ]
  private static boolean if_else_statement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_else_statement_3")) return false;
    else_block(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // const_value | last
  public static boolean index(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "index")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDEX, "<index>");
    r = const_value(b, l + 1);
    if (!r) r = consumeToken(b, LAST);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // header_instance | metadata_instance
  public static boolean instance_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INSTANCE_DECLARATION, "<instance declaration>");
    r = header_instance(b, l + 1);
    if (!r) r = metadata_instance(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // text
  public static boolean instance_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "instance_name")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = text(b, l + 1);
    exit_section_(b, m, INSTANCE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // "+" | "-" | "*" | "<<" | ">>"
  public static boolean length_bin_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "length_bin_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LENGTH_BIN_OP, "<length bin op>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "<<");
    if (!r) r = consumeToken(b, ">>");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // const_value |
  //     field_name |
  //     length_exp length_bin_op length_exp |
  //     ( length_exp )
  public static boolean length_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "length_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, LENGTH_EXP, "<length exp>");
    r = const_value(b, l + 1);
    if (!r) r = field_name(b, l + 1);
    if (!r) r = length_exp_2(b, l + 1);
    if (!r) r = length_exp_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // length_exp length_bin_op length_exp
  private static boolean length_exp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "length_exp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = length_exp(b, l + 1);
    r = r && length_bin_op(b, l + 1);
    r = r && length_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( length_exp )
  private static boolean length_exp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "length_exp_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = length_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "A" | "B" | "C" | "D" | "E" | "F" | "G" | "H" | "I" | "J" | "K" | "L" | "M" | "N" | "O" | "P" | "Q" | "R" | "S" | "T" | "U" | "V" | "W" | "X" | "Y" | "Z" | "a" | "b" | "c" | "d" | "e" | "f" | "g" | "h" | "i" | "j" | "k" | "l" | "m" | "n" | "o" | "p" | "q" | "r" | "s" | "t" | "u" | "v" | "w" | "x" | "y" | "z"
  public static boolean letter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "letter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LETTER, "<letter>");
    r = consumeToken(b, "A");
    if (!r) r = consumeToken(b, "B");
    if (!r) r = consumeToken(b, "C");
    if (!r) r = consumeToken(b, "D");
    if (!r) r = consumeToken(b, "E");
    if (!r) r = consumeToken(b, "F");
    if (!r) r = consumeToken(b, "G");
    if (!r) r = consumeToken(b, "H");
    if (!r) r = consumeToken(b, "I");
    if (!r) r = consumeToken(b, "J");
    if (!r) r = consumeToken(b, "K");
    if (!r) r = consumeToken(b, "L");
    if (!r) r = consumeToken(b, "M");
    if (!r) r = consumeToken(b, "N");
    if (!r) r = consumeToken(b, "O");
    if (!r) r = consumeToken(b, "P");
    if (!r) r = consumeToken(b, "Q");
    if (!r) r = consumeToken(b, "R");
    if (!r) r = consumeToken(b, "S");
    if (!r) r = consumeToken(b, "T");
    if (!r) r = consumeToken(b, "U");
    if (!r) r = consumeToken(b, "V");
    if (!r) r = consumeToken(b, "W");
    if (!r) r = consumeToken(b, "X");
    if (!r) r = consumeToken(b, "Y");
    if (!r) r = consumeToken(b, "Z");
    if (!r) r = consumeToken(b, "a");
    if (!r) r = consumeToken(b, "b");
    if (!r) r = consumeToken(b, "c");
    if (!r) r = consumeToken(b, "d");
    if (!r) r = consumeToken(b, "e");
    if (!r) r = consumeToken(b, "f");
    if (!r) r = consumeToken(b, "g");
    if (!r) r = consumeToken(b, "h");
    if (!r) r = consumeToken(b, "i");
    if (!r) r = consumeToken(b, "j");
    if (!r) r = consumeToken(b, "k");
    if (!r) r = consumeToken(b, "l");
    if (!r) r = consumeToken(b, "m");
    if (!r) r = consumeToken(b, "n");
    if (!r) r = consumeToken(b, "o");
    if (!r) r = consumeToken(b, "p");
    if (!r) r = consumeToken(b, "q");
    if (!r) r = consumeToken(b, "r");
    if (!r) r = consumeToken(b, "s");
    if (!r) r = consumeToken(b, "t");
    if (!r) r = consumeToken(b, "u");
    if (!r) r = consumeToken(b, "v");
    if (!r) r = consumeToken(b, "w");
    if (!r) r = consumeToken(b, "x");
    if (!r) r = consumeToken(b, "y");
    if (!r) r = consumeToken(b, "z");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // field_value | field_or_data_ref
  public static boolean metadata_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METADATA_EXPR, "<metadata expr>");
    r = field_value(b, l + 1);
    if (!r) r = field_or_data_ref(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ field_name ":" field_value ";" ] +
  public static boolean metadata_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_initializer")) return false;
    Marker m = enter_section_(b, l, _NONE_, METADATA_INITIALIZER, "<metadata initializer>");
    metadata_initializer_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // field_name ":" field_value ";"
  private static boolean metadata_initializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_initializer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_name(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && field_value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // metadata header_type_name
  //        instance_name [ metadata_initializer ] | ";"
  public static boolean metadata_instance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_instance")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METADATA_INSTANCE, "<metadata instance>");
    r = metadata_instance_0(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // metadata header_type_name
  //        instance_name [ metadata_initializer ]
  private static boolean metadata_instance_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_instance_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, METADATA);
    r = r && header_type_name(b, l + 1);
    r = r && instance_name(b, l + 1);
    r = r && metadata_instance_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ metadata_initializer ]
  private static boolean metadata_instance_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metadata_instance_0_3")) return false;
    metadata_initializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // meter meter_name {
  //         type ":" meter_type ";"
  //         [ result ":" field_ref ";" ]
  //         [ direct_or_static ";" ]
  //         [ instance_count ":" const_expr ";" ]
  //     }
  public static boolean meter_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meter_declaration")) return false;
    if (!nextTokenIs(b, METER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, METER, METER_NAME);
    r = r && meter_declaration_2(b, l + 1);
    exit_section_(b, m, METER_DECLARATION, r);
    return r;
  }

  // type ":" meter_type ";"
  //         [ result ":" field_ref ";" ]
  //         [ direct_or_static ";" ]
  //         [ instance_count ":" const_expr ";" ]
  private static boolean meter_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meter_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TYPE);
    r = r && consumeToken(b, ":");
    r = r && meter_type(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && meter_declaration_2_4(b, l + 1);
    r = r && meter_declaration_2_5(b, l + 1);
    r = r && meter_declaration_2_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ result ":" field_ref ";" ]
  private static boolean meter_declaration_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meter_declaration_2_4")) return false;
    meter_declaration_2_4_0(b, l + 1);
    return true;
  }

  // result ":" field_ref ";"
  private static boolean meter_declaration_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meter_declaration_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RESULT);
    r = r && consumeToken(b, ":");
    r = r && field_ref(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ direct_or_static ";" ]
  private static boolean meter_declaration_2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meter_declaration_2_5")) return false;
    meter_declaration_2_5_0(b, l + 1);
    return true;
  }

  // direct_or_static ";"
  private static boolean meter_declaration_2_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meter_declaration_2_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_or_static(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ instance_count ":" const_expr ";" ]
  private static boolean meter_declaration_2_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meter_declaration_2_6")) return false;
    meter_declaration_2_6_0(b, l + 1);
    return true;
  }

  // instance_count ":" const_expr ";"
  private static boolean meter_declaration_2_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meter_declaration_2_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSTANCE_COUNT);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, CONST_EXPR);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // bytes | packets
  public static boolean meter_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "meter_type")) return false;
    if (!nextTokenIs(b, "<meter type>", BYTES, PACKETS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METER_TYPE, "<meter type>");
    r = consumeToken(b, BYTES);
    if (!r) r = consumeToken(b, PACKETS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // header_type_declaration |
  //     instance_declaration |
  //     field_list_declaration |
  //     field_list_calculation_declaration |
  //     calculated_field_declaration |
  //     value_set_declaration |
  //     parser_function_declaration |
  //     parser_exception_declaration |
  //     counter_declaration |
  //     meter_declaration |
  //     register_declaration |
  //     action_function_declaration |
  //     action_profile_declaration |
  //     action_selector_declaration |
  //     table_declaration |
  //     control_function_declaration
  public static boolean p4_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "p4_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, P_4_DECLARATION, "<p 4 declaration>");
    r = header_type_declaration(b, l + 1);
    if (!r) r = instance_declaration(b, l + 1);
    if (!r) r = field_list_declaration(b, l + 1);
    if (!r) r = field_list_calculation_declaration(b, l + 1);
    if (!r) r = calculated_field_declaration(b, l + 1);
    if (!r) r = value_set_declaration(b, l + 1);
    if (!r) r = parser_function_declaration(b, l + 1);
    if (!r) r = parser_exception_declaration(b, l + 1);
    if (!r) r = counter_declaration(b, l + 1);
    if (!r) r = meter_declaration(b, l + 1);
    if (!r) r = register_declaration(b, l + 1);
    if (!r) r = action_function_declaration(b, l + 1);
    if (!r) r = action_profile_declaration(b, l + 1);
    if (!r) r = action_selector_declaration(b, l + 1);
    if (!r) r = table_declaration(b, l + 1);
    if (!r) r = control_function_declaration(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // p4_declaration +
  public static boolean p4_program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "p4_program")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, P_4_PROGRAM, "<p 4 program>");
    r = p4_declaration(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!p4_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "p4_program", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // param_name [, param_name]*
  public static boolean param_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list")) return false;
    if (!nextTokenIs(b, PARAM_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PARAM_NAME);
    r = r && param_list_1(b, l + 1);
    exit_section_(b, m, PARAM_LIST, r);
    return r;
  }

  // [, param_name]
  private static boolean param_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_1")) return false;
    consumeToken(b, PARAM_LIST_1_0_0);
    return true;
  }

  /* ********************************************************** */
  // parser_exception parser_exception_name {
  //         set_statement *
  //         return_or_drop ";"
  //     }
  public static boolean parser_exception_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parser_exception_declaration")) return false;
    if (!nextTokenIs(b, PARSER_EXCEPTION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PARSER_EXCEPTION, PARSER_EXCEPTION_NAME);
    r = r && parser_exception_declaration_2(b, l + 1);
    exit_section_(b, m, PARSER_EXCEPTION_DECLARATION, r);
    return r;
  }

  // set_statement *
  //         return_or_drop ";"
  private static boolean parser_exception_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parser_exception_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parser_exception_declaration_2_0(b, l + 1);
    r = r && return_or_drop(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // set_statement *
  private static boolean parser_exception_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parser_exception_declaration_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!set_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parser_exception_declaration_2_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // extract_or_set_statement*
  //     return_statement
  public static boolean parser_function_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parser_function_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARSER_FUNCTION_BODY, "<parser function body>");
    r = parser_function_body_0(b, l + 1);
    r = r && return_statement(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // extract_or_set_statement*
  private static boolean parser_function_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parser_function_body_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!extract_or_set_statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parser_function_body_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // parser parser_state_name { parser_function_body }
  public static boolean parser_function_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parser_function_declaration")) return false;
    if (!nextTokenIs(b, PARSER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PARSER, PARSER_STATE_NAME);
    r = r && parser_function_declaration_2(b, l + 1);
    exit_section_(b, m, PARSER_FUNCTION_DECLARATION, r);
    return r;
  }

  // { parser_function_body }
  private static boolean parser_function_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parser_function_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parser_function_body(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // register register_name {
  //         width_declaration ";"
  //         [ direct_or_static ";" ]
  //         [ instance_count ":" const_value ";" ]
  //         [ attribute_list ";" ]
  //     }
  public static boolean register_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "register_declaration")) return false;
    if (!nextTokenIs(b, REGISTER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, REGISTER, REGISTER_NAME);
    r = r && register_declaration_2(b, l + 1);
    exit_section_(b, m, REGISTER_DECLARATION, r);
    return r;
  }

  // width_declaration ";"
  //         [ direct_or_static ";" ]
  //         [ instance_count ":" const_value ";" ]
  //         [ attribute_list ";" ]
  private static boolean register_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "register_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = width_declaration(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && register_declaration_2_2(b, l + 1);
    r = r && register_declaration_2_3(b, l + 1);
    r = r && register_declaration_2_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ direct_or_static ";" ]
  private static boolean register_declaration_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "register_declaration_2_2")) return false;
    register_declaration_2_2_0(b, l + 1);
    return true;
  }

  // direct_or_static ";"
  private static boolean register_declaration_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "register_declaration_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_or_static(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ instance_count ":" const_value ";" ]
  private static boolean register_declaration_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "register_declaration_2_3")) return false;
    register_declaration_2_3_0(b, l + 1);
    return true;
  }

  // instance_count ":" const_value ";"
  private static boolean register_declaration_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "register_declaration_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INSTANCE_COUNT);
    r = r && consumeToken(b, ":");
    r = r && const_value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ attribute_list ";" ]
  private static boolean register_declaration_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "register_declaration_2_4")) return false;
    register_declaration_2_4_0(b, l + 1);
    return true;
  }

  // attribute_list ";"
  private static boolean register_declaration_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "register_declaration_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute_list(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ">" | ">=" | "==" | "<=" | "<" | "!="
  public static boolean rel_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rel_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REL_OP, "<rel op>");
    r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, "!=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // return_to_control | parser_drop
  public static boolean return_or_drop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_or_drop")) return false;
    if (!nextTokenIs(b, "<return or drop>", PARSER_DROP, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_OR_DROP, "<return or drop>");
    r = return_to_control(b, l + 1);
    if (!r) r = consumeToken(b, PARSER_DROP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // return_value_type |
  //     return select ( select_exp ) { case_entry + }
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    if (!nextTokenIs(b, "<return statement>", PARSE_ERROR, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, "<return statement>");
    r = return_value_type(b, l + 1);
    if (!r) r = return_statement_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // return select ( select_exp ) { case_entry + }
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RETURN, SELECT);
    r = r && return_statement_1_2(b, l + 1);
    r = r && return_statement_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( select_exp )
  private static boolean return_statement_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = select_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // case_entry +
  private static boolean return_statement_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = case_entry(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!case_entry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "return_statement_1_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // return control_function_name
  public static boolean return_to_control(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_to_control")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RETURN, CONTROL_FUNCTION_NAME);
    exit_section_(b, m, RETURN_TO_CONTROL, r);
    return r;
  }

  /* ********************************************************** */
  // return parser_state_name ";" |
  //     return control_function_name ";" |
  //     parse_error parser_exception_name ";"
  public static boolean return_value_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_value_type")) return false;
    if (!nextTokenIs(b, "<return value type>", PARSE_ERROR, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_VALUE_TYPE, "<return value type>");
    r = return_value_type_0(b, l + 1);
    if (!r) r = return_value_type_1(b, l + 1);
    if (!r) r = return_value_type_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // return parser_state_name ";"
  private static boolean return_value_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_value_type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RETURN, PARSER_STATE_NAME);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // return control_function_name ";"
  private static boolean return_value_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_value_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RETURN, CONTROL_FUNCTION_NAME);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // parse_error parser_exception_name ";"
  private static boolean return_value_type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_value_type_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PARSE_ERROR, PARSER_EXCEPTION_NAME);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // header header_type_name instance_name ";"
  public static boolean scalar_instance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scalar_instance")) return false;
    if (!nextTokenIs(b, HEADER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HEADER);
    r = r && header_type_name(b, l + 1);
    r = r && instance_name(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, SCALAR_INSTANCE, r);
    return r;
  }

  /* ********************************************************** */
  // field_or_data_ref [, field_or_data_ref] *
  public static boolean select_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECT_EXP, "<select exp>");
    r = field_or_data_ref(b, l + 1);
    r = r && select_exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [, field_or_data_ref]
  private static boolean select_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_exp_1")) return false;
    consumeToken(b, SELECT_EXP_1_0_0);
    return true;
  }

  /* ********************************************************** */
  // set_metadata ( field_ref, metadata_expr ) ";"
  public static boolean set_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_statement")) return false;
    if (!nextTokenIs(b, SET_METADATA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SET_METADATA);
    r = r && consumeToken(b, FIELD_REF__METADATA_EXPR);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, SET_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // static ":" table_name
  public static boolean static_attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_attribute")) return false;
    if (!nextTokenIs(b, STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STATIC);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, TABLE_NAME);
    exit_section_(b, m, STATIC_ATTRIBUTE, r);
    return r;
  }

  /* ********************************************************** */
  // action_specification | action_profile_specification
  public static boolean table_actions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_actions")) return false;
    if (!nextTokenIs(b, "<table actions>", ACTIONS, ACTION_PROFILE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_ACTIONS, "<table actions>");
    r = action_specification(b, l + 1);
    if (!r) r = action_profile_specification(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // table table_name {
  //         [ reads { field_match + } ]
  //         table_actions
  //         [ min_size ":" const_value ";" ]
  //         [ max_size ":" const_value ";" ]
  //         [ size ":" const_value ";" ]
  // 	[ support_timeout ":" true | false ";" ]
  //     }
  public static boolean table_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration")) return false;
    if (!nextTokenIs(b, TABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TABLE, TABLE_NAME);
    r = r && table_declaration_2(b, l + 1);
    exit_section_(b, m, TABLE_DECLARATION, r);
    return r;
  }

  // [ reads { field_match + } ]
  //         table_actions
  //         [ min_size ":" const_value ";" ]
  //         [ max_size ":" const_value ";" ]
  //         [ size ":" const_value ";" ]
  // 	[ support_timeout ":" true | false ";" ]
  private static boolean table_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_declaration_2_0(b, l + 1);
    r = r && table_actions(b, l + 1);
    r = r && table_declaration_2_2(b, l + 1);
    r = r && table_declaration_2_3(b, l + 1);
    r = r && table_declaration_2_4(b, l + 1);
    r = r && table_declaration_2_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ reads { field_match + } ]
  private static boolean table_declaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_0")) return false;
    table_declaration_2_0_0(b, l + 1);
    return true;
  }

  // reads { field_match + }
  private static boolean table_declaration_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, READS);
    r = r && table_declaration_2_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // field_match +
  private static boolean table_declaration_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_match(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!field_match(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "table_declaration_2_0_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // [ min_size ":" const_value ";" ]
  private static boolean table_declaration_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_2")) return false;
    table_declaration_2_2_0(b, l + 1);
    return true;
  }

  // min_size ":" const_value ";"
  private static boolean table_declaration_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MIN_SIZE);
    r = r && consumeToken(b, ":");
    r = r && const_value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ max_size ":" const_value ";" ]
  private static boolean table_declaration_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_3")) return false;
    table_declaration_2_3_0(b, l + 1);
    return true;
  }

  // max_size ":" const_value ";"
  private static boolean table_declaration_2_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MAX_SIZE);
    r = r && consumeToken(b, ":");
    r = r && const_value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ size ":" const_value ";" ]
  private static boolean table_declaration_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_4")) return false;
    table_declaration_2_4_0(b, l + 1);
    return true;
  }

  // size ":" const_value ";"
  private static boolean table_declaration_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SIZE);
    r = r && consumeToken(b, ":");
    r = r && const_value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ support_timeout ":" true | false ";" ]
  private static boolean table_declaration_2_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_5")) return false;
    table_declaration_2_5_0(b, l + 1);
    return true;
  }

  // support_timeout ":" true | false ";"
  private static boolean table_declaration_2_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = table_declaration_2_5_0_0(b, l + 1);
    if (!r) r = table_declaration_2_5_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // support_timeout ":" true
  private static boolean table_declaration_2_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_5_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUPPORT_TIMEOUT);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, TRUE);
    exit_section_(b, m, null, r);
    return r;
  }

  // false ";"
  private static boolean table_declaration_2_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "table_declaration_2_5_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FALSE);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // { <text> }
  public static boolean text(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "text")) return false;
    if (!nextTokenIs(b, _TEXT_)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TEXT, null);
    r = text(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "~" | "-"
  public static boolean un_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "un_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UN_OP, "<un op>");
    r = consumeToken(b, "~");
    if (!r) r = consumeToken(b, "-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // binary_value | decimal_value | hexadecimal_value
  public static boolean unsigned_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unsigned_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNSIGNED_VALUE, "<unsigned value>");
    r = binary_value(b, l + 1);
    if (!r) r = decimal_value(b, l + 1);
    if (!r) r = hexadecimal_value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // update | verify
  public static boolean update_or_verify(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_or_verify")) return false;
    if (!nextTokenIs(b, "<update or verify>", UPDATE, VERIFY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UPDATE_OR_VERIFY, "<update or verify>");
    r = consumeToken(b, UPDATE);
    if (!r) r = consumeToken(b, VERIFY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // update_or_verify field_list_calculation_name [ if_cond ] ";"
  public static boolean update_verify_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_verify_spec")) return false;
    if (!nextTokenIs(b, "<update verify spec>", UPDATE, VERIFY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UPDATE_VERIFY_SPEC, "<update verify spec>");
    r = update_or_verify(b, l + 1);
    r = r && consumeToken(b, FIELD_LIST_CALCULATION_NAME);
    r = r && update_verify_spec_2(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ if_cond ]
  private static boolean update_verify_spec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "update_verify_spec_2")) return false;
    if_cond(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // value_or_masked [ "," value_or_masked ]* | default
  public static boolean value_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_LIST, "<value list>");
    r = value_list_0(b, l + 1);
    if (!r) r = consumeToken(b, DEFAULT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // value_or_masked [ "," value_or_masked ]*
  private static boolean value_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value_or_masked(b, l + 1);
    r = r && value_list_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ "," value_or_masked ]
  private static boolean value_list_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_list_0_1")) return false;
    value_list_0_1_0(b, l + 1);
    return true;
  }

  // "," value_or_masked
  private static boolean value_list_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_list_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && value_or_masked(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // field_value | field_value mask field_value | value_set_name
  public static boolean value_or_masked(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_or_masked")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_OR_MASKED, "<value or masked>");
    r = field_value(b, l + 1);
    if (!r) r = value_or_masked_1(b, l + 1);
    if (!r) r = consumeToken(b, VALUE_SET_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // field_value mask field_value
  private static boolean value_or_masked_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_or_masked_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = field_value(b, l + 1);
    r = r && consumeToken(b, MASK);
    r = r && field_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parser_value_set value_set_name";"
  public static boolean value_set_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_set_declaration")) return false;
    if (!nextTokenIs(b, PARSER_VALUE_SET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PARSER_VALUE_SET, VALUE_SET_NAME);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, VALUE_SET_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // width ":" const_value ";"
  public static boolean width_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "width_declaration")) return false;
    if (!nextTokenIs(b, WIDTH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WIDTH);
    r = r && consumeToken(b, ":");
    r = r && const_value(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, WIDTH_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // decimal_digit+ "'"
  public static boolean width_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "width_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WIDTH_SPEC, "<width spec>");
    r = width_spec_0(b, l + 1);
    r = r && consumeToken(b, "'");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decimal_digit+
  private static boolean width_spec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "width_spec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decimal_digit(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!decimal_digit(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "width_spec_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

}
