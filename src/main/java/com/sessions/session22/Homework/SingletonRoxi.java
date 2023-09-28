package com.sessions.session22.Homework;

public class SingletonRoxi
{
        // Variabila statică privată pentru a stoca instanța unică a clasei
        private static SingletonRoxi instance;

        // Constructorul privat pentru a preveni crearea de instanțe multiple din exterior
        private SingletonRoxi()
        {
        }

        // Metodă publică pentru a obține instanța unică a clasei
        public static SingletonRoxi getInstance()
        {
            // Verificăm dacă instanța există deja; dacă nu, o creăm
            if (instance == null) {
                instance = new SingletonRoxi();
            }
            return instance;
        }

        public void showMessage()
        {
            System.out.println("Acesta este un mesaj din clasa Singleton.");
        }

        public static void main(String[] args)
        {
            // Obținem instanța singleton
            SingletonRoxi singleton = SingletonRoxi.getInstance();

            // Apelăm metoda showMessage a instanței
            singleton.showMessage();
        }
    }


