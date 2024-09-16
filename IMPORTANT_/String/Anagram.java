package IMPORTANT_.String;

public class Anagram {

        public static boolean isAnagram(String str1, String str2) {
            // First check if both strings have the same length
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert both strings to character arrays
            char[] arr1 = str1.toCharArray();//store in the form of {l,i,s,t,e,n}
            char[] arr2 = str2.toCharArray();//{s,i,l,e,n,t}

            // Sort both arrays manually
            for (int i = 0; i < arr1.length - 1; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i] > arr1[j]) {
                        char temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                    if (arr2[i] > arr2[j]) {
                        char temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }
            // after sorting the arr1 will be {e,i,l,n,s,t}
            //                     arr2 will be {e,i,l,n,s,t}

            // Compare both sorted arrays manually
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            boolean result = isAnagram(str1, str2);

            // Print the result
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }
    }

