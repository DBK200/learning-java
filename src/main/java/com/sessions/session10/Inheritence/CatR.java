package com.sessions.session10.Inheritence;

public class CatR extends AnimalR
{
        protected String name;

        public static void main(String[] args)
        {
            CatR cat=new CatR();
            System.out.println(cat.age);
            //Animal are propietatea age
            //putem sa folosim propietati din clasa parinte

            cat.eat("Food");
        }
        //putem suprascrie niste metode
        @Override//folosim acelasi nume al metodei si acelasi set de parametri

        //cand facem override la o metoda trebuie sa respectam niste reguli:
        //1:metoda trebuie sa aiba aceeasi semnatura in ambele clase
        //2:access modifier cannot be restrictive than the method from parent class
        //3:return type must be covariant -same type or a subclass
        //4:clasa noua pe care vrem sa o implementam nu are voie sa arunce o exceptie mai generala

        protected void eat(String xd)
        {
            System.out.println("Cat is eating something good....");
        }




}
