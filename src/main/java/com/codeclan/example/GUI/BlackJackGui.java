package com.codeclan.example.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlackJackGui extends JFrame implements ActionListener {
    private JLabel dealerName, player1Name, player2Name, player3Name, player4Name, player5Name,
            dealer, player, player1Balance, player2Balance, player3Balance, player4Balance,
            player5Balance, dealerCard1LB ;
    private  JButton btn50Pounds, btn100Pounds, btn200Pounds, bet, btnPlayer1Twist, btnPlayer2Twist,
            btnPlayer3Twist, btnPlayer4Twist, btnPlayer5Twist, btnAddPlayer1, btnAddPlayer2, btnAddPlayer3,
            btnAddPlayer4, btnAddPlayer5, btnStopPlayer1, btnStopPlayer2, btnStopPlayer3, btnStopPlayer4,
            btnStopPlayer5;
    private JTextField bet1txt, bet2txt, bet3txt, bet4txt, bet5txt;
    private  GridBagConstraints item;

    public BlackJackGui(){
        setTitle("Black Jack");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setUpCentralPanel();
        pack();
        setVisible(true);
    }

    private void setUpCentralPanel() {
        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new GridBagLayout());

        JPanel dealer = new JPanel();
        dealer.setLayout(new GridBagLayout());




    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
