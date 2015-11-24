package com.manh.kmp;

public class KMP
{

    // only for test purposes
    public static void main(String[] args)
    {
        KMP stm = new KMP();
        // pattern
        char[] ptrn = "AABA".toCharArray();

        char[] text = "AABAACAADAABAAABAA".toCharArray();
        System.out.print(" ");
        for (char c : text)
        {
            System.out.print(c + "   ");
        }
        System.out.println();
        // search for pattern in the string
        stm.searchSubString(text, ptrn);
    }

    /**
     * Pre processes the pattern array based on proper prefixes and proper
     * suffixes at every position of the array
     * 
     * @param ptrn
     *            word that is to be searched in the search string
     * @return partial match table which indicates
     */
    public int[] preProcessPattern(char[] ptrn)
    {
        int i = 0, j = -1;
        int ptrnLen = ptrn.length;
        int[] b = new int[ptrnLen + 1];

        b[i] = j;
        while (i < ptrnLen)
        {
            while (j >= 0 && ptrn[i] != ptrn[j])
            {
                // if there is mismatch consider next widest border
                j = b[j];
            }
            i++;
            j++;
            b[i] = j;
        }
        return b;
    }

    /**
     * Based on the pre processed array, search for the pattern in the text
     * 
     * @param text
     *            text over which search happens
     * @param ptrn
     *            pattern that is to be searched
     */
    public void searchSubString(char[] text, char[] ptrn)
    {
        int i = 0, j = 0;
        // pattern and text lengths
        int ptrnLen = ptrn.length;
        int txtLen = text.length;

        // initialize new array and preprocess the pattern
        int[] b = preProcessPattern(ptrn);

        while (i < txtLen)
        {
            while (j >= 0 && text[i] != ptrn[j])
            {
                j = b[j];
            }
            i++;
            j++;

            // a match is found
            if (j == ptrnLen)
            {
                System.out.println("Pattern found at index : " + (i - ptrnLen));
                j = b[j];
            }
        }
    }

}
