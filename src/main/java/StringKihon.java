import static org.junit.jupiter.api.Assertions.assertEquals;

import framework.StringKihonBase;

public class StringKihon extends StringKihonBase {

    @Override
    protected String convertToUpperCase(String data) {
        return data.toUpperCase();
    }

    @Override
    protected String convertToLowerCase(String data) {
       return data.toLowerCase();
    }

    @Override
    protected String Combine_Parts_Of_A_Name(String firstName, String middleName, String lastName) {
       String fullName = String.join(" ", firstName, middleName, lastName);
        return fullName;
    }

    @Override
    protected String Combine_Two_Strings(String a, String b) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected int Determine_The_Length_Of_A_String(String data) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected String Remove_All_Leading_Whitespace(String data) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected String Remove_All_Trailing_Whitespace(String data) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected String[] Split_A_String_Into_An_Array(String input, char divider) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected String Join_An_Array_Into_A_String(String[] input, String divider) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected boolean returnTrueIfAContainsB(String a, String b) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected int determineThePositionOfAInB(String a, String b) {
        return 0;
    }

    @Override
    protected boolean returnTrueIfAStartsWithB(String a, String b) {
        return a.startsWith(b);
    }

    @Override
    protected boolean returnTrueIsAEndsWithB(String a, String b) {

        return a.startsWith(b);
    }

    @Override
    protected String returnTheFourthThroughSeventhCharactersOfInput(String input) {
      return input.substring(4,7);
}