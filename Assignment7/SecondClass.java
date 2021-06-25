public class SecondClass {

        public static class SecondInnerClass extends FirstClass.FirstInnerClass {
            public SecondInnerClass() {
                super("passing from second inner class");
            }
        }

}
