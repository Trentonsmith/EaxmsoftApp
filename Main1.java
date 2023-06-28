package trentonsmith;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Main1{

	public static void main(String[] args) {

		
		
		// ^$ checks for null, possibly use for catching true false questions
		
		// lowercase i is ignore case
		
		
		
		
		
		
		
		
		
		
		
		
		// enter exam title in between quotes below
		String quizName = "CASM Residential MSK III PreMidterm Quiz";
		
		
		
		// paste from snible after the equal sign
		 String regexRef = "Question 1\n1\npoints\nTo increase Right Rotation mobility of the L4/5 segment using the Lumbar Roll technique, which position would the patient be in:\n \nAnswer 1\nProne\n \nAnswer 2\nSupine\n \nAnswer 3\nRight Sidely\n \nAnswer 4\nLeft Sidely\n \nCorrect answer\n \nQuestion 2\n1\npoints\nA 75 year old patient presents with 4/5 strength right knee extension, Left = 5/5; 1+ Patellar DTR on right, Left = 2+; (+) Femoral nerve prone knee flexion for increased right LE symptoms at 70 degrees knee flexion; Decreased light touch sensation right medial knee. Which segment is MOST LIKELY involved to explain this patient's neurological findings?\n \nAnswer 1\nL3/4\n \nCorrect answer\nAnswer 2\nL2/3\n \nAnswer 3\nL4/5\n \nAnswer 4\nL5/S1\n \n \nAutomated feedback\n \nQuestion 3\n1\npoints\nA patient complains of difficulty sleeping due to the weight of her sheet causes her to wake up in pain. Which term best describes this patient's pain response?\n \nAnswer 1\nAllodynia\n \nCorrect answer\nAnswer 2\nHyperalgesia\n \nAnswer 3\nHypoalgesia\n \nAnswer 4\nCray-Cray\n \n \nQuestion 4\n1\npoints\nA patient\u2019s neurovascular assessment reveals diminished sensation in both hands (glove pattern), (+) Transverse ligament laxity, (+) Hoffman\u2019s, (+) Inverted Supinator sign, (+) Babinski. What is the BEST course of action for this patient?\n \nAnswer 1\nRefer to MD\n \nCorrect answer\nAnswer 2\nPosture training exercises\n \nAnswer 3\nPatient education on sleep positions\n \nAnswer 4\nCervical muscle strengthening exercises\n \n \nQuestion 5\n1\npoints\nWhere are Type II synovial joint receptors located?\n \nAnswer 1\nCapsules\n \nCorrect answer\nAnswer 2\nOrgans\n \nAnswer 3\nBones\n \nAnswer 4\nArticular cartilage\n \n \nQuestion 6\n1\npoints\nThe Tectorial Membrane is a continuation of which ligament?\n \nAnswer 1\nPosterior Longitudinal\n \nCorrect answer\nAnswer 2\nLigamentum Flavum\n \nAnswer 3\nSupraspinous\n \nAnswer 4\nLigamentum Nuchae\n \n \nQuestion 7\n1\npoints\nThe disc is innervated by which nerves?\n \nAnswer 1\nGrey Ramus Communicans, Recurrent Sinuvertebral, Anterior Primary Ramus\n \nCorrect answer\nAnswer 2\nRecurrent Sinuvertebral, Mixed Spinal Nerve, Posterior Primary Ramus\n \nAnswer 3\nGrey Ramus Communicans, Anterior Primary Ramus, Posterior Primary Ramus\n \nAnswer 4\nRecurrent Sinuvertebral, Anterior Primary Ramus, Posterior Primary Ramus\n \n \nQuestion 8\n1\npoints\nTo improve Left Rotation of the L4/5 segment via the prone legs technique, which direction would you pull the legs? Right or Left? ______. And which side of the spinous prcess would you block? Right or Left? _______.\n \nAnswer 1\nLeft/Left\n \nCorrect answer\nAnswer 2\nLeft/Right\n \nAnswer 3\nRight/Left\n \nAnswer 4\nRight/Right\n \n \nQuestion 9\n1\npoints\nWhat are the best manipulation intervention(s) options for a patient with Grade 1 mobility and low tissue reactivity?\n \nAnswer 1\nGrade III, IV, and progressive oscillations\n \nCorrect answer\nAnswer 2\nGrade II, III, and progressive oscillations\n \nAnswer 3\nGrade III, IV, and V\n \nAnswer 4\nGrade I, III, V\n \n \nQuestion 10\n1\npoints\nWhat is the name for the scoliosis in the image below?\n \n \n \nscoliosis.jpg\n \n \n \n \nAnswer 1\nLevoscoliosis\n \nCorrect answer\nAnswer 2\nDextroscoliosis\n \nAnswer 3\nSpondylosis\n \nAnswer 4\nSpondylolisthesis\n \n \nQuestion 11\n1\npoints\nWhich Direction does the Atlas move with backward bending (Subcranial extension)?\n \nAnswer 1\nAnterior\n \n \n \nAnswer 2\nPosterior\n \nCorrect answer\nAnswer 3\nLateral\n \nAnswer 4\nMedial\n \n \nQuestion 12\n1\npoints\nWhich description BEST describes the primary arthrokinematics that occur with lumbar non-functional sidebending to the right?\n \nAnswer 1\nUpslide on the Right, Downslide on the Left\n \nAnswer 2\nDownslide on the Right, Upslide on the Left\n \nCorrect answer\nAnswer 3\nGap on the Right, Compression on the right\n \nAnswer 4\nGap on the Left, Compression on the left\n \n \nQuestion 13\n1\npoints\nWhich is the BEST description of the primary arthrokinematics that occur at the T5/6 segment with right rotation?\n \nAnswer 1\nGap on left, compression on right\n \nAnswer 2\nGap on right, compression on left\n \nCorrect answer\nAnswer 3\nRight downglide, left upglide\n \nAnswer 4\nLeft downglide, right upglide\n \n \nQuestion 14\n1\npoints\nWhich is the best description of the arthrokinematics that occur with cervical flexion?\n \nAnswer 1\nOA Joint: Posterior glide of occiput on atlas\n \nAA Joint: Forward tilt/slide\n \nMid-cervical: Bilateral upglide\n \nCorrect answer\nAnswer 2\nOA Joint: Anterior glide of occiput on atlas\n \nAA Joint: Forward tilt/slide\n \nMid-cervical: Bilateral upglide\n \nAnswer 3\nOA Joint: Posterior glide of occiput on atlas\n \nAA Joint: Backward tilt/slide\n \nMid-cervical: Bilateral upglide\n \nAnswer 4\nOA Joint: Posterior glide of occiput on atlas\n \nAA Joint: Forward tilt/slide\n \nMid-cervical: Bilateral downglide\n \n \nQuestion 15\n1\npoints\n A patient complains of right midcervical pain. Which type of pattern BEST describes this patient's AROM findings?\n \nFlexion 70 degrees - \"stretch\" right mid-cervical\n \nExtension 15 degrees with \"sharp\" pain right mid-cervical\n \nSB Left 45 degrees - \"stretch\" right mid-cervical\n \nSB Right 20 degrees - \"sharp\" pain right mid-cervical\n \nRotation Left 65 degrees - \"stretch\" right mid-cervical\n \nRotation Right 40 degrees- \"sharp\" pain right mid-cervical\n \nAnswer 1\nNon-capuslar pattern\n \nCorrect answer\nAnswer 2\nCapsular pattern\n \nAnswer 3\nMyofascial pattern\n \nAnswer 4\nInstability pattern\n \n \n\n"
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
;		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
				 
				 
				 
				 
				 
				 
				 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	
		// COPY AND PASTE INTO DOCS
		String regex = "(Question [0-9]+[\\s\\S]*?\\n(?=Question [0-9]+|$))";
		
		Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(regexRef);
			ArrayList<String> myList = new ArrayList<String>();
			ArrayList<Integer> jpgNeededList = new ArrayList<Integer>();
			
		
			while(m.find()) {
			//	System.out.println(m.group(0));
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
		
			String regexMulitpleChoiceFourAnswers = "(Question [0-9]+?) *\\n[0-9]+ *\\n*points* *\\n([\\s\\S]*? *\\n \\n|[\\s\\S]*? *\\n+)(Answer 1 *\\n.* *\\n *\\n[\\s\\S]*?)(Answer 2 *\\n.* *\\n *\\n[\\s\\S]*?)(Answer 3 *\\n.* *\\n *\\n[\\s\\S]*?)(Answer 4[\\s\\S]*)"
			;
			
			
			Pattern pattern2 = Pattern.compile(regexMulitpleChoiceFourAnswers);
			
			
			String regexMultipleChoiceThreeAnswers = "(Question [0-9]+?) *\\n[0-9]+ *\\npoints* *\\n(.*? *\\n \\n|.*? *\\n+)(Answer 1 \\n.* \\n *\\n[\\s\\S]*?)(Answer 2 \\n.* \\n *\\n[\\s\\S]*?)(Answer 3[\\s\\S]*)";
			
			Pattern regexMultipleThreeAnswers = Pattern.compile(regexMultipleChoiceThreeAnswers);
			

			
			String regexTrueFalse = "(Question [0-9]+?) \\n[0-9]+ \\npoints* \\n(.*? *\\n *\\n|.*? *\\n)(True \\n[\\s\\S]*?)(False[\\s\\S]*)";
			 
			
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