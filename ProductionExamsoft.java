package trentonsmith;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class ProductionExamsoft {

	public static void main(String[] args) {

		
		
		// ^$ checks for null, possibly use for catching true false questions
		
		// lowercase i is ignore case
		
		
		
		
		
		
		
		
		
		
		
		
		// enter exam title in between quotes below
		String quizName = "CASM Flex Neuromuscular 1 Exam 1";
		
		
		
		// paste from snible after the equal sign
		 String regexRef = "Question 1\n2\npoints\nYour patient, who recently had a stroke, is relearning how to transition from sit to stand. His performance is highly variable as he is developing an overall understanding of the sit to stand task. Your patient is most likely in which stage of motor learning?\n\nAnswer 1\nAssociative\n\nAnswer 2\nAutonomous\n\nAnswer 3\nCognitive\n\nCorrect answer\nAnswer 4\nPrimary\n\nQuestion 2\n2\npoints\nYou are working with your patient on transferring from their bed to their wheelchair. You have broken up the task into component parts in past treatment sessions and are now practicing the entire skill as a sequence of events. You assist your patient with transferring from the bed to the wheelchair. Which type of motor skill does this bed to wheelchair transfer represent?\n\nAnswer 1\nCognitive\n\nAnswer 2\nContinuous \n\nAnswer 3\nDiscrete\n\nAnswer 4\nSerial  \n\nCorrect answer\nQuestion 3\n2\npoints\nWhich of the following is considered a body function/structure/impairment level according to the International Classification of Functioning, Disability, and Health (ICF) model? \n\nAnswer 1\nWalking up stairs\n\nAnswer 2\nBalance\n\nCorrect answer\nAnswer 3\nSit to stand transfer\n\nAnswer 4\nThrowing a ball   \n\nQuestion 4\n2\npoints\nMovements can be grouped according to the actions and type of motor control required during performance of the task. Which of the following category of motor skills refers to the ability to move from one position to another independently and safely, such as in rolling and/or supine to sit?\n\nAnswer 1\nDynamic postural control\n\nAnswer 2\nSkill\n\nAnswer 3\nStability\n\nAnswer 4\nTransitional mobility   \n\nCorrect answer\nQuestion 5\n2\npoints\nWhich practice condition involves a practice sequence organized around one task performed repetedly, uninterupted by practice on any other task? For example, you are working with your patient on 10 trials of single limb stance without performance of another task during those 10 trials. \n\nAnswer 1\nDistributed \n\nAnswer 2\nConstant \n\nAnswer 3\nBlocked\n\nCorrect answer\nAnswer 4\nRandom  \n\nQuestion 6\n2\npoints\nYou are performing the Functional Movement Screen (FMS) with your patient. Your patient completes the deep squat pattern of the FMS correctly and without compensation. What is the BEST score for your patient on this component of the FMS?\n\nAnswer 1\n0\n\nAnswer 2\n1\n\nAnswer 3\n2\n\nAnswer 4\n3\n\nCorrect answer\nQuestion 7\n2\npoints\nJohnson is being seen in physical therapy for neck movement dysfunction. The PT is utilizing the Selective Functional Movement Assessment (sFMA) to determine a movement diagnosis in order to improve Johnson's movement dysfunction. When asked to perform active cervical neck flexion, Johnson is able to flex chin to chest, but has pain with movement. How would the PT score/classify his top tier active cervical flexion movement? \n\nAnswer 1\nFunctional/Non-painful\n\nAnswer 2\nFunctional/Painful\n\nCorrect answer\nAnswer 3\nScore of 0\n\nAnswer 4\nScore of 3\n\nQuestion 8\n2\npoints\nAfter performing the Selective Functional Movement Assessment (sFMA), Sally's physical therapist determines that Sally has an upper cervical stability motor control dysfunction (SMCD). Based on this information, what is the MOST appropriate intervention option for Sally at this time?\n\nAnswer 1\nPassive range of motion of the upper cervical spine\n\nAnswer 2\nSupine chin tucks strengthening of Longus Colli muscle\n\nCorrect answer\nAnswer 3\nCervical spine joint mobilizations\n\nAnswer 4\nDeep squats with transversus abdominis control\n\nQuestion 9\n2\npoints\nWhich of the following is NOT a purpose of Functional Capacity Assessments/Evaluations performed by a physical therapist?\n\nAnswer 1\nIdentify ways to modify the work place to prevent further injury\n\nAnswer 2\nIdentify Symptom Magnifiers\n\nAnswer 3\nIdentify levels of return to work\n\nAnswer 4\nCreate fear in your patient so they perform poorly on the assessment\n\nCorrect answer\nQuestion 10\n2\npoints\nWhich of the following statements best represents a Functional Capacity Assessment/Evaluation?\n\nAnswer 1\nIt will determine what a patient cannot do and inform the employer\n\nAnswer 2\nIt considers safe level of performance\n\nCorrect answer\nAnswer 3\nAssesses only the trunk as the patient performs job related tasks\n\nAnswer 4\nThe assessment would be stopped by the therapist if the patient complains of pain\n\nQuestion 11\n2\npoints\nWhat is one of the risks of prolonged time waiting for proper referrals in the Workers Compensation system?\n\nAnswer 1\nPhysical and psychological deconditioning\n\nCorrect answer\nAnswer 2\nMay prevent symptom magnification behavior\n\nAnswer 3\nDecreased paperwork for the employer\n\nAnswer 4\nLess need for a lawyer\n\nQuestion 12\n2\npoints\nThe branch of medicine defined as \u201Cbeing concerned with the maintenance of health and the prevention and treatment of diseases and accidental injuries in the work place\" is referred to as:\n\nAnswer 1\nPhysical Medicine\n\nAnswer 2\nWorkplace Medicine\n\nAnswer 3\nRehabilitative Medicine\n\nAnswer 4\nIndustrial Medicine\n\nCorrect answer\nQuestion 13\n2\npoints\nA patient is a tennis player who sustained a Right shoulder injury while playing tennis. The final remaining PT goal is to regain ability to serve a tennis ball. Which of the following PNF techniques would be used with this patient if the goal is to teach or reteach this movement pattern?\n\nAnswer 1\nContract-relax\n\nAnswer 2\nRhythmic initiation\n\nCorrect answer\nAnswer 3\nTiming for emphasis \n\nAnswer 4\nQuick stretch    \n\nQuestion 14\n2\npoints\nWhich of the following does NOT represent a principle of PNF? \n\nAnswer 1\nApproximation\n\nAnswer 2\nCombination of isotonics\n\nCorrect answer\nAnswer 3\nIrradiation \n\nAnswer 4\nVerbal cues\n\nQuestion 15\n2\npoints\nWhich of the following statements does NOT properly represent PNF patterns of movement? \n\nAnswer 1\nThey are spiral and diagonal in nature\n\nAnswer 2\nThey combine movement in only 2 planes\n\nCorrect answer\nAnswer 3\nThey mimic normal activities\n\nAnswer 4\nThey can be performed bilaterally\n\nQuestion 16\n2\npoints\nWhich pelvic pattern would allow strengthening to improve initial contact, loading response phase of gait?\n\nAnswer 1\nPelvic anterior elevation \n\nAnswer 2\nPelvic anterior depression \n\nCorrect answer\nAnswer 3\nPelvic posterior elevation \n\nAnswer 4\nPelvic posterior depression \n\nQuestion 17\n2\npoints\nWhich scapular pattern is used when you push off a bed with the upper extremities during sit to stand? \n\nAnswer 1\nAnterior elevation\n\nAnswer 2\nAnterior depression \n\nAnswer 3\nPosterior elevation\n\nAnswer 4\nPosterior depression \n\nCorrect answer\nQuestion 18\n2\npoints\nStrengthening which PNF LE pattern would improve swing phase of gait to progress your patient towards their goal of community level ambulation? \n\nAnswer 1\nLE D1 extension, abduction and internal rotation\n\nAnswer 2\nLE D1 flexion, adduction, and external rotation\n\nCorrect answer\nAnswer 3\nLE D2 extension, adduction and external rotation\n\nAnswer 4\nLE D2 flexion, abduction, and internal rotation\n\nQuestion 19\n2\npoints\nWhen applying the PNF guiding principle of manual contacts with your patient, which type of manual grip is preferred to properly guide movement? \n\nAnswer 1\nLumbrical grip\n\nCorrect answer\nAnswer 2\nPalmar grip\n\nAnswer 3\nOpen grip\n\nAnswer 4\nEagle grip\n\nQuestion 20\n2\npoints\nWhich of the following Right Upper Extremity PNF patterns is most closely related to the functional task of rolling from supine to sidelying to the left side (chopping)? \n\nAnswer 1\nUE D1 extension, abduction, internal rotation\n\nAnswer 2\nUE D1 flexion, adduction, external rotation\n\nAnswer 3\nUE D2 extension, adduction, internal rotation\n\nCorrect answer\nAnswer 4\nUE D2 flexion, abduction, external rotation\n\nQuestion 21\n2\npoints\nWhich of the following PNF bidirectional techniques would BEST assist a patient with strengthening the movement associated with serving a tennis ball?\n\nAnswer 1\nDynamic Reversals\n\nCorrect answer\nAnswer 2\nQuick Stretch\n\nAnswer 3\nContract-relax\n\nAnswer 4\nCombination of isotonics\n\nQuestion 22\n2\npoints\nWhich of the following PNF techniques helps to strengthen the weaker component through irradiation and reinforcement?\n\nAnswer 1\nContract-relax \n\nAnswer 2\nTiming for emphasis \n\nCorrect answer\nAnswer 3\nDynamic reversals \n\nAnswer 4\nQuick stretch\n\nQuestion 23\n2\npoints\nWhich of the following exercises is Semi-Dynamic?\n\nAnswer 1\nTandem stance on the tile floor\n\nAnswer 2\nDouble leg stance on a bosu\n\nCorrect answer\nAnswer 3\nBox jumps\n\nAnswer 4\nForward lunge to single leg stance\n\nQuestion 24\n2\npoints\nWhich of the sensory systems involved with balance and postural equilibrium register the orientation and movement of the head?\n\nAnswer 1\nVisual\n\nAnswer 2\nSomatosensory\n\n\n\nAnswer 3\nVestibular\n\nCorrect answer\nAnswer 4\nProprioceptive\n\nQuestion 25\n2\npoints\nYou are working with your patient on balance restoration after the patient has experienced numerous falls. Which of the following is a contributor to his falls?\n\nAnswer 1\nVestibular neuritis\n\nAnswer 2\nPeripheral neuropathy at plantar surface of feet\n\nAnswer 3\nModerate to severe thoracic kyphosis\n\n\n\nAnswer 4\nAll of the above may be contributors\n\nCorrect answer\nQuestion 26\n2\npoints\nIn which of the following scenarios is Dynamic Balance NOT observed?\n\nAnswer 1\nJumping forward\n\nAnswer 2\nRhomberg stance\n\nCorrect answer\nAnswer 3\nWalking\n\nAnswer 4\nClimbing stairs\n\nQuestion 27\n2\npoints\nA patient has a goal to be able to reach for a seat belt with the RUE, and buckle the seat belt into the lock. The patient typically sits in the passenger seat of the car and lives in the United States. Which two PNF scapular patterns will be used to strengthen the patient to be able to reach the goal listed? \n\nAnswer 1\nPosterior elevation and posterior depression\n\nAnswer 2\nAnterior elevation and anterior depression \n\nAnswer 3\nAnterior elevation and posterior depression\n\nAnswer 4\nPosterior elevation and anterior depression\n\nCorrect answer\nQuestion 28\n2\npoints\nWhich of the following is an example of extrinsic feedback to your patient for the purpose of motor learning?\n\nAnswer 1\nProprioceptive signals\n\nAnswer 2\nVisual signals\n\nAnswer 3\nVestibular signals\n\nAnswer 4\nManual contacts\n\nCorrect answer\nQuestion 29\n2\npoints\nIn which stage of motor learning is the patient typically able to add multiple secondary tasks? \n\nAnswer 1\nCognitive \n\nAnswer 2\nAssociative \n\nAnswer 3\nAutonomous \n\nCorrect answer\nAnswer 4\nSecondary\n\nQuestion 30\n2\npoints\nA patient sustained a R ankle fracture. They would like to focus on their balance so that they can return to playing soccer. The PT first assesses static balance. Which of the following scenarios BEST represents static balance?\n\nAnswer 1\nCenter of gravity maintained over a fixed base of support\n\nCorrect answer\nAnswer 2\nMaintaining the center of gravity over a moving base of support\n\nAnswer 3\nSingle limb stance on a moving surface\n\nAnswer 4\nRunning\n\nQuestion 31\n0\npoints\nUpon completion of the selective functional movement assessment by a physical therapist (PT), the PT determines that their patient has an upper cervical spine joint mobility dysfunction (JMD). Which of the following components of the PT plan of care is MOST appropriate to delegate to the physical therapist assistant (PTA) for the following treatment?\n\nAnswer 1\nUpper cervical spine joint manipulation\n\nAnswer 2\nUpper cervical spine joint mobilization\n\nAnswer 3\nSternoclavicular joint mobilization\n\nAnswer 4\nUpper cervical spine passive range of motion\n\nCorrect answer\n"
;		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
				 
				 
				 
				 
				 
				 
				 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
		// COPY AND PASTE INTO DOCS
		String regex = "(Question [0-9]+ [\\s\\S]*?\\n(?=Question [0-9]+|$))";
		
		Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(regexRef);
			ArrayList<String> myList = new ArrayList<String>();
			ArrayList<Integer> jpgNeededList = new ArrayList<Integer>();
			
		
			while(m.find()) {
				
				if(m.group(0).contains(" \n \n \n \n \n ")||m.group(0).contains(" \n \n \n \n \n \n \n \n")) {
					myList.add(m.group(0).replaceAll("\\nFull credit given ", "").replaceAll(" \\n \\n \\n \\n \\n \\n \\n", "").replaceAll(" \\n \\n \\n \\n \\n ", " "));
					jpgNeededList.add(myList.size()-1);
				}
				else {
					myList.add(m.group(0).replaceAll("\\nFull credit given ", "").replaceAll(" \\n \\n \\n \\n \\n \\n \\n ", "").replaceAll(" \\n \\n \\n \\n \\n ", " ").replaceAll("  \\n \\n \\n \\n", " "));
				}
			}
			
	//	System.out.println(myList.get(7));
			
			ArrayList<Integer> numList = new ArrayList<Integer>();
			
			
			
			
			String quizNameFormatted = "Title: " + quizName +" ";
			m.reset();
		
			String regexMulitpleChoiceFourAnswers = "(Question [0-9]+?) \\n[0-9]+ \\npoints \\n(.*? *\\n \\n|.*? *\\n)(Answer 1 \\n.* \\n \\n[\\s\\S]*?)(Answer 2 \\n.* \\n \\n[\\s\\S]*?)(Answer 3 \\n.* \\n \\n[\\s\\S]*?)(Answer 4[\\s\\S]*)";
			;
			
			
			Pattern pattern2 = Pattern.compile(regexMulitpleChoiceFourAnswers);
			
			
			String regexMultipleChoiceThreeAnswers = "(Question [0-9]+?) \\n[0-9]+ \\npoints \\n(.*? *\\n \\n|.*? *\\n)(Answer 1 \\n.* \\n \\n[\\s\\S]*?)(Answer 2 \\n.* \\n \\n[\\s\\S]*?)(Answer 3[\\s\\S]*)";
			
			Pattern regexMultipleThreeAnswers = Pattern.compile(regexMultipleChoiceThreeAnswers);
			

			
			String regexTrueFalse = "(Question [0-9]+?) \\n[0-9]+ \\npoints \\n(.*? *\\n \\n|.*? *\\n)(True \\n[\\s\\S]*?)(False[\\s\\S]*)";
			 
			
			Pattern trueFalsePattern = Pattern.compile(regexTrueFalse);
		

			for(int i = 0; i < myList.size(); i++) {

				StringBuilder sb = new StringBuilder();
				m = pattern2.matcher(myList.get(i));

				Matcher trueFalsem = trueFalsePattern.matcher(myList.get(i));
				
				Matcher multipleChoiceThreem = regexMultipleThreeAnswers.matcher(myList.get(i));
				
				boolean isFourAnswers = false;
				
				
				while(m.find()) {
					
					
					
						
					
					
	                sb.append(quizNameFormatted);
	                int value = Integer.parseInt(m.group(1).replaceAll("[^0-9]", ""));
	                numList.add(value);
	                sb.append(value);
	                sb.append(". ");
	                sb.append(m.group(2).trim());
	                sb.append("\n");

	                sb.append(ifCorrectAppendAsteriskMultipleChoice(m.group(3),'a'));
	                sb.append(ifCorrectAppendAsteriskMultipleChoice(m.group(4),'b'));
	                sb.append(ifCorrectAppendAsteriskMultipleChoice(m.group(5),'c'));
	                sb.append(ifCorrectAppendAsteriskMultipleChoice(m.group(6),'d'));
	              System.out.println(sb);
	              isFourAnswers = true;
          
	                
					}
//					else if(m.group(0).matches("(Question [0-9]+?) \\n[0-9]+ \\npoints \\n(.*? *\\n \\n|.*? *\\n)(True \\n[\\s\\S]*? \\n)(False[\\s\\S]*)")) {
//						
//						
//						
//						 sb.append(quizNameFormatted);
//			                int value = Integer.parseInt(m.group(2).replaceAll("[^0-9]", ""));
//			                numList.add(value);
//			                sb.append(value);
//			                sb.append(". ");
//			                sb.append(m.group(3).trim());
//			                sb.append("\n");
//			                
//			                sb.append(ifCorrectAppendAsteriskMultipleChoice(m.group(3),'a'));
//			                sb.append(ifCorrectAppendAsteriskMultipleChoice(m.group(4),'b'));
//						
//						
//						System.out.println(sb);
//						
//					}
					
					if(!isFourAnswers) {
					while(multipleChoiceThreem.find()) {
						
						
						
						int value = Integer.parseInt(multipleChoiceThreem.group(1).replaceAll("[^0-9]", ""));
		                numList.add(value);
		                sb.append(value);
		                sb.append(". ");
		                sb.append(multipleChoiceThreem.group(2).trim());
		                sb.append("\n");

		                sb.append(ifCorrectAppendAsteriskMultipleChoice(multipleChoiceThreem.group(3),'a'));
		                sb.append(ifCorrectAppendAsteriskMultipleChoice(multipleChoiceThreem.group(4),'b'));
		                sb.append(ifCorrectAppendAsteriskMultipleChoice(multipleChoiceThreem.group(5),'c'));
		                System.out.println(sb);
					}
					}
					
					
					
					
					
					
					
					
	           
				
				while(trueFalsem.find()) {
					
			
			
					
					
					sb.append(quizNameFormatted);
                int value = Integer.parseInt(trueFalsem.group(1).replaceAll("[^0-9]", ""));
                numList.add(value);
                sb.append(value);
                sb.append(". ");
                sb.append(trueFalsem.group(2).trim());
                sb.append("\n");
                
                sb.append(ifCorrectAppendAsteriskMultipleChoice(trueFalsem.group(3),'a'));
                sb.append(ifCorrectAppendAsteriskMultipleChoice(trueFalsem.group(4),'b'));
			
			
			System.out.println(sb);
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			System.out.println("---------------------------COPY EVERYTHING ABOVE THIS LINE-------------------------------------------------------------------------");
			
			
			System.out.println("Total number of questions parsed: " + myList.size());
			System.out.println("\nQuestions that were not processed: ");
			for(int i = 1; i <= myList.size();i++) {
				if(!numList.contains(i)){
					System.out.println(i);
				}
			}
			System.out.println("\nQuestions that need images");
			for(Integer i: jpgNeededList) {
				System.out.println(i+1);
			}
			
			

		}
		static String ifCorrectAppendAsteriskMultipleChoice(String question, char letterAnswer) {
			
			StringBuilder returned = new StringBuilder();
			
			if(question.contains("Correct answer")) {
				returned.append("*"+letterAnswer+". ");
			String removeAnswer = question.replaceAll("Answer [0-4]", "");
				String trimmed = removeAnswer.replaceAll("Correct answer", "").trim();
				returned.append(trimmed+"\n");
			return returned.toString();
			}
			else {
				
				String removeAnswer = letterAnswer+". "+(question.replaceAll("Answer [0-4]", "").trim())+"\n";
				return removeAnswer;
			}
		}
		
		
		
//		static String ifCorrectAppendAsteriskTrueFalse(String question,char letterAnswer, String TrueOrFalse) {
//			
//			
//			StringBuilder returned = new StringBuilder();
//			if(question.contains("Correct answer")){
//				
//				returned.append("*"+letterAnswer+". ");
//				
//			}
//			
//			return String;
//		}

}