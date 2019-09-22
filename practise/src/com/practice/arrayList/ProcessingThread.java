package com.practice.arrayList;

class ProcessingThread implements Runnable{
    private int count;
    
    @Override
    public void run() {
        for(int i=1; i < 5; i++){
            processSomething(i);
        	int j=++count;
        	System.out.println("Processing count value is="+j);
        }
    }

    public int getCount() {
        return this.count;
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i*1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
