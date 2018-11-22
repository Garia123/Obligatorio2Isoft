/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;

import com.toedter.calendar.JDateChooser;
import dominio.Agenda;
import dominio.ArchivoGrabacion;
import dominio.ArchivoLectura;
import dominio.Familia;
import dominio.Perro;
import dominio.Sistema;
import java.awt.CardLayout;
import java.io.File;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.imageio.ImageIO;
import sun.awt.image.BufferedImageDevice;




/**
 *
 * @author Tomás
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private javax.swing.JList lista;
    private int xx;
    private int xy;
    Sistema sistema;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal(Sistema unSistema) {
        
        sistema = unSistema;
        initComponents();
        jPanelImgInicio.setVisible(true);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelRegFamiliar.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
        this.setLocationRelativeTo(this);
        jList2.setListData(sistema.listaDePerros.toArray());
        jListFamilia.setListData(sistema.listaFamilia.toArray());
        jListAgenda.setListData(sistema.listaAgenda.toArray());
        jListResponsablesAlimentacion.setListData(sistema.listaAgenda.toArray());
        
    }

    public void recibirNotificacion(Agenda agenda){
         final String username = "cuidomican@gmail.com";
            final String password = "patatapatata1234";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
                props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(agenda.getFamilia().getEmailFamiliar()));
                    message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(agenda.getFamilia().getEmailFamiliar()));
                    message.setSubject("Aviso de evento");
                    if(agenda.getEvento().equals("Paseo")){
                        message.setText(agenda.getFamilia().getNombreFamiliar()+" tienes un evento pendiente a realizar en el horario: "+ agenda.getHora()+
                        "\n Evento: "+ agenda.getEvento());
                        Transport.send(message);
                        System.out.println("Done");
                    }else{
                        message.setText(agenda.getFamilia().getNombreFamiliar()+" tienes un evento pendiente a realizar el dia: "+ agenda.getFecha()+
                        "\n Evento: "+ agenda.getEvento());
                        Transport.send(message);
                        System.out.println("Done");
                    }
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesEventos = new javax.swing.ButtonGroup();
        menuPrincipal = new javax.swing.JPanel();
        jPabelBarraSuperior = new javax.swing.JPanel();
        lbCerrar = new javax.swing.JLabel();
        lbMinimizar = new javax.swing.JLabel();
        btnFamilia = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        jPanelContenido = new javax.swing.JPanel();
        jPanelImgInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelMisCanes = new javax.swing.JPanel();
        listaMisCanes = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        btnEliminarCan = new javax.swing.JButton();
        btnMostrarCan = new javax.swing.JButton();
        lblMisCanes = new javax.swing.JLabel();
        btnAgregarCan = new javax.swing.JButton();
        jPanelMostrarDatosCan = new javax.swing.JPanel();
        jImgPerroPerfil = new javax.swing.JLabel();
        jPesoPerroPerfil = new javax.swing.JLabel();
        jNombrePerroPerfil = new javax.swing.JLabel();
        jDescripcionPerroPerfil = new javax.swing.JTextField();
        jDescPerroPerfil = new javax.swing.JLabel();
        jAlturaPerroPerfil = new javax.swing.JLabel();
        jPanelFamilia = new javax.swing.JPanel();
        jListaFamilia = new javax.swing.JScrollPane();
        jListFamilia = new javax.swing.JList();
        btnEliminarFamiliar = new javax.swing.JButton();
        btnMostrarFamiliar = new javax.swing.JButton();
        lblMiembrosFamilia = new javax.swing.JLabel();
        btnAgregarFamiliar = new javax.swing.JButton();
        jPanelMostrarDatosFamilia = new javax.swing.JPanel();
        jImgFamiliarPerfil = new javax.swing.JLabel();
        jEmailFamiliarPerfil = new javax.swing.JLabel();
        jNombreFamiliarPerfil = new javax.swing.JLabel();
        jPanelRegFamiliar = new javax.swing.JPanel();
        btnCancelarRegFamiliar = new javax.swing.JButton();
        btnSubirImagenFamiliar = new javax.swing.JButton();
        lblRegCan1 = new javax.swing.JLabel();
        lblNombreRegCan1 = new javax.swing.JLabel();
        lblAlturaRegCan1 = new javax.swing.JLabel();
        lblImgRegCan1 = new javax.swing.JLabel();
        btnConfirmarRegFamiliar = new javax.swing.JButton();
        txtNombreRegFamiliar = new javax.swing.JTextField();
        txtEmailRegFamiliar = new javax.swing.JTextField();
        jPanelAgenda = new javax.swing.JPanel();
        lblPendientesAgenda = new javax.swing.JLabel();
        btnDetalleEvento = new javax.swing.JButton();
        btnAgregarEvento = new javax.swing.JButton();
        btnEliminarEvento = new javax.swing.JButton();
        listaAgenda = new javax.swing.JScrollPane();
        jListAgenda = new javax.swing.JList();
        lblAgenda2 = new javax.swing.JLabel();
        jMostrarEventosAgenda = new javax.swing.JPanel();
        lblAgenda1 = new javax.swing.JLabel();
        lblEvento = new javax.swing.JLabel();
        lblFechaEvento = new javax.swing.JLabel();
        lblTipoEventoOResponsable = new javax.swing.JLabel();
        lblDetalleEvento = new javax.swing.JLabel();
        lblDetalleEventoComent = new javax.swing.JLabel();
        jAgregarEventoTipo = new javax.swing.JPanel();
        lblTipoDeEvento = new javax.swing.JLabel();
        btnAgregarAlimentacionEvento = new javax.swing.JButton();
        btnAgregarPaseoEvento = new javax.swing.JButton();
        btnAgregarVeterinariaEvento = new javax.swing.JButton();
        jAgregarVeterinariaEvento = new javax.swing.JPanel();
        btnOtrosVeterinaria = new javax.swing.JRadioButton();
        btnConsultaEsteticaVeterinaria = new javax.swing.JRadioButton();
        btnConsultaMedicaVeterinaria = new javax.swing.JRadioButton();
        lblVeterinaria = new javax.swing.JLabel();
        btnCompraVeterinaria = new javax.swing.JRadioButton();
        txtComentarioVeterinaria = new javax.swing.JTextField();
        lblFechaVeterinaria = new javax.swing.JLabel();
        txtFechaVeterinaria = new com.toedter.calendar.JDateChooser();
        lblComentarioVeterinaria = new javax.swing.JLabel();
        btnCancelarEventoVeterinaria = new javax.swing.JButton();
        btnConfirmarEventoVeterinaria = new javax.swing.JButton();
        checkBoxNotificacionPaseo1 = new javax.swing.JCheckBox();
        listaResponsablesVeterinaria = new javax.swing.JScrollPane();
        jListResponsablesVeterinaria = new javax.swing.JList();
        jAgregarAlimentacionEvento = new javax.swing.JPanel();
        lblAlimentacion = new javax.swing.JLabel();
        txtDetalleAlimentacion = new javax.swing.JTextField();
        lblFechaAlimentacion = new javax.swing.JLabel();
        txtFechaAlimentacion = new com.toedter.calendar.JDateChooser();
        lblResponsableAlimentacion = new javax.swing.JLabel();
        btnCancelarEventoAlimentacion = new javax.swing.JButton();
        btnConfirmarEventoAlimentacion = new javax.swing.JButton();
        lblDetalleAlimentacion = new javax.swing.JLabel();
        listaResponsablesAlimentacion = new javax.swing.JScrollPane();
        jListResponsablesAlimentacion = new javax.swing.JList();
        jCheckRecibirNotifiacion = new javax.swing.JCheckBox();
        jPanelRegCan = new javax.swing.JPanel();
        btnCancelarRegCan = new javax.swing.JButton();
        btnSubirImagen = new javax.swing.JButton();
        lblRegCan = new javax.swing.JLabel();
        lblDescripcionRegCan = new javax.swing.JLabel();
        lblNombreRegCan = new javax.swing.JLabel();
        lblAlturaRegCan = new javax.swing.JLabel();
        lblPesoRegCan = new javax.swing.JLabel();
        lblImgRegCan = new javax.swing.JLabel();
        btnConfirmarRegCan = new javax.swing.JButton();
        txtDescripcionRegCan = new javax.swing.JTextField();
        txtPesoRegCan = new javax.swing.JTextField();
        txtNombreRegCan = new javax.swing.JTextField();
        txtAlturaRegCan = new javax.swing.JTextField();
        jPanelActividadPaseoEvento = new javax.swing.JPanel();
        listaResponsablesPaseo = new javax.swing.JScrollPane();
        jListResponsablesPaseo = new javax.swing.JList();
        lblAgendaEventoPaseo = new javax.swing.JLabel();
        btnCancelarPaseo = new javax.swing.JButton();
        btnConfirmarPaseo = new javax.swing.JButton();
        checkBoxNotificacionPaseo = new javax.swing.JCheckBox();
        lblHorario = new javax.swing.JLabel();
        txtminuto = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnMisCanes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(860, 540));
        setMinimumSize(new java.awt.Dimension(860, 540));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(860, 540));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPrincipal.setBackground(new java.awt.Color(217, 201, 201));
        menuPrincipal.setMaximumSize(new java.awt.Dimension(860, 540));
        menuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPabelBarraSuperior.setBackground(new java.awt.Color(0, 0, 0));
        jPabelBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPabelBarraSuperiorMouseDragged(evt);
            }
        });
        jPabelBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPabelBarraSuperiorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPabelBarraSuperiorMouseReleased(evt);
            }
        });
        jPabelBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCerrar.setForeground(new java.awt.Color(255, 255, 255));
        lbCerrar.setText("X");
        lbCerrar.setToolTipText("");
        lbCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCerrarMouseClicked(evt);
            }
        });
        jPabelBarraSuperior.add(lbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 20, 30));

        lbMinimizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        lbMinimizar.setText("_");
        lbMinimizar.setToolTipText("");
        lbMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseClicked(evt);
            }
        });
        jPabelBarraSuperior.add(lbMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 20, 30));

        menuPrincipal.add(jPabelBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 40));

        btnFamilia.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnFamilia.setText("Familia");
        btnFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamiliaActionPerformed(evt);
            }
        });
        menuPrincipal.add(btnFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 270, 40));

        btnAgenda.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgenda.setText("Agenda");
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        menuPrincipal.add(btnAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 270, 40));

        jPanelContenido.setBackground(new java.awt.Color(217, 201, 201));

        jPanelImgInicio.setBackground(new java.awt.Color(217, 201, 201));
        jPanelImgInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenPrincipal.jpg"))); // NOI18N
        jLabel1.setText("  ");
        jPanelImgInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));

        jPanelMisCanes.setBackground(new java.awt.Color(217, 201, 201));
        jPanelMisCanes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaMisCanes.setViewportView(jList2);

        jPanelMisCanes.add(listaMisCanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 330, 250));

        btnEliminarCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminarCan.setText("Eliminar");
        btnEliminarCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCanActionPerformed(evt);
            }
        });
        jPanelMisCanes.add(btnEliminarCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, 40));

        btnMostrarCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnMostrarCan.setText("Mostrar datos");
        btnMostrarCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCanActionPerformed(evt);
            }
        });
        jPanelMisCanes.add(btnMostrarCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, 40));

        lblMisCanes.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblMisCanes.setText("Mis canes");
        jPanelMisCanes.add(lblMisCanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        btnAgregarCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregarCan.setText("Agregar can");
        btnAgregarCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCanActionPerformed(evt);
            }
        });
        jPanelMisCanes.add(btnAgregarCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 40));

        jPanelMostrarDatosCan.setBackground(new java.awt.Color(217, 201, 201));
        jPanelMostrarDatosCan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jImgPerroPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelMostrarDatosCan.add(jImgPerroPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 140));

        jPesoPerroPerfil.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPesoPerroPerfil.setText("Peso:");
        jPanelMostrarDatosCan.add(jPesoPerroPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jNombrePerroPerfil.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jNombrePerroPerfil.setText("Nombre:");
        jPanelMostrarDatosCan.add(jNombrePerroPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));
        jPanelMostrarDatosCan.add(jDescripcionPerroPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 340, 130));

        jDescPerroPerfil.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jDescPerroPerfil.setText("Descripcion:");
        jPanelMostrarDatosCan.add(jDescPerroPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jAlturaPerroPerfil.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jAlturaPerroPerfil.setText("Altura:");
        jPanelMostrarDatosCan.add(jAlturaPerroPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jPanelFamilia.setBackground(new java.awt.Color(217, 201, 201));
        jPanelFamilia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListaFamilia.setViewportView(jListFamilia);

        jPanelFamilia.add(jListaFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 330, 250));

        btnEliminarFamiliar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminarFamiliar.setText("Eliminar");
        btnEliminarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFamiliarActionPerformed(evt);
            }
        });
        jPanelFamilia.add(btnEliminarFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 160, 40));

        btnMostrarFamiliar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnMostrarFamiliar.setText("Mostrar datos");
        btnMostrarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarFamiliarActionPerformed(evt);
            }
        });
        jPanelFamilia.add(btnMostrarFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 40));

        lblMiembrosFamilia.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblMiembrosFamilia.setText("Miembros de la familia:");
        jPanelFamilia.add(lblMiembrosFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        btnAgregarFamiliar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregarFamiliar.setText("Agregar");
        btnAgregarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFamiliarActionPerformed(evt);
            }
        });
        jPanelFamilia.add(btnAgregarFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 40));

        jPanelMostrarDatosFamilia.setBackground(new java.awt.Color(217, 201, 201));
        jPanelMostrarDatosFamilia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jImgFamiliarPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelMostrarDatosFamilia.add(jImgFamiliarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 140));

        jEmailFamiliarPerfil.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jEmailFamiliarPerfil.setText("Email:");
        jPanelMostrarDatosFamilia.add(jEmailFamiliarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jNombreFamiliarPerfil.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jNombreFamiliarPerfil.setText("Nombre:");
        jPanelMostrarDatosFamilia.add(jNombreFamiliarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jPanelRegFamiliar.setBackground(new java.awt.Color(217, 201, 201));
        jPanelRegFamiliar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelarRegFamiliar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCancelarRegFamiliar.setText("Cancelar");
        btnCancelarRegFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegFamiliarActionPerformed(evt);
            }
        });
        jPanelRegFamiliar.add(btnCancelarRegFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        btnSubirImagenFamiliar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnSubirImagenFamiliar.setText("Subir imagen");
        btnSubirImagenFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirImagenFamiliarActionPerformed(evt);
            }
        });
        jPanelRegFamiliar.add(btnSubirImagenFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 170, -1));

        lblRegCan1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblRegCan1.setText("Registro familiar");
        jPanelRegFamiliar.add(lblRegCan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblNombreRegCan1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombreRegCan1.setText("Nombre:");
        jPanelRegFamiliar.add(lblNombreRegCan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblAlturaRegCan1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblAlturaRegCan1.setText("Email");
        jPanelRegFamiliar.add(lblAlturaRegCan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblImgRegCan1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelRegFamiliar.add(lblImgRegCan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 170, 160));

        btnConfirmarRegFamiliar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnConfirmarRegFamiliar.setText("Confirmar");
        btnConfirmarRegFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarRegFamiliarActionPerformed(evt);
            }
        });
        jPanelRegFamiliar.add(btnConfirmarRegFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtNombreRegFamiliar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombreRegFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegFamiliarActionPerformed(evt);
            }
        });
        jPanelRegFamiliar.add(txtNombreRegFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 230, 30));

        txtEmailRegFamiliar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtEmailRegFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailRegFamiliarActionPerformed(evt);
            }
        });
        jPanelRegFamiliar.add(txtEmailRegFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 250, 30));

        jPanelAgenda.setBackground(new java.awt.Color(217, 201, 201));
        jPanelAgenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPendientesAgenda.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPendientesAgenda.setText("Pendientes:");
        jPanelAgenda.add(lblPendientesAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btnDetalleEvento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnDetalleEvento.setText("Detalle");
        btnDetalleEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleEventoActionPerformed(evt);
            }
        });
        jPanelAgenda.add(btnDetalleEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 120, -1));

        btnAgregarEvento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregarEvento.setText("Agregar");
        btnAgregarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEventoActionPerformed(evt);
            }
        });
        jPanelAgenda.add(btnAgregarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 120, -1));

        btnEliminarEvento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminarEvento.setText("Eliminar");
        btnEliminarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEventoActionPerformed(evt);
            }
        });
        jPanelAgenda.add(btnEliminarEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 120, -1));

        listaAgenda.setViewportView(jListAgenda);

        jPanelAgenda.add(listaAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 280, 170));

        lblAgenda2.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblAgenda2.setText("Agenda:");
        jPanelAgenda.add(lblAgenda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jMostrarEventosAgenda.setBackground(new java.awt.Color(217, 201, 201));
        jMostrarEventosAgenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgenda1.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblAgenda1.setText("Agenda:");
        jMostrarEventosAgenda.add(lblAgenda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        lblEvento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblEvento.setText("Evento");
        jMostrarEventosAgenda.add(lblEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        lblFechaEvento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFechaEvento.setText("Fecha de evento");
        jMostrarEventosAgenda.add(lblFechaEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        lblTipoEventoOResponsable.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTipoEventoOResponsable.setText("Tipo de evento");
        jMostrarEventosAgenda.add(lblTipoEventoOResponsable, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        lblDetalleEvento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDetalleEvento.setText("Detalles:");
        jMostrarEventosAgenda.add(lblDetalleEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        lblDetalleEventoComent.setBackground(new java.awt.Color(255, 255, 255));
        lblDetalleEventoComent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDetalleEventoComent.setOpaque(true);
        jMostrarEventosAgenda.add(lblDetalleEventoComent, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 290, 130));

        jAgregarEventoTipo.setBackground(new java.awt.Color(217, 201, 201));
        jAgregarEventoTipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTipoDeEvento.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblTipoDeEvento.setText("Seleccione tipo de evento:");
        jAgregarEventoTipo.add(lblTipoDeEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        btnAgregarAlimentacionEvento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregarAlimentacionEvento.setText("Alimentación");
        btnAgregarAlimentacionEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlimentacionEventoActionPerformed(evt);
            }
        });
        jAgregarEventoTipo.add(btnAgregarAlimentacionEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 230, 50));

        btnAgregarPaseoEvento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregarPaseoEvento.setText("Paseo");
        btnAgregarPaseoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPaseoEventoActionPerformed(evt);
            }
        });
        jAgregarEventoTipo.add(btnAgregarPaseoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 230, 50));

        btnAgregarVeterinariaEvento.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregarVeterinariaEvento.setText("Veterinaria");
        btnAgregarVeterinariaEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVeterinariaEventoActionPerformed(evt);
            }
        });
        jAgregarEventoTipo.add(btnAgregarVeterinariaEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 230, 50));

        jAgregarVeterinariaEvento.setBackground(new java.awt.Color(217, 201, 201));
        jAgregarVeterinariaEvento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcionesEventos.add(btnOtrosVeterinaria);
        btnOtrosVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnOtrosVeterinaria.setText("Otros");
        jAgregarVeterinariaEvento.add(btnOtrosVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        opcionesEventos.add(btnConsultaEsteticaVeterinaria);
        btnConsultaEsteticaVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnConsultaEsteticaVeterinaria.setText("Consulta estética");
        jAgregarVeterinariaEvento.add(btnConsultaEsteticaVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 210, -1));

        opcionesEventos.add(btnConsultaMedicaVeterinaria);
        btnConsultaMedicaVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        btnConsultaMedicaVeterinaria.setText("Consulta médica");
        jAgregarVeterinariaEvento.add(btnConsultaMedicaVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        lblVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblVeterinaria.setText("Veterinaria:");
        jAgregarVeterinariaEvento.add(lblVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        opcionesEventos.add(btnCompraVeterinaria);
        btnCompraVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCompraVeterinaria.setText("Compra de artículos varios");
        jAgregarVeterinariaEvento.add(btnCompraVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jAgregarVeterinariaEvento.add(txtComentarioVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, 100));

        lblFechaVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFechaVeterinaria.setText("Fecha:");
        jAgregarVeterinariaEvento.add(lblFechaVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));
        jAgregarVeterinariaEvento.add(txtFechaVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 160, 30));

        lblComentarioVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblComentarioVeterinaria.setText("Comentario:");
        jAgregarVeterinariaEvento.add(lblComentarioVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        btnCancelarEventoVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCancelarEventoVeterinaria.setText("Cancelar");
        btnCancelarEventoVeterinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEventoVeterinariaActionPerformed(evt);
            }
        });
        jAgregarVeterinariaEvento.add(btnCancelarEventoVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 120, -1));

        btnConfirmarEventoVeterinaria.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnConfirmarEventoVeterinaria.setText("Confirmar");
        btnConfirmarEventoVeterinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarEventoVeterinariaActionPerformed(evt);
            }
        });
        jAgregarVeterinariaEvento.add(btnConfirmarEventoVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        checkBoxNotificacionPaseo1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        checkBoxNotificacionPaseo1.setText("Recibir notificación");
        jAgregarVeterinariaEvento.add(checkBoxNotificacionPaseo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 30));

        listaResponsablesVeterinaria.setViewportView(jListResponsablesVeterinaria);

        jAgregarVeterinariaEvento.add(listaResponsablesVeterinaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 190, 90));

        jAgregarAlimentacionEvento.setBackground(new java.awt.Color(217, 201, 201));
        jAgregarAlimentacionEvento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAlimentacion.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblAlimentacion.setText("Alimentación");
        jAgregarAlimentacionEvento.add(lblAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
        jAgregarAlimentacionEvento.add(txtDetalleAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 280, 100));

        lblFechaAlimentacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFechaAlimentacion.setText("Fecha:");
        jAgregarAlimentacionEvento.add(lblFechaAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));
        jAgregarAlimentacionEvento.add(txtFechaAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 160, 30));

        lblResponsableAlimentacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblResponsableAlimentacion.setText("Seleccione responsable:");
        jAgregarAlimentacionEvento.add(lblResponsableAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        btnCancelarEventoAlimentacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCancelarEventoAlimentacion.setText("Cancelar");
        btnCancelarEventoAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEventoAlimentacionActionPerformed(evt);
            }
        });
        jAgregarAlimentacionEvento.add(btnCancelarEventoAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 120, -1));

        btnConfirmarEventoAlimentacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnConfirmarEventoAlimentacion.setText("Confirmar");
        btnConfirmarEventoAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarEventoAlimentacionActionPerformed(evt);
            }
        });
        jAgregarAlimentacionEvento.add(btnConfirmarEventoAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        lblDetalleAlimentacion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDetalleAlimentacion.setText("Detalle del alimento:");
        jAgregarAlimentacionEvento.add(lblDetalleAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        listaResponsablesAlimentacion.setViewportView(jListResponsablesAlimentacion);

        jAgregarAlimentacionEvento.add(listaResponsablesAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 100));

        jCheckRecibirNotifiacion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCheckRecibirNotifiacion.setText("Recibir notifiación");
        jCheckRecibirNotifiacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckRecibirNotifiacionActionPerformed(evt);
            }
        });
        jAgregarAlimentacionEvento.add(jCheckRecibirNotifiacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jPanelRegCan.setBackground(new java.awt.Color(217, 201, 201));
        jPanelRegCan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelarRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCancelarRegCan.setText("Cancelar");
        btnCancelarRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(btnCancelarRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        btnSubirImagen.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnSubirImagen.setText("Subir imagen");
        btnSubirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirImagenActionPerformed(evt);
            }
        });
        jPanelRegCan.add(btnSubirImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 170, -1));

        lblRegCan.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblRegCan.setText("Registro de nuevo can:");
        jPanelRegCan.add(lblRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lblDescripcionRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDescripcionRegCan.setText("Descripción:");
        jPanelRegCan.add(lblDescripcionRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblNombreRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombreRegCan.setText("Nombre:");
        jPanelRegCan.add(lblNombreRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        lblAlturaRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblAlturaRegCan.setText("Altura: ");
        jPanelRegCan.add(lblAlturaRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lblPesoRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPesoRegCan.setText("Peso:");
        jPanelRegCan.add(lblPesoRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lblImgRegCan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelRegCan.add(lblImgRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 170, 160));

        btnConfirmarRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnConfirmarRegCan.setText("Confirmar");
        btnConfirmarRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(btnConfirmarRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        txtDescripcionRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(txtDescripcionRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 320, 80));

        txtPesoRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPesoRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(txtPesoRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 90, 30));

        txtNombreRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombreRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(txtNombreRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 90, 30));

        txtAlturaRegCan.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtAlturaRegCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaRegCanActionPerformed(evt);
            }
        });
        jPanelRegCan.add(txtAlturaRegCan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 90, 30));

        jPanelActividadPaseoEvento.setBackground(new java.awt.Color(217, 201, 201));
        jPanelActividadPaseoEvento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaResponsablesPaseo.setViewportView(jListResponsablesPaseo);

        jPanelActividadPaseoEvento.add(listaResponsablesPaseo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, 270));

        lblAgendaEventoPaseo.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        lblAgendaEventoPaseo.setText("Paseo");
        jPanelActividadPaseoEvento.add(lblAgendaEventoPaseo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 170, 50));

        btnCancelarPaseo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCancelarPaseo.setText("Cancelar");
        jPanelActividadPaseoEvento.add(btnCancelarPaseo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 140, 30));

        btnConfirmarPaseo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnConfirmarPaseo.setText("Confirmar");
        btnConfirmarPaseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarPaseoActionPerformed(evt);
            }
        });
        jPanelActividadPaseoEvento.add(btnConfirmarPaseo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 140, 30));

        checkBoxNotificacionPaseo.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        checkBoxNotificacionPaseo.setText("Recibir notificación");
        jPanelActividadPaseoEvento.add(checkBoxNotificacionPaseo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, 30));

        lblHorario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblHorario.setText("Horario:");
        jPanelActividadPaseoEvento.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));
        jPanelActividadPaseoEvento.add(txtminuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 40, 30));
        jPanelActividadPaseoEvento.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 40, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText(":");
        jPanelActividadPaseoEvento.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 10, -1));

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addComponent(jPanelImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMisCanes, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMostrarDatosCan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(27, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(jPanelMostrarDatosFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(134, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRegFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(jPanelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jMostrarEventosAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addComponent(jAgregarEventoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 43, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jAgregarVeterinariaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jAgregarAlimentacionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addComponent(jPanelRegCan, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelActividadPaseoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(7, 7, 7)))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addComponent(jPanelMisCanes, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMostrarDatosCan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                    .addContainerGap(150, Short.MAX_VALUE)
                    .addComponent(jPanelMostrarDatosFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelRegFamiliar, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                    .addContainerGap(55, Short.MAX_VALUE)
                    .addComponent(jPanelAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jMostrarEventosAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addComponent(jAgregarEventoTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jAgregarVeterinariaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jAgregarAlimentacionEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addComponent(jPanelRegCan, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelContenidoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelActividadPaseoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        menuPrincipal.add(jPanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 540, 470));

        btnMisCanes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnMisCanes.setText("Mis canes");
        btnMisCanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisCanesActionPerformed(evt);
            }
        });
        menuPrincipal.add(btnMisCanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 270, 40));

        getContentPane().add(menuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarMouseClicked
       ArchivoGrabacion out = new ArchivoGrabacion("Can.txt", this);
        File imgPerro;
        BufferedImage img;
        Graphics2D gr;
        for (int i = 0; i < sistema.listaDePerros.size(); i++) {
            out.grabarLinea(sistema.listaDePerros.get(i).getNombre() + "#" + 
                            sistema.listaDePerros.get(i).getAltura()+ "#" + 
                            sistema.listaDePerros.get(i).getPeso() + "#" + 
                            sistema.listaDePerros.get(i).getComentario()+ "#" +
                            sistema.listaDePerros.get(i).getImagen(), this);
            imgPerro = new File("imgPerro" + i + ".png");
            
            try {
                img = ImageIO.read(new File(sistema.listaDePerros.get(i).getImagen()));
                ImageIO.write(img, "png", imgPerro);
                gr = (Graphics2D) img.getGraphics();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        out.grabarLinea("#", this);
        for (int i = 0; i < sistema.listaFamilia.size(); i++) {
            String aux = sistema.listaFamilia.get(i).getNombreFamiliar()+ "#" +
                         sistema.listaFamilia.get(i).getEmailFamiliar();
            out.grabarLinea(aux, this);
        }
        out.cerrar();
        this.dispose();
    }//GEN-LAST:event_lbCerrarMouseClicked

    private void jPabelBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPabelBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPabelBarraSuperiorMouseDragged

    private void jPabelBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPabelBarraSuperiorMousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPabelBarraSuperiorMousePressed

    private void jPabelBarraSuperiorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPabelBarraSuperiorMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_jPabelBarraSuperiorMouseReleased

    private void lbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseClicked
        this.setExtendedState(this.ICONIFIED);
    }//GEN-LAST:event_lbMinimizarMouseClicked

    private void btnFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamiliaActionPerformed
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelFamilia.setVisible(true);
        jPanelRegFamiliar.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(true);
        jAgregarVeterinariaEvento.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
        
    }//GEN-LAST:event_btnFamiliaActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelRegFamiliar.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(true);
        jAgregarVeterinariaEvento.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
        for (int i = 0; i < sistema.listaAgenda.size(); i++) {
             jListAgenda.setListData(sistema.ordenarPorFecha().toArray());
        }
        
      
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnEliminarCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCanActionPerformed
        if (!jList2.isSelectionEmpty()) {
            for (int i = 0; i < sistema.listaDePerros.size(); i++) {
                if (jList2.getSelectedIndex() == i) {
                    sistema.listaDePerros.remove(i);
                }
            }
            jList2.setListData(sistema.listaDePerros.toArray());
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun can", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarCanActionPerformed

    private void btnMostrarCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCanActionPerformed
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(true);
        jPanelFamilia.setVisible(false);
        jPanelRegFamiliar.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
        
        String nombre;
        String altura;
        String peso;
        String descripcion;
        String imagen;
        int i = 0;
        if (!jList2.isSelectionEmpty()) {
            int pos = jList2.getSelectedIndex();
            nombre = "Nombre: " + sistema.listaDePerros.get(pos).getNombre();
            jNombrePerroPerfil.setText(nombre);
            altura = "Altura: " + sistema.listaDePerros.get(pos).getAltura();
            jAlturaPerroPerfil.setText(altura);
            peso = "Peso: " + sistema.listaDePerros.get(pos).getPeso();
            jPesoPerroPerfil.setText(peso);
            descripcion = sistema.listaDePerros.get(pos).getComentario();
            jDescripcionPerroPerfil.setText(descripcion);
            imagen = sistema.listaDePerros.get(pos).getImagen();
            FileReader archivo;
            try {
                archivo = new FileReader(imagen);
                rsscalelabel.RSScaleLabel.setScaleLabel(jImgPerroPerfil, imagen);
                this.jImgPerroPerfil.setText(archivo.toString());
            } catch (FileNotFoundException ex) {
                
            }
        }
        
        
        
    }//GEN-LAST:event_btnMostrarCanActionPerformed

    private void btnMisCanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisCanesActionPerformed
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(true);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelRegFamiliar.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
        String retorno = "";
       
    }//GEN-LAST:event_btnMisCanesActionPerformed

    private void txtDescripcionRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionRegCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionRegCanActionPerformed

    private void btnConfirmarRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarRegCanActionPerformed

        String nombre = txtNombreRegCan.getText();
        String altura = txtAlturaRegCan.getText();
        String peso = txtPesoRegCan.getText();
        String descripcion = txtDescripcionRegCan.getText();
        String vacio = "";
        if (nombre.equals(vacio) || descripcion.equals(vacio) || altura.equals(vacio) || peso.equals(vacio)){
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios.", "Error", JOptionPane.WARNING_MESSAGE);
        } 
        else {
            if (sistema.existePerro(nombre, this) && 
                sistema.controlRango(this,altura, "Se debe ingresar una altura valida (1-50).", "Se deben ingresar la altura en caracteres númericos.") && 
                sistema.controlRango(this, peso, "Se debe ingresar un peso valido (1-50).", "Se deben ingresar el peso en caracteres númericos.")) {
                Perro nuevo = new Perro();
                nuevo.setNombre(nombre);
                nuevo.setAltura(Float.parseFloat(altura));
                nuevo.setPeso(Float.parseFloat(peso));
                nuevo.setComentario(descripcion);
                nuevo.setImagen(lblImgRegCan);
                sistema.listaDePerros.add(nuevo);
                JOptionPane.showMessageDialog(this, "Los datos fueron ingresados correctamente.", "OK", JOptionPane.INFORMATION_MESSAGE);
                jList2.setListData(sistema.listaDePerros.toArray());
                txtNombreRegCan.setText("");
                txtAlturaRegCan.setText("");
                txtPesoRegCan.setText("");
                txtDescripcionRegCan.setText("");
                //lblImgRegCan.setIcon(null);
                jPanelRegFamiliar.setVisible(false);
                jPanelFamilia.setVisible(false);
                jPanelImgInicio.setVisible(false);
                jPanelRegCan.setVisible(false);
                jPanelMisCanes.setVisible(true);
                jPanelMostrarDatosCan.setVisible(false);
                jPanelMostrarDatosFamilia.setVisible(false);
                jPanelAgenda.setVisible(false);
                jAgregarVeterinariaEvento.setVisible(false);
                jMostrarEventosAgenda.setVisible(false);
                jAgregarEventoTipo.setVisible(false);
                jAgregarAlimentacionEvento.setVisible(false);
                jPanelActividadPaseoEvento.setVisible(false);
            }
            
        }    
    }//GEN-LAST:event_btnConfirmarRegCanActionPerformed

    private void btnSubirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirImagenActionPerformed
        JFileChooser img = new JFileChooser();
        img.setDialogTitle("Buscar foto");
        if(img.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            File archivo = new File(img.getSelectedFile().toString());
            rsscalelabel.RSScaleLabel.setScaleLabel(lblImgRegCan, img.getSelectedFile().toString());
            this.lblImgRegCan1.setText(img.getSelectedFile().toString());
        }    
    }//GEN-LAST:event_btnSubirImagenActionPerformed

    private void btnCancelarRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegCanActionPerformed
        txtNombreRegCan.setText("");
        txtAlturaRegCan.setText("");
        txtPesoRegCan.setText("");
        txtDescripcionRegCan.setText("");
        lblImgRegCan.setIcon(null);
        jPanelRegFamiliar.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(true);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
    }//GEN-LAST:event_btnCancelarRegCanActionPerformed

    private void txtPesoRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoRegCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoRegCanActionPerformed

    private void txtNombreRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegCanActionPerformed

    private void txtAlturaRegCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaRegCanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaRegCanActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ArchivoLectura in = new ArchivoLectura("Can.txt", this);
        boolean familia = false;
        while (in.hayMasLineas()) {
            String[] datos = in.linea().split("#");
            if (datos.length < 4 && !familia) {
		familia = true;
            }
            else if (!familia) {
		sistema.listaDePerros.add(new Perro(datos[0], Float.parseFloat(datos[1]), Float.parseFloat(datos[2]), datos[3], ""));
            } 
            else if (familia) {
		sistema.listaFamilia.add(new Familia(datos[0], datos[1]));
            }
	}
        for (int i = 0; i < sistema.listaDePerros.size(); i++) {
            sistema.listaDePerros.get(i).setImagen("imgPerro" + i + ".png");
            
        }
        in.cerrar();
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCanActionPerformed
        jPanelRegFamiliar.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(true);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
           }//GEN-LAST:event_btnAgregarCanActionPerformed

    private void btnEliminarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFamiliarActionPerformed
          if (!jListFamilia.isSelectionEmpty()) {
            for (int i = 0; i < sistema.listaFamilia.size(); i++) {
                if (jListFamilia.getSelectedIndex() == i) {
                    sistema.listaFamilia.remove(i);
                }
            }
            jListFamilia.setListData(sistema.listaFamilia.toArray());
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun can", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarFamiliarActionPerformed

    private void btnMostrarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFamiliarActionPerformed
      jPanelRegFamiliar.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(true);
        jPanelAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
        
        String nombre;
        String email;
        int i = 0;
        if (!jListFamilia.isSelectionEmpty()) {
            int pos = jListFamilia.getSelectedIndex();
            nombre = "Nombre: " + sistema.listaFamilia.get(pos).getNombreFamiliar();
            jNombreFamiliarPerfil.setText(nombre);
            email = "Email: " + sistema.listaFamilia.get(pos).getEmailFamiliar();
            
        }
    }//GEN-LAST:event_btnMostrarFamiliarActionPerformed

    private void btnAgregarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFamiliarActionPerformed
         jPanelRegFamiliar.setVisible(true);
        jPanelFamilia.setVisible(false);
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
    }//GEN-LAST:event_btnAgregarFamiliarActionPerformed

    private void btnCancelarRegFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegFamiliarActionPerformed
        txtNombreRegFamiliar.setText("");
        txtEmailRegFamiliar.setText("");
        jPanelRegFamiliar.setVisible(false);
        jPanelFamilia.setVisible(true);
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
    }//GEN-LAST:event_btnCancelarRegFamiliarActionPerformed

    private void btnSubirImagenFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirImagenFamiliarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubirImagenFamiliarActionPerformed

    private void btnConfirmarRegFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarRegFamiliarActionPerformed
        String nombreFamiliar = txtNombreRegFamiliar.getText();
        String emailFamiliar = txtEmailRegFamiliar.getText();
        String vacio = "";
        if (nombreFamiliar.equals(vacio) || emailFamiliar.equals(vacio)){
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios.", "Error", JOptionPane.WARNING_MESSAGE);
        } 
        else {
            if (sistema.existeFamiliar(nombreFamiliar, this)) {
                Familia nuevo = new Familia();
                nuevo.setNombreFamiliar(nombreFamiliar);
                nuevo.setEmailFamiliar(emailFamiliar);
                sistema.listaFamilia.add(nuevo);
                JOptionPane.showMessageDialog(this, "Los datos fueron ingresados correctamente.", "OK", JOptionPane.INFORMATION_MESSAGE);
                jListFamilia.setListData(sistema.listaFamilia.toArray());
                jListResponsablesAlimentacion.setListData(sistema.listaFamilia.toArray());
                jListResponsablesAlimentacion.setListData(sistema.listaAgenda.toArray());
                jPanelRegFamiliar.setVisible(false);
                jPanelFamilia.setVisible(true);
                jPanelRegFamiliar.setVisible(false);
                jPanelImgInicio.setVisible(false);
                jPanelRegCan.setVisible(false);
                jPanelMisCanes.setVisible(false);
                jPanelMostrarDatosCan.setVisible(false);
                jPanelMostrarDatosFamilia.setVisible(false);
                jPanelAgenda.setVisible(false);
                jAgregarVeterinariaEvento.setVisible(false);
                jMostrarEventosAgenda.setVisible(false);
                jAgregarEventoTipo.setVisible(false);
                jPanelActividadPaseoEvento.setVisible(false);
            }
            
        }    
    }//GEN-LAST:event_btnConfirmarRegFamiliarActionPerformed

    private void txtNombreRegFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegFamiliarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegFamiliarActionPerformed

    private void txtEmailRegFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailRegFamiliarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailRegFamiliarActionPerformed

    private void btnDetalleEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetalleEventoActionPerformed

    private void btnEliminarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEventoActionPerformed
        if (!jListAgenda.isSelectionEmpty()) {
            for (int i = 0; i < sistema.listaDePerros.size(); i++) {
                if (jListAgenda.getSelectedIndex() == i) {
                    sistema.listaAgenda.remove(i);
                }
            }
            jListAgenda.setListData(sistema.listaAgenda.toArray());
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun can", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarEventoActionPerformed

    private void btnAgregarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEventoActionPerformed
     jPanelRegFamiliar.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(true);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
    }//GEN-LAST:event_btnAgregarEventoActionPerformed

    private void btnAgregarAlimentacionEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlimentacionEventoActionPerformed
        // TODO add your handling code here: jPanelRegFamiliar.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(true);
        jPanelActividadPaseoEvento.setVisible(false);
    }//GEN-LAST:event_btnAgregarAlimentacionEventoActionPerformed

    private void btnAgregarPaseoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPaseoEventoActionPerformed
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelRegFamiliar.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(true);  
    }//GEN-LAST:event_btnAgregarPaseoEventoActionPerformed

    private void btnAgregarVeterinariaEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVeterinariaEventoActionPerformed
        jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelRegFamiliar.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(true);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jPanelActividadPaseoEvento.setVisible(false);
    }//GEN-LAST:event_btnAgregarVeterinariaEventoActionPerformed

    private void btnConfirmarEventoVeterinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarEventoVeterinariaActionPerformed
        jPanelFamilia.setVisible(false);
        String evento = "Veterinaria" ;
       
        String descripcion = txtComentarioVeterinaria.getText();
        Date fecha = txtFechaVeterinaria.getDate();
        String vacio = "";
        Date fecha1 = new Date();
        if (evento.equals(vacio) && fecha.compareTo(fecha1)>0){
            
           JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacios.", "Error", JOptionPane.WARNING_MESSAGE);
        } 
        else {
            Agenda nuevo = new Agenda();
            nuevo.setEvento(evento);
            nuevo.setDescripcion(descripcion);
            nuevo.setFecha(fecha);
            //nuevo.setDate(fecha);
            
           if (btnOtrosVeterinaria.isSelected()){
               String tipoEvento1 = "Otros";
               nuevo.setTipoEvento(tipoEvento1);
           }
           else if(btnCompraVeterinaria.isSelected()){
               String tipoEvento2 = "Compra de articulo";
               nuevo.setTipoEvento(tipoEvento2);
           }
           else if(btnConsultaMedicaVeterinaria.isSelected()){
               String tipoEvento3 = "Consulta medica";
               nuevo.setTipoEvento(tipoEvento3);
           }
           else if(btnConsultaEsteticaVeterinaria.isSelected()){
               String tipoEvento4 = "Consulta estetica";
               nuevo.setTipoEvento(tipoEvento4);
           }
            sistema.listaAgenda.add(nuevo);
            jListAgenda.setListData(sistema.listaAgenda.toArray());
            JOptionPane.showMessageDialog(this, "Los datos fueron ingresados correctamente.", "OK", JOptionPane.INFORMATION_MESSAGE);
            jMostrarEventosAgenda.setVisible(true);
            jAgregarVeterinariaEvento.setVisible(false); 
            String eventoAux;
            String tipoEventoAux;
            String fechaAux;
            String descripcionAux;
            eventoAux ="Evento: " + nuevo.getEvento();
            lblEvento.setText(eventoAux);
            tipoEventoAux = "Tipo de evento: " + nuevo.getTipoEvento();
            lblTipoEventoOResponsable.setText(tipoEventoAux);
            fechaAux = "Fecha: " + nuevo.getFecha();
            lblFechaEvento.setText(fechaAux);
            descripcionAux = nuevo.getDescripcion();
            lblDetalleEventoComent.setText(descripcionAux);
        }    
    }//GEN-LAST:event_btnConfirmarEventoVeterinariaActionPerformed

    private void btnConfirmarEventoAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarEventoAlimentacionActionPerformed
        /*jPanelImgInicio.setVisible(false);
        jPanelRegCan.setVisible(false);
        jPanelMisCanes.setVisible(false);
        jPanelMostrarDatosCan.setVisible(false);
        jPanelFamilia.setVisible(false);
        jPanelRegFamiliar.setVisible(false);
        jPanelMostrarDatosFamilia.setVisible(false);
        jPanelAgenda.setVisible(false);
        jMostrarEventosAgenda.setVisible(false);
        jAgregarVeterinariaEvento.setVisible(false);
        jAgregarEventoTipo.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false);
        jAgregarAlimentacionEvento.setVisible(false); */
        String evento = "Alimentacion";
        String miembro;
        Date fecha = txtFechaAlimentacion.getDate();
        String descripcion = txtDetalleAlimentacion.getText();
        Agenda nuevo = new Agenda();
        nuevo.setEvento(evento);
        nuevo.setDescripcion(descripcion);
        nuevo.setFecha(fecha);
        if (!jListResponsablesAlimentacion.isSelectionEmpty()) {
            int pos = jListResponsablesAlimentacion.getSelectedIndex();
            miembro = sistema.listaFamilia.get(pos).getNombreFamiliar();
            nuevo.setFamilia(sistema.listaFamilia.get(pos));
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar el responsable de la alimentacion del can.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        if(jCheckRecibirNotifiacion.isSelected()){
            recibirNotificacion(nuevo);
        }

        sistema.listaAgenda.add(nuevo);
        jListAgenda.setListData(sistema.listaAgenda.toArray());
        jMostrarEventosAgenda.setVisible(true); 
        String eventoAux;
        String responsableAlimentacion;
        String fechaAux;
        String descripcionAux;
        eventoAux ="Evento: " + nuevo.getEvento();
        lblEvento.setText(eventoAux);
        responsableAlimentacion = "Responsable: " + nuevo.getFamilia();
        lblTipoEventoOResponsable.setText(responsableAlimentacion);
        fechaAux = "Fecha: " + nuevo.getFecha();
        lblFechaEvento.setText(fechaAux);
        descripcionAux = nuevo.getDescripcion();
        lblDetalleAlimentacion.setText(descripcionAux);
    }//GEN-LAST:event_btnConfirmarEventoAlimentacionActionPerformed

    private void btnCancelarEventoAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEventoAlimentacionActionPerformed
        txtDetalleAlimentacion.setText("");
        txtFechaAlimentacion.setDate(null);
        jAgregarEventoTipo.setVisible(true);  
    }//GEN-LAST:event_btnCancelarEventoAlimentacionActionPerformed

    private void btnCancelarEventoVeterinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEventoVeterinariaActionPerformed
        btnOtrosVeterinaria.setText("");
        btnConsultaEsteticaVeterinaria.setText("");
        btnConsultaMedicaVeterinaria.setText("");
        btnCompraVeterinaria.setText("");
        txtFechaVeterinaria.setDate(null);
        lblImgRegCan.setIcon(null);
        jAgregarEventoTipo.setVisible(true);
        jPanelActividadPaseoEvento.setVisible(false);
    }//GEN-LAST:event_btnCancelarEventoVeterinariaActionPerformed

    private void jCheckRecibirNotifiacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckRecibirNotifiacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckRecibirNotifiacionActionPerformed

    private void btnConfirmarPaseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarPaseoActionPerformed
        Agenda nuevo = new Agenda();
        String evento ="Paseo";
        String hora = txtHora.getText();
        String minuto = txtminuto.getText();
        String horarioFinal = hora+" : "+minuto;
        String miembro;
        nuevo.setEvento(evento);
        nuevo.setHora(horarioFinal);
        if (!jListResponsablesAlimentacion.isSelectionEmpty()) {
            int pos = jListResponsablesAlimentacion.getSelectedIndex();
            miembro = sistema.listaFamilia.get(pos).getNombreFamiliar();
            nuevo.setFamilia(sistema.listaFamilia.get(pos));
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar el responsable de la alimentacion del can.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        if(checkBoxNotificacionPaseo.isSelected()){
            recibirNotificacion(nuevo);
        }
        sistema.listaAgenda.add(nuevo);
        jListAgenda.setListData(sistema.listaAgenda.toArray());
        jMostrarEventosAgenda.setVisible(true);
        String eventoAux;
        String responsablePaseo;
        String fechaAux;
        String descripcionAux;
        eventoAux ="Evento: " + nuevo.getEvento();
        lblEvento.setText(eventoAux);
        responsablePaseo = "Responsable: " + nuevo.getFamilia();
        lblTipoEventoOResponsable.setText(responsablePaseo);
        fechaAux = "Hora: " + nuevo.getHora();
        lblFechaEvento.setText(fechaAux);
    }//GEN-LAST:event_btnConfirmarPaseoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnAgregarAlimentacionEvento;
    private javax.swing.JButton btnAgregarCan;
    private javax.swing.JButton btnAgregarEvento;
    private javax.swing.JButton btnAgregarFamiliar;
    private javax.swing.JButton btnAgregarPaseoEvento;
    private javax.swing.JButton btnAgregarVeterinariaEvento;
    private javax.swing.JButton btnCancelarEventoAlimentacion;
    private javax.swing.JButton btnCancelarEventoVeterinaria;
    private javax.swing.JButton btnCancelarPaseo;
    private javax.swing.JButton btnCancelarRegCan;
    private javax.swing.JButton btnCancelarRegFamiliar;
    private javax.swing.JRadioButton btnCompraVeterinaria;
    private javax.swing.JButton btnConfirmarEventoAlimentacion;
    private javax.swing.JButton btnConfirmarEventoVeterinaria;
    private javax.swing.JButton btnConfirmarPaseo;
    private javax.swing.JButton btnConfirmarRegCan;
    private javax.swing.JButton btnConfirmarRegFamiliar;
    private javax.swing.JRadioButton btnConsultaEsteticaVeterinaria;
    private javax.swing.JRadioButton btnConsultaMedicaVeterinaria;
    private javax.swing.JButton btnDetalleEvento;
    private javax.swing.JButton btnEliminarCan;
    private javax.swing.JButton btnEliminarEvento;
    private javax.swing.JButton btnEliminarFamiliar;
    private javax.swing.JButton btnFamilia;
    private javax.swing.JButton btnMisCanes;
    private javax.swing.JButton btnMostrarCan;
    private javax.swing.JButton btnMostrarFamiliar;
    private javax.swing.JRadioButton btnOtrosVeterinaria;
    private javax.swing.JButton btnSubirImagen;
    private javax.swing.JButton btnSubirImagenFamiliar;
    private javax.swing.JCheckBox checkBoxNotificacionPaseo;
    private javax.swing.JCheckBox checkBoxNotificacionPaseo1;
    private javax.swing.JPanel jAgregarAlimentacionEvento;
    private javax.swing.JPanel jAgregarEventoTipo;
    private javax.swing.JPanel jAgregarVeterinariaEvento;
    private javax.swing.JLabel jAlturaPerroPerfil;
    private javax.swing.JCheckBox jCheckRecibirNotifiacion;
    private javax.swing.JLabel jDescPerroPerfil;
    private javax.swing.JTextField jDescripcionPerroPerfil;
    private javax.swing.JLabel jEmailFamiliarPerfil;
    private javax.swing.JLabel jImgFamiliarPerfil;
    private javax.swing.JLabel jImgPerroPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList2;
    private javax.swing.JList jListAgenda;
    private javax.swing.JList jListFamilia;
    private javax.swing.JList jListResponsablesAlimentacion;
    private javax.swing.JList jListResponsablesPaseo;
    private javax.swing.JList jListResponsablesVeterinaria;
    private javax.swing.JScrollPane jListaFamilia;
    private javax.swing.JPanel jMostrarEventosAgenda;
    private javax.swing.JLabel jNombreFamiliarPerfil;
    private javax.swing.JLabel jNombrePerroPerfil;
    private javax.swing.JPanel jPabelBarraSuperior;
    private javax.swing.JPanel jPanelActividadPaseoEvento;
    private javax.swing.JPanel jPanelAgenda;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelFamilia;
    private javax.swing.JPanel jPanelImgInicio;
    private javax.swing.JPanel jPanelMisCanes;
    private javax.swing.JPanel jPanelMostrarDatosCan;
    private javax.swing.JPanel jPanelMostrarDatosFamilia;
    private javax.swing.JPanel jPanelRegCan;
    private javax.swing.JPanel jPanelRegFamiliar;
    private javax.swing.JLabel jPesoPerroPerfil;
    private javax.swing.JLabel lbCerrar;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel lblAgenda1;
    private javax.swing.JLabel lblAgenda2;
    private javax.swing.JLabel lblAgendaEventoPaseo;
    private javax.swing.JLabel lblAlimentacion;
    private javax.swing.JLabel lblAlturaRegCan;
    private javax.swing.JLabel lblAlturaRegCan1;
    private javax.swing.JLabel lblComentarioVeterinaria;
    private javax.swing.JLabel lblDescripcionRegCan;
    private javax.swing.JLabel lblDetalleAlimentacion;
    private javax.swing.JLabel lblDetalleEvento;
    private javax.swing.JLabel lblDetalleEventoComent;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblFechaAlimentacion;
    private javax.swing.JLabel lblFechaEvento;
    private javax.swing.JLabel lblFechaVeterinaria;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblImgRegCan;
    private javax.swing.JLabel lblImgRegCan1;
    private javax.swing.JLabel lblMiembrosFamilia;
    private javax.swing.JLabel lblMisCanes;
    private javax.swing.JLabel lblNombreRegCan;
    private javax.swing.JLabel lblNombreRegCan1;
    private javax.swing.JLabel lblPendientesAgenda;
    private javax.swing.JLabel lblPesoRegCan;
    private javax.swing.JLabel lblRegCan;
    private javax.swing.JLabel lblRegCan1;
    private javax.swing.JLabel lblResponsableAlimentacion;
    private javax.swing.JLabel lblTipoDeEvento;
    private javax.swing.JLabel lblTipoEventoOResponsable;
    private javax.swing.JLabel lblVeterinaria;
    private javax.swing.JScrollPane listaAgenda;
    private javax.swing.JScrollPane listaMisCanes;
    private javax.swing.JScrollPane listaResponsablesAlimentacion;
    private javax.swing.JScrollPane listaResponsablesPaseo;
    private javax.swing.JScrollPane listaResponsablesVeterinaria;
    public static javax.swing.JPanel menuPrincipal;
    private javax.swing.ButtonGroup opcionesEventos;
    private javax.swing.JTextField txtAlturaRegCan;
    private javax.swing.JTextField txtComentarioVeterinaria;
    private javax.swing.JTextField txtDescripcionRegCan;
    private javax.swing.JTextField txtDetalleAlimentacion;
    private javax.swing.JTextField txtEmailRegFamiliar;
    private com.toedter.calendar.JDateChooser txtFechaAlimentacion;
    private com.toedter.calendar.JDateChooser txtFechaVeterinaria;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombreRegCan;
    private javax.swing.JTextField txtNombreRegFamiliar;
    private javax.swing.JTextField txtPesoRegCan;
    private javax.swing.JTextField txtminuto;
    // End of variables declaration//GEN-END:variables
}
