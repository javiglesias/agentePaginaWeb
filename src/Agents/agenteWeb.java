package Agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.ParallelBehaviour;
import java.util.Scanner;

public class agenteWeb extends Agent 
	{
		private static final long serialVerisonUID = 1L;
		protected CyclicBehaviour cyclicBehaviour;
		protected ParallelBehaviour parallelBehaviour;
		
			public void setup()
			{
				cyclicBehaviour = new CyclicBehaviour(this)
				{
					@Override
					public void action() {
						// TODO Auto-generated method stub
						block();
					}
					
				};
				/*parallelBehaviour = new ParallelBehaviour(this,0)
				{
					
				};*/
				addBehaviour(cyclicBehaviour);
				//addBehaviour(parallelBehaviour);
			}
	}

