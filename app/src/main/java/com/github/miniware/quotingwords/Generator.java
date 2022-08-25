package com.github.miniware.quotingwords;

import androidx.annotation.DrawableRes;
import androidx.annotation.IntegerRes;

public class Generator {
    private String[] quotes = {
            "The most important thing is to enjoy your life – to be happy – it’s all that matters.\n\nAudrey Hepburn",
            "Life is not a problem to be solved, but a reality to be experienced.\n\nSoren Kierkegaard",
            "Very little is needed to make a happy life; it is all within yourself, in your way of thinking.\n\nMarcus Aurelius",
            "In the end, it’s not the years in your life that count. It’s the life in your years.\n\nAbraham Lincoln",
            "We do not remember days, we remember moments.\n\nCesare Pavese",
            "I have found that if you love life, life will love you back.\n\nArthur Rubinstein",
            "One way to get the most out of life is to look upon it as an adventure.\n\nWilliam Feather",
            "Life is a mirror and will reflect back to the thinker what he thinks into it.\n\nErnest Holmes",
            "If you love life, don’t waste time, for time is what life is made up of.\n\nBruce Lee",
            "It’s all about quality of life and finding a happy balance between work and friends and family.\n\nPhilip Green",
            "The greatest trap in our life is not success, popularity or power, but self-rejection.\n\nHenri Nouwen",
            "Life is ten percent what happens to you and ninety percent how you respond to it.\n\nLou Holtz",
            "The chief danger in life is that you may take too many precautions.\n\nAlfred Adler",
            "Whenever you find yourself on the side of the majority, it is time to reform (or pause and reflect).\n\nMark Twain",
            "The saddest aspect of life right now is that science gathers knowledge faster than society gathers wisdom.\n\nIsaac Asimov",
            "Any fool can know. The point is to understand.\n\nAlbert Einstein",
            "The simple things are also the most extraordinary things, and only the wise can see them.\n\nPaulo Coelho",
            "The man of knowledge must be able not only to love his enemies but also to hate his friends.\n\nFriedrich Nietzsche",
            "Follow your heart, listen to your inner voice, stop caring about what others think.\n\nRoy T. Bennett",
            "The measure of intelligence is the ability to change.\n\nAlbert Einstein",
            "It is not that I'm so smart. But I stay with the questions much longer.\n\nAlbert Einstein",
            "Don't waste your time with explanations: people only hear what they want to hear.\n\nPaulo Coelho",
            "The past has no power over the present moment.\n\nEckhart Tolle",
            "Failure is the condiment that gives success its flavor.\n\nTruman Capote",
            "We can know only that we know nothing. And that is the highest degree of human wisdom.\n\nLeo Tolstoy",
            "The more I read, the more I acquire, the more certain I am that I know nothing.\n\nVoltaire",
            "Half of seeming clever is keeping your mouth shut at the right times.\n\nPatrick Rothfuss",
            "Life would be tragic if it weren't funny.\n\nStephen Hawking",
            "Risks must be taken because the greatest hazard in life is to risk nothing.\n\nLeo F. Buscaglia",
            "A day without sunshine is like, you know, night.\n\nSteve Martin",
            "Whenever I feel the need to exercise, I lie down until it goes away.\n\nPaul Terry",
            "It’s no use going back to yesterday, because I was a different person then.\n\nLewis Carroll",
            "Creativity is knowing how to hide your sources\n\nC.E.M. Joad",
            "Never memorize something that you can look up.\n\nAlbert Einstein",
            "If at first you don't succeed, try, try again. Then quit. No use being a damn fool about it.\n\nW.C. Fields",
            "The only man who never makes mistakes is the man who never does anything.\n\nTheodore Roosevelt",
            "I have not failed. I've just found 10,000 ways that won't work.\n\nThomas A. Edison",
            "It is never too late to be what you might have been.\n\nGeorge Eliot",
            "Life isn't about finding yourself. Life is about creating yourself.\n\nGeorge Bernard Shaw",
            "Do what you can, with what you have, where you are.\n\nTheodore Roosevelt",
            "Do what you feel in your heart to be right – for you’ll be criticized anyway.\n\nEleanor Roosevelt",
            "Don't be pushed around by the fears in your mind. Be led by the dreams in your heart.\n\nRoy T. Bennett",
            "Life is too short to waste your time on people who don’t respect, appreciate, and value you.\n\nRoy T. Bennett",
            "You cannot control the behavior of others, but you can always choose how you respond to it.\n\nRoy T. Bennett",
            "Don't judge each day by the harvest you reap but by the seeds that you plant.\n\nRobert Louis Stevenson ",
            "Without deviation from the norm, progress is not possible.\n\nFrank Zappa",
            "Trust yourself. You know more than you think you do.\n\nBenjamin Spock",
            "Do not fear to be eccentric in opinion, for every opinion now accepted was once eccentric.\n\nBertrand Russell",
            "It is better to fail in originality than to succeed in imitation.\n\nHerman Melville",
            "Have no fear of perfection - you'll never reach it.\n\nSalvador Dali",
            "The worst part of success is trying to find someone who is happy for you.\n\nBette Midler",
            "Sometimes it takes a good fall to really know where you stand\n\nHayley Williams",
            "It is hard to fail, but it is worse never to have tried to succeed.\n\nTheodore Roosevelt",
            "The most courageous act is still to think for yourself. Aloud.\n\nCoco Chanel",
            "Insanity: doing the same thing over and over again and expecting different results.\n\nAlbert Einstein",
            "The greatest wealth is to live content with little.\n\nPlato",
            "The future belongs to those who prepare for it today.\n\nMalcolm X",
            "Those who dare to fail miserably can achieve greatly.\n\nJohn F. Kennedy",
            "In order to be irreplaceable one must always be different.\n\nCoco Chanel",
            "I like criticism. It makes you strong.\n\nLeBron James",
            "Well done is better than well said.\n\nBenjamin Franklin",
            "Be yourself; everyone else is already taken.\n\nOscar Wilde",
            "The best things in life are free. The second best things are very expensive.\n\nCoco Chanel",
            "It’s not whether you get knocked down, it’s whether you get up.\n\nVince Lombardi",
            "Education is the most powerful weapon which you can use to change the world.\n\nNelson Mandela",
            "The only thing that interferes with my learning is my education.\n\nAlbert Einstein",
            "It always seems impossible until it’s done.\n\nNelson Mandela",
            "Life is a flower of which love is the honey.\n\nVictor Hugo",
            "It’s not how much you have that makes people look up to you, it’s who you are.\n\nElvis Presley",
            "A man who stands for nothing will fall for anything.\n\nMalcolm X",
            "You have power over your mind – not outside events. Realize this, and you will find strength.\n\nMarcus Aurelius",
            "The path to success is to take massive, determined action.\n\nTony Robbins",
            "Better to build a bridge than a wall.\n\nElton John",
            "Winners never quit, and quitters never win.\n\nVince Lombardi",
            "Doing the best at this moment puts you in the best place for the next moment.\n\nOprah Winfrey",
            "You never really learn much from hearing yourself speak.\n\nGeorge Clooney",
            "Someone’s sitting in the shade today because someone planted a tree a long time ago.\n\nWarren Buffett",
            "Doubt is not a pleasant condition, but certainty is absurd.\n\nVoltaire"
    };

    private @DrawableRes int[] images = {
            R.drawable.tropical,
            R.drawable.bluesea,
            R.drawable.redsea,
            R.drawable.waves,
            R.drawable.dolphin,
            R.drawable.sunset,
            R.drawable.bridge,
            R.drawable.coast,
            R.drawable.shore,
            R.drawable.rocks,
            R.drawable.dock,
            R.drawable.sandy,
            R.drawable.cave
    };

    private String status = "";
    private @DrawableRes int image;
    private String recent;
    private @DrawableRes int recentImage;

    public String updateStatus(){
        this.recent = this.status;
        while (this.recent == this.status){
            this.status = this.quotes[(int)(Math.random() * this.quotes.length)];
        }
        return this.status;
    }

    @DrawableRes
    public int updateImage(){
        this.recentImage = this.image;
        while (this.recentImage == this.image){
            this.image = this.images[(int)(Math.random() * this.images.length)];
        }
        return this.image;
    }
}
