class Point {
    int m_x, m_y;
    
    public Point(int x, int y) { m_x = x; m_y = y; System.out.println("1"); }
    public Point() { this(10, 10); System.out.println("2");}
    public int getX() { return m_x; }
    public int getY() { return m_y; }
    
    public static void main(String args[]) {
      Point p = new Point();
      System.out.println(p.getX());
    }
  } 