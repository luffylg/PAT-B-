package patb_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class solution_1025 {
	public static class node{
		String address;
		String val;
		String nextaddress;
		public node(String address, String val, String nextaddress) {
			this.address = address;
			this.val = val;
			this.nextaddress = nextaddress;
		}
		@Override
		public String toString() {
			return address + " " + val + " " + nextaddress;
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String[] split = line.split(" ");
		String start=split[0];
		int N=Integer.valueOf(split[1]);
		int K=Integer.valueOf(split[2]);
		HashMap<String, node> map = new HashMap<String,node>();
		for (int i = 0; i < N; i++) {
			String line1 = reader.readLine();
			String[] split1 = line1.split(" ");
			map.put(split1[0], new node(split1[0], split1[1], split1[2]));
		}
		reader.close();
		ArrayList<node> list = new ArrayList<node>();
		while (true) {
			
			for (int i = 0; i < K; i++) {
				node tmp = map.get(start);
				if (tmp==null||tmp.address=="-1") {
					break;
				}
				list.add(tmp);
				start=tmp.nextaddress;
			}
			if (list.size()<K) {
				break;
			}
			for (int i = K-1; i>=1; i--) {
				node tm=list.get(i);
				System.out.println(tm.address+" "+tm.val+" "+list.get(i-1).address);
			}
			System.out.println(list.get(0).address+" "+list.get(0).val+" "+list.get(K-1).nextaddress);
			list.clear();
		}
		for (node node : list) {
			System.out.println(node);
		}
	}

}
