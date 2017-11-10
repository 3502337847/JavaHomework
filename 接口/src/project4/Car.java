package project4;

public class Car {
	ComputeWeigh[] goods;
	double total = 0;
	Car(ComputeWeigh[] goods){
		this.goods = goods;
	}
	public double getTotal(){//计算总得货物重量
		total = 0;
		for(int i=0;i<goods.length;i++){
			total = total+goods[i].computeWeight();
		}
		return total;
		
	}

}
