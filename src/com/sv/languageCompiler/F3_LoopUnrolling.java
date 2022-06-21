package com.sv.languageCompiler;

public class F3_LoopUnrolling {

    public static String loopUnrolling(String codeBlock) {
        return null;
    }

    public static void main(String[] args) {
        String codeBlock = "2[sum = sum + i; 2[i++; ]]";
        System.out.println(loopUnrolling(codeBlock));
    }
}
