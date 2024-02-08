public class CountIPAddresses {

	public static long ipsBetween(String startIP, String endIP) {
		 String[] startOctets = startIP.split("\\.");
        String[] endOctets = endIP.split("\\.");

        long start = 0;
        long end = 0;

        for (int i = 0; i < 4; i++) {
            start = (start << 8) + Long.parseLong(startOctets[i]);
            end = (end << 8) + Long.parseLong(endOctets[i]);
        }

        return end - start;
	}
}
