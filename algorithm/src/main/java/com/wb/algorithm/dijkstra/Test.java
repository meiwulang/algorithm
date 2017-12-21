package com.wb.algorithm.dijkstra;
import java.util.ArrayList;
import java.util.List;

public class Test {

	/** 
	 * @Description: 测试最短距离
	 * @author 王斌
	 * @date 2017年12月20日 上午10:09:48
	 * @param args
	 */
	public static void main(String[] args) {
		List<Vertex> vertexs = new ArrayList<Vertex>();
		Vertex a = new Vertex("A", 0);
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		Vertex f = new Vertex("F");
		vertexs.add(a);
		vertexs.add(b);
		vertexs.add(c);
		vertexs.add(d);
		vertexs.add(e);
		vertexs.add(f);
		int[][] edges = {
				{ Integer.MAX_VALUE,                6,                3, Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE },
				{ 6                ,Integer.MAX_VALUE,                2,                 5,Integer.MAX_VALUE,Integer.MAX_VALUE },
				{                 3,                2,Integer.MAX_VALUE,                 3,                4,Integer.MAX_VALUE },
				{ Integer.MAX_VALUE,                5,                3, Integer.MAX_VALUE,                5,                3 },
				{ Integer.MAX_VALUE,Integer.MAX_VALUE,                4,                 5,Integer.MAX_VALUE,                5 },
				{ Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,                 3,                5,Integer.MAX_VALUE }

		};
		Graph graph = new Graph(vertexs, edges);
		graph.printGraph();
		graph.search();
		//如何把任意两点的最短路径的轨迹找出来
		System.out.println(graph.getDistance(c, e));
		System.out.println(f.getPath());
	}

}