package project4;

public class Car {
	ComputeWeigh[] goods;
	double total = 0;
	Car(ComputeWeigh[] goods){
		this.goods = goods;
	}
	public double getTotal(){//�����ܵû�������
		total = 0;
		for(int i=0;i<goods.length;i++){
			total = total+goods[i].computeWeight();
		}
		return total;
		
	}

}
