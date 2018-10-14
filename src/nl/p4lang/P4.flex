package nl.p4lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static nl.p4lang.psi.P4Types.*;

%%

%{
  public _P4Lexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _P4Lexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
COMMENT="//".*
INTEGER=[0-9]+
NUMBER=[0-9]+(\.[0-9]*)?
ID=[:letter:][a-zA-Z_0-9]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}                 { return WHITE_SPACE; }

  ";"                           { return SEMI; }
  "="                           { return EQ; }
  "("                           { return LP; }
  ")"                           { return RP; }
  "{"                           { return LB; }
  "}"                           { return RB; }
  "header_type"                 { return HEADER_TYPE; }
  "fields"                      { return FIELDS; }
  "length"                      { return LENGTH; }
  "max_length"                  { return MAX_LENGTH; }
  "signed"                      { return SIGNED; }
  "saturating"                  { return SATURATING; }
  "header"                      { return HEADER; }
  "metadata"                    { return METADATA; }
  "last"                        { return LAST; }
  "field_list"                  { return FIELD_LIST; }
  "field_list_calculation"      { return FIELD_LIST_CALCULATION; }
  "input"                       { return INPUT; }
  "algorithm"                   { return ALGORITHM; }
  "output_width"                { return OUTPUT_WIDTH; }
  "calculated_field"            { return CALCULATED_FIELD; }
  "update"                      { return UPDATE; }
  "verify"                      { return VERIFY; }
  "if"                          { return IF; }
  "valid"                       { return VALID; }
  "parser_value_set"            { return PARSER_VALUE_SET; }
  "parser"                      { return PARSER; }
  "extract"                     { return EXTRACT; }
  "next"                        { return NEXT; }
  "set_metadata"                { return SET_METADATA; }
  "return"                      { return RETURN; }
  "select"                      { return SELECT; }
  "parse_error"                 { return PARSE_ERROR; }
  "mask"                        { return MASK; }
  "latest"                      { return LATEST; }
  "current"                     { return CURRENT; }
  "parser_exception"            { return PARSER_EXCEPTION; }
  "parser_drop"                 { return PARSER_DROP; }
  "counter"                     { return COUNTER; }
  "type"                        { return TYPE; }
  "instance_count"              { return INSTANCE_COUNT; }
  "min_width"                   { return MIN_WIDTH; }
  "bytes"                       { return BYTES; }
  "packets"                     { return PACKETS; }
  "packets_and_bytes"           { return PACKETS_AND_BYTES; }
  "direct"                      { return DIRECT; }
  "static"                      { return STATIC; }
  "meter"                       { return METER; }
  "result"                      { return RESULT; }
  "register"                    { return REGISTER; }
  "width"                       { return WIDTH; }
  "attributes"                  { return ATTRIBUTES; }
  "action"                      { return ACTION; }
  "action_profile"              { return ACTION_PROFILE; }
  "size"                        { return SIZE; }
  "dynamic_action_selection"    { return DYNAMIC_ACTION_SELECTION; }
  "action_selector"             { return ACTION_SELECTOR; }
  "selection_key"               { return SELECTION_KEY; }
  "table"                       { return TABLE; }
  "reads"                       { return READS; }
  "min_size"                    { return MIN_SIZE; }
  "max_size"                    { return MAX_SIZE; }
  "support_timeout"             { return SUPPORT_TIMEOUT; }
  "exact"                       { return EXACT; }
  "ternary"                     { return TERNARY; }
  "lpm"                         { return LPM; }
  "range"                       { return RANGE; }
  "actions"                     { return ACTIONS; }
  "control"                     { return CONTROL; }
  "apply"                       { return APPLY; }
  "default"                     { return DEFAULT; }
  "hit"                         { return HIT; }
  "miss"                        { return MISS; }
  "else"                        { return ELSE; }
  "not"                         { return NOT; }
  "true"                        { return TRUE; }
  "false"                       { return FALSE; }
  "value"                       { return VALUE; }
  "or"                          { return OR; }
  "and"                         { return AND; }

  {SPACE}                       { return SPACE; }
  {COMMENT}                     { return COMMENT; }
  {INTEGER}                     { return INTEGER; }
  {NUMBER}                      { return NUMBER; }
  {ID}                          { return ID; }
  {STRING}                      { return STRING; }

}

[^] { return BAD_CHARACTER; }
