boolean solution(double[] prices, String[] notes, double x) {
    double totalDiff = 0;
    
    for ( int i = 0; i < prices.length; i++) {
        String note = notes[i];
        if (note.contains("Same")) {
            continue;
        }
        
        double prec = Double.valueOf(note.substring(0, notes[i].indexOf("%")));
        double price = prices[i];
        double diff;
        
        if (note.contains("higher")) {
            diff = price - ((price / (1 + (prec / 100))));
        } else {
            diff = price - ((price / (1 - (prec / 100))));
        }
        
        totalDiff += diff;
    }
    
    return totalDiff - x < 1e-10;
}
