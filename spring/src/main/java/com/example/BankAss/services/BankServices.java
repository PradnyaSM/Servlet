package com.example.BankAss.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BankServices {

    List<String> branches = new ArrayList<>(Arrays.asList(
            "MG Road Branch", "Brigade Road Branch", "Indiranagar Branch",
            "Koramangala Branch", "Whitefield Branch", "BTM Branch",
            "HSR Layout Branch", "Rajajinagar Branch", "Jayanagar Branch",
            "Hebbal Branch"
    )) ;

    public List<String> getBranches(){
        return branches;
    }

    List<String> services = new ArrayList<>(Arrays.asList(
            "Savings Account",
            "Current Account",
            "Fixed Deposits",
            "Loans",
            "Credit Cards",
            "Net Banking",
            "Mobile Banking",
            "Insurance",
            "Wealth Management",
            "Mutual Funds"
    )) ;

    public List<String> getServices(){
        return services;
    }
}
