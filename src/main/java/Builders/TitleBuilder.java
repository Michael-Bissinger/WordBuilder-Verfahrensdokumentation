package Builders;

import java.util.List;

public class TitleBuilder {

    public static List<String> makeTitle (List<String> list) {

        // Titelzeilen in Liste abspeichern (Zeile für Zeile)


        // Liste zurückgeben
        return list;


    }

}
/*
Titel:

        \begin{titlepage}
        \centering
        \includegraphics[width=0.15\textwidth]{Grafiken/laptop.png}\par%\vspace{1cm}


        {\scshape\huge Verfahrensdokumentation \par}
        \vspace{2cm}
        %	{\scshape\Large XXX\par}
        %	\vspace{1.5cm}
        %	{\huge\bfseries Verfahrensdokumentation\par}
        \vfill
        \includegraphics[width=0.15\textwidth]{Grafiken/HWS_New_Logo_blue.png}\par%\vspace{1cm}
        \textbf{HWS Lutz GmbH \& Co. KG}\par
        Steuerberatungsgesellschaft\par
        Kupferstraße 5\par
        70565 Stuttgart\par
        \vfill

        \underline{Versionsnummer:} 1.0\par
        %\underline{Stand:} \today\par
        \underline{Stand:} 23.06.2022\par
        \vfill

        \vspace{2cm}
        {\Large Jüngste Änderungshistorie*}
        %\vfill
        %supervised by\par
        %Dr.~Mark \textsc{Brown}\par
        \normalsize
        \begin{center}
        \begin{tabular}{ | l | l | l | p{7cm} |}
        \hline
        \textbf{Datum} & \textbf{Version} & \textbf{Export durch} & \textbf{Kommentar zur Änderung} \\ \hline

        &  &  & \\ \hline
        &  &  & \\ \hline
        &  &  & \\ \hline

        \end{tabular}
        \end{center}

        \textit{\small*Überblick der letzten drei Änderungen. Komplette Änderungshistorie in Kapitel \ref{sec:Änderungshistorie}}

        \vfill

        % Bottom of the page
        %{\large \today\par}
        \end{titlepage}
 * */