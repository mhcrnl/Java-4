public class Atom {
	private String name;
	private int numberOfElectrons;
	private int numberOfProtons;
	private int numberOfNeutrons;
	private double electronMass = 0.01;
	private double protonMass = 1.0;
	private double neutronMass = 1.01;
	private boolean radioactive;
	private Atom decayingResult;
	
	public static void main(String[] args) {
		Atom hydrogen = new Atom ("Hydrogen", 1, 1, 0, false);
		Atom deuterium = new Atom ("Deuterium", 1, 1, 1, false);
		Atom tritium = new Atom ("Tritium", 1, 1, 2, true, deuterium);
		Atom[] allAtoms = new Atom[3];
		allAtoms[0] = hydrogen;
		allAtoms[1] = deuterium;
		allAtoms[2] = tritium;
		
		for (int i=0; i<3; i++) {
			System.out.println(allAtoms[i]);
		}
		System.out.println();
		
		allAtoms[2] = tritium.decay();
		
		System.out.println(tritium);
		System.out.println();
		
		for (int i=0; i<3; i++) {
			System.out.println(allAtoms[i]);
		}
	}
	
	public Atom(String name, int numberOfElectrons, int numberOfProtons,
			int numberOfNeutrons, boolean radioactive) {
		super();
		this.name = name;
		this.numberOfElectrons = numberOfElectrons;
		this.numberOfProtons = numberOfProtons;
		this.numberOfNeutrons = numberOfNeutrons;
		this.radioactive = radioactive;
	}
	
	public Atom(String name, int numberOfElectrons, int numberOfProtons) {
		super();
		this.name = name;
		this.numberOfElectrons = numberOfElectrons;
		this.numberOfProtons = numberOfProtons;
	}

	public Atom(String name, int numberOfElectrons, int numberOfProtons,
			int numberOfNeutrons, boolean radioactive, Atom decayingResult) {
		super();
		this.name = name;
		this.numberOfElectrons = numberOfElectrons;
		this.numberOfProtons = numberOfProtons;
		this.numberOfNeutrons = numberOfNeutrons;
		this.radioactive = radioactive;
		
		if (radioactive) {
			this.decayingResult = decayingResult;
		}
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfElectrons() {
		return numberOfElectrons;
	}
	public void setNumberOfElectrons(int numberOfElectrons) {
		this.numberOfElectrons = numberOfElectrons;
	}
	public int getNumberOfProtons() {
		return numberOfProtons;
	}
	public void setNumberOfProtons(int numberOfProtons) {
		this.numberOfProtons = numberOfProtons;
	}
	public int getNumberOfNeutrons() {
		return numberOfNeutrons;
	}
	public void setNumbarOfNeutrons(int numberOfNeutrons) {
		this.numberOfNeutrons = numberOfNeutrons;
	}
	public boolean isRadioactive() {
		return radioactive;
	}
	public void setRadioactive(boolean radioactive) {
		this.radioactive = radioactive;
	}
	public Atom getDecayingResult() {
		return decayingResult;
	}
	public void setDecayingResult(Atom decayingResult) {
		if (radioactive) {
			this.decayingResult = decayingResult;
		}
	}
	public double getElectronMass() {
		return electronMass;
	}
	public double getProtonMass() {
		return protonMass;
	}
	public double getNeutronMass() {
		return neutronMass;
	}
	
	public double getMass() {
		double mass = numberOfElectrons*electronMass;
		mass += numberOfProtons*protonMass;
		mass += numberOfNeutrons*neutronMass;
		return mass;
	}
	
	public Atom decay() {
		if (!radioactive) {
			return this;
		}
		else {
			System.out.println(decayingResult);
			return decayingResult;
		}
	}

	@Override
	public String toString() {
		return "Atom [name=" + name + ", numberOfElectrons="
				+ numberOfElectrons + ", numberOfProtons=" + numberOfProtons
				+ ", numberOfNeutrons=" + numberOfNeutrons + ", radioactive="
				+ radioactive + ", decayingResult=" + decayingResult
				+ ", getMass()=" + getMass() + "]";
	}
		
}