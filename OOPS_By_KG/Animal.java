package OOPS_By_KG;


    class Animal9{
        void eat(){System.out.println("eating...");}
    }
    class Dogs extends Animal9{
        void bark(){System.out.println("barking...");}
    }
    class BabyDog extends Dogs{
        void weep(){System.out.println("weeping...");}
    }
    class TestInheritance2{
        public static void main(String args[]){
            BabyDog d=new BabyDog();
            d.weep();
            d.bark();
            d.eat();
        }}

