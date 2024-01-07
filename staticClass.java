class st{
    static int val = 10;
}

class staticClass{
    public static void main(String[] args) {
        st.val = 20;
        System.out.println(st.val);
    }
}