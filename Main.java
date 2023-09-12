public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        Shape shape2 = new Shape(5.0);

        Shape shape3 = new Shape(4, 4.0);

        Shape shape4 = new Shape(4, 6.0, 8.0);

        Shape shape5 = new Shape(3, 3.0, 4.0, 5.0);

        String details1 = shape1.getShapeDetails();
        String details2 = shape2.getShapeDetails();
        String details3 = shape3.getShapeDetails();
        String details4 = shape4.getShapeDetails();
        String details5 = shape5.getShapeDetails();

        System.out.println("Shape 1 :\n" + details1 + "\n");
        System.out.println("Shape 2 :\n" + details2 + "\n");
        System.out.println("Shape 3 :\n" + details3 + "\n");
        System.out.println("Shape 4 :\n" + details4 + "\n");
        System.out.println("Shape 5 :\n" + details5 + "\n");
    }
}