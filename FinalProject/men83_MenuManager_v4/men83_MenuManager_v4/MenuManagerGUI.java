package men83_MenuManager_v4;
/**
 * Class MenuManagerGUI
 * author: Morgan Noonan
 * created 11/27/2022
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.*;

public class MenuManagerGUI {
	private JFrame frame;
	private JFrame detailFrame;
	private JLabel label;
	private JComboBox<String> comboBox1;
	private JComboBox<String> comboBox2;
	private JComboBox<String> comboBox3;
	private JComboBox<String> comboBox4;
	private MenuManager manage = new MenuManager("data/dishes.txt");
	private FileManager fileManage = new FileManager();
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private Entree eAdd;
	private Side siAdd;
	private Salad saAdd;
	private Dessert dAdd;
	private String menuName;
	private JButton detailsButton;
	private JButton deleteButton;
	private JButton saveButton;
	private DefaultListModel<Menu> listModel = new DefaultListModel<>();
	private JList<Menu> menuListSelector = new JList<>(listModel);
	private Menu menuSelected;


	public MenuManagerGUI(String dishFile) {
		manage = new MenuManager(dishFile);
		frame();
		panel1();
		panel2();
		panel3();

	}
	//frame
	public void frame() {
		frame = new JFrame("MenuManager");
		frame.setLayout(null);
		frame.setBounds(250,100,750,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//panel1
	public void panel1() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(30,40,340,300);
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel);
		label = new JLabel("Build your own Menu");
		label.setBounds(5,5,140,20);
		label.setHorizontalAlignment(0);
		panel.add(label);
		//entree
		label = new JLabel("Entree");
		label.setBounds(30,50,100,15);
		label.setHorizontalAlignment(0);
		panel.add(label);
		comboBox1 = new JComboBox<String>();
		for(int k = 0; k<manage.getEntrees().size();k++) {
			comboBox1.addItem(manage.getEntrees().get(k).getName());
		}
		comboBox1.setBounds(150,40,150,30);
		comboBox1.setVisible(true);
		panel.add(comboBox1);
		//side
		label = new JLabel("Side");
		label.setBounds(25,100,100,15);		
		label.setHorizontalAlignment(0);
		panel.add(label);
		comboBox2 = new JComboBox<String>();
		for(int k = 0; k<manage.getSides().size();k++) {
			comboBox2.addItem(manage.getSides().get(k).getName());
		}
		comboBox2.setBounds(150,90,150,30);
		comboBox2.setVisible(true);
		panel.add(comboBox2);
		//salad
		label = new JLabel("Salad");
		label.setBounds(30,150,100,15);
		label.setHorizontalAlignment(0);
		panel.add(label);
		comboBox3 = new JComboBox<String>();
		for(int k = 0; k<manage.getSalads().size();k++) {
			comboBox3.addItem(manage.getSalads().get(k).getName());
		}
		comboBox3.setBounds(150,140,150,30);
		comboBox3.setVisible(true);
		panel.add(comboBox3);
		//dessert
		label = new JLabel("Dessert");
		label.setBounds(35,200,100,15);
		label.setHorizontalAlignment(0);
		panel.add(label);
		comboBox4 = new JComboBox<String>();
		for(int k = 0; k<manage.getDesserts().size();k++) {
			comboBox4.addItem(manage.getDesserts().get(k).getName());
		}
		comboBox4.setBounds(150,190,150,30);
		comboBox4.setVisible(true);
		panel.add(comboBox4);
		//button
		button1 = new JButton("Create menu with these dishes");
		button1.setBounds(20,250,300,30);
		panel.add(button1);
		button1.addActionListener(event ->{
			Object e = comboBox1.getSelectedItem();
			Object si = comboBox2.getSelectedItem();
			Object sa = comboBox3.getSelectedItem();
			Object d = comboBox4.getSelectedItem();
			for(int k =0;k<manage.getEntrees().size();k++) {
				if(manage.getEntrees().get(k).getName().equals(e)) {
					eAdd = manage.getEntrees().get(k);
				}
			}
			for(int k =0;k<manage.getSides().size();k++) {
				if(manage.getSides().get(k).getName().equals(si)) {
					siAdd = manage.getSides().get(k);
				}
			}
			for(int k =0;k<manage.getSalads().size();k++) {
				if(manage.getSalads().get(k).getName().equals(sa)) {
					saAdd = manage.getSalads().get(k);
				}
			}
			for(int k =0;k<manage.getDesserts().size();k++) {
				if(manage.getDesserts().get(k).getName().equals(d)) {
					dAdd = manage.getDesserts().get(k);
				}
			}
			menuName = JOptionPane.showInputDialog("Name for menu:");
			Menu newMenu = new Menu(menuName, eAdd,siAdd,saAdd,dAdd);
			addMenu(newMenu);
		});
	}
	//panel2
	public void panel2() {
		panel = new JPanel();
		panel.setBounds(30,350,340,280);
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel);
		label = new JLabel("Or generate a menu");
		label.setBounds(35,380,220,60);
		label.setHorizontalAlignment(0);
		panel.add(label);
		//random menu
		button2 = new JButton("Create a Random Menu");
		button2.setBounds(50,60,300,30);
		panel.add(button2);
		button2.addActionListener(event->{
			menuName = JOptionPane.showInputDialog("Name for menu:");
			Menu newMenu = manage.randomMenu(menuName);
			addMenu(newMenu);
		});

	}
	//panel3
	public void panel3() {
		panel = new JPanel();
		panel.setBounds(400,70,320,520);
		panel.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.getContentPane().add(panel);
		//created menus:
		label = new JLabel("Created Menus:");
		label.setBounds(400,40,120,20);
		frame.getContentPane().add(label);
		detailButton();
		saveToFile();
		//delete all
		deleteButton=new JButton("Delete all");
		deleteButton.setBounds(510,600,100,30);
		frame.add(deleteButton);
		deleteButton.addActionListener(event->{
			listModel.removeAllElements();
			fileManage.deleteFileContent("data/menus.txt");
		});
		menuListSelector.setBounds(panel.getBounds().x + 10, panel.getBounds().y + 10, panel.getWidth() - 20, panel.getHeight() - 20);

		panel.add(menuListSelector);
	}
	//addMenu
	public void addMenu(Menu menu) {
		listModel.addElement(menu);
	}
	//detailButton
	public void detailButton() {
		detailsButton =new JButton("Details");
		detailsButton.setBounds(410,600,100,30);
		frame.add(detailsButton);

		detailsButton.addActionListener(event->{
			if(listModel.get(menuListSelector.getSelectedIndex())!=null) {
				menuSelected = listModel.get(menuListSelector.getSelectedIndex());
				detailFrame = new JFrame(menuSelected.getName());
				detailFrame.setLayout(null);
				detailFrame.setBounds(250,100,800,500);
				detailFrame.setVisible(true);
				detailFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				//entree
				label = new JLabel ("entree");
				label.setBounds(10,20,100,15);
				detailFrame.add(label);
				panel = new JPanel();
				panel.setBounds(80,5,650,80);
				panel.setBorder(BorderFactory.createLineBorder(Color.black));
				detailFrame.getContentPane().add(panel);
				label = new JLabel(menuSelected.getEntree().getName()+":");
				label.setBounds(5,5,50,15);
				label.setHorizontalTextPosition(JLabel.LEFT);
				panel.add(label);
				label = new JLabel(menuSelected.getEntree().getDesc());
				label.setBounds(5,25,600,30);

				panel.add(label);
				label = new JLabel(" Calories: "+menuSelected.getEntree().getCal()+" Price: $"+menuSelected.getEntree().getPrice()+"0");
				label.setBounds(5,50,100,15);
				panel.add(label);
				//side
				label = new JLabel ("side");
				label.setBounds(10,100,180,15);
				detailFrame.add(label);
				panel = new JPanel();
				panel.setBounds(80,90,650,80);
				panel.setBorder(BorderFactory.createLineBorder(Color.black));
				detailFrame.getContentPane().add(panel);
				label = new JLabel(menuSelected.getSide().getName()+":");
				label.setBounds(5,5,50,15);
				panel.add(label);
				label = new JLabel(menuSelected.getSide().getDesc());
				label.setBounds(5,65,630,15);
				panel.add(label);
				label = new JLabel(" Calories: "+menuSelected.getSide().getCal()+" Price: $"+menuSelected.getSide().getPrice()+"0");
				label.setBounds(5,125,630,15);
				panel.add(label);
				//salad
				label = new JLabel ("salad");
				label.setBounds(10,180,100,15);
				detailFrame.add(label);
				panel = new JPanel();
				panel.setBounds(80,175,650,80);
				panel.setBorder(BorderFactory.createLineBorder(Color.black));
				detailFrame.getContentPane().add(panel);
				label = new JLabel(menuSelected.getSalad().getName()+":");
				label.setBounds(5,5,50,15);
				panel.add(label);
				label = new JLabel(menuSelected.getSalad().getDesc());
				label.setBounds(5,65,630,15);
				panel.add(label);
				label = new JLabel(" Calories: "+menuSelected.getSalad().getCal()+" Price: $"+menuSelected.getSalad().getPrice()+"0");
				label.setBounds(5,125,630,15);
				panel.add(label);
				//dessert
				label = new JLabel ("dessert");
				label.setBounds(10,270,100,15);
				detailFrame.add(label);
				panel = new JPanel();
				panel.setBounds(80,260,650,80);
				panel.setBorder(BorderFactory.createLineBorder(Color.black));
				detailFrame.getContentPane().add(panel);	
				label = new JLabel(menuSelected.getDessert().getName()+":");
				label.setBounds(5,5,50,15);
				panel.add(label);
				label = new JLabel(menuSelected.getDessert().getDesc());
				label.setBounds(5,65,630,15);
				panel.add(label);
				label = new JLabel(" Calories: "+menuSelected.getDessert().getCal()+" Price: $"+menuSelected.getDessert().getPrice()+"0");
				label.setBounds(5,125,630,15);
				panel.add(label);
				//cal & price
				label = new JLabel("Total Calories:");
				label.setBounds(10,340,100,60);
				detailFrame.add(label);
				panel = new JPanel();
				panel.setBounds(120,355,100,30);
				panel.setBorder(BorderFactory.createLineBorder(Color.black));
				detailFrame.getContentPane().add(panel);
				label = new JLabel(String.valueOf(menuSelected.totalCalories()));
				panel.add(label);
				label = new JLabel("Total Price: $");
				detailFrame.add(label);
				label.setBounds(10,380,100,60);
				panel = new JPanel();
				panel.setBounds(120,395,100,30);
				panel.setBorder(BorderFactory.createLineBorder(Color.black));
				detailFrame.getContentPane().add(panel);
				label = new JLabel(String.valueOf(menuSelected.totalPrice())+"0");
				panel.add(label);
			}
		});
	}
	//saveToFile
	public void saveToFile() {
		saveButton =new JButton("Save to file");
		saveButton.setBounds(610,600,100,30);
		frame.add(saveButton);
		saveButton.addActionListener( event->{
			ArrayList<Menu> menuConvert = new ArrayList<Menu>();
			for(int k =0;k<listModel.getSize();k++) {
				menuConvert.add(listModel.getElementAt(k));
			}
			fileManage.writeMenus("data/menus.txt", menuConvert);
		});
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuManagerGUI window = new MenuManagerGUI("data/dishes.txt");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}


