package project4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeWeigh[] goodsBig = new ComputeWeigh[66];
		ComputeWeigh[] goodsSmall = new ComputeWeigh[22];
		for(int i=0;i<goodsBig.length;i++){
			if(i%3==0){
				goodsBig[i] = new Television();
			}
			if(i%3==1){
				goodsBig[i] = new Computer();
			}
			if(i%3==2){
				goodsBig[i] = new WashMachine();
			}
		}
		for(int i=0;i<goodsSmall.length;i++){
			if(i%3==0){
				goodsSmall[i] = new Television();
			}
			if(i%3==1){
				goodsSmall[i] = new Computer();
			}
			if(i%3==2){
				goodsSmall[i] = new WashMachine();
			}
		}
		Car bigcar = new Car(goodsBig);
		System.out.println("大货车的装载重量是："+bigcar.getTotal());
		Car smallcar = new Car(goodsSmall);
		System.out.println("大货车的装载重量是："+smallcar.getTotal());

	}

}
