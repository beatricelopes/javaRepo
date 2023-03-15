package classe;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class telaCadastro extends javax.swing.JFrame {
private Database gati = new Database();
	
 	public class AplicaNimbusLookAndFeel {
	    	private AplicaNimbusLookAndFeel() {

	    	}
	    	public static void pegaNimbus() {
	    		try {
	    		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	    		        if ("Nimbus".equals(info.getName())) {
	    		            UIManager.setLookAndFeel(info.getClassName());
	    		            break;
	    		        }
	    		    }
	    		} catch (UnsupportedLookAndFeelException e) {

	    		    System.out.println("Erro: " + e.getMessage());
	    		    e.printStackTrace();

	    		} catch (ClassNotFoundException e) {

	    			System.out.println("Erro: " + e.getMessage());
	    		    e.printStackTrace();

	    		} catch (InstantiationException e) {

	    			System.out.println("Erro: " + e.getMessage());
	    		    e.printStackTrace();

	    		} catch (IllegalAccessException e) {

	    			System.out.println("Erro: " + e.getMessage());
	    		    e.printStackTrace();
	    		}
	    	}
	    }
	
    public telaCadastro() {
    	setTitle("Cadastre seu gato");
    	setResizable(false);
    	getContentPane().setBackground(new Color(238, 218, 229));
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\beatr\\OneDrive\\Documentos\\java_repo\\Gatite\\src\\image\\paw.png"));
        initComponents();
    }
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(360, 93, 43, 17);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(360, 124, 43, 17);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(360, 152, 43, 17);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(360, 180, 43, 17);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(360, 224, 43, 17);
        btnOk = new javax.swing.JButton();
        btnOk.setBounds(414, 264, 56, 23);
        txtNome = new javax.swing.JTextField();
        txtNome.setBounds(431, 93, 79, 19);
        txtAltura = new javax.swing.JTextField();
        txtAltura.setBounds(431, 123, 37, 19);
        txtPeso = new javax.swing.JTextField();
        txtPeso.setBounds(431, 151, 37, 19);
        txtCor = new javax.swing.JTextField();
        txtCor.setBounds(431, 179, 79, 19);
        comGato = new javax.swing.JComboBox<>();
        comGato.setBounds(431, 221, 78, 23);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(0, 0, 299, 363);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(399, 11, 89, 22);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Altura");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Peso");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Cor");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Sexo");

        btnOk.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnOk.setText("Ok");
        btnOk.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        
        

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtAltura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAltura.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtPeso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPeso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtCor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        comGato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comGato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino" }));
        comGato.setSelectedIndex(-1);
        comGato.setBorder(null);

        jLabel6.setIcon(new ImageIcon("C:\\Users\\beatr\\OneDrive\\Documentos\\java_repo\\Gatite\\src\\image\\Cadastro_cut.png"));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Cadastro");
        getContentPane().setLayout(null);
        getContentPane().add(jLabel6);
        getContentPane().add(btnOk);
        getContentPane().add(jLabel1);
        getContentPane().add(jLabel5);
        getContentPane().add(jLabel4);
        getContentPane().add(jLabel3);
        getContentPane().add(jLabel2);
        getContentPane().add(txtAltura);
        getContentPane().add(txtNome);
        getContentPane().add(txtPeso);
        getContentPane().add(txtCor);
        getContentPane().add(comGato);
        getContentPane().add(jLabel7);
        
        lblCm = new JLabel();
        lblCm.setText("cm");
        lblCm.setFont(new Font("Arial", Font.PLAIN, 14));
        lblCm.setBounds(478, 124, 43, 17);
        getContentPane().add(lblCm);
        
        lblKg = new JLabel();
        lblKg.setText("kg");
        lblKg.setFont(new Font("Arial", Font.PLAIN, 14));
        lblKg.setBounds(478, 153, 43, 17);
        getContentPane().add(lblKg);
        
        JButton btnExibir = new JButton();
        btnExibir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		btnExibirActionPerformed(e);
        	}
        });
        btnExibir.setText("Exibir");
        btnExibir.setFont(new Font("Arial", Font.PLAIN, 14));
        btnExibir.setBounds(387, 316, 111, 23);
        getContentPane().add(btnExibir);

        pack();
    }

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {
        Gato gato = new Gato();
        gato.setSexo(comGato.getSelectedItem().toString());
        gato.setAltura(Float.parseFloat(txtAltura.getText()));
        gato.setPeso(Float.parseFloat(txtPeso.getText()));
        gato.setCor(txtCor.getText());
        gato.setNome(txtNome.getText());
        System.out.println(gato);
        
        gati.arrayGato.add(gato); //add array
        gati.hashGato.add(gato); //add hashset
        gati.mapaGato.put(gato.getNome(), gato); //add hashmap
        
        //painel de exibição de sucesso, caso erro/null ele exibe uma janela de erro padrão 
        JOptionPane.showMessageDialog(null, "Gatinho cadastro com sucesso.");

        clearForm();  //limpar os textos após cada cadastro, da o set para valor vazio ""
    }
    	
    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {
    	String message = "";  //inicialização da variavel que vou concatenar as mensagens
    	
    	for (Object g: gati.mapaGato.entrySet()) {  //para cada coisa adc a mapaGato vamos ter uma variavel g que a representa 
    		message += g.toString();  //OBS: toString() retorna os valores dos gatinhos, ele sobrescreveu o metodo toString()
    								  //e toma o funcionamento para o que você seta para a classe 
    		message += "\n";  //concatenando os valores do gati e quebrando a linha
    	}
    	
    	JOptionPane.showMessageDialog(null, message);   //mostra a mensagem concatenada de todos os gatinhos adicionados ao mapaGato
    }   
    
    private void clearForm() {
    	 txtNome.setText("");
         txtCor.setText("");
         txtAltura.setText("");
         txtPeso.setText("");
         comGato.setSelectedIndex(-1);
    }
    	
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        
        java.awt.EventQueue.invokeLater(() -> {
            new telaCadastro().setVisible(true);
        });
    }

    
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> comGato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private JLabel lblCm;
    private JLabel lblKg;
}
