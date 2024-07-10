public class Program31 {
    public static void main(String args[]) {
        System.out.println("------------------P.31----------------");
        int perimeter = 200, sides = 4, side, sa;
        side = perimeter / sides;
        sa = side * side;
        System.out.println("area of square=" + sa);

        System.out.println("------------------P.32----------------");
        int gs = 150, ag;
        ag = gs * gs;
        System.out.println("area of garden=" + ag);

        System.out.println("------------------P.33----------------");

        System.out.println("------------------P.34----------------");

        System.out.println("------------------P.35----------------");
        float r = 7.7f, pi = 3.14f, surface_Area_of_Cylinder;
        int h = 12;
        surface_Area_of_Cylinder = 2 * pi * r * (r + h);
        System.out.println("surface_Area_of_Cylinder=" + surface_Area_of_Cylinder);

        System.out.println("------------------P.36----------------");
        float r2 = ((15f) / 2), pi2 = 3.14f, surface_Area_of_Cylinder2;
        int h2 = 7;
        surface_Area_of_Cylinder2 = 2 * pi2 * r2 * (r2 + h2);
        System.out.println("surface_Area_of_Cylinder=" + surface_Area_of_Cylinder2);

        System.out.println("------------------P.37----------------");
        float pi3 = 3.14f, surface_Area_of_Cylinder3 = 149f, r3, diameter;
        int h3 = 6;
        r3 = (surface_Area_of_Cylinder3 / (2 * pi3 * h3));
        diameter = r3 * 2;
        System.out.println("diameter of the cylinder=" + diameter);

        System.out.println("------------------P.38----------------");
        int volume = 1287, radius = 10;
        float pi4 = 3.14f, h4, surface_Area_of_Cylinder4;
        h4 = volume / (pi * radius * radius);
        surface_Area_of_Cylinder4 = 2 * pi4 * radius * (radius + h4);
        System.out.println("area of the cylinder=" + surface_Area_of_Cylinder4);

        System.out.println("------------------P.39----------------");
        int d = 12, r4 = d / 2, h5 = 9;
        float pi5 = 3.14f, surface_Area_of_Cylinder5;
        surface_Area_of_Cylinder5 = 2 * pi5 * r4 * (r4 + h5);
        System.out.println("surface of the cylinder=" + surface_Area_of_Cylinder5);

        System.out.println("------------------P.40----------------");
        int r5 = 5, h6 = 9;
        float pi6 = 3.14f, volume2;
        volume2 = pi6 * r5 * r5 * h6;
        System.out.println("volume of the cylinder=" + volume2);

    }
}
