package JAVA_FUNDAMENTAL.Array;

public class Delete_by_ {

        public static void main(String[] args) {
            int[] a= {3,5,8,1,8,9,4,9};
            for(int i=0;i<a.length;i++) {
                if(a[i]!=8&&a[i]!=9 ) {

                    a[i]=a[i];
                    System.out.println(a[i]);

                }
            }

        }

    }

