package Lexington;

public class FirmsMain {

	public static void main(String[] args) {
				
		Tenents r = new Tenents("Raj", "Microsoft","SE", JobType.FTE, 8);
		Tenents s = new Tenents("Sai", "Microsoft", "SE", JobType.FTE, 7);
		Tenents c = new Tenents("C.Manoj", "Amazon", "SE", JobType.FTE, 7);
		Tenents b = new Tenents("B.Manoj", "T-Mobile","SA", JobType.FTE, 6);
		Tenents v = new Tenents("Vikram", "7/11", "SE", JobType.FTE, 5);
		Tenents h = new Tenents("Harish", "T-Mobile", "SA", JobType.COC, 4);
				
		/*
		 * tp.jobType(r.name, r.position); tp.jobType(s.name, s.position);
		 * tp.jobType(c.name, c.position); tp.jobType(b.name, b.position);
		 * tp.jobType(v.name, v.position); tp.jobType(h.name, h.position);
		 * System.out.println(); tp.costlyTenent(r.name, r.salary);
		 * tp.costlyTenent(s.name, s.salary); tp.costlyTenent(c.name, c.salary);
		 * tp.costlyTenent(b.name, b.salary); tp.costlyTenent(v.name, v.salary);
		 * tp.costlyTenent(h.name, h.salary); System.out.println(); tp.avgTenent(r.name,
		 * r.salary); tp.avgTenent(s.name, s.salary); tp.avgTenent(c.name, c.salary);
		 * tp.avgTenent(b.name, b.salary); tp.avgTenent(v.name, v.salary);
		 * tp.avgTenent(h.name, h.salary);
		 */
		/*
		 * tp.exp(r.name); System.out.println(); tp.exp(s.name); System.out.println();
		 * tp.exp(c.name); System.out.println(); tp.exp(b.name); System.out.println();
		 * tp.exp(v.name); System.out.println(); tp.exp(h.name);
		 */

		TenentsPositions.expPosition(r.name,r.exp,r.position);
		TenentsPositions.expPosition(s.name,s.exp,s.position);
		TenentsPositions.expPosition(c.name,c.exp,c.position);
		TenentsPositions.expPosition(b.name,b.exp,b.position);
		TenentsPositions.expPosition(v.name,v.exp,v.position);
		TenentsPositions.expPosition(h.name,h.exp,h.position);
		
	}

}
