package view;



public class StudentskaSluzba {

	
	public static void main(String[] args) {

<<<<<<< HEAD
		GlavniProzor glavniP = new GlavniProzor();
		glavniP.setVisible(true);

=======
		// provera da li postoji uneta vrednost ulaznog argumenta
		if (args.length != 0) {

			int param = 0;
			String arg0 = args[0];
			try {
				param = Integer.parseInt(arg0);
			} catch (Exception e) {
				System.out.println("Neispravna vrednost ulaznog parametra");
				System.exit(0);
			}
		} else {
			//Ovde se piše kod.
			

		}
>>>>>>> 4628238ccd848dc24cbfe8320719cf2a2356978d

	}

}
