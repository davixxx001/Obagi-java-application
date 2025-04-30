public class ArrayExercise{
	public static void main(String[] args){
		int[] counts = new int[10];
		
		System.out.print("Counts: ");
		for(int i = 0; i < counts.length; i++){
			System.out.print("Counts[i] + ");
		}
		System.out.println("\n");
		int[] bonus = new int [15];
		for(int i = 0; i < bonus.length; i++){
			System.out.println("Bonus");
			for(int b : bonus){
				System.out.print(b + " ");
			}
			System.out.println("\n");
			
			int[] bestScores = {87,92,78,94,88};
			System.out.println("Best Scores:");
			for(int score : bestScores)
			{
				System.out.print(score + " ");
			}
		}
	}
}