package com.im;

public class First {

    public static void main(String[] args) {

        /*String mainString = "This is my main string text";
        String subString = "main";
        String replacementString = "modified";

        First first = new First();
        System.out.println(first.replaceSubString(mainString, subString, replacementString));*/
    }

    /**
     * This method is used to replace the part of string with new string.
     * @param mainString string which needs to be modified
     * @param subString string which needs to be replaced
     * @param  replacementString string to be replaced with
     * @return updated string if mainString contains substring, else original string
     */
    public String replaceSubString(String mainString, String subString, String replacementString) {
        if(!mainString.isEmpty() && subString != null && replacementString != null && mainString.contains(subString)) {
            return mainString.replaceAll(subString, replacementString);
        }else {
            return mainString;
        }
    }

}
