import java.util.Scanner;

abstract class Match{
	private int currentscore;
	private float currentover;
	private int target;

	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public abstract float calculateRunRate();
	public abstract int calculateBalls();
	public abstract void display(double reqRunrate, int balls);
}

class ODIMatch extends Match {
	public float calculateRunRate() {
		return (getTarget()-getCurrentscore())/(50-getCurrentover());
	}
	public int calculateBalls() {
		float rover=50-getCurrentover();
		int k=(int)(rover);
		int l=((int)(rover-k))*10;
		return k*6+l;
	}
	public void display(double reqRunrate, int balls) {
		System.out.println("Need "+ (getTarget()-getCurrentscore()) +" runs in "+ balls +" balls");
		System.out.printf("Required Runrate: %.2f",reqRunrate);
	}
}

class TestMatch extends Match {
	public float calculateRunRate() {
		return (getTarget()-getCurrentscore())/(90-getCurrentover());
	}
	public int calculateBalls() {
		float rover=90-getCurrentover();
		int k=(int)(rover);
		int l=((int)(rover-k))*10;
		return k*6+l;
	}
	public void display(double reqRunrate, int balls) {
		System.out.println("Need "+ (getTarget()-getCurrentscore()) +" runs in "+ balls +" balls");
		System.out.printf("Required Runrate: %.2f",reqRunrate);
	}
}

class T20Match extends Match {
	public float calculateRunRate() {
		return (getTarget()-getCurrentscore())/(20-getCurrentover());
	}
	public int calculateBalls() {
		float rover=20-getCurrentover();
		int k=(int)(rover);
		int l=((int)(rover-k))*10;
		return k*6+l;
	}
	public void display(double reqRunrate, int balls) {
		System.out.println("Need "+ (getTarget()-getCurrentscore()) +" runs in "+ balls +" balls");
		System.out.printf("Required Runrate: %.2f",reqRunrate);
	}
}

public class Matchmain {
	public static void main(String[] args) {
		System.out.println("Enter the match format");
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");
		Scanner scan=new Scanner(System.in);
		int ch=scan.nextInt();
		if(ch==1) {
			System.out.println("Enter the Current score");
			int crun=scan.nextInt();
			System.out.println("Enter the current Over");
			float cover=scan.nextFloat();
			System.out.println("Enter the Target Score");
			int trun=scan.nextInt();
			ODIMatch d=new ODIMatch();
			d.setCurrentscore(crun);
			d.setCurrentover(cover);
			d.setTarget(trun);
			int balls=d.calculateBalls();
			double reqdrunrate=d.calculateRunRate();
			System.out.println("Requirements:");
			d.display(reqdrunrate, balls);
		}
		else if(ch==2) {
			System.out.println("Enter the Current score");
			int crun=scan.nextInt();
			System.out.println("Enter the current Over");
			float cover=scan.nextFloat();
			System.out.println("Enter the Target Score");
			int trun=scan.nextInt();
			T20Match d=new T20Match();
			d.setCurrentscore(crun);
			d.setCurrentover(cover);
			d.setTarget(trun);
			int balls=d.calculateBalls();
			double reqdrunrate=d.calculateRunRate();
			System.out.println("Requirements:");
			d.display(reqdrunrate, balls);
		}
		else {
			System.out.println("Enter the Current score");
			int crun=scan.nextInt();
			System.out.println("Enter the current Over");
			float cover=scan.nextFloat();
			System.out.println("Enter the Target Score");
			int trun=scan.nextInt();
			TestMatch d=new TestMatch();
			d.setCurrentscore(crun);
			d.setCurrentover(cover);
			d.setTarget(trun);
			int balls=d.calculateBalls();
			double reqdrunrate=d.calculateRunRate();
			System.out.println("Requirements:");
			d.display(reqdrunrate, balls);
		}
		scan.close();
	}
}
