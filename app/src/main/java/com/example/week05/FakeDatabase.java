package com.example.week05; // <============= CHANGE ME

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/***
 * A class to simulate some data source existing. Use to practice intents and lists/RecyclerView
 * before going into APIs.
 *
 * Example usage:
 *      Article articleObject1 = FakeDatabase.getArticleById(1);
 *      System.out.println(articleObject1.getHeadline());
 *
 * Output:
 *      Diamonds, Warlords and Mercenaries: Russia’s New Playbook in Africa
 */
public class FakeDatabase {


    /***
     * Retrieves an Article object using the provided id.
     */
    public static Article getArticleById(int articleID) {
        return articles.get(articleID);
    }

    /***
     * Return an ArrayList containing all the articles in the database.
     */
    public static ArrayList<Article> getAllArticles() {
        return new ArrayList<Article>((List) Arrays.asList(articles.values().toArray()));
    }


    // You can ignore everything below this for now.
    private static final HashMap<Integer, Article> articles = new HashMap<>();

    static {
        articles.put(1, new Article(
                1,
                "Diamonds, Warlords and Mercenaries: Russia’s New Playbook in Africa",
                "Dionne Searcey",
                "After meddling in the 2016 American election, Russia is using similar tactics in the Central African Republic. But as it sows political chaos, this time it is also seeking diamonds.",
                "BANGUI, Central African Republic — The dealer pulled back a shiny pink curtain and sprinkled the contents of two white envelopes across his desk: sparkling diamonds, more than 100 of them.\n" +
                        "\n" +
                        "Some gems are sold legally, he explained. But many are trafficked by rebels who fight over the mines, adding fuel to a six-year uprising that has killed thousands and displaced more than a million people here in the Central African Republic.\n" +
                        "\n" +
                        "Now, hoping to wrest control over the diamond trade and piece the country back together, the government has turned to a new partner — Russia — in what some lawmakers fear is a dangerous bargain that trades one threat for another.\n" +
                        "\n" +
                        "Russian mercenaries have fanned out across the nation to train local soldiers. A former Russian spy has been installed by the Central African president as his top security adviser. Russians shuttled warlords to peace talks with the government, helping lead to a deal with more than a dozen armed groups to stop fighting.",
                R.drawable.article1_image
        ));
        articles.put(2, new Article(
                2,
                "Biden’s Digital Ads Are Disappearing. ‘Not a Good Sign,’ Strategists Say.",
                "Shane Goldmacher",
                "In a race where many voters are following politics online, Mr. Biden’s pullback is a striking and potentially worrisome sign about his appeal among the digitally active.",
                "Joseph R. Biden Jr.’s presidential campaign has sharply scaled back his online advertising, cutting spending so severely since August that he is now investing only a fraction of what his top rivals are on Facebook and Google, the two dominant internet platforms.\n" +
                        "\n" +
                        "In a race where many voters are following politics on their smartphones, Mr. Biden’s pullback is an unusual and potentially worrisome sign about his appeal among the Democratic activists, young people and donors who are especially engaged on social media. Candidates rarely withdraw so much money from their online campaigns unless they are seeing weak results in online fund-raising, according to interviews with digital strategists.\n" +
                        "\n" +
                        "As the candidates make their final pitches to donors before a quarterly fund-raising deadline at midnight Monday, Senator Elizabeth Warren of Massachusetts and other top rivals are outspending Mr. Biden online. He was only the sixth-biggest Democratic spender on Facebook ads in the seven days ending Thursday, even as he was at the center of a swirling national controversy involving President Trump, Ukraine and impeachment.",
                R.drawable.article2_image
        ));

        articles.put(3, new Article(
                3,
                "France Marks a Day of Mourning for Jacques Chirac",
                "Aurelien Breeden",
                "PARIS — World leaders and dignitaries gathered in Paris on Monday as France marked a national day of mourning for Jacques Chirac, the former French president who died last week.",
                "After Mr. Chirac’s family met privately on Monday morning, President Emmanuel Macron presided over a military ceremony in his honor in the courtyard of the Invalides monument in central Paris.\n" +
                        "\n" +
                        "A military band played the Marseillaise, France’s national anthem, before Mr. Chirac’s coffin, which was draped in the red, white and blue French flag, as a somber-looking Mr. Macron stood by.\n" +
                        "A funeral procession then brought the coffin to the Saint-Sulpice church, about a mile east, where former French presidents and dozens of French officials and politicians gathered for a religious service.\n" +
                        "\n" +
                        "One of Notre-Dame Cathedral’s main bells rang out to mark the procession’s departure, the first time it has tolled since a fire ravaged the building in April. Small crowds lined the streets and clapped as Mr. Chirac’s hearse, surrounded by a motorcade, slowly drove by.",
                R.drawable.article3_image
        ));

        articles.put(4, new Article(
                4,
                "4 Inmates Escape From Ohio Jail After Overpowering Guards",
                "Neil Vigdor",
                "The escapees had help from at least one individual on the outside, the authorities said.",
                "Four inmates who are considered “extremely dangerous” escaped from a county jail in Ohio early Sunday morning after overpowering two guards, the authorities said.\n" +
                        "\n" +
                        "The inmates used a homemade weapon known as a shank and stole the keys to a corrections officer’s vehicle, which was used in the first part of their escape from the Gallia County Jail, Sheriff Matt Champlin said at a news conference.\n" +
                        "\n" +
                        "He said the inmates, all men, had help from at least one individual on the outside.\n" +
                        "\n" +
                        "The authorities said that a second vehicle was waiting for the inmates about a block from the jail and was later found in an unspecified part of Pennsylvania.\n" +
                        "\n" +
                        "The Westmoreland Mall near Pittsburgh was briefly closed because one of the escapees was believed to be in the area, the Pennsylvania State Police said.\n" +
                        "\n" +
                        "The sheriff said the two female jail officers who were on duty were not seriously injured during the escape, which happened around 12:15 a.m.",
                R.drawable.article4_image
        ));

        articles.put(5, new Article(
                5,
                "The Artist Creating a New Mythology for the North Pole",
                "Tess Thackara",
                "Inspired by her own journey to the Arctic Circle, Himali Singh Soin upends traditional stories of exploration in her new commission for Frieze.",
                "In her sunlit live-work space overlooking Brick Lane in East London, the artist Himali Singh Soin is spinning a narrative about the farthest reaches of our planet. Singh Soin, a poet and artist from north-central India, has spent the past couple of years contemplating, among other things, the earth’s polar caps. “It’s a blank screen to project so much on it, it’s almost asking for hyperbole and fantasy,” she says. “These two spaces seem like the closest to outer space.”\n" +
                        "\n" +
                        "Singh Soin is primarily a writer of poetry and art criticism, but her language also spills off the page and into immersive audiovisual environments, film and spoken-word performances that often dwell on the environment, issues of identity and the nature of deep time. She’s made recent appearances in exhibitions and performances at Somerset House, the Serpentine Gallery and Whitechapel Gallery in London but is lesser known to audiences outside the United Kingdom. With a new commission from Frieze, that looks set to change.\n" +
                        "\n" +
                        "On a roving residency aboard a sailboat in the North Pole in 2017, Singh Soin met the science historian Alexis Rider and learned that Victorian-era Britain was abuzz with anxieties about the imminent arrival of another ice age. As British explorers set out across the globe in the 19th century, fears of the colonial “other” became tangled up with paranoid fantasies of far-flung environments invading their shores — of glacial infiltration or contamination. Satirical drawings in Punch magazine imagined polar bears turning up in English fields. The artist Gustave Doré composed a scene in which the River Thames and London’s skyline had frozen over, while a “Southern Savage” loomed on its banks. And Mary Shelley wrote her 1818 novel “Frankenstein,” in which the explorer and ship captain Robert Walton ventures to the globe’s icy periphery in search of the unknown and encounters Victor Frankenstein and his haunting story.",
                R.drawable.article5_image
        ));

        articles.put(6, new Article(
                6,
                "Are We Living in a Post-Happiness World?",
                "Laura M. Holson",
                "With happiness harder to come by these days, people are grasping at any moment of joy they can get.",
                "Joy, it seems, is everywhere these days.\n" +
                        "\n" +
                        "It is used to sell boxes at Ikea. It is included in ads for drinks at McDonald’s and as a prescriptive for female hygiene. There are T-shirts that tout joy as “an act of resistance.” There is the “Chasing Joy” podcast. And a number of books are being published this year devoted to joyful living, including marriage, productivity, even how to live more like Hugh Jackman.\n" +
                        "\n" +
                        "But if joy is everywhere, why does happiness feel so elusive? Haven’t we learned anything since 2014 when Marie Kondo taught us that cleaning our closets was a path to bliss? Well, so much has changed since then. Politics in the era of President Trump has divided Americans into two camps: angry and angrier. Our world is threatened by climate change. And the booming United States economy is showing signs of fatigue.\n" +
                        "\n" +
                        "It is no wonder then that people are calculating well-being in mere moments. “In an age of despair, choosing joy is a revolutionary act,” said Douglas Abrams, an author of “The Book of Joy: Lasting Happiness in a Changing World,” a 2016 best seller he wrote with Desmond Tutu and the Dalai Lama. Joy is more attainable, he said. “Happiness seems like it is outside of us, in some perfect moment.”\n" +
                        "\n" +
                        "So, are we living in a post-happiness world? According to the World Happiness Report, which ranks 156 countries based on inhabitants’ perception and well-being, happiness in the United States is declining. Americans said they were less content in 2018 than a year earlier, ranking No. 19 behind Australia and Canada. The 24-hour news cycle, combined with the onslaught of natural disasters, social upheaval and political strife, has left Americans exhausted. Worse, the agita shows no sign of abating; psychologists suggest anxiety is on the rise.",
                R.drawable.article6_image
        ));

    }
}
