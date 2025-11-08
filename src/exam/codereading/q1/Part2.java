package exam.codereading.q1;

public class Part2 {

	public static void main(String[] args) {
		//What will print?
		VersionNumber v4 = new VersionNumber( 4 ) ;
		VersionNumber v4b = new VersionNumber( 4 ) ;
		v4.majorBump( ) ;
		System.out.println(v4.isEquivalent( v4b ) ) ;
	}
	// C
	// C
	// B
	// S : v 4 . 1
}
