public class W03_01_NetOrice {
    public static void main(String[] args) {
        short price = 350;
        byte quantity = 10;
        byte  percentDiscount = 5;
        int totalPrice = price * quantity;
        int discount = totalPrice * percentDiscount / 100;
        int netPrice = totalPrice - discount;
        System.out.println("|| Total Proce || = " + (totalPrice) + " บาท");
        System.out.println("|| Discount||  = " + (discount) + " บาท");
        System.out.println("|| NetPrice || = " + (netPrice)+" บาท");
        System.out.println("  _________            .__                          __   \r\n" + //
                " /   _____/__ ________ |  |__ _____    ____ _____ _/  |_ \r\n" + //
                " \\_____  \\|  |  \\____ \\|  |  \\\\__  \\  /    \\\\__  \\\\   __\\\r\n" + //
                " /        \\  |  /  |_> >   Y  \\/ __ \\|   |  \\/ __ \\|  |  \r\n" + //
                "/_______  /____/|   __/|___|  (____  /___|  (____  /__|  \r\n" + //
                "        \\/      |__|        \\/     \\/     \\/     \\/      ");

    }
}