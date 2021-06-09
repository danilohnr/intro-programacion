package evaluaciones;

import java.util.Scanner;

public class Tarea {

	public static void main(String[] args) {
		
		Scanner j = new Scanner(System.in);
		Scanner nomb = new Scanner(System.in);
	
		String nom ;
		double ingreso, deudas, gastos, ahorros, casa,carro,tarjeta,otro,alim, colegiatura, transporte,entretenimiento,ropa,mascotas,otros1,luz,agua,tv1,internet,pdd,otros2;
		double  servicio_basico,x,l,p,ahorro;
		char resp;
		
		ciclo1:do{
		System.out.println("..................................");
		System.out.println("            Bienvenido");
		System.out.println("..................................");
	
			System.out.println(" ingrese su nombre completo :");
			nom = nomb .nextLine();

			ingreso1:do{
				
				System.out.print("Ingrese sus ingresos mensuales");
                ingreso = j .nextDouble();
                
                if(ingreso>0 && ingreso <= 100000) {
                	break ingreso1;
                }
                else{
                	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
                	continue ingreso1;
                }
                }while(true);
			
			  System.out.println("..................................................................");
				System.out.println("Ingrese de cuanto es su deuda de las siguientes opciones  :");
				System.out.println("..................................................................");
				
				casa:do{
	            System.out.print(" casa  ");
	             casa = j .nextDouble();
	           
	            if(casa>=0) {
              	break casa;
              }
              else{
              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
              	continue casa;
              }   
            }while(true);
				
				 carro:do {
					   System.out.print(" carro  ");
			             carro = j .nextDouble();
			           
			            if(carro>=0) {
		                	break carro;
		                }
		                else{
		                	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
		                	continue carro;
		                }   
				   }while(true);
				 
				 tarjetas:do{
					  System.out.print(" tarjecta  ");
			             tarjeta = j .nextDouble();
			           
			            if(tarjeta>=0) {
		                	break tarjetas;
		                }
		                else{
		                	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
		                	continue tarjetas;
		                }   
				  }while(true);
				
				 otros:do {
					
					 System.out.print("otros");
					  otro = j .nextDouble();
					 
					  if(otro>=0) {
		                	break otros;
		                }
		                else{
		                	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
		                	continue otros;
		                }   
					   }while(true);
				 
				  System.out.println("..................................................................");
					System.out.println("Ingrese de cuanto es su Gasto de las siguientes opciones  :");
					System.out.println("..................................................................");
					
					alimentacion:do{
			            System.out.print(" alimentacion  ");
			             alim = j .nextDouble();
			           
			            if(alim>=0) {
		              	break alimentacion;
		              }
		              else{
		              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
		              	continue alimentacion;
		              }   
		            }while(true);
						
					colegiatura:do{
			            System.out.print(" colegiatura  ");
			            colegiatura = j .nextDouble();
			           
			            if(colegiatura>=0) {
		              	break colegiatura;
		              }
		              else{
		              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
		              	continue colegiatura;
		              }   
		            }while(true);
					
					transporte:do{
			            System.out.print(" transporte  ");
			           transporte = j .nextDouble();
			           
			            if(transporte>=0) {
		              	break transporte;
		              }
		              else{
		              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
		              	continue transporte;
		              }   
		            }while(true);
					
					entretenimiento:do{
			            System.out.print(" entretenimiento  ");
			             entretenimiento = j .nextDouble();
			           
			            if(entretenimiento>=0) {
		              	break entretenimiento;
		              }
		              else{
		              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
		              	continue entretenimiento;
		              }   
		            }while(true);
					
					ropa:do{
			            System.out.print(" ropa  ");
			            ropa = j .nextDouble();
			           
			            if( ropa>=0) {
		              	break ropa;
		              }
		              else{
		              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
		              	continue ropa;
		              }   
		            }while(true);
					
					mascotas:do{
			            System.out.print(" mascotas  ");
			            mascotas = j .nextDouble();
			           
			            if( mascotas >=0) {
		              	break mascotas ;
		              }
		              else{
		              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
		              	continue mascotas;
		              }   
		            }while(true);
					
					otro1:do{
			            System.out.print(" otro  ");
			          otros1  = j .nextDouble();
			           
			            if(  otros1  >=0) {
		              	break  otro1;
		              }
		              else{
		              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
		              	continue  otro1;
		              }   
		            }while(true);
					
					  System.out.println(".............................................................................");
						System.out.println("Ingrese de cuanto es su servicio basicos de las siguientes opciones  :");
						System.out.println("............................................................................");
							
				luz_electrica:do{
				            System.out.print(" luz electrica  ");
				             luz  = j .nextDouble();
				           
				            if( luz  >=0) {
			              	break  luz_electrica;
			              }
			              else{
			              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
			              	continue  luz_electrica;
			              }   
			            }while(true);
				
				agua:do{
		            System.out.print(" agua  ");
		             agua  = j .nextDouble();
		           
		            if( agua >=0) {
	              	break  agua;
	              }
	              else{
	              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
	              	continue  agua;
	              }   
	            }while(true);
				
				tv:do{
		            System.out.print(" Tv por cable  ");
		             tv1  = j .nextDouble();
		           
		            if( tv1 >=0) {
	              	break  tv;
	              }
	              else{
	              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
	              	continue  tv;
	              }   
	            }while(true);
				
				internet:do{
		            System.out.print(" internet  ");
		           internet  = j .nextDouble();
		           
		            if( internet >=0) {
	              	break  internet;
	              }
	              else{
	              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
	              	continue  internet;
	              }   
	            }while(true);
				
				plan_de_dato:do{
		            System.out.print(" plan de dato  ");
		            pdd  = j .nextDouble();
		           
		            if( pdd >=0) {
	              	break  plan_de_dato;
	              }
	              else{
	              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
	              	continue  plan_de_dato;
	              }   
	            }while(true);
				
				otros2:do{
		            System.out.print(" otros  ");
		            otros2  = j .nextDouble();
		           
		            if( otros2 >=0) {
	              	break  otros2;
	              }
	              else{
	              	System.out.println("Usted ha ingresado un valor incorrecto. intente de nuevo....");
	              	continue  otros2;
	              }   
	            }while(true);
				
				   System.out.println(".............................................................................");
					System.out.println("                                     Ahorros");
					System.out.println("............................................................................");
						
					System.out.print( " ingrese sus ahorro mensuales : " );
					ahorros = j .nextDouble(); 
					
				deudas=casa+carro+tarjeta+otro;
				
					gastos=alim+ colegiatura+ transporte+ entretenimiento+ropa+mascotas+otros1 ;
						
					 servicio_basico=luz+agua+tv1+internet+pdd+otros2 ;
					
					x=deudas/ingreso*100;
					
					l=gastos/ingreso*100;
					
					p=ahorros/ingreso*100;
					
					System.out.println("...........................................................................................");
					System.out.println("para llevar un buen presupuesto de deudas , gastos y ahorros debe cumplir lo siguientes");
					System.out.println("debe tener el minimo del 35% de deudas ");
					System.out.println("debe tener el minimo del 50% de gastos ");
					System.out.println("debe tener como maximo del 15% de ahorro ");
					System.out.println("..............................................................................................");
					
					if ( x <= 35 ) {
				      System.out.println(" felicidades usted cumple con las normas establecidas sus deudas son de " + Math.round(x) +"%");
					}
					else {
						System.out.println("usted no cumple con las normas sus deudas exceden el promedio propuesto " +  + Math.round(x) +"%");
						System.out.println("le recomiendo que disminuya las deudas ");
					}
					
					if ( l <= 50 ) {
					      System.out.println(" felicidades usted cumple con las normas establecidas " + Math.round(l) +"%"   );
						}
						else {
							System.out.println("usted no cumple con las normas su gastos exceden el promedio propuesto" +  Math.round(l) +"%");
							System.out.println("le recomiendo que disminuya los entretenimiento o otros gasto innecesario ");
						}
					
					if(p>=15) {
						  System.out.println(" felicidades usted tiene un ahorro bastan  estables " +  Math.round(p) +"%");
					}
					else {
						System.out.println("su porcetaje de ahorros es muy bajo " +  Math.round(p) +"%");
						System.out.println("le recomiendo que disminuya las deudas o gasto , para mejorar sus ahorros  ");
					}

					ciclo2: do {
						System.out.println(" ");
						System.out.println("¿Desea hacer de nuevo el calculo?");
						System.out.println("a. Si");
						System.out.println("b. No");
						System.out.print("respuesta: ");
						resp = j.next().charAt(0);
					
						switch (resp) {
							case 'a':
								System.out.println(" ");
								continue ciclo1;
						
							case 'b':
								System.out.println("Saliendo del programa...");
								break ciclo1;
							
							default:
								System.out.println("Usted ha ingresado un valor incorrecto. Intentelo de nuevo...");
								continue ciclo2;
						}
					}while(true);
			
		  }while(true);
	}
}