class StockSpanner {

    Stack<Integer> priceStk,weightStk;
      
    public StockSpanner() {
        priceStk = new Stack();
        weightStk = new Stack();
    }
    
    public int next(int price) {
        int w = 1;
        while (!priceStk.isEmpty() && priceStk.peek() <= price) {
            priceStk.pop();
            w += weightStk.pop();
        }

        priceStk.push(price);
        weightStk.push(w);
        return w;  
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
