package cn.tedu.shoot;
/** 天空 */
public class Sky {
	int width;
	int height;
	int x;
	int y;
	int speed; //移动速度
	int y1;    //第2张图的y坐标
	
	/** 天空移动 */
	void step() {
		System.out.println("天空的y坐标和y1坐标移动了:"+speed);
	}
}




















