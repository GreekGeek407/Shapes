
public class TestShapes {

	public static void main(String[] args) {
		Rect r = new Rect();
		r.makeVisible();
		r.slowMoveHorizontal(100);
		r.changeColor("purple");
		r.changeSize(100, 200);
		
		Oval o = new Oval();
		o.makeVisible();
		o.slowMoveDiagonal(75, -1, 1);
		o.changeColor("blue");
		o.changeSize(80, 160);
		
		Rect s = new Rect();
		s.makeVisible();
		s.slowMoveVertical(50);
		s.changeColor("green");
		s.changeSize(200, 100);
		
		Triangle t = new Triangle();
		t.makeVisible();
		t.slowMoveVertical(50);
		t.changeColor("blue");
		t.changeSize(200, 50);
		t.slowMoveDiagonal(150, 1, -1);
	}

}
