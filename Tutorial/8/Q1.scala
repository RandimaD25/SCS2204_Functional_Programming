import  math.{sqrt, pow}

case class Point(a: Int, b: Int){
    def x : Int = a
    def y : Int = b
    
    def +(that: Point) = Point(this.x + that.x, this.y + that.y)

    def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

    def distance(that: Point) = sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2))

    def invert() = Point(this.y, this.x)
}

object main extends App{
    val p1 = Point(3, 5);
    val p2 = Point(1, 2);
    val p3 = p1 + p2;
    val p4 = p1.move(2, 4);
    val p5 = p1.distance(p2)
    val p6 = p2.invert()

    println(p1);
    println(p2);
    
    println("Add two points : " + p3);
    println("Move points : " + p4);
    println("Distance between two pounts : " + p5);
    println("Invert of point : " + p6);
}


