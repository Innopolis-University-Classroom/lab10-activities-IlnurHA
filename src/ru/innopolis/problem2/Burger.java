package src.ru.innopolis.problem2;

public class Burger {
    private boolean cheese;
    private boolean peperone;
    private boolean letucci;
    private boolean tomato;
    private SizeOfBurger sizeOfBurger;

    private Burger() {
    }

    class BurgerBuilder {
        private boolean cheese;
        private boolean peperone;
        private boolean letucci;
        private boolean tomato;
        private SizeOfBurger sizeOfBurger;

        BurgerBuilder() {
            reset();
        }

        BurgerBuilder cheese() {
            cheese = true;
            return this;
        }

        BurgerBuilder peperone() {
            peperone = true;
            return this;
        }

        BurgerBuilder letucci() {
            letucci = true;
            return this;
        }

        BurgerBuilder tomato() {
            tomato = true;
            return this;
        }

        BurgerBuilder size(SizeOfBurger size) {
            sizeOfBurger = size;
            return this;
        }

        Burger build() {
            Burger burger = new Burger();

            burger.sizeOfBurger = sizeOfBurger;
            burger.cheese = cheese;
            burger.letucci = letucci;
            burger.peperone = peperone;
            burger.tomato = tomato;

            return burger;
        }

        void reset() {
            cheese = false;
            peperone = false;
            letucci = false;
            tomato = false;
            sizeOfBurger = SizeOfBurger.medium;
        }
    }
}
