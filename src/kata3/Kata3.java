package kata3;

public class Kata3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Histogram histogram = new Histogram();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
                                
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
