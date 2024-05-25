package review_kawakubo;

import java.io.IOException;
import java.util.Scanner;

public class Ex070_B_川久保 {

	static class TimeRecorder {
		String name;
		int begin;
		int stop;
		public TimeRecorder(String name, int begin, int stop) {
			this.name = name;
			this.begin = begin;
			this.stop = stop;
		}
		public String getName() {
			return name;
		}
		public int getBegin() {
			return begin;
		}
		public int getStop() {
			return stop;
		}
		
	}

	public static void main(String[] args) throws IOException {
		TimeRecorder[] r = prepare();
		TimeRecorder t1 = r[0];
		TimeRecorder t2 = r[1];
		int overlap = overlap(t1.getBegin(), t1.getStop(), t2.getBegin(), t2.getStop());
		System.out.println((overlap));
	}

	public static TimeRecorder[] prepare() {
		Scanner sc = new Scanner(System.in);
		TimeRecorder t1 = new TimeRecorder("Alice", sc.nextInt(), sc.nextInt());
		TimeRecorder t2 = new TimeRecorder("Bob", sc.nextInt(), sc.nextInt());
		sc.close();
		return new TimeRecorder[]{t1, t2};
	}

	static int overlap(int beginX, int stopX, int beginY, int stopY) throws IOException {
		return Math.max(Math.min(stopX, stopY) - Math.max(beginX, beginY), 0);
	}

}
